void call (){
    pipeline {
        agent any
        stages {
            stage('Checkout artifact') {
                steps {
                    echo "checking out Artifact repo"
                }
            }
            stage('build artifact') {
                steps {
                    echo "building artifact"
                }
            }
            stage('publish artifact') {
                steps {
                    echo "publishing artifact"
                }
            }
        }
    }
}