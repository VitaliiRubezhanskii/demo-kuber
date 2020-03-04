pipeline {


   stages {

    stage('Checkout') {
           git 'https://github.com/VitaliiRubezhanskii/iotconsumer.git'
       }

    stage('Build') {
           sh 'mvn clean install -DSkipTests=true'
       }
   }
}