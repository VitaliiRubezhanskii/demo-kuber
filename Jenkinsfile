pipeline {
   agent any

   stages {

    stage('Preparation') {
          cleanWs()
          git credentialsId: 'GitHub', url: "https://github.com/VitaliiRubezhanskii/demo-kuber.git"
       }

    stage('Build') {
           sh '''./mvnw clean install -DskipTests=true'''
       }

    stage('Build and Push Image') {
            steps {
              sh 'docker image build -t 063132795330.dkr.ecr.eu-central-1.amazonaws.com/inflotrolix .'
            }
         }
   }
}