package mesosphere.metronome.client.model.v1;

import java.util.List;

/**
 * Created by julien on 04/11/16.
 */
public class Placement {
    private List<Constraint> constraints;

    public List<Constraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<Constraint> constraints) {
        this.constraints = constraints;
    }
}
