// classes.groovy

class classes {
    def steps
    classes(steps) {this.steps = steps}
    def printHeader(String message) {
		def header = "=== ${message} ==="
        def line = '=' * header.length()

        steps.println "${line}"
        steps.println "${header}"
        steps.println "${line}"
    }

    def printInfo(String message) {
        steps.println "[INFO] ${message}"
    }

	def printWarning(String message) {
        steps.println "[WARNING] ${message}"
    }

	def printError(String message) {
        steps.println "[ERROR] ${message}"
    }
}