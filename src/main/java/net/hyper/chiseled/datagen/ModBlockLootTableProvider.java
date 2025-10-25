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
        dropSelf(ModBlocks.POLISHED_STONE.get());
        dropSelf(ModBlocks.CRACKED_POLISHED_STONE.get());
        dropSelf(ModBlocks.POLISHED_STONE_STAIRS.get());
        add(ModBlocks.POLISHED_STONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_STONE_SLAB.get()));
        dropSelf(ModBlocks.POLISHED_STONE_WALL.get());

        dropSelf(ModBlocks.CRACKED_CHISELED_STONE_BRICKS.get());

        dropSelf(ModBlocks.STONE_TILES.get());
        dropSelf(ModBlocks.CRACKED_STONE_TILES.get());
        dropSelf(ModBlocks.STONE_TILE_STAIRS.get());
        add(ModBlocks.STONE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.STONE_TILE_SLAB.get()));
        dropSelf(ModBlocks.STONE_TILE_WALL.get());

        dropSelf(ModBlocks.SMALL_STONE_BRICKS.get());
        dropSelf(ModBlocks.CRACKED_SMALL_STONE_BRICKS.get());
        dropSelf(ModBlocks.SMALL_STONE_BRICK_STAIRS.get());
        add(ModBlocks.SMALL_STONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SMALL_STONE_BRICK_SLAB.get()));
        dropSelf(ModBlocks.SMALL_STONE_BRICK_WALL.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}