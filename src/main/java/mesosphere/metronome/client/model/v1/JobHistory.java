package mesosphere.metronome.client.model.v1;

import java.util.List;

/**
 * Created by julien on 05/11/16.
 */
public class JobHistory {

    private String successCount;
    private String failureCount;
    private String lastSuccessAt;
    private String lastFailureAt;
    private List<JobRunInfo> successfulFinishedRuns;
    private List<JobRunInfo> failedFinishedRuns;

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

    public String getLastSuccessAt() {
        return lastSuccessAt;
    }

    public void setLastSuccessAt(String lastSuccessAt) {
        this.lastSuccessAt = lastSuccessAt;
    }

    public String getLastFailureAt() {
        return lastFailureAt;
    }

    public void setLastFailureAt(String lastFailureAt) {
        this.lastFailureAt = lastFailureAt;
    }

    public List<JobRunInfo> getSuccessfulFinishedRuns() {
        return successfulFinishedRuns;
    }

    public void setSuccessfulFinishedRuns(List<JobRunInfo> successfulFinishedRuns) {
        this.successfulFinishedRuns = successfulFinishedRuns;
    }

    public List<JobRunInfo> getFailedFinishedRuns() {
        return failedFinishedRuns;
    }

    public void setFailedFinishedRuns(List<JobRunInfo> failedFinishedRuns) {
        this.failedFinishedRuns = failedFinishedRuns;
    }
}
