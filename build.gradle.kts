plugins {
    id("java")
}

group = "com.craftworkgames"
version = "0.1.0"
base.archivesName = "create-expeditions"

repositories {
    mavenCentral()
    maven {
        name = "NeoForged"
        url = uri("https://maven.neoforged.net/releases/")
    }
    maven {
        name = "Minecraft Forge"
        url = uri("https://maven.minecraftforge.net/")
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

dependencies {
    // NeoForge API for 1.21.1
    compileOnly("net.neoforged:neoforge-api:21.1.0")
    
    // Minecraft 1.21.1 (for compilation only)
    compileOnly("net.neoforged.fancymodloader:neoforgeflame:21.1.0")
}

tasks.withType(JavaCompile::class) {
    options.encoding = "UTF-8"
}

tasks.jar {
    from("src/main/resources/")
}

println("✅ Gradle configured for NeoForge 1.21.1")
