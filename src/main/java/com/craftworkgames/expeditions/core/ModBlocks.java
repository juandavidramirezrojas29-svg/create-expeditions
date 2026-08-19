package com.craftworkgames.expeditions.core;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import com.craftworkgames.expeditions.CreateExpeditions;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = 
        DeferredRegister.createBlocks(CreateExpeditions.MOD_ID);

    // ========================
    // CAMPGROUND BLOCKS (4)
    // ========================
    public static final DeferredBlock<Block> TENT = BLOCKS.register("tent",
        () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_LOG)
            .sound(SoundType.WOOL)));

    public static final DeferredBlock<Block> CAMPFIRE_BLOCK = BLOCKS.register("campfire_block",
        () -> new Block(Block.Properties.ofFullCopy(Blocks.CAMPFIRE)
            .sound(SoundType.WOOD)
            .lightLevel(state -> 15)));

    public static final DeferredBlock<Block> SUPPLY_CHEST = BLOCKS.register("supply_chest",
        () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_WOOD)
            .sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> CAMP_BANNER = BLOCKS.register("camp_banner",
        () -> new Block(Block.Properties.ofFullCopy(Blocks.STRUCTURE_BLOCK)
            .sound(SoundType.WOOL)));

    // ========================
    // WORLDGEN BLOCKS (3)
    // ========================
    public static final DeferredBlock<Block> OXIDIZED_BLOCK = BLOCKS.register("oxidized_block",
        () -> new Block(Block.Properties.ofFullCopy(Blocks.DEEPSLATE)
            .sound(SoundType.DEEPSLATE)
            .mapColor(MapColor.COLOR_CYAN)));

    public static final DeferredBlock<Block> ANCIENT_STONE = BLOCKS.register("ancient_stone",
        () -> new Block(Block.Properties.ofFullCopy(Blocks.BLACKSTONE)
            .sound(SoundType.STONE)
            .mapColor(MapColor.COLOR_GRAY)));

    public static final DeferredBlock<Block> VOID_CRYSTAL_ORE = BLOCKS.register("void_crystal_ore",
        () -> new Block(Block.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE)
            .sound(SoundType.DEEPSLATE)
            .lightLevel(state -> 7)
            .mapColor(MapColor.COLOR_PURPLE)));

    // ========================
    // STRUCTURE/DECORATION (1)
    // ========================
    public static final DeferredBlock<Block> RUIN_BLOCK = BLOCKS.register("ruin_block",
        () -> new Block(Block.Properties.ofFullCopy(Blocks.ANDESITE)
            .sound(SoundType.STONE)
            .mapColor(MapColor.STONE)));
}
