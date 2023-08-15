// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:4.2.2")
        classpath ("io.realm:realm-gradle-plugin:6.0.2")
        classpath("com.google.gms:google-services:4.3.15")
    }
}