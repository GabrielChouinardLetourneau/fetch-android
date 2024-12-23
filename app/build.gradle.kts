plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    signingConfigs {
        getByName("debug") {
            storeFile =
                file("C:\\Users\\Gab\\Documents\\repos\\fetch-coding-exercise\\keystore.jks")
            storePassword = "fetchandroid"
            keyAlias = "codingExercise"
            keyPassword = "fetchandroid"
        }
    }
    namespace = "com.gabcletourneau.codingexercise"
    compileSdk = 35


    defaultConfig {
        applicationId = "com.gabcletourneau.codingexercise"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        // Config for the base API url
        buildConfigField(
            "String",
            "BASE_API_URL",
            "\"${project.findProperty("BASE_API_URL")}\""
        )
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
}

dependencies {
    // Core
    implementation(libs.androidx.core.ktx)

    // Lifecycle
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.lifecycle.livedata)

    // Jetpack compose
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.runtime.livedata)

    //---------------------
    // Third party impl
    // Retrofit
    implementation(libs.retrofit)
    // Gson Converter
    implementation(libs.retrofit2.converter.gson)

    // Dagger and DIs
    implementation(libs.dagger)
    implementation(libs.hilt.android)
    //---------------------

    // Test impl
    implementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.junit)
    testImplementation(libs.mockito.core)
    testImplementation(libs.mockito.junit.jupiter)
    testImplementation(libs.junit.jupiter)
    testImplementation(libs.junit.jupiter)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}