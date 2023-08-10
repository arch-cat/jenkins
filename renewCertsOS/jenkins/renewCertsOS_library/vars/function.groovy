// function.groovy

// "Функция" вызова cloneRepository
def cloneRepository() {
    def repoUrl = "ssh://git@{URL}/.../..."

    checkout([$class: 'GitSCM',
        branches: [[name: 'support']],
        extensions: [[$class: 'CloneOption', depth: 1, noTags: false, reference: '', shallow: true]],
        userRemoteConfigs: [[credentialsId: 'Test', url: repoUrl]]])
}