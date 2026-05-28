buildscript {
    configurations.classpath {
        resolutionStrategy {
            // errorprone 2.27.0 isn't reachable on this network; pin to a present version.
            force("com.google.errorprone:error_prone_annotations:2.28.0")
        }
    }
}

// Top-level build file — plugins are declared here but applied in the :app module.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}
