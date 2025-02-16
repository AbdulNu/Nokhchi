plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("com.google.devtools.ksp") version "1.9.0-1.0.12"
}

android {
    namespace = "com.example.nokhchi"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.nokhchi"
        minSdk = 24
        targetSdk = 35
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
    implementation ("com.google.android.material:material:1.6.1")
    implementation ("androidx.viewpager2:viewpager2:1.0.0")
    implementation ("androidx.cardview:cardview:1.0.0")

    val room_version = "2.6.1"
    val lifecycle_version = "2.2.0"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")
    // implementation ("androidx.lifecycle:lifecycle-livedata:2.5.1")
    //implementation ("androidx.lifecycle:lifecycle-viewmodel:2.5.1") // Добавь это
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")
    implementation("androidx.lifecycle:lifecycle-livedata:2.5.1")
// LiveData
    //implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    // implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.2.0")
    //implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.0")
    ksp("androidx.room:room-compiler:$room_version")

    implementation("androidx.room:room-runtime:$room_version")

    // If this project uses any Kotlin source, use Kotlin Symbol Processing (KSP)
    // See Add the KSP plugin to your project
    implementation("androidx.room:room-ktx:$room_version")

    // If this project only uses Java source, use the Java annotationProcessor
    // No additional plugins are necessary
    annotationProcessor("androidx.room:room-compiler:$room_version")

    // optional - Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:$room_version")

    // optional - RxJava2 support for Room
    implementation("androidx.room:room-rxjava2:$room_version")

    // optional - RxJava3 support for Room
    implementation("androidx.room:room-rxjava3:$room_version")

    // optional - Guava support for Room, including Optional and ListenableFuture
    implementation("androidx.room:room-guava:$room_version")

    // optional - Test helpers
    testImplementation("androidx.room:room-testing:$room_version")

    // optional - Paging 3 Integration
    implementation("androidx.room:room-paging:$room_version")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")

// Navigation component
    implementation ("androidx.navigation:navigation-fragment-ktx:2.5.1")
    implementation ("androidx.navigation:navigation-ui-ktx:2.5.1")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.3.3")
    implementation ("androidx.navigation:navigation-ui-ktx:2.3.3")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}