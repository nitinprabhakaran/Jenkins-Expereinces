def dockerImage;

node('docker'){
	stage('SCM'){
		checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/nitinprabhakaran/JenkinsDocker']]]);
	}
	stage('build'){
		dockerImage = docker.build('nitinprabhakaran/agent-dnc:v$BUILD_NUMBER', './dotnetcore');
	}
	stage('push'){
		docker.withRegistry('https://index.docker.io/v1/', 'dockerhubcreds'){
			dockerImage.push();
		}
	}
}