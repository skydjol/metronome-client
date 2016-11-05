# metronome-client

This project is a Java library for communicating with Metronome API. At this point this library supports version v2 of Metronome API, please refer to the [docs](https://mesosphere.github.io/metronome/docs/rest-api.html) for more details.

## Using metronome-client in your maven project

Add metronome-client as a dependency:

```
<dependency>
  <groupId>com.mesosphere</groupId>
  <artifactId>metronome-client</artifactId>
  <version>0.1.0-SNAPSHOT</version>
</dependency>
```

## Usage

### Initialization

The following piece of code initializes the client. ```MetronomeClient.getInstance()``` method expects the endpoint for metronome:

```
String endpoint = "<Metronome's endpoint>";
Metronome metronome = MetronomeClient.getInstance(endpoint);
```

### Getting all jobs

The following will return all the jobs that have been created:

```
List<Job> jobsResponse = metronome.getJobs();
```

### Create a new job

The following example demonstrates how a new job can be created:
```
Job job = new Job();
job.setId("echohisleepbye");
job.setCmd("echo hi; sleep 10; echo bye;");
job.setCpus(1.0);
job.setMem(16.0);
metronome.createJob(job);
```

### Get details about an existing job

The following example, demostrates how to get details about an already created job:

```
GetJobResponse jobGet = metronome.getJob("echohisleepbye");
```

### Delete an job

The following example demostrate, how one can delete an existing job:
```
metronome.deleteJob("echohisleepbye");
```

## Building

This project is built using [Apache Maven](http://maven.apache.org/).

Run the following command from the root of repository, to build the client JAR:

```
$ mvn clean install
```

## Bugs

Bugs can be reported using Github issues.
