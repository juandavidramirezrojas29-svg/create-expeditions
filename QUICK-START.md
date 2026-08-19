# ⚡ QUICK START — COMPILAR EN 5 MINUTOS

## 1️⃣ Verificar Requisitos

```bash
# Verificar Java
java -version
# Resultado esperado: java version "21" o superior

# Verificar Gradle (opcional, puedes usar wrapper)
gradle --version
# Resultado esperado: Gradle 8.x o superior
```

## 2️⃣ Compilar el Proyecto

### Opción A: Linux/macOS

```bash
cd create-expeditions

# Limpiar (opcional pero recomendado)
./gradlew clean

# Compilar
./gradlew build

# ✅ Resultado: build/libs/create-expeditions-0.1.0.jar
```

### Opción B: Windows

```cmd
cd create-expeditions

# Limpiar
gradlew.bat clean

# Compilar
gradlew.bat build

# ✅ Resultado: build/libs/create-expeditions-0.1.0.jar
```

### Opción C: Sin wrapper (necesita Gradle global)

```bash
cd create-expeditions
gradle clean build
```

---

## 3️⃣ Verificar Compilación

```bash
# Lista el archivo generado
ls -la build/libs/

# Debe existir:
# create-expeditions-0.1.0.jar (~50-100 KB)

# Verifica que el log termina con:
# BUILD SUCCESSFUL
```

---

## 4️⃣ Instalar en Minecraft

### A: Desarrollo Local (IDE)

```bash
# IntelliJ IDEA:
./gradlew genIntellijRuns
# → Run Configuration → Minecraft Client → Run

# Eclipse:
./gradlew genEclipseRuns
# → Run → Run As → Java Application
```

### B: Cliente Minecraft

```bash
# 1. Copia el JAR
cp build/libs/create-expeditions-0.1.0.jar ~/.minecraft/mods/

# 2. Abre Minecraft con NeoForge
# 3. Crea un mundo creativo
# 4. Busca Creative Tab "Expeditions"
# 5. Verifica que ves 27 items + 8 bloques
```

---

## 5️⃣ Validar en Minecraft

```
✅ Mod se carga sin crashes
✅ Creative tab "Expeditions" existe
✅ Items/bloques aparecen en creative
✅ Log muestra: "[Expeditions] Common setup complete!"
```

---

## 🐛 Si Algo Falla

```bash
# Limpiar cache completo
./gradlew clean --refresh-dependencies

# Recompilación forzada
./gradlew build --info

# Detener daemon de Gradle
./gradlew --stop

# Usar la última versión de Gradle
./gradlew wrapper --gradle-version=8.5
```

---

## 📊 Comando Rápido Completo

```bash
# One-liner (Linux/macOS)
cd create-expeditions && ./gradlew clean build && echo "✅ COMPILADO: build/libs/create-expeditions-0.1.0.jar"

# One-liner (Windows)
cd create-expeditions & gradlew.bat clean build & echo BUILD COMPLETE
```

---

## ⏱️ Tiempos Esperados

| Paso | Tiempo |
|------|--------|
| **Descarga de dependencias** | 5-10 min (1ª vez) |
| **Compilación** | 30-60 seg |
| **Generación JAR** | 10-20 seg |
| **Total** | 5-15 min (1ª vez) |
| **Recompilación** | 1-2 min (compilaciones posteriores) |

---

## 📁 Estructura Esperada Post-Compilación

```
create-expeditions/
├── build/
│   ├── libs/
│   │   └── create-expeditions-0.1.0.jar  ← El MOD
│   ├── classes/
│   ├── resources/
│   └── ... (archivos temporales)
├── src/ (sin cambios)
└── ... (archivos de configuración)
```

---

## 🎮 Verificación Minecraft

1. **Abre Minecraft Launcher**
2. **Profile**: Selecciona NeoForge 1.21.1
3. **Mods folder**: Coloca el JAR aquí
4. **Launch**: Click en Play
5. **World**: Crea uno en Creative
6. **Busca**: Creative Tab "Expeditions"
7. **Resultado**: 27 items + 8 bloques

---

## 📞 Problemas Comunes

**Error: "Command not found gradlew"**
→ Asegúrate de estar en el directorio correcto: `cd create-expeditions`

**Error: "Java version too low"**
→ Instala Java 21: https://www.oracle.com/java/technologies/downloads/

**Error: "NeoForge not found"**
→ Verifica Internet y ejecuta: `./gradlew clean --refresh-dependencies`

**Error: "JAVA_HOME not set"**
→ Linux: `export JAVA_HOME=/usr/lib/jvm/java-21`
→ Windows: Establece en Variables de Entorno

---

## ✅ Checklist Mínimo

```
[_] Java 21+ instalado
[_] Estoy en directorio create-expeditions/
[_] Ejecuté ./gradlew clean (o gradlew.bat clean en Windows)
[_] Ejecuté ./gradlew build (o gradlew.bat build en Windows)
[_] Veo "BUILD SUCCESSFUL"
[_] JAR existe en build/libs/
[_] Instalé en ~/.minecraft/mods/
[_] Minecraft tiene NeoForge 1.21.1
[_] Veo Creative Tab "Expeditions" en juego
```

---

**¡Listo! Tu mod Create: Expeditions está compilado y funcionando.** 🎉

Para documentación detallada: Ver `README.md` y `FASE1-COMPILACION.md`
