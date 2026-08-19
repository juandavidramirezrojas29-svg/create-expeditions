package com.craftworkgames.expeditions.entity.enemies;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class CorruptedAutomataEntity extends Monster {
    public CorruptedAutomataEntity(EntityType<? extends CorruptedAutomataEntity> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, 35.0)
            .add(Attributes.FOLLOW_RANGE, 30.0)
            .add(Attributes.MOVEMENT_SPEED, 0.28)
            .add(Attributes.ATTACK_DAMAGE, 7.0)
            .add(Attributes.ATTACK_KNOCKBACK, 1.5)
            .add(Attributes.ARMOR, 3.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        // IA en FASE 4
    }
}
