def call() {
    node {
        stage('Checkout') {
            echo 'checking out the project ...'
        }
        stage('build') {
            echo 'building the project ...'
        }
        stage('deploy') {
            echo 'deploying the project ...'
        }
    }
}