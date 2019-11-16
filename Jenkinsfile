node{
	stage('SCM-Checkout'){
		git 'https://github.com/surjeetkm/microservice.git'
	}
	stage('Compile-Package'){
		sh 'mvn-package'
	}
}