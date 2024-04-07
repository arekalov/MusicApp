plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    kotlin("kapt")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.arekalov.musicapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.arekalov.musicapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
    // Material Design
    implementation ("com.google.android.material:material:1.11.0")

    // Architectural Components
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")

    // Lifecycle
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime:2.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")

    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")

    // Coroutine Lifecycle Scopes
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")

    // Navigation Component
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation( "androidx.navigation:navigation-ui-ktx:2.7.7")

    // Glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    kapt( "com.github.bumptech.glide:compiler:4.11.0")

    // Activity KTX for viewModels()
    implementation("androidx.activity:activity-ktx:1.8.2")

    //Dagger - Hilt
    implementation("com.google.dagger:hilt-android:2.28-alpha")
    kapt("com.google.dagger:hilt-android-compiler:2.28-alpha")
    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
    kapt("androidx.hilt:hilt-compiler:1.2.0")

    // Timber
    implementation("com.jakewharton.timber:timber:4.7.1")

    // Firebase Firestore
    implementation("com.google.firebase:firebase-firestore:24.11.0")

    // Firebase Storage KTX
    implementation("com.google.firebase:firebase-storage-ktx:20.3.0")

    // Firebase Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.1.1")

    // ExoPlayer
    api("com.google.android.exoplayer:exoplayer-core:2.19.1")
    api("com.google.android.exoplayer:exoplayer-ui:2.19.1")
    api("com.google.android.exoplayer:extension-mediasession:2.19.1")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}