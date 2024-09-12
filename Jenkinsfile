pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Clone the repository
                git branch: 'main', url: 'https://github.com/mahmoudworkin/verysimpleapp.git'
            }
        }

        stage('Build') {
            steps {
                // Execute Maven build
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Execute Maven tests
                sh 'mvn test'
            }
        }

        stage('Archive') {
            steps {
                // Archive JAR files produced by Maven build
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }

    post {
        always {
            // Archive test results
            junit '**/target/surefire-reports/*.xml'
        }

        success {
            // Actions on successful build
            echo 'Build and tests successful.'
        }

        failure {
            // Actions on build failure
            echo 'Build or tests failed.'
        }
    }
}
