package com.craftworkgames.expeditions.entity.enemies;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class MechanicalGuardianEntity extends Monster {
    public MechanicalGuardianEntity(EntityType<? extends MechanicalGuardianEntity> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, 30.0)
            .add(Attributes.FOLLOW_RANGE, 35.0)
            .add(Attributes.MOVEMENT_SPEED, 0.25)
            .add(Attributes.ATTACK_DAMAGE, 6.0)
            .add(Attributes.ATTACK_KNOCKBACK, 1.0)
            .add(Attributes.ARMOR, 2.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        // TODO: IA será implementada en FASE 4
    }
}
