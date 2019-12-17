node{
         stage('SCM Checkout'){
             git 'https://github.com/surjeetkm/microservice'
         }
         stage('Compile-Package'){
             def mvnHome=tool name: 'MAven', type: 'maven'
                  bat "${mvnHome}/bin/mvn package"
         }
}
