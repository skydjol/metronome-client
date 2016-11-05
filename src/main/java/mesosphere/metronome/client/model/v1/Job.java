package mesosphere.metronome.client.model.v1;

import java.util.List;
import java.util.Map;

/**
 * Created by julien on 04/11/16.
 */
public class Job {

    private String id;
    private String description;
    private Run run;
    private Map<String, String> labels;
    private List<Schedule> schedules;
    private List<JobRun> activeRuns;
    private JobHistory history;
    private JobHistorySummary historySummary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Run getRun() {
        return run;
    }

    public void setRun(Run run) {
        this.run = run;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public List<JobRun> getActiveRuns() {
        return activeRuns;
    }

    public void setActiveRuns(List<JobRun> activeRuns) {
        this.activeRuns = activeRuns;
    }

    public void setHistory(JobHistory history) {
        this.history = history;
    }

    public JobHistorySummary getHistorySummary() {
        return historySummary;
    }

    public void setHistorySummary(JobHistorySummary historySummary) {  this.historySummary = historySummary; }

    public JobHistory getHistory() {
        return history;
    }
}
