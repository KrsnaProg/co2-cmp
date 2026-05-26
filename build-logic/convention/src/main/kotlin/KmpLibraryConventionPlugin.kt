import com.android.build.api.dsl.LibraryExtension
import com.example.co2.convention.configureKotlinAndroid
import com.example.co2.convention.configureKotlinMultiplatform
import com.example.co2.convention.libs
import com.example.co2.convention.pathToResourcePrefix
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class KmpLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.multiplatform")
                apply("org.jetbrains.kotlin.plugin.serialization")
            }

            configureKotlinMultiplatform()

            extensions.configure<LibraryExtension> {
                configureKotlinAndroid(this)

                resourcePrefix = this@with.pathToResourcePrefix()

                experimentalProperties["android.experimental.kmp.enableAndroidResources"] =
                    "true"
            }

            dependencies {
                "commonMainImplementation"(libs.findLibrary("kotlinx-serialization-json").get())
                "commonMainImplementation"(libs.findLibrary("kotlin-test").get())
            }
        }
    }
}

