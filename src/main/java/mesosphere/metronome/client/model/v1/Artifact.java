package mesosphere.metronome.client.model.v1;

/**
 * Created by julien on 05/11/16.
 */
public class Artifact {

    private String uri;
    private Boolean extract = true;
    private Boolean executable = false;
    private Boolean cache = true;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Boolean getExtract() {
        return extract;
    }

    public void setExtract(Boolean extract) {
        this.extract = extract;
    }

    public Boolean getExecutable() {
        return executable;
    }

    public void setExecutable(Boolean executable) {
        this.executable = executable;
    }

    public Boolean getCache() {
        return cache;
    }

    public void setCache(Boolean cache) {
        this.cache = cache;
    }
}
