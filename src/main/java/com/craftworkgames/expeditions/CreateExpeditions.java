package com.craftworkgames.expeditions;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

import com.craftworkgames.expeditions.core.ModBlocks;
import com.craftworkgames.expeditions.core.ModEntityTypes;
import com.craftworkgames.expeditions.core.ModItems;
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod("expeditions")
public class CreateExpeditions {
    public static final String MOD_ID = "expeditions";
    public static final Logger LOGGER = LoggerFactory.getLogger("Create: Expeditions");

    public CreateExpeditions(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("==============================================");
        LOGGER.info("Create: Expeditions v0.1.0 - INITIALIZATION");
        LOGGER.info("==============================================");

        // Registrar deferred registers
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);

        // Setup eventos
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(this::onAttributeCreation);

        LOGGER.info("==============================================");
        LOGGER.info("Registrations complete!");
        LOGGER.info("==============================================");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("[Expeditions] Common setup complete!");
    }

    private void onAttributeCreation(EntityAttributeCreationEvent event) {
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

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientEvents {
        @net.neoforged.neoforge.api.distmarker.OnlyIn(Dist.CLIENT)
        static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("[Expeditions] Client setup complete!");
        }
    }
}
