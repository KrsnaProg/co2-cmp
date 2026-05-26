package com.example.co2.convention

import org.gradle.api.Project

fun Project.pathToPackageName(): String {
    val relativePackageName = path
        .replace(':', '.')
        .lowercase()

    return "com.example$relativePackageName"
}

fun Project.pathToResourcePrefix(): String {
    return path
        .replace(':', '_')
        .lowercase()
        .drop(1) + "_"
}

fun Project.pathToFrameworkName(): String {
    return this.path.split(":", "-", "_", " ").joinToString("") {
        it.replaceFirstChar { ch -> ch.uppercase() }
    }
}
