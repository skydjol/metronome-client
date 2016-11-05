package mesosphere.metronome.client.utils;

public class MetronomeException extends Exception {
    private static final long serialVersionUID = 1L;
    private int status;
    private String message;
    private String body;

    public MetronomeException(int status, String message, String body) {
        this.status = status;
        this.message = message;
        this.body = body;
    }

    /**
     * Gets the HTTP status code of the failure, such as 404.
     */
    public int getStatus() {
        return status;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String getMessage() {
        return message + " (http status: " + status + ", body: " + body + ")";
    }

    @Override
    public String toString() {
        return message + " (http status: " + status + ", body: " + body + ")";
    }
}
