def call() {
    stage('Shared Build') {
        echo "Running Maven build using Shared Library..."
        bat 'mvn clean package'
    }

    stage('Shared Test') {
        echo "Running tests using Shared Library..."
        bat 'mvn test'
    }

    stage('Shared Deploy') {
        echo "Deploying application using Shared Library..."
        echo "Application deployed successfully (via Shared Library)!"
    }
}
