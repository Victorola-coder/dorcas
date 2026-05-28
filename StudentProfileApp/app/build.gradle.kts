plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.dorcas.studentprofile"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.dorcas.studentprofile"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
}

configurations.all {
    resolutionStrategy {
        // Pin the transitively-pulled coroutines to a version present locally so
        // Gradle sync resolves on this machine (Maven Central is unreachable here).
        force("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
        force("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
        force("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.7.3")
    }
}
