plugins {
    id("java")
}

group = "com.craftworkgames"
version = "0.1.0"
base.archivesName = "create-expeditions"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

dependencies {
    // Empty for now - this is a base mod skeleton
}

tasks.withType(JavaCompile::class) {
    options.encoding = "UTF-8"
}

tasks.jar {
    from("src/main/resources/")
}

println("✅ Gradle build configured for Create: Expeditions Mod")
