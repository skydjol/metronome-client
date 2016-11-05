package mesosphere.metronome.client.model.v1;

/**
 * Created by julien on 04/11/16.
 */
public class Restart {
    private String policy;
    private Integer activeDeadlineSeconds;

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public Integer getActiveDeadlineSeconds() {
        return activeDeadlineSeconds;
    }

    public void setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
    }
}
