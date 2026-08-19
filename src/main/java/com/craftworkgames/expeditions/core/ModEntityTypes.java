package com.craftworkgames.expeditions.core;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegistryObject;

import com.craftworkgames.expeditions.CreateExpeditions;
import com.craftworkgames.expeditions.entity.enemies.AncientVigilantEntity;
import com.craftworkgames.expeditions.entity.enemies.CorruptedAutomataEntity;
import com.craftworkgames.expeditions.entity.enemies.ExplorerCorruptedEntity;
import com.craftworkgames.expeditions.entity.enemies.MechanicalGuardianEntity;
import com.craftworkgames.expeditions.entity.enemies.MechanicalSwarmEntity;
import com.craftworkgames.expeditions.entity.enemies.RisingPulseEntity;
import com.craftworkgames.expeditions.entity.enemies.VacuumCentinelEntity;
import com.craftworkgames.expeditions.entity.enemies.boss.BossColossusEntity;
import com.craftworkgames.expeditions.entity.enemies.boss.BossGuardianEntity;
import com.craftworkgames.expeditions.entity.neutral.AdormidoSentryEntity;
import com.craftworkgames.expeditions.entity.neutral.GuardianSpiritEntity;
import com.craftworkgames.expeditions.entity.neutral.NomadTraderEntity;
import com.craftworkgames.expeditions.entity.neutral.PeacefulExplorerEntity;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = 
        DeferredRegister.create(net.minecraft.core.registries.Registries.ENTITY_TYPE, CreateExpeditions.MOD_ID);

    // ========================
    // TIER 1 ENEMIES
    // ========================
    public static final RegistryObject<EntityType<MechanicalGuardianEntity>> MECHANICAL_GUARDIAN =
        ENTITY_TYPES.register("mechanical_guardian",
            () -> EntityType.Builder.of(MechanicalGuardianEntity::new, MobCategory.MONSTER)
                .sized(0.8f, 2.1f)
                .clientTrackingRange(10)
                .build("mechanical_guardian"));

    public static final RegistryObject<EntityType<VacuumCentinelEntity>> VACUUM_CENTINEL =
        ENTITY_TYPES.register("vacuum_centinel",
            () -> EntityType.Builder.of(VacuumCentinelEntity::new, MobCategory.MONSTER)
                .sized(0.6f, 1.0f)
                .clientTrackingRange(10)
                .build("vacuum_centinel"));

    public static final RegistryObject<EntityType<CorruptedAutomataEntity>> CORRUPTED_AUTOMATA =
        ENTITY_TYPES.register("corrupted_automata",
            () -> EntityType.Builder.of(CorruptedAutomataEntity::new, MobCategory.MONSTER)
                .sized(0.8f, 1.9f)
                .clientTrackingRange(10)
                .build("corrupted_automata"));

    // ========================
    // TIER 2 ENEMIES
    // ========================
    public static final RegistryObject<EntityType<RisingPulseEntity>> RISING_PULSE =
        ENTITY_TYPES.register("rising_pulse",
            () -> EntityType.Builder.of(RisingPulseEntity::new, MobCategory.MONSTER)
                .sized(0.5f, 0.8f)
                .clientTrackingRange(8)
                .build("rising_pulse"));

    public static final RegistryObject<EntityType<MechanicalSwarmEntity>> MECHANICAL_SWARM =
        ENTITY_TYPES.register("mechanical_swarm",
            () -> EntityType.Builder.of(MechanicalSwarmEntity::new, MobCategory.MONSTER)
                .sized(0.4f, 0.6f)
                .clientTrackingRange(8)
                .build("mechanical_swarm"));

    // ========================
    // TIER 3 ENEMIES
    // ========================
    public static final RegistryObject<EntityType<ExplorerCorruptedEntity>> EXPLORER_CORRUPTED =
        ENTITY_TYPES.register("explorer_corrupted",
            () -> EntityType.Builder.of(ExplorerCorruptedEntity::new, MobCategory.MONSTER)
                .sized(0.6f, 1.8f)
                .clientTrackingRange(10)
                .build("explorer_corrupted"));

    public static final RegistryObject<EntityType<AncientVigilantEntity>> ANCIENT_VIGILANT =
        ENTITY_TYPES.register("ancient_vigilant",
            () -> EntityType.Builder.of(AncientVigilantEntity::new, MobCategory.MONSTER)
                .sized(0.7f, 2.0f)
                .clientTrackingRange(10)
                .build("ancient_vigilant"));

    // ========================
    // BOSSES
    // ========================
    public static final RegistryObject<EntityType<BossGuardianEntity>> BOSS_GUARDIAN =
        ENTITY_TYPES.register("boss_guardian",
            () -> EntityType.Builder.of(BossGuardianEntity::new, MobCategory.MONSTER)
                .sized(1.5f, 3.0f)
                .clientTrackingRange(20)
                .build("boss_guardian"));

    public static final RegistryObject<EntityType<BossColossusEntity>> BOSS_COLOSSUS =
        ENTITY_TYPES.register("boss_colossus",
            () -> EntityType.Builder.of(BossColossusEntity::new, MobCategory.MONSTER)
                .sized(2.0f, 3.5f)
                .clientTrackingRange(30)
                .build("boss_colossus"));

    // ========================
    // NEUTRAL/ALLY ENTITIES
    // ========================
    public static final RegistryObject<EntityType<NomadTraderEntity>> NOMAD_TRADER =
        ENTITY_TYPES.register("nomad_trader",
            () -> EntityType.Builder.of(NomadTraderEntity::new, MobCategory.CREATURE)
                .sized(0.6f, 1.8f)
                .clientTrackingRange(10)
                .build("nomad_trader"));

    public static final RegistryObject<EntityType<GuardianSpiritEntity>> GUARDIAN_SPIRIT =
        ENTITY_TYPES.register("guardian_spirit",
            () -> EntityType.Builder.of(GuardianSpiritEntity::new, MobCategory.CREATURE)
                .sized(0.8f, 1.5f)
                .clientTrackingRange(10)
                .build("guardian_spirit"));

    public static final RegistryObject<EntityType<PeacefulExplorerEntity>> PEACEFUL_EXPLORER =
        ENTITY_TYPES.register("peaceful_explorer",
            () -> EntityType.Builder.of(PeacefulExplorerEntity::new, MobCategory.CREATURE)
                .sized(0.6f, 1.8f)
                .clientTrackingRange(10)
                .build("peaceful_explorer"));

    public static final RegistryObject<EntityType<AdormidoSentryEntity>> ADORMIDO_SENTRY =
        ENTITY_TYPES.register("adormido_sentry",
            () -> EntityType.Builder.of(AdormidoSentryEntity::new, MobCategory.CREATURE)
                .sized(0.9f, 2.2f)
                .clientTrackingRange(10)
                .build("adormido_sentry"));
}
