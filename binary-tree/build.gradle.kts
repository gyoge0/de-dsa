plugins {
    id("java")
}

group = "com.gyoge"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}
