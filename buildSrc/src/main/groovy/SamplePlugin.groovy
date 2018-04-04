import org.gradle.api.Plugin
import org.gradle.api.Project

class SamplePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.task("print") {
            doLast {
                project.getLogger().error('Printed through logger')
                System.err.println('Printed (stderr)')
            }
        }
    }
}
