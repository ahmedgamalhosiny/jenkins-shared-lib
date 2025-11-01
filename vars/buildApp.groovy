def call() {
    echo "Starting build process..."

    stage('Checkout') {
        echo "Cloning the project repository..."
        git branch: 'main', url: 'https://github.com/ahmedgamalhosiny/java-pipeline-iti.git'
    }

    stage('Build') {
        echo "Building Java project using Maven..."
        def mvnHome = tool name: 'Maven_3_9_11', type: 'maven'
        bat "\"${mvnHome}\\bin\\mvn\" clean package"
    }

    stage('Test') {
        echo "Running tests..."
        def mvnHome = tool name: 'Maven_3_9_11', type: 'maven'
        bat "\"${mvnHome}\\bin\\mvn\" test"
    }

    stage('Deploy') {
        echo "Deployment successful!"
    }
}
