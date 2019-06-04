void call (){
    pipeline {
        agent any
        stages {
            stage('checkout microservice') {
                steps {
                    echo "Checking microservice"
                }
            }
            stage('build microservice') {
                steps {
                    echo "Checking microservice"
                }
            }
            stage('deploy microservice') {
                steps {
                    echo "Checking microservice"
                }
            }
        }

    }
}