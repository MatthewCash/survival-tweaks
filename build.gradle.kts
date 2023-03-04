plugins {
    java
}

repositories {
    maven { url = uri("https://repo.papermc.io/repository/maven-public/") }
    mavenCentral()
}

dependencies {
    implementation("io.papermc.paper:paper-api:1.19.3-R0.1-SNAPSHOT")
    implementation("net.kyori:adventure-text-minimessage:4.11.0")
}

group = "com.matthewcash.network"
version = "1.0.0"
description = "Matthew_Cash Survival Tweaks"
java.sourceCompatibility = JavaVersion.VERSION_17
