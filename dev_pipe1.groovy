pipelineJob('Environments/dev/pipe1') {
  displayName('pipe1')
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url "https://gitlab.com/estudio4953632/jenkins_pipelines.git"
          }
          branch "*/main"
          extensions {}
        }
      }
      scriptPath('dev_pipe1.jenkinsfile')
      lightweight(true)
    }
  }
}
