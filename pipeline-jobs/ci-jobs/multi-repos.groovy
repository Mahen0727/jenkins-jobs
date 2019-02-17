node('SLAVE'){
    stage('One'){
        dir('CODE'){
            git 'https://github.com/Mahen0727/studentapp-ui.git'
            sh 'ls'
        }
    }
    stage('Two'){
        dir('Terraform'){
            git 'https://github.com/Mahen0727/Terraform.git'
            sh 'ls'
        }
    }

    stage('Three'){
        dir('CODE'){
            sh 'ls'
        }
    }
    
}