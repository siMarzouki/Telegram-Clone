plugins {
    id("com.android.application")
}

android {
    namespace = "com.isep.telegramclone"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.isep.telegramclone"
        minSdk = 26
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
}

dependencies {
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")

    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("com.google.firebase:firebase-auth-ktx:21.0.3")
    implementation ("com.google.firebase:firebase-firestore-ktx:24.1.1")
    implementation ("com.google.firebase:firebase-storage-ktx:20.0.1")
    implementation ("com.github.bumptech.glide:glide:4.15.0")
    platform("com.google.firebase:firebase-bom:31.2.3")

}