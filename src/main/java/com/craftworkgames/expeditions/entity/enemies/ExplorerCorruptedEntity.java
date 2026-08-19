package com.craftworkgames.expeditions.entity.enemies;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class ExplorerCorruptedEntity extends Monster {
    public ExplorerCorruptedEntity(EntityType<? extends ExplorerCorruptedEntity> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, 25.0)
            .add(Attributes.FOLLOW_RANGE, 32.0)
            .add(Attributes.MOVEMENT_SPEED, 0.32)
            .add(Attributes.ATTACK_DAMAGE, 5.5)
            .add(Attributes.ATTACK_KNOCKBACK, 1.2)
            .add(Attributes.ARMOR, 1.5);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }
}
