package mesosphere.metronome.client;

import feign.*;
import feign.Feign.Builder;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.ErrorDecoder;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import mesosphere.metronome.client.auth.TokenAuthRequestInterceptor;
import mesosphere.metronome.client.utils.MetronomeException;
import mesosphere.metronome.client.utils.ModelUtils;

import java.io.IOException;

import static java.util.Arrays.asList;

public class MetronomeClient {
    public static Metronome getInstance(String endpoint) {
        return getInstance(endpoint, null);
    }

    /**
     * The generalized version of the method that allows more in-depth customizations via
     * {@link RequestInterceptor}s.
     *
     * @param endpoint URL of Metronome
     */
    public static Metronome getInstance(String endpoint, RequestInterceptor... interceptors) {
        Builder b = Feign.builder()
                .encoder(new GsonEncoder(ModelUtils.GSON))
                .decoder(new GsonDecoder(ModelUtils.GSON))
                .errorDecoder(new MetronomeErrorDecoder());
        if (interceptors != null)
            b.requestInterceptors(asList(interceptors));
        b.requestInterceptor(new MetronomeHeadersInterceptor());
        return b.target(Metronome.class, endpoint);
    }

    /**
     * Creates a Metronome client proxy that performs HTTP basic authentication.
     */
    public static Metronome getInstanceWithBasicAuth(String endpoint, String username, String password) {
        return getInstance(endpoint, new BasicAuthRequestInterceptor(username, password));
    }

    /**
     * Creates a Metronome client proxy that uses a token for authentication.
     *
     * @param endpoint URL of Metronome
     * @param token    token
     * @return Metronome client
     */
    public static Metronome getInstanceWithTokenAuth(String endpoint, String token) {
        return getInstance(endpoint, new TokenAuthRequestInterceptor(token));
    }

    static class MetronomeHeadersInterceptor implements RequestInterceptor {
        @Override
        public void apply(RequestTemplate template) {
//			template.header("Accept", "application/json");
//			template.header("Content-Type", "application/json");
        }
    }

    static class MetronomeErrorDecoder implements ErrorDecoder {
        @Override
        public Exception decode(String methodKey, Response response) {

            String body = null;
            try {
                body = Util.toString(response.body().asReader());
            } catch (IOException e) {
            }
            return new MetronomeException(response.status(), response.reason(), body);
        }
    }
}
