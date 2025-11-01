def call() {
    echo "  Starting build process..."

    stage('Checkout') {
        echo "Cloning the project repository..."
        // Instead of 'checkout scm', do this:
        git branch: 'main', url: 'https://github.com/ahmedgamalhosiny/java-pipeline-iti.git'
    }

    stage('Build') {
        echo "Building Java project using Maven..."
        bat "mvn clean package"
    }

    stage('Deploy') {
        echo " Deployment successful!"
    }
}
