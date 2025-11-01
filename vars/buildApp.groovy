def call() {
    echo "Starting build process..."

    stage('Checkout') {
        echo "Cloning the project repository..."
        // Clone your Git repo
        git branch: 'main', url: 'https://github.com/ahmedgamalhosiny/java-pipeline-iti.git'
    }

    stage('Build') {
        echo "Building Java project using Maven..."
        // Use the Jenkins Maven tool
        withMaven(maven: 'Maven_3_9_9') {
            bat "mvn clean package"
        }
    }

    stage('Deploy') {
        echo "Deployment successful!"
    }
}
