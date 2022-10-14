package org.dementiev.archassignment.gradle.dependencies

object Dependencies {
    object Libraries {
        val coreKtx = "androidx.core:core-ktx:1.9.0".toImpl
        val compose = "androidx.compose.ui:ui:1.3.0-beta02".toImpl
        val composeMaterial = "androidx.compose.material3:material3:1.0.0-beta02".toImpl
        val composePreview = "androidx.compose.ui:ui-tooling-preview:1.3.0-beta02".toImpl
        val composeActivity = "androidx.activity:activity-compose:1.5.1".toImpl
        val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1".toImpl
    }

    object TestLibraries {
        val jUnit = "junit:junit:4.13.2".toTestImpl
        val jUnitExt = "androidx.test.ext:junit:1.1.3".toAndroidTestImpl
        val espresso = "androidx.test.espresso:espresso-core:3.4.0".toAndroidTestImpl
        val jUnitCompose = "androidx.compose.ui:ui-test-junit4:1.3.0-alpha03".toAndroidTestImpl
    }

    object DebugLibraries {
        val composeUiTooling = "androidx.compose.ui:ui-tooling:1.3.0-alpha03".toDebugImpl
        val composeTestManifest = "androidx.compose.ui:ui-test-manifest:1.3.0-alpha03".toDebugImpl
    }
}
