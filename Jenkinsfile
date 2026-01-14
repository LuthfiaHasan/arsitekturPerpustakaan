pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3' 
        // Pastikan Maven terinstal di Global Tool Configuration Jenkins dengan nama ini
        // Atau gunakan wrapper 'mvnw' jika agent mendukung
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                // Build semua module dan skip test untuk efisiensi di demo ini
                // Hapus -DskipTests untuk menjalankan unit test
                sh 'mvn clean package -DskipTests' 
            }
        }

        // Contoh stage untuk build Docker Image (Opsional, butuh konfigurasi kredensial Docker Hub)
        /*
        stage('Docker Build & Push') {
            steps {
                script {
                    docker.build("my-repo/anggota-service:${env.BUILD_NUMBER}", "./anggota")
                    // docker.withRegistry('', 'docker-hub-credentials') {
                    //    docker.image("my-repo/anggota-service:${env.BUILD_NUMBER}").push()
                    // }
                }
            }
        }
        */
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
