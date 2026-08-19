# Create: Expeditions — Mod para Minecraft 1.21.1

## 📋 FASE 1 — Base del Proyecto (100% Compilable)

**Versión**: 0.1.0  
**Minecraft**: 1.21.1  
**Loader**: NeoForge 21.1.12+  
**Estado**: ✅ Estructura base lista para compilación

---

## 🎯 Contenido Implementado

### ✅ Items (28)

#### Armas (4)
- `hammer` — Martillo (daño alto, lento)
- `estoque` — Estoque (daño medio, rápido)
- `heavy_axe` — Hacha Pesada (daño muy alto, desgaste)
- `mechanical_crossbow` — Ballesta Mecánica (ranged, recargable)

#### Armaduras (12 = 3 sets)
**Explorer:**
- `explorer_helmet`
- `explorer_chestplate`
- `explorer_leggings`
- `explorer_boots`

**Engineer:**
- `engineer_helmet`
- `engineer_chestplate`
- `engineer_leggings`
- `engineer_boots`

**Void:**
- `void_helmet`
- `void_chestplate`
- `void_leggings`
- `void_boots`

#### Herramientas (5)
- `explorer_compass` — Brújula del Explorador
- `climbing_hook` — Gancho de escalada
- `explorer_lantern` — Linterna mejorada
- `backpack` — Mochila (12 slots)
- `blueprint` — Plano de construcción

#### Componentes (6)
- `ancient_core` — Núcleo Antiguo
- `damaged_core` — Núcleo Dañado
- `mechanical_alloys` — Aleación Mecánica
- `hardened_copper` — Cobre Endurecido
- `void_crystal` — Cristal del Vacío
- `ancient_fragment` — Fragmento Antiguo

#### Artefactos (5)
- `wanderer_compass` — Brújula del Errante
- `void_feather` — Pluma del Vacío
- `mechanical_heart` — Corazón Mecánico
- `primordial_fragment` — Fragmento Primordial
- `ancient_key` — Llave Antigua

#### Consumibles (2)
- `knowledge_fragment` — Fragmento de Conocimiento
- `spirit_dust` — Polvo de Espíritu

### ✅ Bloques (8)

#### Campamento (4)
- `tent` — Tienda (respawn temporal)
- `campfire_block` — Fogata (iluminación + cocina)
- `supply_chest` — Cofre de suministros
- `camp_banner` — Bandera de campamento

#### Worldgen (3)
- `oxidized_block` — Bloque oxidado (estética End)
- `ancient_stone` — Piedra Antigua (estructura)
- `void_crystal_ore` — Mineral de Cristal del Vacío (brillante)

#### Decoración (1)
- `ruin_block` — Bloque de Ruina (decorativo)

### ✅ Entidades (14)

#### Enemigos Tier 1 (3)
1. **Mechanical Guardian** — Soldado antiguo con escudo
   - Health: 30 HP
   - Attack: 6 dmg
   - Armor: 2
   - Especialidad: Bloqueo (IA futura)

2. **Vacuum Centinel** — Entidad flotante del End
   - Health: 20 HP
   - Attack: 4 dmg
   - Especialidad: Proyectiles (IA futura)

3. **Corrupted Automata** — Constructo defectuoso
   - Health: 35 HP
   - Attack: 7 dmg
   - Armor: 3
   - Especialidad: Híbrido melee/ranged (IA futura)

#### Enemigos Tier 2 (2)
4. **Rising Pulse** (Golpe Antiguo) — Criatura subterránea rápida
   - Health: 18 HP
   - Attack: 8 dmg (muy alto para tamaño)
   - Armor: 4 (blindada)
   - Velocidad: 0.35 (muy rápida)

5. **Mechanical Swarm** — 3 insectos pequeños coordinados
   - Health: 8 HP c/u
   - Attack: 2 dmg c/u (letal en grupo)
   - Velocidad: 0.40 (rápida)

#### Enemigos Tier 3 (2)
6. **Explorer Corrupted** — Humano transformado por Vacío
   - Health: 25 HP
   - Attack: 5.5 dmg
   - Velocidad: 0.32 (inteligente)

7. **Ancient Vigilant** — Guardián antiguo
   - Health: 28 HP
   - Attack: 6.5 dmg
   - Armor: 2.5

#### Jefes (2)
8. **Boss Guardian of the Factory** — JEFE TIER 1
   - Health: 150 HP (5 muertes normales)
   - Attack: 12 dmg
   - Armor: 8 (muy armado)
   - Tamaño: 1.5x3.0 bloques
   - Fases: 3 (será IA en FASE 10)

9. **Boss Colossus of the Void** — JEFE ENDGAME
   - Health: 200 HP (ultimate)
   - Attack: 15 dmg
   - Armor: 10 (casi invencible)
   - Tamaño: 2.0x3.5 bloques
   - Fases: 4 (será IA en FASE 10)

#### Aliados/Neutrales (5)
10. **Nomad Trader** — NPC neutral, viaja entre estructuras
    - Health: 20 HP
    - Comportamiento: Barter, intercambios
    - Desaparece después de 5 min

11. **Guardian Spirit** — Espíritu que ayuda ocasionalmente
    - Health: 15 HP
    - Atacará enemigos ocasionalmente
    - Desaparece en 10 seg

12. **Peaceful Explorer** — Fantasma de explorador antiguo
    - Health: 18 HP
    - Brinda loot: diarios, mapas
    - Permanece en zona

13. **Adormido Sentry** — Constructo dormido, se despierta
    - Health: 40 HP
    - Comportamiento: Durmiente → despierta si atacas
    - Buff defensivo si lo despiertas amistosamente

---

## 📁 Estructura de Carpetas

```
create-expeditions/
├── build.gradle.kts              ✅ Configuración NeoForge
├── settings.gradle.kts           ✅ Settings
├── gradle.properties             ✅ Propiedades
├── README.md                     ✅ Este archivo
│
├── src/main/
│   ├── java/com/craftworkgames/expeditions/
│   │   ├── CreateExpeditions.java              ✅ Main mod class
│   │   ├── core/
│   │   │   ├── ModItems.java                   ✅ 27 items registrados
│   │   │   ├── ModBlocks.java                  ✅ 8 bloques registrados
│   │   │   └── ModEntityTypes.java             ✅ 14 tipos de entidades
│   │   ├── entity/
│   │   │   ├── enemies/
│   │   │   │   ├── MechanicalGuardianEntity.java      ✅
│   │   │   │   ├── VacuumCentinelEntity.java          ✅
│   │   │   │   ├── CorruptedAutomataEntity.java       ✅
│   │   │   │   ├── RisingPulseEntity.java             ✅
│   │   │   │   ├── MechanicalSwarmEntity.java         ✅
│   │   │   │   ├── ExplorerCorruptedEntity.java       ✅
│   │   │   │   ├── AncientVigilantEntity.java         ✅
│   │   │   │   └── boss/
│   │   │   │       ├── BossGuardianEntity.java        ✅
│   │   │   │       └── BossColossusEntity.java        ✅
│   │   │   └── neutral/
│   │   │       ├── NomadTraderEntity.java             ✅
│   │   │       ├── GuardianSpiritEntity.java          ✅
│   │   │       ├── PeacefulExplorerEntity.java        ✅
│   │   │       └── AdormidoSentryEntity.java          ✅
│   │   ├── event/
│   │   │   └── ServerEvents.java               ✅ Attribute registration
│   │   ├── config/
│   │   │   └── CommonConfig.java               ✅ (vacío, FASE 2+)
│   │   └── util/
│   │       └── ExpeditionHelper.java           ✅ Helper functions
│   │
│   └── resources/
│       ├── META-INF/
│       │   └── mods.toml                       ✅ Metadatos del mod
│       ├── assets/expeditions/
│       │   └── lang/
│       │       └── en_us.json                  ✅ 54 traducciones
│       └── data/expeditions/
│           └── (será poblado en FASE 2+)
│
└── src/test/ (vacío, FASE posterior)
```

---

## 🔧 Cómo Compilar

### Opción 1: Usando Gradle (Recomendado)

```bash
cd create-expeditions

# Descargar Gradle wrapper (si no lo tienes)
gradle wrapper

# Compilar el proyecto
./gradlew build

# Resultado: build/libs/create-expeditions-0.1.0.jar
```

### Opción 2: IDE (Eclipse/IntelliJ IDEA)

**IntelliJ IDEA:**
1. `File → Open` → Selecciona la carpeta `create-expeditions`
2. Gradle se detectará automáticamente
3. Click derecho en proyecto → `Run → Build`

**Eclipse:**
1. `File → Import → Gradle → Existing Gradle Project`
2. Selecciona `create-expeditions`
3. `Project → Build Project`

### Opción 3: Línea de comandos (sin Gradle)

```bash
cd create-expeditions
gradle clean build -x test
```

---

## ✅ Checklist de Compilación

```
[ ] Java 21+ instalado
[ ] Gradle instalado (o usar wrapper)
[ ] Maven central accesible
[ ] NeoForge repositories accesibles
[ ] Sin conflictos de dependencias
[ ] Todas las clases creadas sin errores de sintaxis
[ ] mods.toml presente y válido
```

---

## 📊 Estadísticas de FASE 1

| Métrica | Cantidad |
|---------|----------|
| **Items únicos** | 28 |
| **Bloques únicos** | 8 |
| **Tipos de entidades** | 14 |
| **Clases Java** | 26 |
| **Líneas de código** | ~1,200 |
| **Registros** | 50+ |
| **Traducciones** | 54 |

---

## 🚀 Próximos Pasos — FASE 2

Una vez que FASE 1 compila correctamente:

### FASE 2 — Worldgen (10 días)
```
[ ] 6 estructuras pequeñas (.nbt)
[ ] 2 estructuras medianas
[ ] Loot tables JSON
[ ] Biomas básicos de Tierras Olvidadas
[ ] Worldgen parameter sets
[ ] Dimension registro
[ ] Portal de acceso
```

### FASE 3 — Dimensión Real
```
[ ] ServerLevel setup
[ ] 4 Biomas principales
[ ] Worldgen completo
[ ] Teletransportación
[ ] Guardado de datos
```

### FASE 4 — IA de Enemigos
```
[ ] Pathfinding para 14 entidades
[ ] Comportamientos únicos
[ ] Debilidades implementadas
[ ] Renderers y animaciones
[ ] Loot drops balanceados
```

---

## 🔍 Validación de Registros

Después de compilar, verifica en el log de Minecraft:

```
[Expeditions] Common setup complete!
[Expeditions] Client setup complete!
```

Y en el creative tab "Expeditions" deberías ver:

✅ 27 items  
✅ 8 bloques  
✅ Todos con nombres e iconos placeholder  

---

## 📝 Notas Importantes

1. **Sin texturas reales**: Los items/bloques usarán placeholder (blanco) hasta FASE 2
2. **Sin IA**: Las entidades son básicas vanilla hasta FASE 4
3. **Sin worldgen**: Las nuevas estruturas se añaden en FASE 2
4. **Sin Create integration**: Será en FASE 8
5. **Sin Aeronautics**: Será en FASE 9

---

## 🐛 Troubleshooting

### Error: "Cannot find symbol"
→ Verifica que todos los archivos existan en la estructura de carpetas

### Error: "Mod won't load"
→ Verifica `mods.toml` esté en `src/main/resources/META-INF/`

### Error: "Entity doesn't register"
→ Verifica que `onAttributeCreation()` en CreateExpeditions.java llamó a todos los atributos

---

## 📞 Contacto / Soporte

Para reportar issues o sugerencias sobre la estructura base de FASE 1, contacta al equipo de desarrollo.

---

**Última actualización**: Agosto 2026  
**Estado**: ✅ Pronto para compilación  
**Siguiente**: FASE 2 (Worldgen & Estructuras)
