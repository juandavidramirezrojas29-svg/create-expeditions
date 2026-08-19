plugins {
    id("java")
    id("net.neoforged.gradle.userdev") version "7.0.+"
}

group = "com.craftworkgames"
version = "0.1.0"
base.archivesName = "create-expeditions"

repositories {
    mavenCentral()
    maven("https://maven.neoforged.net/releases/")
    maven("https://maven.parchmentmc.org")
    maven("https://maven.minecraftforge.net/")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

minecraft {
    version = "1.21.1"
}

dependencies {
    // NeoForge
    implementation("net.neoforged:neoforge:21.1.+")
    
    // Create (compatible con 1.21.1)
    compileOnly("com.simibubi.create:create:0.5.1-mc1.21.1")
    
    // Para evitar problemas de compilación si Create no está
    runtimeOnly("com.simibubi.create:create:0.5.1-mc1.21.1")
}

tasks.withType(JavaCompile::class) {
    options.encoding = "UTF-8"
}

println("Gradle configuration loaded for NeoForge 1.21.1")
