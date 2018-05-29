pipeline {
    agent any
    stages {
    stage('init') {
                steps {
                    git poll: true, url: 'https://github.com/niceGeek/BusinessRulesValidation.git'
                }
            }
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}