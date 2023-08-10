// production.groovy

def env_vars() {
    def ANSIBLE_PATH = "${WORKSPACE}/support/jobs/renewCertsOS/ansible"
    def JENKINS_PATH = "${WORKSPACE}/support/jobs/"
    return [ANSIBLE_PATH, JENKINS_PATH]
}

def param_vars() {
    def method = params.METHOD
    def debug_mode = params.ENABLE_DEBUG
    return [method, debug_mode]
}

def vault_config() {
    return [
        vaultUrl: "",
        vaultCredentialId: "",
        vaultNamespace: "",
        vaultRole: "",
        vaultMount: ""
    ]
}