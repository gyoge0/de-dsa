plugins {
    id("java")
    alias(libs.plugins.kotlin.jvm)
}

group = "com.gyoge"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.kotlin.test)
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}
