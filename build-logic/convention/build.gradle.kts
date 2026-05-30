import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.compose.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.androidx.room.gradle.plugin)
    implementation(libs.buildkonfig.gradlePlugin)
    implementation(libs.buildkonfig.compiler)
}

group = "com.example.convention.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
    }
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "com.example.convention.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose") {
            id = "com.example.convention.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("cmpApplication") {
            id = "com.example.convention.cmp.application"
            implementationClass = "CmpApplicationConventionPlugin"
        }
        register("KmpLibrary") {
            id = "com.example.convention.kmp.library"
            implementationClass = "KmpLibraryConventionPlugin"
        }
        register("CmpLibrary") {
            id = "com.example.convention.cmp.library"
            implementationClass = "CmpLibraryConventionPlugin"
        }
        register("CmpFeature") {
            id = "com.example.convention.cmp.feature"
            implementationClass = "CmpFeatureConventionPlugin"
        }
        register("BuildKonfig") {
            id = "com.example.convention.build.konfig"
            implementationClass = "BuildKonfigConventionPlugin"
        }
        register("Room") {
            id = "com.example.convention.room"
            implementationClass = "RoomConventionPlugin"
        }
    }
}