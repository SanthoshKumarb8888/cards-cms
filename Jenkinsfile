pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Using the provided Git repository URL
                git branch: 'main', url: 'https://github.com/SanthoshKumarb8888/cards-cms.git'
            }
        }

        stage('Hello World') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
