package net.hyper.chiseled.datagen;

import net.hyper.chiseled.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.STONE_WALL.get());

        dropSelf(ModBlocks.POLISHED_STONE.get());
        dropSelf(ModBlocks.POLISHED_STONE_STAIRS.get());
        add(ModBlocks.POLISHED_STONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_STONE_SLAB.get()));
        dropSelf(ModBlocks.POLISHED_STONE_WALL.get());

        dropSelf(ModBlocks.MOSSY_POLISHED_STONE.get());
        dropSelf(ModBlocks.MOSSY_POLISHED_STONE_STAIRS.get());
        add(ModBlocks.MOSSY_POLISHED_STONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSSY_POLISHED_STONE_SLAB.get()));
        dropSelf(ModBlocks.MOSSY_POLISHED_STONE_WALL.get());

        dropSelf(ModBlocks.CRACKED_CHISELED_STONE_BRICKS.get());
        dropSelf(ModBlocks.MOSSY_CHISELED_STONE_BRICKS.get());

        dropSelf(ModBlocks.STONE_TILES.get());
        dropSelf(ModBlocks.CRACKED_STONE_TILES.get());
        dropSelf(ModBlocks.STONE_TILE_STAIRS.get());
        add(ModBlocks.STONE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.STONE_TILE_SLAB.get()));

        dropSelf(ModBlocks.MOSSY_STONE_TILES.get());
        dropSelf(ModBlocks.MOSSY_STONE_TILE_STAIRS.get());
        add(ModBlocks.MOSSY_STONE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSSY_STONE_TILE_SLAB.get()));

        dropSelf(ModBlocks.SMALL_STONE_BRICKS.get());
        dropSelf(ModBlocks.CRACKED_SMALL_STONE_BRICKS.get());
        dropSelf(ModBlocks.SMALL_STONE_BRICK_STAIRS.get());
        add(ModBlocks.SMALL_STONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SMALL_STONE_BRICK_SLAB.get()));
        dropSelf(ModBlocks.SMALL_STONE_BRICK_WALL.get());

        dropSelf(ModBlocks.MOSSY_SMALL_STONE_BRICKS.get());
        dropSelf(ModBlocks.MOSSY_SMALL_STONE_BRICK_STAIRS.get());
        add(ModBlocks.MOSSY_SMALL_STONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSSY_SMALL_STONE_BRICK_SLAB.get()));
        dropSelf(ModBlocks.MOSSY_SMALL_STONE_BRICK_WALL.get());

        dropSelf(ModBlocks.MIXED_STONE_TILES.get());
        add(ModBlocks.MIXED_STONE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MIXED_STONE_TILE_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_GRANITE_WALL.get());

        dropSelf(ModBlocks.POLISHED_GRANITE_BRICKS.get());
        dropSelf(ModBlocks.CRACKED_POLISHED_GRANITE_BRICKS.get());
        dropSelf(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS.get());
        add(ModBlocks.POLISHED_GRANITE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_GRANITE_BRICK_SLAB.get()));
        dropSelf(ModBlocks.POLISHED_GRANITE_BRICK_WALL.get());

        dropSelf(ModBlocks.CHISELED_POLISHED_GRANITE_BRICKS.get());

        dropSelf(ModBlocks.POLISHED_GRANITE_TILES.get());
        dropSelf(ModBlocks.CRACKED_POLISHED_GRANITE_TILES.get());
        dropSelf(ModBlocks.POLISHED_GRANITE_TILE_STAIRS.get());
        add(ModBlocks.POLISHED_GRANITE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_GRANITE_TILE_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_DIORITE_WALL.get());

        dropSelf(ModBlocks.POLISHED_DIORITE_BRICKS.get());
        dropSelf(ModBlocks.CRACKED_POLISHED_DIORITE_BRICKS.get());
        dropSelf(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS.get());
        add(ModBlocks.POLISHED_DIORITE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_DIORITE_BRICK_SLAB.get()));
        dropSelf(ModBlocks.POLISHED_DIORITE_BRICK_WALL.get());

        dropSelf(ModBlocks.CHISELED_POLISHED_DIORITE_BRICKS.get());

        dropSelf(ModBlocks.POLISHED_DIORITE_TILES.get());
        dropSelf(ModBlocks.CRACKED_POLISHED_DIORITE_TILES.get());
        dropSelf(ModBlocks.POLISHED_DIORITE_TILE_STAIRS.get());
        add(ModBlocks.POLISHED_DIORITE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_DIORITE_TILE_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_ANDESITE_WALL.get());

        dropSelf(ModBlocks.POLISHED_ANDESITE_BRICKS.get());
        dropSelf(ModBlocks.CRACKED_POLISHED_ANDESITE_BRICKS.get());
        dropSelf(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS.get());
        add(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB.get()));
        dropSelf(ModBlocks.POLISHED_ANDESITE_BRICK_WALL.get());

        dropSelf(ModBlocks.CHISELED_POLISHED_ANDESITE_BRICKS.get());

        dropSelf(ModBlocks.POLISHED_ANDESITE_TILES.get());
        dropSelf(ModBlocks.CRACKED_POLISHED_ANDESITE_TILES.get());
        dropSelf(ModBlocks.POLISHED_ANDESITE_TILE_STAIRS.get());
        add(ModBlocks.POLISHED_ANDESITE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_ANDESITE_TILE_SLAB.get()));

        dropSelf(ModBlocks.DEEPSLATE_TILES.get());
        dropSelf(ModBlocks.CRACKED_DEEPSLATE_TILES.get());
        dropSelf(ModBlocks.DEEPSLATE_TILE_STAIRS.get());
        add(ModBlocks.DEEPSLATE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DEEPSLATE_TILE_SLAB.get()));

        dropSelf(ModBlocks.MOSSY_BRICKS.get());
        dropSelf(ModBlocks.MOSSY_BRICK_STAIRS.get());
        add(ModBlocks.MOSSY_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSSY_BRICK_SLAB.get()));
        dropSelf(ModBlocks.MOSSY_BRICK_WALL.get());

        dropSelf(ModBlocks.WEATHERED_BRICKS.get());
        dropSelf(ModBlocks.WEATHERED_BRICK_STAIRS.get());
        add(ModBlocks.WEATHERED_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WEATHERED_BRICK_SLAB.get()));
        dropSelf(ModBlocks.WEATHERED_BRICK_WALL.get());

        dropSelf(ModBlocks.PACKED_MUD_STAIRS.get());
        add(ModBlocks.PACKED_MUD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PACKED_MUD_SLAB.get()));
        dropSelf(ModBlocks.PACKED_MUD_WALL.get());

        dropSelf(ModBlocks.MOSSY_MUD_BRICKS.get());
        dropSelf(ModBlocks.MOSSY_MUD_BRICK_STAIRS.get());
        add(ModBlocks.MOSSY_MUD_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSSY_MUD_BRICK_SLAB.get()));
        dropSelf(ModBlocks.MOSSY_MUD_BRICK_WALL.get());

        dropSelf(ModBlocks.MUD_TILES.get());
        dropSelf(ModBlocks.MUD_TILE_STAIRS.get());
        add(ModBlocks.MUD_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MUD_TILE_SLAB.get()));

        dropSelf(ModBlocks.MOSSY_MUD_TILES.get());
        dropSelf(ModBlocks.MOSSY_MUD_TILE_STAIRS.get());
        add(ModBlocks.MOSSY_MUD_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSSY_MUD_TILE_SLAB.get()));

        dropSelf(ModBlocks.SMALL_MUD_BRICKS.get());
        dropSelf(ModBlocks.SMALL_MUD_BRICK_STAIRS.get());
        add(ModBlocks.SMALL_MUD_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SMALL_MUD_BRICK_SLAB.get()));
        dropSelf(ModBlocks.SMALL_MUD_BRICK_WALL.get());

        dropSelf(ModBlocks.MOSSY_SMALL_MUD_BRICKS.get());
        dropSelf(ModBlocks.MOSSY_SMALL_MUD_BRICK_STAIRS.get());
        add(ModBlocks.MOSSY_SMALL_MUD_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSSY_SMALL_MUD_BRICK_SLAB.get()));
        dropSelf(ModBlocks.MOSSY_SMALL_MUD_BRICK_WALL.get());

        dropSelf(ModBlocks.SMOOTH_SANDSTONE_WALL.get());

        dropSelf(ModBlocks.SANDSTONE_BRICKS.get());
        dropSelf(ModBlocks.CRACKED_SANDSTONE_BRICKS.get());
        dropSelf(ModBlocks.SANDSTONE_BRICK_STAIRS.get());
        add(ModBlocks.SANDSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SANDSTONE_BRICK_SLAB.get()));
        dropSelf(ModBlocks.SANDSTONE_BRICK_WALL.get());

        dropSelf(ModBlocks.SANDSTONE_TILES.get());
        dropSelf(ModBlocks.CRACKED_SANDSTONE_TILES.get());
        dropSelf(ModBlocks.SANDSTONE_TILE_STAIRS.get());
        add(ModBlocks.SANDSTONE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SANDSTONE_TILE_SLAB.get()));

        dropSelf(ModBlocks.MIXED_SANDSTONE_TILES.get());
        add(ModBlocks.MIXED_SANDSTONE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MIXED_SANDSTONE_TILE_SLAB.get()));

        dropSelf(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get());

        dropSelf(ModBlocks.RED_SANDSTONE_BRICKS.get());
        dropSelf(ModBlocks.CRACKED_RED_SANDSTONE_BRICKS.get());
        dropSelf(ModBlocks.RED_SANDSTONE_BRICK_STAIRS.get());
        add(ModBlocks.RED_SANDSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RED_SANDSTONE_BRICK_SLAB.get()));
        dropSelf(ModBlocks.RED_SANDSTONE_BRICK_WALL.get());

        dropSelf(ModBlocks.RED_SANDSTONE_TILES.get());
        dropSelf(ModBlocks.CRACKED_RED_SANDSTONE_TILES.get());
        dropSelf(ModBlocks.RED_SANDSTONE_TILE_STAIRS.get());
        add(ModBlocks.RED_SANDSTONE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RED_SANDSTONE_TILE_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_PRISMARINE.get());
        dropSelf(ModBlocks.POLISHED_PRISMARINE_STAIRS.get());
        add(ModBlocks.POLISHED_PRISMARINE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_PRISMARINE_SLAB.get()));
        dropSelf(ModBlocks.POLISHED_PRISMARINE_WALL.get());

        dropSelf(ModBlocks.PRISMARINE_BRICK_WALL.get());

        dropSelf(ModBlocks.PRISMARINE_TILES.get());
        dropSelf(ModBlocks.PRISMARINE_TILE_STAIRS.get());
        add(ModBlocks.PRISMARINE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PRISMARINE_TILE_SLAB.get()));

        dropSelf(ModBlocks.MIXED_PRISMARINE_TILES.get());
        add(ModBlocks.MIXED_PRISMARINE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MIXED_PRISMARINE_TILE_SLAB.get()));

        dropSelf(ModBlocks.DARK_PRISMARINE_WALL.get());

        dropSelf(ModBlocks.DARK_PRISMARINE_TILES.get());
        dropSelf(ModBlocks.DARK_PRISMARINE_TILE_STAIRS.get());
        add(ModBlocks.DARK_PRISMARINE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_PRISMARINE_TILE_SLAB.get()));

        dropSelf(ModBlocks.SMOOTH_BASALT_STAIRS.get());
        add(ModBlocks.SMOOTH_BASALT_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SMOOTH_BASALT_SLAB.get()));
        dropSelf(ModBlocks.SMOOTH_BASALT_WALL.get());
        
        dropSelf(ModBlocks.GILDED_BLACKSTONE_STAIRS.get());
        add(ModBlocks.GILDED_BLACKSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GILDED_BLACKSTONE_SLAB.get()));
        dropSelf(ModBlocks.GILDED_BLACKSTONE_WALL.get());

        dropSelf(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.get());
        dropSelf(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_STAIRS.get());
        add(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_SLAB.get()));
        dropSelf(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_WALL.get());

        dropSelf(ModBlocks.POLISHED_BLACKSTONE_TILES.get());
        dropSelf(ModBlocks.CRACKED_POLISHED_BLACKSTONE_TILES.get());
        dropSelf(ModBlocks.POLISHED_BLACKSTONE_TILE_STAIRS.get());
        add(ModBlocks.POLISHED_BLACKSTONE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_BLACKSTONE_TILE_SLAB.get()));

        dropSelf(ModBlocks.GILDED_POLISHED_BLACKSTONE_TILES.get());
        dropSelf(ModBlocks.GILDED_POLISHED_BLACKSTONE_TILE_STAIRS.get());
        add(ModBlocks.GILDED_POLISHED_BLACKSTONE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GILDED_POLISHED_BLACKSTONE_TILE_SLAB.get()));

        dropSelf(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICKS.get());
        dropSelf(ModBlocks.CRACKED_SMALL_POLISHED_BLACKSTONE_BRICKS.get());
        dropSelf(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS.get());
        add(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICK_SLAB.get()));
        dropSelf(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICK_WALL.get());

        dropSelf(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICKS.get());
        dropSelf(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS.get());
        add(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_SLAB.get()));
        dropSelf(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_WALL.get());

        dropSelf(ModBlocks.END_STONE_STAIRS.get());
        add(ModBlocks.END_STONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.END_STONE_SLAB.get()));
        dropSelf(ModBlocks.END_STONE_WALL.get());

        dropSelf(ModBlocks.POLISHED_END_STONE.get());
        dropSelf(ModBlocks.POLISHED_END_STONE_STAIRS.get());
        add(ModBlocks.POLISHED_END_STONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_END_STONE_SLAB.get()));
        dropSelf(ModBlocks.POLISHED_END_STONE_WALL.get());

        dropSelf(ModBlocks.CRACKED_END_STONE_BRICKS.get());
        dropSelf(ModBlocks.CHISELED_END_STONE_BRICKS.get());

        dropSelf(ModBlocks.END_STONE_TILES.get());
        dropSelf(ModBlocks.CRACKED_END_STONE_TILES.get());
        dropSelf(ModBlocks.END_STONE_TILE_STAIRS.get());
        add(ModBlocks.END_STONE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.END_STONE_TILE_SLAB.get()));

        dropSelf(ModBlocks.SMALL_END_STONE_BRICKS.get());
        dropSelf(ModBlocks.CRACKED_SMALL_END_STONE_BRICKS.get());
        dropSelf(ModBlocks.SMALL_END_STONE_BRICK_STAIRS.get());
        add(ModBlocks.SMALL_END_STONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SMALL_END_STONE_BRICK_SLAB.get()));
        dropSelf(ModBlocks.SMALL_END_STONE_BRICK_WALL.get());

        dropSelf(ModBlocks.NETHERITE_STAIRS.get());

        dropSelf(ModBlocks.QUARTZ_WALL.get());
        dropSelf(ModBlocks.SMOOTH_QUARTZ_WALL.get());

        dropSelf(ModBlocks.QUARTZ_BRICK_STAIRS.get());
        add(ModBlocks.QUARTZ_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.QUARTZ_BRICK_SLAB.get()));
        dropSelf(ModBlocks.QUARTZ_BRICK_WALL.get());

        dropSelf(ModBlocks.QUARTZ_TILES.get());
        dropSelf(ModBlocks.QUARTZ_TILE_STAIRS.get());
        add(ModBlocks.QUARTZ_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.QUARTZ_TILE_SLAB.get()));

        dropSelf(ModBlocks.AMETHYST_STAIRS.get());
        add(ModBlocks.AMETHYST_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.AMETHYST_SLAB.get()));
        dropSelf(ModBlocks.AMETHYST_WALL.get());

        dropSelf(ModBlocks.AMETHYST_BRICKS.get());
        dropSelf(ModBlocks.AMETHYST_BRICK_STAIRS.get());
        add(ModBlocks.AMETHYST_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.AMETHYST_BRICK_SLAB.get()));
        dropSelf(ModBlocks.AMETHYST_BRICK_WALL.get());

        dropSelf(ModBlocks.AMETHYST_TILES.get());
        dropSelf(ModBlocks.AMETHYST_TILE_STAIRS.get());
        add(ModBlocks.AMETHYST_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.AMETHYST_TILE_SLAB.get()));

        dropSelf(ModBlocks.TERRACOTTA_STAIRS.get());
        add(ModBlocks.TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.WHITE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.WHITE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WHITE_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.WHITE_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.GRAY_TERRACOTTA_STAIRS.get());
        add(ModBlocks.GRAY_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GRAY_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.GRAY_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.BLACK_TERRACOTTA_STAIRS.get());
        add(ModBlocks.BLACK_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLACK_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.BLACK_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.BROWN_TERRACOTTA_STAIRS.get());
        add(ModBlocks.BROWN_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BROWN_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.BROWN_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.RED_TERRACOTTA_STAIRS.get());
        add(ModBlocks.RED_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RED_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.RED_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.ORANGE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ORANGE_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.ORANGE_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get());
        add(ModBlocks.YELLOW_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.YELLOW_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.YELLOW_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.LIME_TERRACOTTA_STAIRS.get());
        add(ModBlocks.LIME_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIME_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.LIME_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.GREEN_TERRACOTTA_STAIRS.get());
        add(ModBlocks.GREEN_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GREEN_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.GREEN_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.CYAN_TERRACOTTA_STAIRS.get());
        add(ModBlocks.CYAN_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CYAN_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.CYAN_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.BLUE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.BLUE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLUE_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.BLUE_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get());
        add(ModBlocks.PURPLE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PURPLE_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.PURPLE_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
        add(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.MAGENTA_TERRACOTTA_WALL.get());
        dropSelf(ModBlocks.PINK_TERRACOTTA_STAIRS.get());
        add(ModBlocks.PINK_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PINK_TERRACOTTA_SLAB.get()));
        dropSelf(ModBlocks.PINK_TERRACOTTA_WALL.get());

        dropSelf(ModBlocks.WHITE_CONCRETE_STAIRS.get());
        add(ModBlocks.WHITE_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WHITE_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.WHITE_CONCRETE_WALL.get());
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
        add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
        dropSelf(ModBlocks.GRAY_CONCRETE_STAIRS.get());
        add(ModBlocks.GRAY_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GRAY_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.GRAY_CONCRETE_WALL.get());
        dropSelf(ModBlocks.BLACK_CONCRETE_STAIRS.get());
        add(ModBlocks.BLACK_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLACK_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.BLACK_CONCRETE_WALL.get());
        dropSelf(ModBlocks.BROWN_CONCRETE_STAIRS.get());
        add(ModBlocks.BROWN_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BROWN_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.BROWN_CONCRETE_WALL.get());
        dropSelf(ModBlocks.RED_CONCRETE_STAIRS.get());
        add(ModBlocks.RED_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RED_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.RED_CONCRETE_WALL.get());
        dropSelf(ModBlocks.ORANGE_CONCRETE_STAIRS.get());
        add(ModBlocks.ORANGE_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ORANGE_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.ORANGE_CONCRETE_WALL.get());
        dropSelf(ModBlocks.YELLOW_CONCRETE_STAIRS.get());
        add(ModBlocks.YELLOW_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.YELLOW_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.YELLOW_CONCRETE_WALL.get());
        dropSelf(ModBlocks.LIME_CONCRETE_STAIRS.get());
        add(ModBlocks.LIME_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIME_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.LIME_CONCRETE_WALL.get());
        dropSelf(ModBlocks.GREEN_CONCRETE_STAIRS.get());
        add(ModBlocks.GREEN_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GREEN_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.GREEN_CONCRETE_WALL.get());
        dropSelf(ModBlocks.CYAN_CONCRETE_STAIRS.get());
        add(ModBlocks.CYAN_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CYAN_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.CYAN_CONCRETE_WALL.get());
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
        add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
        dropSelf(ModBlocks.BLUE_CONCRETE_STAIRS.get());
        add(ModBlocks.BLUE_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLUE_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.BLUE_CONCRETE_WALL.get());
        dropSelf(ModBlocks.PURPLE_CONCRETE_STAIRS.get());
        add(ModBlocks.PURPLE_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PURPLE_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.PURPLE_CONCRETE_WALL.get());
        dropSelf(ModBlocks.MAGENTA_CONCRETE_STAIRS.get());
        add(ModBlocks.MAGENTA_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MAGENTA_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.MAGENTA_CONCRETE_WALL.get());
        dropSelf(ModBlocks.PINK_CONCRETE_STAIRS.get());
        add(ModBlocks.PINK_CONCRETE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PINK_CONCRETE_SLAB.get()));
        dropSelf(ModBlocks.PINK_CONCRETE_WALL.get());
        
        dropSelf(ModBlocks.CALCITE_STAIRS.get());
        add(ModBlocks.CALCITE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CALCITE_SLAB.get()));
        dropSelf(ModBlocks.CALCITE_WALL.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}