plugins {
    id("java")
    alias(libs.plugins.lombok)
}

group = "com.gyoge"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

tasks.test {
    useJUnitPlatform()
}