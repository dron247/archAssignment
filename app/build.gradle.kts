import org.dementiev.archassignment.gradle.dependencies.Dependencies
import org.dementiev.archassignment.gradle.dependencies.dependency

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "org.dementiev.archassignment"
    compileSdk = 33

    defaultConfig {
        applicationId = "org.dementiev.archassignment"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    dependency(Dependencies.Libraries.coreKtx)
    dependency(Dependencies.Libraries.compose)
    dependency(Dependencies.Libraries.composeMaterial)
    dependency(Dependencies.Libraries.composePreview)
    dependency(Dependencies.Libraries.composeActivity)
    dependency(Dependencies.Libraries.lifecycle)
    dependency(Dependencies.TestLibraries.jUnit)
    dependency(Dependencies.TestLibraries.jUnitExt)
    dependency(Dependencies.TestLibraries.espresso)
    dependency(Dependencies.TestLibraries.jUnitCompose)
    dependency(Dependencies.DebugLibraries.composeUiTooling)
    dependency(Dependencies.DebugLibraries.composeTestManifest)
}
