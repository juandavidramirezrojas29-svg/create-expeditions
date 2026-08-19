package com.craftworkgames.expeditions.entity.enemies;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class RisingPulseEntity extends Monster {
    public RisingPulseEntity(EntityType<? extends RisingPulseEntity> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, 18.0)
            .add(Attributes.FOLLOW_RANGE, 25.0)
            .add(Attributes.MOVEMENT_SPEED, 0.35)
            .add(Attributes.ATTACK_DAMAGE, 8.0)
            .add(Attributes.ATTACK_KNOCKBACK, 2.0)
            .add(Attributes.ARMOR, 4.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        // IA en FASE 4
    }
}
