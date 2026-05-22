import com.android.build.api.dsl.ApplicationExtension
import com.example.co2.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.example.convention.android.application")
                apply("org.jetbrains.kotlin.plugin.compose")

                extensions.configure<ApplicationExtension> {
                    configureAndroidCompose(this)
                }
            }
        }
    }
}