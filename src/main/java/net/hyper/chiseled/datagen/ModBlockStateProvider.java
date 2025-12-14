package net.hyper.chiseled.datagen;

import net.hyper.chiseled.Chiseled;
import net.hyper.chiseled.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.IronBarsBlock;
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

        blockWithItem(ModBlocks.CHISELED_POLISHED_GRANITE_BRICKS);

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

        blockWithItem(ModBlocks.CHISELED_POLISHED_DIORITE_BRICKS);

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

        blockWithItem(ModBlocks.CHISELED_POLISHED_ANDESITE_BRICKS);

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

        wallBlock(ModBlocks.SMOOTH_SANDSTONE_WALL.get(), blockTexture(Blocks.SMOOTH_SANDSTONE));

        blockWithItem(ModBlocks.SANDSTONE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_SANDSTONE_BRICKS);
        stairsBlock(ModBlocks.SANDSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.SANDSTONE_BRICKS.get()));
        blockItem(ModBlocks.SANDSTONE_BRICK_STAIRS);
        slabBlock(ModBlocks.SANDSTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.SANDSTONE_BRICKS.get()), blockTexture(ModBlocks.SANDSTONE_BRICKS.get()));
        blockItem(ModBlocks.SANDSTONE_BRICK_SLAB);
        wallBlock(ModBlocks.SANDSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.SANDSTONE_BRICKS.get()));

        blockWithItem(ModBlocks.SANDSTONE_TILES);
        blockWithItem(ModBlocks.CRACKED_SANDSTONE_TILES);
        stairsBlock(ModBlocks.SANDSTONE_TILE_STAIRS.get(), blockTexture(ModBlocks.SANDSTONE_TILES.get()));
        blockItem(ModBlocks.SANDSTONE_TILE_STAIRS);
        slabBlock(ModBlocks.SANDSTONE_TILE_SLAB.get(), blockTexture(ModBlocks.SANDSTONE_TILES.get()), blockTexture(ModBlocks.SANDSTONE_TILES.get()));
        blockItem(ModBlocks.SANDSTONE_TILE_SLAB);

        wallBlock(ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), blockTexture(Blocks.SMOOTH_RED_SANDSTONE));

        blockWithItem(ModBlocks.RED_SANDSTONE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_RED_SANDSTONE_BRICKS);
        stairsBlock(ModBlocks.RED_SANDSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.RED_SANDSTONE_BRICKS.get()));
        blockItem(ModBlocks.RED_SANDSTONE_BRICK_STAIRS);
        slabBlock(ModBlocks.RED_SANDSTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.RED_SANDSTONE_BRICKS.get()), blockTexture(ModBlocks.RED_SANDSTONE_BRICKS.get()));
        blockItem(ModBlocks.RED_SANDSTONE_BRICK_SLAB);
        wallBlock(ModBlocks.RED_SANDSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.RED_SANDSTONE_BRICKS.get()));

        blockWithItem(ModBlocks.RED_SANDSTONE_TILES);
        blockWithItem(ModBlocks.CRACKED_RED_SANDSTONE_TILES);
        stairsBlock(ModBlocks.RED_SANDSTONE_TILE_STAIRS.get(), blockTexture(ModBlocks.RED_SANDSTONE_TILES.get()));
        blockItem(ModBlocks.RED_SANDSTONE_TILE_STAIRS);
        slabBlock(ModBlocks.RED_SANDSTONE_TILE_SLAB.get(), blockTexture(ModBlocks.RED_SANDSTONE_TILES.get()), blockTexture(ModBlocks.RED_SANDSTONE_TILES.get()));
        blockItem(ModBlocks.RED_SANDSTONE_TILE_SLAB);

        blockWithItem(ModBlocks.POLISHED_PRISMARINE);
        stairsBlock(ModBlocks.POLISHED_PRISMARINE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_PRISMARINE.get()));
        blockItem(ModBlocks.POLISHED_PRISMARINE_STAIRS);
        slabBlock(ModBlocks.POLISHED_PRISMARINE_SLAB.get(), blockTexture(ModBlocks.POLISHED_PRISMARINE.get()), blockTexture(ModBlocks.POLISHED_PRISMARINE.get()));
        blockItem(ModBlocks.POLISHED_PRISMARINE_SLAB);
        wallBlock(ModBlocks.POLISHED_PRISMARINE_WALL.get(), blockTexture(ModBlocks.POLISHED_PRISMARINE.get()));

        wallBlock(ModBlocks.PRISMARINE_BRICK_WALL.get(), blockTexture(Blocks.PRISMARINE_BRICKS));

        blockWithItem(ModBlocks.PRISMARINE_TILES);
        stairsBlock(ModBlocks.PRISMARINE_TILE_STAIRS.get(), blockTexture(ModBlocks.PRISMARINE_TILES.get()));
        blockItem(ModBlocks.PRISMARINE_TILE_STAIRS);
        slabBlock(ModBlocks.PRISMARINE_TILE_SLAB.get(), blockTexture(ModBlocks.PRISMARINE_TILES.get()), blockTexture(ModBlocks.PRISMARINE_TILES.get()));
        blockItem(ModBlocks.PRISMARINE_TILE_SLAB);

        wallBlock(ModBlocks.DARK_PRISMARINE_WALL.get(), blockTexture(Blocks.DARK_PRISMARINE));

        blockWithItem(ModBlocks.DARK_PRISMARINE_TILES);
        stairsBlock(ModBlocks.DARK_PRISMARINE_TILE_STAIRS.get(), blockTexture(ModBlocks.DARK_PRISMARINE_TILES.get()));
        blockItem(ModBlocks.DARK_PRISMARINE_TILE_STAIRS);
        slabBlock(ModBlocks.DARK_PRISMARINE_TILE_SLAB.get(), blockTexture(ModBlocks.DARK_PRISMARINE_TILES.get()), blockTexture(ModBlocks.DARK_PRISMARINE_TILES.get()));
        blockItem(ModBlocks.DARK_PRISMARINE_TILE_SLAB);

        stairsBlock(ModBlocks.SMOOTH_BASALT_STAIRS.get(), blockTexture(Blocks.SMOOTH_BASALT));
        blockItem(ModBlocks.SMOOTH_BASALT_STAIRS);
        slabBlock(ModBlocks.SMOOTH_BASALT_SLAB.get(), blockTexture(Blocks.SMOOTH_BASALT), blockTexture(Blocks.SMOOTH_BASALT));
        blockItem(ModBlocks.SMOOTH_BASALT_SLAB);
        wallBlock(ModBlocks.SMOOTH_BASALT_WALL.get(), blockTexture(Blocks.SMOOTH_BASALT));
        
        stairsBlock(ModBlocks.GILDED_BLACKSTONE_STAIRS.get(), blockTexture(Blocks.GILDED_BLACKSTONE));
        blockItem(ModBlocks.GILDED_BLACKSTONE_STAIRS);
        slabBlock(ModBlocks.GILDED_BLACKSTONE_SLAB.get(), blockTexture(Blocks.GILDED_BLACKSTONE), blockTexture(Blocks.GILDED_BLACKSTONE));
        blockItem(ModBlocks.GILDED_BLACKSTONE_SLAB);
        wallBlock(ModBlocks.GILDED_BLACKSTONE_WALL.get(), blockTexture(Blocks.GILDED_BLACKSTONE));
        
        blockWithItem(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS);
        stairsBlock(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.get()));
        blockItem(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        slabBlock(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.get()), blockTexture(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.get()));
        blockItem(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_SLAB);
        wallBlock(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.get()));

        blockWithItem(ModBlocks.POLISHED_BLACKSTONE_TILES);
        blockWithItem(ModBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        stairsBlock(ModBlocks.POLISHED_BLACKSTONE_TILE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_BLACKSTONE_TILES.get()));
        blockItem(ModBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        slabBlock(ModBlocks.POLISHED_BLACKSTONE_TILE_SLAB.get(), blockTexture(ModBlocks.POLISHED_BLACKSTONE_TILES.get()), blockTexture(ModBlocks.POLISHED_BLACKSTONE_TILES.get()));
        blockItem(ModBlocks.POLISHED_BLACKSTONE_TILE_SLAB);

        blockWithItem(ModBlocks.GILDED_POLISHED_BLACKSTONE_TILES);
        stairsBlock(ModBlocks.GILDED_POLISHED_BLACKSTONE_TILE_STAIRS.get(), blockTexture(ModBlocks.GILDED_POLISHED_BLACKSTONE_TILES.get()));
        blockItem(ModBlocks.GILDED_POLISHED_BLACKSTONE_TILE_STAIRS);
        slabBlock(ModBlocks.GILDED_POLISHED_BLACKSTONE_TILE_SLAB.get(), blockTexture(ModBlocks.GILDED_POLISHED_BLACKSTONE_TILES.get()), blockTexture(ModBlocks.GILDED_POLISHED_BLACKSTONE_TILES.get()));
        blockItem(ModBlocks.GILDED_POLISHED_BLACKSTONE_TILE_SLAB);

        blockWithItem(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_SMALL_POLISHED_BLACKSTONE_BRICKS);
        stairsBlock(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICKS.get()));
        blockItem(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS);
        slabBlock(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICKS.get()), blockTexture(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICKS.get()));
        blockItem(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICK_SLAB);
        wallBlock(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICKS.get()));

        blockWithItem(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICKS);
        stairsBlock(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICKS.get()));
        blockItem(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS);
        slabBlock(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_SLAB.get(), blockTexture(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICKS.get()), blockTexture(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICKS.get()));
        blockItem(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_SLAB);
        wallBlock(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICKS.get()));

        stairsBlock(ModBlocks.END_STONE_STAIRS.get(), blockTexture(Blocks.END_STONE));
        blockItem(ModBlocks.END_STONE_STAIRS);
        slabBlock(ModBlocks.END_STONE_SLAB.get(), blockTexture(Blocks.END_STONE), blockTexture(Blocks.END_STONE));
        blockItem(ModBlocks.END_STONE_SLAB);
        wallBlock(ModBlocks.END_STONE_WALL.get(), blockTexture(Blocks.END_STONE));

        blockWithItem(ModBlocks.POLISHED_END_STONE);
        stairsBlock(ModBlocks.POLISHED_END_STONE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_END_STONE.get()));
        blockItem(ModBlocks.POLISHED_END_STONE_STAIRS);
        slabBlock(ModBlocks.POLISHED_END_STONE_SLAB.get(), blockTexture(ModBlocks.POLISHED_END_STONE.get()), blockTexture(ModBlocks.POLISHED_END_STONE.get()));
        blockItem(ModBlocks.POLISHED_END_STONE_SLAB);
        wallBlock(ModBlocks.POLISHED_END_STONE_WALL.get(), blockTexture(ModBlocks.POLISHED_END_STONE.get()));

        blockWithItem(ModBlocks.CRACKED_END_STONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_END_STONE_BRICKS);

        blockWithItem(ModBlocks.END_STONE_TILES);
        blockWithItem(ModBlocks.CRACKED_END_STONE_TILES);
        stairsBlock(ModBlocks.END_STONE_TILE_STAIRS.get(), blockTexture(ModBlocks.END_STONE_TILES.get()));
        blockItem(ModBlocks.END_STONE_TILE_STAIRS);
        slabBlock(ModBlocks.END_STONE_TILE_SLAB.get(), blockTexture(ModBlocks.END_STONE_TILES.get()), blockTexture(ModBlocks.END_STONE_TILES.get()));
        blockItem(ModBlocks.END_STONE_TILE_SLAB);

        blockWithItem(ModBlocks.SMALL_END_STONE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_SMALL_END_STONE_BRICKS);
        stairsBlock(ModBlocks.SMALL_END_STONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.SMALL_END_STONE_BRICKS.get()));
        blockItem(ModBlocks.SMALL_END_STONE_BRICK_STAIRS);
        slabBlock(ModBlocks.SMALL_END_STONE_BRICK_SLAB.get(), blockTexture(ModBlocks.SMALL_END_STONE_BRICKS.get()), blockTexture(ModBlocks.SMALL_END_STONE_BRICKS.get()));
        blockItem(ModBlocks.SMALL_END_STONE_BRICK_SLAB);
        wallBlock(ModBlocks.SMALL_END_STONE_BRICK_WALL.get(), blockTexture(ModBlocks.SMALL_END_STONE_BRICKS.get()));

        stairsBlock(ModBlocks.NETHERITE_STAIRS.get(), blockTexture(Blocks.NETHERITE_BLOCK));
        blockItem(ModBlocks.NETHERITE_STAIRS);

        wallBlock(ModBlocks.QUARTZ_WALL.get(), blockTexture(Blocks.QUARTZ_BLOCK));
        wallBlock(ModBlocks.SMOOTH_QUARTZ_WALL.get(), blockTexture(Blocks.SMOOTH_QUARTZ));

        stairsBlock(ModBlocks.QUARTZ_BRICK_STAIRS.get(), blockTexture(Blocks.QUARTZ_BRICKS));
        blockItem(ModBlocks.QUARTZ_BRICK_STAIRS);
        slabBlock(ModBlocks.QUARTZ_BRICK_SLAB.get(), blockTexture(Blocks.QUARTZ_BRICKS), blockTexture(Blocks.QUARTZ_BRICKS));
        blockItem(ModBlocks.QUARTZ_BRICK_SLAB);
        wallBlock(ModBlocks.QUARTZ_BRICK_WALL.get(), blockTexture(Blocks.QUARTZ_BRICKS));

        blockWithItem(ModBlocks.QUARTZ_TILES);
        stairsBlock(ModBlocks.QUARTZ_TILE_STAIRS.get(), blockTexture(ModBlocks.QUARTZ_TILES.get()));
        blockItem(ModBlocks.QUARTZ_TILE_STAIRS);
        slabBlock(ModBlocks.QUARTZ_TILE_SLAB.get(), blockTexture(ModBlocks.QUARTZ_TILES.get()), blockTexture(ModBlocks.QUARTZ_TILES.get()));
        blockItem(ModBlocks.QUARTZ_TILE_SLAB);

        stairsBlock(ModBlocks.AMETHYST_STAIRS.get(), blockTexture(Blocks.AMETHYST_BLOCK));
        blockItem(ModBlocks.AMETHYST_STAIRS);
        slabBlock(ModBlocks.AMETHYST_SLAB.get(), blockTexture(Blocks.AMETHYST_BLOCK), blockTexture(Blocks.AMETHYST_BLOCK));
        blockItem(ModBlocks.AMETHYST_SLAB);
        wallBlock(ModBlocks.AMETHYST_WALL.get(), blockTexture(Blocks.AMETHYST_BLOCK));

        blockWithItem(ModBlocks.AMETHYST_BRICKS);
        stairsBlock(ModBlocks.AMETHYST_BRICK_STAIRS.get(), blockTexture(ModBlocks.AMETHYST_BRICKS.get()));
        blockItem(ModBlocks.AMETHYST_BRICK_STAIRS);
        slabBlock(ModBlocks.AMETHYST_BRICK_SLAB.get(), blockTexture(ModBlocks.AMETHYST_BRICKS.get()), blockTexture(ModBlocks.AMETHYST_BRICKS.get()));
        blockItem(ModBlocks.AMETHYST_BRICK_SLAB);
        wallBlock(ModBlocks.AMETHYST_BRICK_WALL.get(), blockTexture(ModBlocks.AMETHYST_BRICKS.get()));

        blockWithItem(ModBlocks.AMETHYST_TILES);
        stairsBlock(ModBlocks.AMETHYST_TILE_STAIRS.get(), blockTexture(ModBlocks.AMETHYST_TILES.get()));
        blockItem(ModBlocks.AMETHYST_TILE_STAIRS);
        slabBlock(ModBlocks.AMETHYST_TILE_SLAB.get(), blockTexture(ModBlocks.AMETHYST_TILES.get()), blockTexture(ModBlocks.AMETHYST_TILES.get()));
        blockItem(ModBlocks.AMETHYST_TILE_SLAB);

        stairsBlock(ModBlocks.TERRACOTTA_STAIRS.get(), blockTexture(Blocks.TERRACOTTA));
        blockItem(ModBlocks.TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.TERRACOTTA_SLAB.get(), blockTexture(Blocks.TERRACOTTA), blockTexture(Blocks.TERRACOTTA));
        blockItem(ModBlocks.TERRACOTTA_SLAB);
        wallBlock(ModBlocks.TERRACOTTA_WALL.get(), blockTexture(Blocks.TERRACOTTA));
        stairsBlock(ModBlocks.WHITE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.WHITE_TERRACOTTA));
        blockItem(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.WHITE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.WHITE_TERRACOTTA), blockTexture(Blocks.WHITE_TERRACOTTA));
        blockItem(ModBlocks.WHITE_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.WHITE_TERRACOTTA_WALL.get(), blockTexture(Blocks.WHITE_TERRACOTTA));
        stairsBlock(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        blockItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        blockItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        stairsBlock(ModBlocks.GRAY_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.GRAY_TERRACOTTA));
        blockItem(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.GRAY_TERRACOTTA_SLAB.get(), blockTexture(Blocks.GRAY_TERRACOTTA), blockTexture(Blocks.GRAY_TERRACOTTA));
        blockItem(ModBlocks.GRAY_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.GRAY_TERRACOTTA_WALL.get(), blockTexture(Blocks.GRAY_TERRACOTTA));
        stairsBlock(ModBlocks.BLACK_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BLACK_TERRACOTTA));
        blockItem(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.BLACK_TERRACOTTA_SLAB.get(), blockTexture(Blocks.BLACK_TERRACOTTA), blockTexture(Blocks.BLACK_TERRACOTTA));
        blockItem(ModBlocks.BLACK_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.BLACK_TERRACOTTA_WALL.get(), blockTexture(Blocks.BLACK_TERRACOTTA));
        stairsBlock(ModBlocks.BROWN_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BROWN_TERRACOTTA));
        blockItem(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.BROWN_TERRACOTTA_SLAB.get(), blockTexture(Blocks.BROWN_TERRACOTTA), blockTexture(Blocks.BROWN_TERRACOTTA));
        blockItem(ModBlocks.BROWN_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.BROWN_TERRACOTTA_WALL.get(), blockTexture(Blocks.BROWN_TERRACOTTA));
        stairsBlock(ModBlocks.RED_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.RED_TERRACOTTA));
        blockItem(ModBlocks.RED_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.RED_TERRACOTTA_SLAB.get(), blockTexture(Blocks.RED_TERRACOTTA), blockTexture(Blocks.RED_TERRACOTTA));
        blockItem(ModBlocks.RED_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.RED_TERRACOTTA_WALL.get(), blockTexture(Blocks.RED_TERRACOTTA));
        stairsBlock(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.ORANGE_TERRACOTTA));
        blockItem(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.ORANGE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.ORANGE_TERRACOTTA), blockTexture(Blocks.ORANGE_TERRACOTTA));
        blockItem(ModBlocks.ORANGE_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.ORANGE_TERRACOTTA_WALL.get(), blockTexture(Blocks.ORANGE_TERRACOTTA));
        stairsBlock(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.YELLOW_TERRACOTTA));
        blockItem(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.YELLOW_TERRACOTTA_SLAB.get(), blockTexture(Blocks.YELLOW_TERRACOTTA), blockTexture(Blocks.YELLOW_TERRACOTTA));
        blockItem(ModBlocks.YELLOW_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.YELLOW_TERRACOTTA_WALL.get(), blockTexture(Blocks.YELLOW_TERRACOTTA));
        stairsBlock(ModBlocks.LIME_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIME_TERRACOTTA));
        blockItem(ModBlocks.LIME_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.LIME_TERRACOTTA_SLAB.get(), blockTexture(Blocks.LIME_TERRACOTTA), blockTexture(Blocks.LIME_TERRACOTTA));
        blockItem(ModBlocks.LIME_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.LIME_TERRACOTTA_WALL.get(), blockTexture(Blocks.LIME_TERRACOTTA));
        stairsBlock(ModBlocks.GREEN_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.GREEN_TERRACOTTA));
        blockItem(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.GREEN_TERRACOTTA_SLAB.get(), blockTexture(Blocks.GREEN_TERRACOTTA), blockTexture(Blocks.GREEN_TERRACOTTA));
        blockItem(ModBlocks.GREEN_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.GREEN_TERRACOTTA_WALL.get(), blockTexture(Blocks.GREEN_TERRACOTTA));
        stairsBlock(ModBlocks.CYAN_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.CYAN_TERRACOTTA));
        blockItem(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.CYAN_TERRACOTTA_SLAB.get(), blockTexture(Blocks.CYAN_TERRACOTTA), blockTexture(Blocks.CYAN_TERRACOTTA));
        blockItem(ModBlocks.CYAN_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.CYAN_TERRACOTTA_WALL.get(), blockTexture(Blocks.CYAN_TERRACOTTA));
        stairsBlock(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        blockItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        blockItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        stairsBlock(ModBlocks.BLUE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.BLUE_TERRACOTTA));
        blockItem(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.BLUE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.BLUE_TERRACOTTA), blockTexture(Blocks.BLUE_TERRACOTTA));
        blockItem(ModBlocks.BLUE_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.BLUE_TERRACOTTA_WALL.get(), blockTexture(Blocks.BLUE_TERRACOTTA));
        stairsBlock(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.PURPLE_TERRACOTTA));
        blockItem(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.PURPLE_TERRACOTTA_SLAB.get(), blockTexture(Blocks.PURPLE_TERRACOTTA), blockTexture(Blocks.PURPLE_TERRACOTTA));
        blockItem(ModBlocks.PURPLE_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.PURPLE_TERRACOTTA_WALL.get(), blockTexture(Blocks.PURPLE_TERRACOTTA));
        stairsBlock(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA));
        blockItem(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA), blockTexture(Blocks.MAGENTA_TERRACOTTA));
        blockItem(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.MAGENTA_TERRACOTTA_WALL.get(), blockTexture(Blocks.MAGENTA_TERRACOTTA));
        stairsBlock(ModBlocks.PINK_TERRACOTTA_STAIRS.get(), blockTexture(Blocks.PINK_TERRACOTTA));
        blockItem(ModBlocks.PINK_TERRACOTTA_STAIRS);
        slabBlock(ModBlocks.PINK_TERRACOTTA_SLAB.get(), blockTexture(Blocks.PINK_TERRACOTTA), blockTexture(Blocks.PINK_TERRACOTTA));
        blockItem(ModBlocks.PINK_TERRACOTTA_SLAB);
        wallBlock(ModBlocks.PINK_TERRACOTTA_WALL.get(), blockTexture(Blocks.PINK_TERRACOTTA));

        stairsBlock(ModBlocks.WHITE_CONCRETE_STAIRS.get(), blockTexture(Blocks.WHITE_CONCRETE));
        blockItem(ModBlocks.WHITE_CONCRETE_STAIRS);
        slabBlock(ModBlocks.WHITE_CONCRETE_SLAB.get(), blockTexture(Blocks.WHITE_CONCRETE), blockTexture(Blocks.WHITE_CONCRETE));
        blockItem(ModBlocks.WHITE_CONCRETE_SLAB);
        wallBlock(ModBlocks.WHITE_CONCRETE_WALL.get(), blockTexture(Blocks.WHITE_CONCRETE));
        stairsBlock(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), blockTexture(Blocks.LIGHT_GRAY_CONCRETE));
        blockItem(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        slabBlock(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), blockTexture(Blocks.LIGHT_GRAY_CONCRETE), blockTexture(Blocks.LIGHT_GRAY_CONCRETE));
        blockItem(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        wallBlock(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), blockTexture(Blocks.LIGHT_GRAY_CONCRETE));
        stairsBlock(ModBlocks.GRAY_CONCRETE_STAIRS.get(), blockTexture(Blocks.GRAY_CONCRETE));
        blockItem(ModBlocks.GRAY_CONCRETE_STAIRS);
        slabBlock(ModBlocks.GRAY_CONCRETE_SLAB.get(), blockTexture(Blocks.GRAY_CONCRETE), blockTexture(Blocks.GRAY_CONCRETE));
        blockItem(ModBlocks.GRAY_CONCRETE_SLAB);
        wallBlock(ModBlocks.GRAY_CONCRETE_WALL.get(), blockTexture(Blocks.GRAY_CONCRETE));
        stairsBlock(ModBlocks.BLACK_CONCRETE_STAIRS.get(), blockTexture(Blocks.BLACK_CONCRETE));
        blockItem(ModBlocks.BLACK_CONCRETE_STAIRS);
        slabBlock(ModBlocks.BLACK_CONCRETE_SLAB.get(), blockTexture(Blocks.BLACK_CONCRETE), blockTexture(Blocks.BLACK_CONCRETE));
        blockItem(ModBlocks.BLACK_CONCRETE_SLAB);
        wallBlock(ModBlocks.BLACK_CONCRETE_WALL.get(), blockTexture(Blocks.BLACK_CONCRETE));
        stairsBlock(ModBlocks.BROWN_CONCRETE_STAIRS.get(), blockTexture(Blocks.BROWN_CONCRETE));
        blockItem(ModBlocks.BROWN_CONCRETE_STAIRS);
        slabBlock(ModBlocks.BROWN_CONCRETE_SLAB.get(), blockTexture(Blocks.BROWN_CONCRETE), blockTexture(Blocks.BROWN_CONCRETE));
        blockItem(ModBlocks.BROWN_CONCRETE_SLAB);
        wallBlock(ModBlocks.BROWN_CONCRETE_WALL.get(), blockTexture(Blocks.BROWN_CONCRETE));
        stairsBlock(ModBlocks.RED_CONCRETE_STAIRS.get(), blockTexture(Blocks.RED_CONCRETE));
        blockItem(ModBlocks.RED_CONCRETE_STAIRS);
        slabBlock(ModBlocks.RED_CONCRETE_SLAB.get(), blockTexture(Blocks.RED_CONCRETE), blockTexture(Blocks.RED_CONCRETE));
        blockItem(ModBlocks.RED_CONCRETE_SLAB);
        wallBlock(ModBlocks.RED_CONCRETE_WALL.get(), blockTexture(Blocks.RED_CONCRETE));
        stairsBlock(ModBlocks.ORANGE_CONCRETE_STAIRS.get(), blockTexture(Blocks.ORANGE_CONCRETE));
        blockItem(ModBlocks.ORANGE_CONCRETE_STAIRS);
        slabBlock(ModBlocks.ORANGE_CONCRETE_SLAB.get(), blockTexture(Blocks.ORANGE_CONCRETE), blockTexture(Blocks.ORANGE_CONCRETE));
        blockItem(ModBlocks.ORANGE_CONCRETE_SLAB);
        wallBlock(ModBlocks.ORANGE_CONCRETE_WALL.get(), blockTexture(Blocks.ORANGE_CONCRETE));
        stairsBlock(ModBlocks.YELLOW_CONCRETE_STAIRS.get(), blockTexture(Blocks.YELLOW_CONCRETE));
        blockItem(ModBlocks.YELLOW_CONCRETE_STAIRS);
        slabBlock(ModBlocks.YELLOW_CONCRETE_SLAB.get(), blockTexture(Blocks.YELLOW_CONCRETE), blockTexture(Blocks.YELLOW_CONCRETE));
        blockItem(ModBlocks.YELLOW_CONCRETE_SLAB);
        wallBlock(ModBlocks.YELLOW_CONCRETE_WALL.get(), blockTexture(Blocks.YELLOW_CONCRETE));
        stairsBlock(ModBlocks.LIME_CONCRETE_STAIRS.get(), blockTexture(Blocks.LIME_CONCRETE));
        blockItem(ModBlocks.LIME_CONCRETE_STAIRS);
        slabBlock(ModBlocks.LIME_CONCRETE_SLAB.get(), blockTexture(Blocks.LIME_CONCRETE), blockTexture(Blocks.LIME_CONCRETE));
        blockItem(ModBlocks.LIME_CONCRETE_SLAB);
        wallBlock(ModBlocks.LIME_CONCRETE_WALL.get(), blockTexture(Blocks.LIME_CONCRETE));
        stairsBlock(ModBlocks.GREEN_CONCRETE_STAIRS.get(), blockTexture(Blocks.GREEN_CONCRETE));
        blockItem(ModBlocks.GREEN_CONCRETE_STAIRS);
        slabBlock(ModBlocks.GREEN_CONCRETE_SLAB.get(), blockTexture(Blocks.GREEN_CONCRETE), blockTexture(Blocks.GREEN_CONCRETE));
        blockItem(ModBlocks.GREEN_CONCRETE_SLAB);
        wallBlock(ModBlocks.GREEN_CONCRETE_WALL.get(), blockTexture(Blocks.GREEN_CONCRETE));
        stairsBlock(ModBlocks.CYAN_CONCRETE_STAIRS.get(), blockTexture(Blocks.CYAN_CONCRETE));
        blockItem(ModBlocks.CYAN_CONCRETE_STAIRS);
        slabBlock(ModBlocks.CYAN_CONCRETE_SLAB.get(), blockTexture(Blocks.CYAN_CONCRETE), blockTexture(Blocks.CYAN_CONCRETE));
        blockItem(ModBlocks.CYAN_CONCRETE_SLAB);
        wallBlock(ModBlocks.CYAN_CONCRETE_WALL.get(), blockTexture(Blocks.CYAN_CONCRETE));
        stairsBlock(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), blockTexture(Blocks.LIGHT_BLUE_CONCRETE));
        blockItem(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        slabBlock(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), blockTexture(Blocks.LIGHT_BLUE_CONCRETE), blockTexture(Blocks.LIGHT_BLUE_CONCRETE));
        blockItem(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        wallBlock(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), blockTexture(Blocks.LIGHT_BLUE_CONCRETE));
        stairsBlock(ModBlocks.BLUE_CONCRETE_STAIRS.get(), blockTexture(Blocks.BLUE_CONCRETE));
        blockItem(ModBlocks.BLUE_CONCRETE_STAIRS);
        slabBlock(ModBlocks.BLUE_CONCRETE_SLAB.get(), blockTexture(Blocks.BLUE_CONCRETE), blockTexture(Blocks.BLUE_CONCRETE));
        blockItem(ModBlocks.BLUE_CONCRETE_SLAB);
        wallBlock(ModBlocks.BLUE_CONCRETE_WALL.get(), blockTexture(Blocks.BLUE_CONCRETE));
        stairsBlock(ModBlocks.PURPLE_CONCRETE_STAIRS.get(), blockTexture(Blocks.PURPLE_CONCRETE));
        blockItem(ModBlocks.PURPLE_CONCRETE_STAIRS);
        slabBlock(ModBlocks.PURPLE_CONCRETE_SLAB.get(), blockTexture(Blocks.PURPLE_CONCRETE), blockTexture(Blocks.PURPLE_CONCRETE));
        blockItem(ModBlocks.PURPLE_CONCRETE_SLAB);
        wallBlock(ModBlocks.PURPLE_CONCRETE_WALL.get(), blockTexture(Blocks.PURPLE_CONCRETE));
        stairsBlock(ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), blockTexture(Blocks.MAGENTA_CONCRETE));
        blockItem(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        slabBlock(ModBlocks.MAGENTA_CONCRETE_SLAB.get(), blockTexture(Blocks.MAGENTA_CONCRETE), blockTexture(Blocks.MAGENTA_CONCRETE));
        blockItem(ModBlocks.MAGENTA_CONCRETE_SLAB);
        wallBlock(ModBlocks.MAGENTA_CONCRETE_WALL.get(), blockTexture(Blocks.MAGENTA_CONCRETE));
        stairsBlock(ModBlocks.PINK_CONCRETE_STAIRS.get(), blockTexture(Blocks.PINK_CONCRETE));
        blockItem(ModBlocks.PINK_CONCRETE_STAIRS);
        slabBlock(ModBlocks.PINK_CONCRETE_SLAB.get(), blockTexture(Blocks.PINK_CONCRETE), blockTexture(Blocks.PINK_CONCRETE));
        blockItem(ModBlocks.PINK_CONCRETE_SLAB);
        wallBlock(ModBlocks.PINK_CONCRETE_WALL.get(), blockTexture(Blocks.PINK_CONCRETE));

        paneBlockWithRenderType(ModBlocks.FRAMED_GLASS_PANE.get(), modLoc("block/framed_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_WHITE_STAINED_GLASS_PANE.get(), modLoc("block/framed_white_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_LIGHT_GRAY_STAINED_GLASS_PANE.get(), modLoc("block/framed_light_gray_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_GRAY_STAINED_GLASS_PANE.get(), modLoc("block/framed_gray_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_BLACK_STAINED_GLASS_PANE.get(), modLoc("block/framed_black_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_BROWN_STAINED_GLASS_PANE.get(), modLoc("block/framed_brown_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_RED_STAINED_GLASS_PANE.get(), modLoc("block/framed_red_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_ORANGE_STAINED_GLASS_PANE.get(), modLoc("block/framed_orange_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_YELLOW_STAINED_GLASS_PANE.get(), modLoc("block/framed_yellow_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_LIME_STAINED_GLASS_PANE.get(), modLoc("block/framed_lime_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_GREEN_STAINED_GLASS_PANE.get(), modLoc("block/framed_green_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_CYAN_STAINED_GLASS_PANE.get(), modLoc("block/framed_cyan_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_LIGHT_BLUE_STAINED_GLASS_PANE.get(), modLoc("block/framed_light_blue_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_BLUE_STAINED_GLASS_PANE.get(), modLoc("block/framed_blue_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_PURPLE_STAINED_GLASS_PANE.get(), modLoc("block/framed_purple_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_MAGENTA_STAINED_GLASS_PANE.get(), modLoc("block/framed_magenta_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");
        paneBlockWithRenderType(ModBlocks.FRAMED_PINK_STAINED_GLASS_PANE.get(), modLoc("block/framed_pink_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");

        paneBlockWithRenderType(ModBlocks.FRAMED_GREEN_STAINED_GLASS_PANE.get(), modLoc("block/framed_green_stained_glass"),
                modLoc("block/framed_glass_top"), "translucent");

        stairsBlock(ModBlocks.CALCITE_STAIRS.get(), blockTexture(Blocks.CALCITE));
        blockItem(ModBlocks.CALCITE_STAIRS);
        slabBlock(ModBlocks.CALCITE_SLAB.get(), blockTexture(Blocks.CALCITE), blockTexture(Blocks.CALCITE));
        blockItem(ModBlocks.CALCITE_SLAB);
        wallBlock(ModBlocks.CALCITE_WALL.get(), blockTexture(Blocks.CALCITE));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("chiseled:block/" + deferredBlock.getId().getPath()));
    }
}