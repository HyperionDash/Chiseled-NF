package net.hyper.chiseled.datagen;

import net.hyper.chiseled.Chiseled;
import net.hyper.chiseled.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
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
        wallBlock(ModBlocks.STONE_WALL.get(), blockTexture(Blocks.STONE));

        blockWithItem(ModBlocks.POLISHED_STONE);
        stairsBlock(ModBlocks.POLISHED_STONE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_STONE.get()));
        blockItem(ModBlocks.POLISHED_STONE_STAIRS);
        slabBlock(ModBlocks.POLISHED_STONE_SLAB.get(), blockTexture(ModBlocks.POLISHED_STONE.get()), blockTexture(ModBlocks.POLISHED_STONE.get()));
        blockItem(ModBlocks.POLISHED_STONE_SLAB);
        wallBlock(ModBlocks.POLISHED_STONE_WALL.get(), blockTexture(ModBlocks.POLISHED_STONE.get()));

        blockWithItem(ModBlocks.MOSSY_POLISHED_STONE);
        stairsBlock(ModBlocks.MOSSY_POLISHED_STONE_STAIRS.get(), blockTexture(ModBlocks.MOSSY_POLISHED_STONE.get()));
        blockItem(ModBlocks.MOSSY_POLISHED_STONE_STAIRS);
        slabBlock(ModBlocks.MOSSY_POLISHED_STONE_SLAB.get(), blockTexture(ModBlocks.MOSSY_POLISHED_STONE.get()), blockTexture(ModBlocks.MOSSY_POLISHED_STONE.get()));
        blockItem(ModBlocks.MOSSY_POLISHED_STONE_SLAB);
        wallBlock(ModBlocks.MOSSY_POLISHED_STONE_WALL.get(), blockTexture(ModBlocks.MOSSY_POLISHED_STONE.get()));

        blockWithItem(ModBlocks.CRACKED_CHISELED_STONE_BRICKS);
        blockWithItem(ModBlocks.MOSSY_CHISELED_STONE_BRICKS);

        blockWithItem(ModBlocks.STONE_TILES);
        blockWithItem(ModBlocks.CRACKED_STONE_TILES);
        stairsBlock(ModBlocks.STONE_TILE_STAIRS.get(), blockTexture(ModBlocks.STONE_TILES.get()));
        blockItem(ModBlocks.STONE_TILE_STAIRS);
        slabBlock(ModBlocks.STONE_TILE_SLAB.get(), blockTexture(ModBlocks.STONE_TILES.get()), blockTexture(ModBlocks.STONE_TILES.get()));
        blockItem(ModBlocks.STONE_TILE_SLAB);

        blockWithItem(ModBlocks.MOSSY_STONE_TILES);
        stairsBlock(ModBlocks.MOSSY_STONE_TILE_STAIRS.get(), blockTexture(ModBlocks.MOSSY_STONE_TILES.get()));
        blockItem(ModBlocks.MOSSY_STONE_TILE_STAIRS);
        slabBlock(ModBlocks.MOSSY_STONE_TILE_SLAB.get(), blockTexture(ModBlocks.MOSSY_STONE_TILES.get()), blockTexture(ModBlocks.MOSSY_STONE_TILES.get()));
        blockItem(ModBlocks.MOSSY_STONE_TILE_SLAB);

        blockWithItem(ModBlocks.SMALL_STONE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_SMALL_STONE_BRICKS);
        stairsBlock(ModBlocks.SMALL_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.SMALL_STONE_BRICKS.get()));
        blockItem(ModBlocks.SMALL_STONE_BRICK_STAIRS);
        slabBlock(ModBlocks.SMALL_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.SMALL_STONE_BRICKS.get()), blockTexture(ModBlocks.SMALL_STONE_BRICKS.get()));
        blockItem(ModBlocks.SMALL_STONE_BRICK_SLAB);
        wallBlock(ModBlocks.SMALL_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.SMALL_STONE_BRICKS.get()));

        blockWithItem(ModBlocks.MOSSY_SMALL_STONE_BRICKS);
        stairsBlock(ModBlocks.MOSSY_SMALL_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.MOSSY_SMALL_STONE_BRICKS.get()));
        blockItem(ModBlocks.MOSSY_SMALL_STONE_BRICK_STAIRS);
        slabBlock(ModBlocks.MOSSY_SMALL_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.MOSSY_SMALL_STONE_BRICKS.get()), blockTexture(ModBlocks.MOSSY_SMALL_STONE_BRICKS.get()));
        blockItem(ModBlocks.MOSSY_SMALL_STONE_BRICK_SLAB);
        wallBlock(ModBlocks.MOSSY_SMALL_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.MOSSY_SMALL_STONE_BRICKS.get()));

        wallBlock(ModBlocks.POLISHED_GRANITE_WALL.get(), blockTexture(Blocks.POLISHED_GRANITE));

        blockWithItem(ModBlocks.POLISHED_GRANITE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_POLISHED_GRANITE_BRICKS);
        stairsBlock(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS.get(), blockTexture(ModBlocks.POLISHED_GRANITE_BRICKS.get()));
        blockItem(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS);
        slabBlock(ModBlocks.POLISHED_GRANITE_BRICK_SLAB.get(), blockTexture(ModBlocks.POLISHED_GRANITE_BRICKS.get()), blockTexture(ModBlocks.POLISHED_GRANITE_BRICKS.get()));
        blockItem(ModBlocks.POLISHED_GRANITE_BRICK_SLAB);
        wallBlock(ModBlocks.POLISHED_GRANITE_BRICK_WALL.get(), blockTexture(ModBlocks.POLISHED_GRANITE_BRICKS.get()));

        blockWithItem(ModBlocks.POLISHED_GRANITE_TILES);
        blockWithItem(ModBlocks.CRACKED_POLISHED_GRANITE_TILES);
        stairsBlock(ModBlocks.POLISHED_GRANITE_TILE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_GRANITE_TILES.get()));
        blockItem(ModBlocks.POLISHED_GRANITE_TILE_STAIRS);
        slabBlock(ModBlocks.POLISHED_GRANITE_TILE_SLAB.get(), blockTexture(ModBlocks.POLISHED_GRANITE_TILES.get()), blockTexture(ModBlocks.POLISHED_GRANITE_TILES.get()));
        blockItem(ModBlocks.POLISHED_GRANITE_TILE_SLAB);

        wallBlock(ModBlocks.POLISHED_DIORITE_WALL.get(), blockTexture(Blocks.POLISHED_DIORITE));

        blockWithItem(ModBlocks.POLISHED_DIORITE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_POLISHED_DIORITE_BRICKS);
        stairsBlock(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS.get(), blockTexture(ModBlocks.POLISHED_DIORITE_BRICKS.get()));
        blockItem(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS);
        slabBlock(ModBlocks.POLISHED_DIORITE_BRICK_SLAB.get(), blockTexture(ModBlocks.POLISHED_DIORITE_BRICKS.get()), blockTexture(ModBlocks.POLISHED_DIORITE_BRICKS.get()));
        blockItem(ModBlocks.POLISHED_DIORITE_BRICK_SLAB);
        wallBlock(ModBlocks.POLISHED_DIORITE_BRICK_WALL.get(), blockTexture(ModBlocks.POLISHED_DIORITE_BRICKS.get()));

        blockWithItem(ModBlocks.POLISHED_DIORITE_TILES);
        blockWithItem(ModBlocks.CRACKED_POLISHED_DIORITE_TILES);
        stairsBlock(ModBlocks.POLISHED_DIORITE_TILE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_DIORITE_TILES.get()));
        blockItem(ModBlocks.POLISHED_DIORITE_TILE_STAIRS);
        slabBlock(ModBlocks.POLISHED_DIORITE_TILE_SLAB.get(), blockTexture(ModBlocks.POLISHED_DIORITE_TILES.get()), blockTexture(ModBlocks.POLISHED_DIORITE_TILES.get()));
        blockItem(ModBlocks.POLISHED_DIORITE_TILE_SLAB);

        wallBlock(ModBlocks.POLISHED_ANDESITE_WALL.get(), blockTexture(Blocks.POLISHED_ANDESITE));

        blockWithItem(ModBlocks.POLISHED_ANDESITE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_POLISHED_ANDESITE_BRICKS);
        stairsBlock(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS.get(), blockTexture(ModBlocks.POLISHED_ANDESITE_BRICKS.get()));
        blockItem(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
        slabBlock(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB.get(), blockTexture(ModBlocks.POLISHED_ANDESITE_BRICKS.get()), blockTexture(ModBlocks.POLISHED_ANDESITE_BRICKS.get()));
        blockItem(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB);
        wallBlock(ModBlocks.POLISHED_ANDESITE_BRICK_WALL.get(), blockTexture(ModBlocks.POLISHED_ANDESITE_BRICKS.get()));

        blockWithItem(ModBlocks.POLISHED_ANDESITE_TILES);
        blockWithItem(ModBlocks.CRACKED_POLISHED_ANDESITE_TILES);
        stairsBlock(ModBlocks.POLISHED_ANDESITE_TILE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_ANDESITE_TILES.get()));
        blockItem(ModBlocks.POLISHED_ANDESITE_TILE_STAIRS);
        slabBlock(ModBlocks.POLISHED_ANDESITE_TILE_SLAB.get(), blockTexture(ModBlocks.POLISHED_ANDESITE_TILES.get()), blockTexture(ModBlocks.POLISHED_ANDESITE_TILES.get()));
        blockItem(ModBlocks.POLISHED_ANDESITE_TILE_SLAB);

        blockWithItem(ModBlocks.DEEPSLATE_TILES);
        blockWithItem(ModBlocks.CRACKED_DEEPSLATE_TILES);
        stairsBlock(ModBlocks.DEEPSLATE_TILE_STAIRS.get(), blockTexture(ModBlocks.DEEPSLATE_TILES.get()));
        blockItem(ModBlocks.DEEPSLATE_TILE_STAIRS);
        slabBlock(ModBlocks.DEEPSLATE_TILE_SLAB.get(), blockTexture(ModBlocks.DEEPSLATE_TILES.get()), blockTexture(ModBlocks.DEEPSLATE_TILES.get()));
        blockItem(ModBlocks.DEEPSLATE_TILE_SLAB);

        blockWithItem(ModBlocks.MOSSY_BRICKS);
        stairsBlock(ModBlocks.MOSSY_BRICK_STAIRS.get(), blockTexture(ModBlocks.MOSSY_BRICKS.get()));
        blockItem(ModBlocks.MOSSY_BRICK_STAIRS);
        slabBlock(ModBlocks.MOSSY_BRICK_SLAB.get(), blockTexture(ModBlocks.MOSSY_BRICKS.get()), blockTexture(ModBlocks.MOSSY_BRICKS.get()));
        blockItem(ModBlocks.MOSSY_BRICK_SLAB);
        wallBlock(ModBlocks.MOSSY_BRICK_WALL.get(), blockTexture(ModBlocks.MOSSY_BRICKS.get()));

        blockWithItem(ModBlocks.WEATHERED_BRICKS);
        stairsBlock(ModBlocks.WEATHERED_BRICK_STAIRS.get(), blockTexture(ModBlocks.WEATHERED_BRICKS.get()));
        blockItem(ModBlocks.WEATHERED_BRICK_STAIRS);
        slabBlock(ModBlocks.WEATHERED_BRICK_SLAB.get(), blockTexture(ModBlocks.WEATHERED_BRICKS.get()), blockTexture(ModBlocks.WEATHERED_BRICKS.get()));
        blockItem(ModBlocks.WEATHERED_BRICK_SLAB);
        wallBlock(ModBlocks.WEATHERED_BRICK_WALL.get(), blockTexture(ModBlocks.WEATHERED_BRICKS.get()));

        stairsBlock(ModBlocks.PACKED_MUD_STAIRS.get(), blockTexture(Blocks.PACKED_MUD));
        blockItem(ModBlocks.PACKED_MUD_STAIRS);
        slabBlock(ModBlocks.PACKED_MUD_SLAB.get(), blockTexture(Blocks.PACKED_MUD), blockTexture(Blocks.PACKED_MUD));
        blockItem(ModBlocks.PACKED_MUD_SLAB);
        wallBlock(ModBlocks.PACKED_MUD_WALL.get(), blockTexture(Blocks.PACKED_MUD));

        blockWithItem(ModBlocks.MOSSY_MUD_BRICKS);
        stairsBlock(ModBlocks.MOSSY_MUD_BRICK_STAIRS.get(), blockTexture(ModBlocks.MOSSY_MUD_BRICKS.get()));
        blockItem(ModBlocks.MOSSY_MUD_BRICK_STAIRS);
        slabBlock(ModBlocks.MOSSY_MUD_BRICK_SLAB.get(), blockTexture(ModBlocks.MOSSY_MUD_BRICKS.get()), blockTexture(ModBlocks.MOSSY_MUD_BRICKS.get()));
        blockItem(ModBlocks.MOSSY_MUD_BRICK_SLAB);
        wallBlock(ModBlocks.MOSSY_MUD_BRICK_WALL.get(), blockTexture(ModBlocks.MOSSY_MUD_BRICKS.get()));

        blockWithItem(ModBlocks.MUD_TILES);
        stairsBlock(ModBlocks.MUD_TILE_STAIRS.get(), blockTexture(ModBlocks.MUD_TILES.get()));
        blockItem(ModBlocks.MUD_TILE_STAIRS);
        slabBlock(ModBlocks.MUD_TILE_SLAB.get(), blockTexture(ModBlocks.MUD_TILES.get()), blockTexture(ModBlocks.MUD_TILES.get()));
        blockItem(ModBlocks.MUD_TILE_SLAB);

        blockWithItem(ModBlocks.MOSSY_MUD_TILES);
        stairsBlock(ModBlocks.MOSSY_MUD_TILE_STAIRS.get(), blockTexture(ModBlocks.MOSSY_MUD_TILES.get()));
        blockItem(ModBlocks.MOSSY_MUD_TILE_STAIRS);
        slabBlock(ModBlocks.MOSSY_MUD_TILE_SLAB.get(), blockTexture(ModBlocks.MOSSY_MUD_TILES.get()), blockTexture(ModBlocks.MOSSY_MUD_TILES.get()));
        blockItem(ModBlocks.MOSSY_MUD_TILE_SLAB);

        blockWithItem(ModBlocks.SMALL_MUD_BRICKS);
        stairsBlock(ModBlocks.SMALL_MUD_BRICK_STAIRS.get(), blockTexture(ModBlocks.SMALL_MUD_BRICKS.get()));
        blockItem(ModBlocks.SMALL_MUD_BRICK_STAIRS);
        slabBlock(ModBlocks.SMALL_MUD_BRICK_SLAB.get(), blockTexture(ModBlocks.SMALL_MUD_BRICKS.get()), blockTexture(ModBlocks.SMALL_MUD_BRICKS.get()));
        blockItem(ModBlocks.SMALL_MUD_BRICK_SLAB);
        wallBlock(ModBlocks.SMALL_MUD_BRICK_WALL.get(), blockTexture(ModBlocks.SMALL_MUD_BRICKS.get()));

        blockWithItem(ModBlocks.MOSSY_SMALL_MUD_BRICKS);
        stairsBlock(ModBlocks.MOSSY_SMALL_MUD_BRICK_STAIRS.get(), blockTexture(ModBlocks.MOSSY_SMALL_MUD_BRICKS.get()));
        blockItem(ModBlocks.MOSSY_SMALL_MUD_BRICK_STAIRS);
        slabBlock(ModBlocks.MOSSY_SMALL_MUD_BRICK_SLAB.get(), blockTexture(ModBlocks.MOSSY_SMALL_MUD_BRICKS.get()), blockTexture(ModBlocks.MOSSY_SMALL_MUD_BRICKS.get()));
        blockItem(ModBlocks.MOSSY_SMALL_MUD_BRICK_SLAB);
        wallBlock(ModBlocks.MOSSY_SMALL_MUD_BRICK_WALL.get(), blockTexture(ModBlocks.MOSSY_SMALL_MUD_BRICKS.get()));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("chiseled:block/" + deferredBlock.getId().getPath()));
    }
}
