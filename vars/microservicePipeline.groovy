void call (){
    pipeline {
        agent any
        stages {
            stage('checkout microservice') {
                steps {
                    echo "Checking microservice"
                }
            }
        }
        stages {
            stage('build microservice') {
                steps {
                    echo "building microservice"
                }
            }
        }
        stages {
            stage('deploy microservice') {
                steps {
                    echo "deploying microservcie"
                }
            }
        }
    }
}