package net.hyper.chiseled.datagen;

import net.hyper.chiseled.Chiseled;
import net.hyper.chiseled.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Chiseled.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.POLISHED_STONE);
        blockWithItem(ModBlocks.CRACKED_POLISHED_STONE);
        stairsBlock(ModBlocks.POLISHED_STONE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_STONE.get()));
        blockItem(ModBlocks.POLISHED_STONE_STAIRS);
        slabBlock(ModBlocks.POLISHED_STONE_SLAB.get(), blockTexture(ModBlocks.POLISHED_STONE.get()), blockTexture(ModBlocks.POLISHED_STONE.get()));
        blockItem(ModBlocks.POLISHED_STONE_SLAB);
        wallBlock(ModBlocks.POLISHED_STONE_WALL.get(), blockTexture(ModBlocks.POLISHED_STONE.get()));

        blockWithItem(ModBlocks.CRACKED_CHISELED_STONE_BRICKS);

        blockWithItem(ModBlocks.STONE_TILES);
        blockWithItem(ModBlocks.CRACKED_STONE_TILES);
        stairsBlock(ModBlocks.STONE_TILE_STAIRS.get(), blockTexture(ModBlocks.STONE_TILES.get()));
        blockItem(ModBlocks.STONE_TILE_STAIRS);
        slabBlock(ModBlocks.STONE_TILE_SLAB.get(), blockTexture(ModBlocks.STONE_TILES.get()), blockTexture(ModBlocks.STONE_TILES.get()));
        blockItem(ModBlocks.STONE_TILE_SLAB);
        wallBlock(ModBlocks.STONE_TILE_WALL.get(), blockTexture(ModBlocks.STONE_TILES.get()));

        blockWithItem(ModBlocks.SMALL_STONE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_SMALL_STONE_BRICKS);
        stairsBlock(ModBlocks.SMALL_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.SMALL_STONE_BRICKS.get()));
        blockItem(ModBlocks.SMALL_STONE_BRICK_STAIRS);
        slabBlock(ModBlocks.SMALL_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.SMALL_STONE_BRICKS.get()), blockTexture(ModBlocks.SMALL_STONE_BRICKS.get()));
        blockItem(ModBlocks.SMALL_STONE_BRICK_SLAB);
        wallBlock(ModBlocks.SMALL_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.SMALL_STONE_BRICKS.get()));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("chiseled:block/" + deferredBlock.getId().getPath()));
    }
}