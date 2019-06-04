def call(int buildNumber) {
    if (buildNumber % 2 == 0) {
        artifactPipeline()
    } else {
        microservicePipeline()
    }
}