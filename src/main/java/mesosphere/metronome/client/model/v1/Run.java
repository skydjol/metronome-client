package mesosphere.metronome.client.model.v1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by julien on 04/11/16.
 */
public class Run {
    private String cmd;
    private List<String> args;
    private Double cpus;
    private Double mem;
    private Double disk;
    private String user;
    private Map<String, String> env;
    private Placement placement;
    private Collection<Artifact> artifacts;
    private Integer maxLaunchDelay;
    private Docker docker;
    private Collection<Volume> volumes;
    private Restart restart;

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public Double getCpus() {
        return cpus;
    }

    public void setCpus(Double cpus) {
        this.cpus = cpus;
    }

    public Double getMem() {
        return mem;
    }

    public void setMem(Double mem) {
        this.mem = mem;
    }

    public Double getDisk() {
        return disk;
    }

    public void setDisk(Double disk) {
        this.disk = disk;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Map<String, String> getEnv() {
        return env;
    }

    public void setEnv(Map<String, String> env) {
        this.env = env;
    }

    public Placement getPlacement() {
        return placement;
    }

    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    public Integer getMaxLaunchDelay() {
        return maxLaunchDelay;
    }

    public void setMaxLaunchDelay(Integer maxLaunchDelay) {
        this.maxLaunchDelay = maxLaunchDelay;
    }

    public Docker getDocker() {
        return docker;
    }

    public void setDocker(Docker docker) {
        this.docker = docker;
    }

    public Collection<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }

    public Restart getRestart() {
        return restart;
    }

    public void setRestart(Restart restart) {
        this.restart = restart;
    }

    public Collection<Artifact> getArtifacts() {
        return artifacts;
    }

    public void addArtifact(Artifact artifact) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<Artifact>();
        }
        this.artifacts.add(artifact);
    }
}
