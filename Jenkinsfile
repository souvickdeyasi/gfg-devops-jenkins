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
			 	echo 'welcome to Jenkins Pipeline'
			 }
			}
			
			stage('Maven Clean')
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
			stage('Final Build Step')
			{
			 steps
			 {
			 	echo 'Build Done' 
			 }
			}
		}
	}