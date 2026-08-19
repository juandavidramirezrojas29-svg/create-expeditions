package com.craftworkgames.expeditions.entity.enemies;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class AncientVigilantEntity extends Monster {
    public AncientVigilantEntity(EntityType<? extends AncientVigilantEntity> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
            .add(Attributes.MAX_HEALTH, 28.0)
            .add(Attributes.FOLLOW_RANGE, 33.0)
            .add(Attributes.MOVEMENT_SPEED, 0.26)
            .add(Attributes.ATTACK_DAMAGE, 6.5)
            .add(Attributes.ATTACK_KNOCKBACK, 1.3)
            .add(Attributes.ARMOR, 2.5);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }
}
