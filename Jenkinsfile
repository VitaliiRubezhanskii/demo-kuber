pipeline {
   agent any

   stages {

    stage('Preparation') {
          cleanWs()
          git credentialsId: 'GitHub', url: "https://github.com/VitaliiRubezhanskii/iotconsumer.git"
       }

    stage('Build') {
           sh '''mvn clean install -DSkipTests=true'''
       }

    stage('Build and Push Image') {
            steps {
              sh 'docker image build -t 063132795330.dkr.ecr.eu-central-1.amazonaws.com/inflotrolix .'
            }
         }
   }
}