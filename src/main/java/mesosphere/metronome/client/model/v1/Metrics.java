package mesosphere.metronome.client.model.v1;

import java.util.Map;

/**
 * Created by julien on 04/11/16.
 */
public class Metrics {
    private Map<String, Object> gauges;
    private Map<String, Object> counters;
    private Map<String, Object> histograms;

}
