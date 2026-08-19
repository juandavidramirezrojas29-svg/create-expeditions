# FASE 1 — COMPILACIÓN DETALLADA

## 🎯 Objetivo

Compilar el proyecto base del mod Create: Expeditions para Minecraft 1.21.1 con:
- ✅ 27 items registrados
- ✅ 8 bloques registrados  
- ✅ 14 tipos de entidades definidas
- ✅ Creative tab "Expeditions"
- ✅ Sin errores de compilación

---

## ⚙️ Requisitos Previos

### 1. Java Development Kit (JDK)
```bash
# Verificar versión
java -version

# Requerido: Java 21+
# Si no tienes Java 21:
# - Windows: https://www.oracle.com/java/technologies/downloads/
# - Linux: sudo apt-get install openjdk-21-jdk
# - macOS: brew install openjdk@21
```

### 2. Gradle
```bash
# Opción A: Con Gradle instalado globalmente
gradle --version
# Debe mostrar: Gradle 8.x o superior

# Opción B: Usar el wrapper (incluido en el proyecto)
./gradlew --version  # Linux/macOS
gradlew.bat --version  # Windows
```

### 3. Conexión a Internet
- Maven Central: https://repo.maven.apache.org/maven2/
- NeoForge: https://maven.neoforged.net/releases/

---

## 📦 Estructura del Proyecto

El proyecto está organizado así:

```
create-expeditions/
├── build.gradle.kts          (Configuración Gradle)
├── settings.gradle.kts       (Settings Gradle)
├── gradle.properties         (Propiedades)
├── README.md                 (Documentación)
└── src/
    └── main/
        ├── java/             (Código fuente - 26 archivos)
        └── resources/        (Assets)
            ├── META-INF/     (mods.toml)
            ├── assets/       (Texturas, idiomas)
            └── data/         (Data gen)
```

---

## 🛠️ Pasos de Compilación

### PASO 1: Preparar el Ambiente

```bash
# 1. Navega al directorio del proyecto
cd create-expeditions

# 2. Verifica que existen los archivos clave
ls -la build.gradle.kts
ls -la settings.gradle.kts
ls -la gradle.properties
ls -la src/main/resources/META-INF/mods.toml

# Si falta alguno, descarga de nuevo el proyecto completo
```

### PASO 2: Descargar Dependencias

```bash
# Linux/macOS
./gradlew clean

# Windows
gradlew.bat clean

# Esto descargará:
# - NeoForge 21.1.12
# - Minecraft 1.21.1
# - Create (optional)
# - Todas las dependencias transitorias

# ⏱️ Tiempo estimado: 5-15 minutos (dependiendo de internet)
```

### PASO 3: Validar Compilación

```bash
# Linux/macOS
./gradlew compileJava

# Windows
gradlew.bat compileJava

# Esto compilará solo el código Java sin crear el JAR
# Si hay errores, aparecerán aquí

# ✅ Si termina sin errores:
# BUILD SUCCESSFUL
```

### PASO 4: Construir el JAR

```bash
# Linux/macOS
./gradlew build

# Windows
gradlew.bat build

# Esto:
# 1. Compila el código
# 2. Empaqueta los assets
# 3. Genera el archivo JAR
# 4. Ejecuta tests (si existen)

# ✅ Si todo va bien:
# BUILD SUCCESSFUL in Xs
```

### PASO 5: Verificar Resultado

```bash
# El JAR compilado estará en:
ls -la build/libs/

# Deberías ver:
# create-expeditions-0.1.0.jar (el mod compilado)

# Tamaño esperado: 50-100 KB
```

---

## 🎮 Instalar en Minecraft

### Opción 1: Desarrollo Local (Recomendado)

```bash
# Genera los archivos de desarrollo para ejecutar en IDE
./gradlew genEclipseRuns  # Para Eclipse
# o
./gradlew genIntellijRuns  # Para IntelliJ

# En IntelliJ, selecciona la configuración "Minecraft Client" y ejecuta
# En Eclipse, Run → Run As → Java Application
```

### Opción 2: Instalar en Cliente de Minecraft

```bash
# 1. Ubica tu carpeta de mods
# Windows: %APPDATA%/.minecraft/mods/
# Linux: ~/.minecraft/mods/
# macOS: ~/Library/Application Support/minecraft/mods/

# 2. Copia el JAR compilado
cp build/libs/create-expeditions-0.1.0.jar ~/.minecraft/mods/

# 3. Abre Minecraft con NeoForge
# (Debe tener NeoForge 21.1.12+ instalado)

# 4. Verifica en el log:
# [Expeditions] Common setup complete!
# [Expeditions] Client setup complete!

# 5. Entra a un mundo creativo
# - Creative Tab → "Expeditions"
# - Deberías ver 27 items y 8 bloques
```

---

## 🔍 Validación de la Compilación

### Checklist Post-Compilación

```
✅ Archivo build.gradle.kts está presente
✅ Java 21+ está instalado
✅ Gradle ejecutable sin errores
✅ No hay errores en compileJava
✅ BUILD SUCCESSFUL aparece
✅ create-expeditions-0.1.0.jar existe en build/libs/
✅ Tamaño del JAR > 10 KB
✅ mods.toml es válido (sin errores de TOML)
```

### Verificar en Minecraft

1. Lanza Minecraft con NeoForge
2. Mira el log (en el launcher)
3. Busca líneas que digan:
```
[Expeditions] Common setup complete!
[Expeditions] Client setup complete!
```

4. Entra a creative mode
5. Abre el inventario de creative
6. Busca la pestaña "Expeditions"
7. Verifica que ves:
   - 27 items (algunos con íconos grises/blancos)
   - 8 bloques
   - Nombres en inglés (en_us.json)

---

## 🐛 Errores Comunes y Soluciones

### Error: "Cannot find symbol"
```
Error location: ModEntityTypes.java line X

Solución:
1. Verifica que TODOS los archivos .java existen en las carpetas correctas
2. Ejecuta: ./gradlew clean
3. Verifica imports en cada archivo
```

### Error: "JSON Exception in mods.toml"
```
Solución:
1. Abre mods.toml con editor de texto
2. Verifica que NO hay caracteres especiales
3. Verifica indentación (debe ser espacios, no tabs)
4. Resguarda cambios y recompila
```

### Error: "No main manifest attribute"
```
Solución:
1. Esto es normal, no afecta el mod
2. El mod se carga desde mods.toml, no desde manifest
3. Ignora este error
```

### Error: "NeoForge dependency not found"
```
Solución:
1. Verifica conexión a Internet
2. Ejecuta: ./gradlew clean --refresh-dependencies
3. Espera a que descargue todas las dependencias
4. Reintenta compilación
```

### Error: "Create dependency error"
```
Solución:
Este error es esperado si Create no está disponible para 1.21.1
Es una dependencia OPCIONAL, no es crítica
1. Comenta la línea de Create en build.gradle.kts
2. El mod seguirá siendo compilable
```

---

## 📊 Información de Compilación Esperada

### Output Esperado (Exitoso)

```
Building 'Create Expeditions' 0.1.0 for Minecraft 1.21.1

[32 / 32] Compiling...

✅ Creating JAR file
✅ Registering 27 items
✅ Registering 8 blocks  
✅ Registering 14 entities
✅ Loading mods.toml

BUILD SUCCESSFUL in 45s

Artifacts:
- build/libs/create-expeditions-0.1.0.jar
```

### Archivos Generados

```
build/
├── classes/        (Archivos .class compilados)
├── libs/
│   └── create-expeditions-0.1.0.jar
├── resources/      (Assets compilados)
└── ... (otros archivos temporales)
```

---

## 🚀 Próximo Paso: FASE 2

Una vez que FASE 1 compila correctamente, procede a **FASE 2 — Worldgen**:

1. Crear estructuras (archivos .nbt)
2. Definir biomas
3. Crear loot tables (JSONs)
4. Implementar worldgen parameter sets
5. Crear la dimensión "Tierras Olvidadas"

Estimado: 10 días de desarrollo.

---

## 📞 Ayuda y Troubleshooting

Si tienes problemas durante la compilación:

1. **Revisa los logs completos**: `./gradlew build --info`
2. **Limpia el cache**: `./gradlew clean`
3. **Reinicia Gradle daemon**: `./gradlew --stop`
4. **Verifica estructura de carpetas**: Asegúrate de que coincide exactamente
5. **Valida archivos JSON**: Usa un validador JSON online

---

## 📝 Notas Finales

- **Sin texturas reales**: Items y bloques tendrán iconos placeholder
- **Sin IA**: Las entidades no se mueven de forma inteligente aún
- **Sin contenido mundo**: El Overworld no tiene nuevas estructuras
- **Sin dimensión propia**: Se añade en FASE 3
- **Sin integración Create**: Se añade en FASE 8

**Todo lo anterior es normal y esperado para FASE 1.**

---

**Estado**: ✅ Listo para compilar  
**Última actualización**: Agosto 2026  
**Próxima fase**: FASE 2 (Worldgen)
