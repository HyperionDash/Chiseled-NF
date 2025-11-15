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
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}