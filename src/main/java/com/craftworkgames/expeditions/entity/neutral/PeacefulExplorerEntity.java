package com.craftworkgames.expeditions.entity.neutral;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class PeacefulExplorerEntity extends Animal {
    public PeacefulExplorerEntity(EntityType<? extends PeacefulExplorerEntity> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
            .add(Attributes.MAX_HEALTH, 18.0)
            .add(Attributes.FOLLOW_RANGE, 20.0)
            .add(Attributes.MOVEMENT_SPEED, 0.24)
            .add(Attributes.ARMOR, 0.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(net.minecraft.world.entity.player.Player player, AgeableMob ageableMob) {
        return null;
    }
}
