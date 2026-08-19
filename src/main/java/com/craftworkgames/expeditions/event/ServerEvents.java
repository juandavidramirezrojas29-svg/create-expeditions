package com.craftworkgames.expeditions.event;

import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

import com.craftworkgames.expeditions.core.ModEntityTypes;
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

public class ServerEvents {
    public static void onAttributeCreation(EntityAttributeCreationEvent event) {
        // Enemies
        event.put(ModEntityTypes.MECHANICAL_GUARDIAN.get(), MechanicalGuardianEntity.createAttributes().build());
        event.put(ModEntityTypes.VACUUM_CENTINEL.get(), VacuumCentinelEntity.createAttributes().build());
        event.put(ModEntityTypes.CORRUPTED_AUTOMATA.get(), CorruptedAutomataEntity.createAttributes().build());
        event.put(ModEntityTypes.RISING_PULSE.get(), RisingPulseEntity.createAttributes().build());
        event.put(ModEntityTypes.MECHANICAL_SWARM.get(), MechanicalSwarmEntity.createAttributes().build());
        event.put(ModEntityTypes.EXPLORER_CORRUPTED.get(), ExplorerCorruptedEntity.createAttributes().build());
        event.put(ModEntityTypes.ANCIENT_VIGILANT.get(), AncientVigilantEntity.createAttributes().build());
        
        // Bosses
        event.put(ModEntityTypes.BOSS_GUARDIAN.get(), BossGuardianEntity.createAttributes().build());
        event.put(ModEntityTypes.BOSS_COLOSSUS.get(), BossColossusEntity.createAttributes().build());
        
        // Neutrals
        event.put(ModEntityTypes.NOMAD_TRADER.get(), NomadTraderEntity.createAttributes().build());
        event.put(ModEntityTypes.GUARDIAN_SPIRIT.get(), GuardianSpiritEntity.createAttributes().build());
        event.put(ModEntityTypes.PEACEFUL_EXPLORER.get(), PeacefulExplorerEntity.createAttributes().build());
        event.put(ModEntityTypes.ADORMIDO_SENTRY.get(), AdormidoSentryEntity.createAttributes().build());
    }
}
