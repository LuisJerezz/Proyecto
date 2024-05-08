//@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
//grandle de módulo
plugins {
    // alias(libs.plugins.com.android.application)
    // alias(libs.plugins.org.jetbrains.kotlin.android)
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.srodenas.example_with_catalogs"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.srodenas.example_with_catalogs"
        minSdk = 24
        targetSdk = 33
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
    viewBinding {
        viewBinding {
            enable = true
        }
    }

    dependencies {
        implementation("androidx.core:core-ktx:1.12.0")
        implementation("androidx.appcompat:appcompat:1.6.1")
        implementation("com.google.android.material:material:1.11.0")
        implementation("androidx.constraintlayout:constraintlayout:2.1.4")
        // Navigation Component
        implementation("androidx.navigation:navigation-fragment-ktx:2.4.2") // Asegúrate de usar la versión correcta
        implementation("androidx.navigation:navigation-ui-ktx:2.4.2") // Asegúrate de usar la versión correcta
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

        // Glide for image loading
        implementation("com.github.bumptech.glide:glide:4.15.1")

        // ViewModel and LiveData
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
        implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")

        // Simplifies use of ViewModel and LiveData in Fragments and Activities
        implementation("androidx.fragment:fragment-ktx:1.6.2")
        implementation("androidx.activity:activity-ktx:1.6.2")

        // Hilt for Dependency Injection
        implementation("com.google.dagger:hilt-android:2.44")
        kapt("com.google.dagger:hilt-compiler:2.44")

        // Room for database
        implementation("androidx.room:room-runtime:2.6.1")
        kapt("androidx.room:room-compiler:2.6.1")
        implementation("androidx.room:room-ktx:2.6.1")

        // Retrofit for network operations
        implementation("com.squareup.retrofit2:retrofit:2.9.0")
        implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    }
}