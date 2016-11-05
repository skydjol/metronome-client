package mesosphere.metronome.client;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import mesosphere.metronome.client.model.v1.*;
import mesosphere.metronome.client.utils.MetronomeException;

import java.util.List;

public interface Metronome {
    // Apps
    @RequestLine("GET /v1/jobs?embed=activeRuns&embed=schedules&embed=history&embed=historySummary")
    List<Job> getJobs() throws MetronomeException;

    @RequestLine("GET /v1/jobs/{jobId}?embed=activeRuns&embed=schedules&embed=history&embed=historySummary")
    Job getJob(@Param("jobId") String jobId) throws MetronomeException;

    @RequestLine("POST /v1/jobs")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Job createJob(Job job) throws MetronomeException;

    @RequestLine("PUT /v1/jobs/{jobId}")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Job updateJob(@Param("jobId") String jobId, Job job) throws MetronomeException;

    @RequestLine("DELETE /v1/jobs/{jobId}?stopCurrentJobRuns={stopCurrentJobRuns}")
    Job deleteJob(@Param("jobId") String jobId, @Param("stopCurrentJobRuns") boolean stopCurrentJobRuns) throws MetronomeException;
    // Schedule

    @RequestLine("GET /v1/jobs/{jobId}/schedules")
    List<Schedule> getJobSchedules(@Param("jobId") String jobId) throws MetronomeException;

    @RequestLine("POST /v1/jobs/{jobId}/schedules")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Schedule createJobSchedule(@Param("jobId") String jobId, Schedule schedule) throws MetronomeException;

    @RequestLine("GET /v1/jobs/{jobId}/schedules/{scheduleId}")
    Schedule getJobSchedule(@Param("jobId") String jobId, @Param("scheduleId") String scheduleId) throws MetronomeException;

    @RequestLine("PUT /v1/jobs/{jobId}/schedules/{scheduleId}")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Schedule updateJobSchedule(@Param("jobId") String jobId, @Param("scheduleId") String scheduleId, Schedule schedule) throws MetronomeException;

    @RequestLine("DELETE /v1/jobs/{jobId}/schedules/{scheduleId}")
    void deleteJobSchedule(@Param("jobId") String jobId, @Param("scheduleId") String scheduleId) throws MetronomeException;

    // Run

    @RequestLine("GET /v1/jobs/{jobId}/runs")
    List<Run> getJobRuns(@Param("jobId") String jobId) throws MetronomeException;

    @RequestLine("POST /v1/jobs/{jobId}/runs")
    JobRun createJobRun(@Param("jobId") String jobId) throws MetronomeException;

    @RequestLine("GET /v1/jobs/{jobId}/runs/{runId}")
    JobRun getJobRun(@Param("jobId") String jobId, @Param("runId") String runId) throws MetronomeException;

    @RequestLine("POST /v1/jobs/{jobId}/runs/{runId}/actions/stop")
    JobRun stopRun(@Param("jobId") String jobId, @Param("runId") String runId) throws MetronomeException;

    // Miscellaneous

    @RequestLine("GET /ping")
    String ping() throws MetronomeException;

    @RequestLine("GET /v1/metrics")
    Metrics metrics() throws MetronomeException;
}
