package com.craftworkgames.expeditions.entity.enemies.boss;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class BossGuardianEntity extends Monster {
    public BossGuardianEntity(EntityType<? extends BossGuardianEntity> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, 150.0)
            .add(Attributes.FOLLOW_RANGE, 50.0)
            .add(Attributes.MOVEMENT_SPEED, 0.20)
            .add(Attributes.ATTACK_DAMAGE, 12.0)
            .add(Attributes.ATTACK_KNOCKBACK, 2.0)
            .add(Attributes.ARMOR, 8.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }
}
