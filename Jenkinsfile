pipeline {
	agent any
	tools {
	maven 'MAVEN_HOME'
	}
	
	stages{
			stage('Welcome Stage')
			{
			 steps
			  {
			  	bat echo 'welcome to Jenkins Pipeline'
			  }
			}
			
			stage('Maven clean')
			{
			 steps
			  {
			  	bat 'mvn clean'
			  }
			}
	
			stage('Maven package')
			{
			 steps
			  {
			  	bat 'mvn package'
			  }
			}
			
			stage('Maven Install')
			{
			 steps
			  {
			  	bat 'mvn install'
			  }
			}
			
			stage('Final Build step')
			{
			 steps
			  {
			  	echo 'build done'
			  }
			}
		}
}