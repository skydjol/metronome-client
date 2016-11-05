package mesosphere.metronome.client.model.v1;

/**
 * Created by julien on 05/11/16.
 */
public class JobHistorySummary {

    private String successCount;
    private String failureCount;
    private String lastSucessAt;
    private String lastFailureAt;

    public String getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(String successCount) {
        this.successCount = successCount;
    }

    public String getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(String failureCount) {
        this.failureCount = failureCount;
    }

    public String getLastSucessAt() {
        return lastSucessAt;
    }

    public void setLastSucessAt(String lastSucessAt) {
        this.lastSucessAt = lastSucessAt;
    }

    public String getLastFailureAt() {
        return lastFailureAt;
    }

    public void setLastFailureAt(String lastFailureAt) {
        this.lastFailureAt = lastFailureAt;
    }
}
