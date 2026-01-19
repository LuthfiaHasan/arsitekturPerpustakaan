pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build All Services') {
            steps {
                dir('anggota') {
                    sh 'mvn clean package -DskipTests'
                }
                dir('buku') {
                    sh 'mvn clean package -DskipTests'
                }
                dir('peminjaman') {
                    sh 'mvn clean package -DskipTests'
                }
                dir('pengembalian') {
                    sh 'mvn clean package -DskipTests'
                }
                dir('api-gateway') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }
    }

    post {
        always {
            cleanWs()
        }
        success {
            echo 'Pipeline berhasil!'
        }
        failure {
            echo 'Pipeline gagal.'
        }
    }
}
