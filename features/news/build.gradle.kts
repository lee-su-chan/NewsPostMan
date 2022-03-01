plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    implementation(project(":features:core-ui"))

    implementation(Dep.Android.core)
    implementation(Dep.Android.appcompat)
    implementation(Dep.Android.material)
}