pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                git poll: true, url: 'https://github.com/niceGeek/BusinessRulesValidation.git'
                sh 'mvn clean install'
            }
        }
    }
}