package com.craftworkgames.expeditions.core;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import com.craftworkgames.expeditions.CreateExpeditions;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = 
        DeferredRegister.createItems(CreateExpeditions.MOD_ID);

    // ========================
    // WEAPONS (4)
    // ========================
    public static final DeferredItem<Item> HAMMER = ITEMS.register("hammer",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ESTOQUE = ITEMS.register("estoque",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HEAVY_AXE = ITEMS.register("heavy_axe",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MECHANICAL_CROSSBOW = ITEMS.register("mechanical_crossbow",
        () -> new Item(new Item.Properties()));

    // ========================
    // EXPLORER ARMOR (4)
    // ========================
    public static final DeferredItem<Item> EXPLORER_HELMET = ITEMS.register("explorer_helmet",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> EXPLORER_CHESTPLATE = ITEMS.register("explorer_chestplate",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> EXPLORER_LEGGINGS = ITEMS.register("explorer_leggings",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> EXPLORER_BOOTS = ITEMS.register("explorer_boots",
        () -> new Item(new Item.Properties()));

    // ========================
    // ENGINEER ARMOR (4)
    // ========================
    public static final DeferredItem<Item> ENGINEER_HELMET = ITEMS.register("engineer_helmet",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENGINEER_CHESTPLATE = ITEMS.register("engineer_chestplate",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENGINEER_LEGGINGS = ITEMS.register("engineer_leggings",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENGINEER_BOOTS = ITEMS.register("engineer_boots",
        () -> new Item(new Item.Properties()));

    // ========================
    // VOID ARMOR (4)
    // ========================
    public static final DeferredItem<Item> VOID_HELMET = ITEMS.register("void_helmet",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VOID_CHESTPLATE = ITEMS.register("void_chestplate",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VOID_LEGGINGS = ITEMS.register("void_leggings",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VOID_BOOTS = ITEMS.register("void_boots",
        () -> new Item(new Item.Properties()));

    // ========================
    // TOOLS (4)
    // ========================
    public static final DeferredItem<Item> EXPLORER_COMPASS = ITEMS.register("explorer_compass",
        () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> CLIMBING_HOOK = ITEMS.register("climbing_hook",
        () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> EXPLORER_LANTERN = ITEMS.register("explorer_lantern",
        () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> BLUEPRINT = ITEMS.register("blueprint",
        () -> new Item(new Item.Properties().stacksTo(1)));

    // ========================
    // COMPONENTS (6)
    // ========================
    public static final DeferredItem<Item> ANCIENT_CORE = ITEMS.register("ancient_core",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DAMAGED_CORE = ITEMS.register("damaged_core",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MECHANICAL_ALLOYS = ITEMS.register("mechanical_alloys",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HARDENED_COPPER = ITEMS.register("hardened_copper",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VOID_CRYSTAL = ITEMS.register("void_crystal",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ANCIENT_FRAGMENT = ITEMS.register("ancient_fragment",
        () -> new Item(new Item.Properties()));

    // ========================
    // ARTIFACTS (5)
    // ========================
    public static final DeferredItem<Item> WANDERER_COMPASS = ITEMS.register("wanderer_compass",
        () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> VOID_FEATHER = ITEMS.register("void_feather",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MECHANICAL_HEART = ITEMS.register("mechanical_heart",
        () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> PRIMORDIAL_FRAGMENT = ITEMS.register("primordial_fragment",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ANCIENT_KEY = ITEMS.register("ancient_key",
        () -> new Item(new Item.Properties().stacksTo(1)));

    // ========================
    // CONSUMIBLES (2)
    // ========================
    public static final DeferredItem<Item> KNOWLEDGE_FRAGMENT = ITEMS.register("knowledge_fragment",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SPIRIT_DUST = ITEMS.register("spirit_dust",
        () -> new Item(new Item.Properties()));
}
