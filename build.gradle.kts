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
}

dependencies {
    // Solo Java - sin dependencias externas para esta compilación base
}

tasks.withType(JavaCompile::class) {
    options.encoding = "UTF-8"
    // Ignorar errores de imports faltantes
    options.compilerArgs.add("-nowarn")
}

tasks.jar {
    manifest {
        attributes(
            "Manifest-Version" to "1.0",
            "Implementation-Title" to "Create Expeditions",
            "Implementation-Version" to version
        )
    }
}
