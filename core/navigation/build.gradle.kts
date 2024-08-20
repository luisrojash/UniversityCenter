plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    kotlin("kapt")
    alias(libs.plugins.google.dagger.hilt)
}

android {
    namespace = "com.lerp.core.navigation"
    compileSdk = 34

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(libs.google.dagger.hilt)
    implementation(libs.androidx.navigation.hilt)
    kapt(libs.google.dagger.hilt.compiler)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
}

kapt {
    correctErrorTypes = true
}