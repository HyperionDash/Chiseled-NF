package net.hyper.chiseled.datagen;

import net.hyper.chiseled.Chiseled;
import net.hyper.chiseled.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Chiseled.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.STONE_WALL.get())

                .add(ModBlocks.POLISHED_STONE.get())
                .add(ModBlocks.POLISHED_STONE_STAIRS.get())
                .add(ModBlocks.POLISHED_STONE_SLAB.get())
                .add(ModBlocks.POLISHED_STONE_WALL.get())

                .add(ModBlocks.MOSSY_POLISHED_STONE.get())
                .add(ModBlocks.MOSSY_POLISHED_STONE_STAIRS.get())
                .add(ModBlocks.MOSSY_POLISHED_STONE_SLAB.get())
                .add(ModBlocks.MOSSY_POLISHED_STONE_WALL.get())

                .add(ModBlocks.CRACKED_CHISELED_STONE_BRICKS.get())
                .add(ModBlocks.MOSSY_CHISELED_STONE_BRICKS.get())

                .add(ModBlocks.STONE_TILES.get())
                .add(ModBlocks.CRACKED_STONE_TILES.get())
                .add(ModBlocks.STONE_TILE_STAIRS.get())
                .add(ModBlocks.STONE_TILE_SLAB.get())

                .add(ModBlocks.MOSSY_STONE_TILES.get())
                .add(ModBlocks.MOSSY_STONE_TILE_STAIRS.get())
                .add(ModBlocks.MOSSY_STONE_TILE_SLAB.get())

                .add(ModBlocks.SMALL_STONE_BRICKS.get())
                .add(ModBlocks.CRACKED_SMALL_STONE_BRICKS.get())
                .add(ModBlocks.SMALL_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.SMALL_STONE_BRICK_SLAB.get())
                .add(ModBlocks.SMALL_STONE_BRICK_WALL.get())

                .add(ModBlocks.MOSSY_SMALL_STONE_BRICKS.get())
                .add(ModBlocks.MOSSY_SMALL_STONE_BRICK_STAIRS.get())
                .add(ModBlocks.MOSSY_SMALL_STONE_BRICK_SLAB.get())
                .add(ModBlocks.MOSSY_SMALL_STONE_BRICK_WALL.get())

                .add(ModBlocks.POLISHED_GRANITE_WALL.get())

                .add(ModBlocks.POLISHED_GRANITE_BRICKS.get())
                .add(ModBlocks.CRACKED_POLISHED_GRANITE_BRICKS.get())
                .add(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS.get())
                .add(ModBlocks.POLISHED_GRANITE_BRICK_SLAB.get())
                .add(ModBlocks.POLISHED_GRANITE_BRICK_WALL.get())

                .add(ModBlocks.POLISHED_GRANITE_TILES.get())
                .add(ModBlocks.CRACKED_POLISHED_GRANITE_TILES.get())
                .add(ModBlocks.POLISHED_GRANITE_TILE_STAIRS.get())
                .add(ModBlocks.POLISHED_GRANITE_TILE_SLAB.get())

                .add(ModBlocks.POLISHED_DIORITE_WALL.get())

                .add(ModBlocks.POLISHED_DIORITE_BRICKS.get())
                .add(ModBlocks.CRACKED_POLISHED_DIORITE_BRICKS.get())
                .add(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS.get())
                .add(ModBlocks.POLISHED_DIORITE_BRICK_SLAB.get())
                .add(ModBlocks.POLISHED_DIORITE_BRICK_WALL.get())

                .add(ModBlocks.POLISHED_DIORITE_TILES.get())
                .add(ModBlocks.CRACKED_POLISHED_DIORITE_TILES.get())
                .add(ModBlocks.POLISHED_DIORITE_TILE_STAIRS.get())
                .add(ModBlocks.POLISHED_DIORITE_TILE_SLAB.get())
        
                .add(ModBlocks.POLISHED_ANDESITE_WALL.get())

                .add(ModBlocks.POLISHED_ANDESITE_BRICKS.get())
                .add(ModBlocks.CRACKED_POLISHED_ANDESITE_BRICKS.get())
                .add(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS.get())
                .add(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB.get())
                .add(ModBlocks.POLISHED_ANDESITE_BRICK_WALL.get())

                .add(ModBlocks.POLISHED_ANDESITE_TILES.get())
                .add(ModBlocks.CRACKED_POLISHED_ANDESITE_TILES.get())
                .add(ModBlocks.POLISHED_ANDESITE_TILE_STAIRS.get())
                .add(ModBlocks.POLISHED_ANDESITE_TILE_SLAB.get());

        tag(BlockTags.WALLS)
                .add(ModBlocks.STONE_WALL.get())
                .add(ModBlocks.POLISHED_STONE_WALL.get())
                .add(ModBlocks.MOSSY_POLISHED_STONE_WALL.get())
                .add(ModBlocks.SMALL_STONE_BRICK_WALL.get())
                .add(ModBlocks.MOSSY_SMALL_STONE_BRICK_WALL.get())
                .add(ModBlocks.POLISHED_GRANITE_WALL.get())
                .add(ModBlocks.POLISHED_GRANITE_BRICK_WALL.get())
                .add(ModBlocks.POLISHED_DIORITE_WALL.get())
                .add(ModBlocks.POLISHED_DIORITE_BRICK_WALL.get())
                .add(ModBlocks.POLISHED_ANDESITE_WALL.get())
                .add(ModBlocks.POLISHED_ANDESITE_BRICK_WALL.get());
    }
}