pipeline {
    agent any
    stages {
        stage('Init') {
            steps {
                echo 'Hi, This is Sabzar from Evry Tieto'
                echo 'Initializing the project'
            }
        }
        stage('build') {
            steps {
                echo 'Building sample maven project'
            }
        }
		stage('Integration Testing') {
            steps {
                echo 'Intehration Testing'
				echo 'All test cases passes'
            }
        }
        stage('deploy') {
            steps {
                echo 'Deploying the project to stage'
            }
        }
		stage('deploy Prodection') {
            steps {
                echo 'Deploying the project to Prodection'
            }
        }

    }
}