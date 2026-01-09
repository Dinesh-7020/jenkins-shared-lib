def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
        //sh 'mvn clean package sonar:sonar'
         sh 'mvn clean verify'
    }
}