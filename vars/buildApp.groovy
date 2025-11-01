def call() {
    echo " Starting build process..."
    
    stage('Checkout') {
        echo "Cloning the project repository..."
        checkout scm
    }

    stage('Build') {
        echo "Building Java project using Maven..."
        bat "mvn clean package"
    }

    stage('Test') {
        echo "Running unit tests..."
        bat "mvn test"
    }

    stage('Deploy') {
        echo "Deploying application (simulation)..."
        echo " Deployment successful!"
    }
    
    echo " BuildApp pipeline finished successfully."
}
