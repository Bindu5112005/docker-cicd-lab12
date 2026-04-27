pipeline {
    agent any

    tools {
        maven "Maven3"
    }

    stages {

        stage('Clean Workspace') {
            steps {
                deleteDir()
            }
        }

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/Bindu5112005/docker-cicd-lab12.git'
            }
        }

        stage('Build Maven Project') {
            steps {
                dir('calculator') {
                    bat 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t add-two-number-app -f calculator/Dockerfile calculator'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker rm -f app || exit 0'
                bat 'docker run -d -p 9090:8080 --name app add-two-number-app'
            }
        }
    }
}
