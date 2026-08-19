package com.craftworkgames.expeditions.entity.enemies;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class VacuumCentinelEntity extends Monster {
    public VacuumCentinelEntity(EntityType<? extends VacuumCentinelEntity> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, 20.0)
            .add(Attributes.FOLLOW_RANGE, 40.0)
            .add(Attributes.MOVEMENT_SPEED, 0.30)
            .add(Attributes.ATTACK_DAMAGE, 4.0)
            .add(Attributes.ATTACK_KNOCKBACK, 0.5)
            .add(Attributes.ARMOR, 0.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        // IA en FASE 4
    }
}
