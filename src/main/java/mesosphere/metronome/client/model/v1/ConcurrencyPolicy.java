package mesosphere.metronome.client.model.v1;

import com.google.gson.annotations.SerializedName;

/**
 * Created by julien on 05/11/16.
 */
public enum ConcurrencyPolicy {
    ALLOW,
    FORBID,
    REPLACE;
}
