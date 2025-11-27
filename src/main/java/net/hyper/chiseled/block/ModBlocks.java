package net.hyper.chiseled.block;

import net.hyper.chiseled.Chiseled;
import net.hyper.chiseled.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Chiseled.MOD_ID);

//    public static final DeferredBlock<Block> BLOCK = registerBlock("block",
//            () -> new Block(BlockBehaviour.Properties.of()
//                    .strength(0F).explosionResistance(0F).sound(SoundType.).mapColor(MapColor..requiresCorrectToolForDrops()));
//    public static final DeferredBlock<StairBlock> BLOCK_STAIRS = registerBlock("block_stairs",
//            () -> new StairBlock(ModBlocks.BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of()
//                    .strength(0F).explosionResistance(0F).sound(SoundType.).mapColor(MapColor.).requiresCorrectToolForDrops()));
//    public static final DeferredBlock<SlabBlock> BLOCK_SLAB = registerBlock("block_slab",
//            () -> new SlabBlock(BlockBehaviour.Properties.of()
//                    .strength(0F).explosionResistance(0F).sound(SoundType.).mapColor(MapColor.).requiresCorrectToolForDrops()));
//    public static final DeferredBlock<WallBlock> BLOCK_WALL = registerBlock("block_wall",
//            () -> new WallBlock(BlockBehaviour.Properties.of()
//                    .strength(0F).explosionResistance(0F).sound(SoundType.).mapColor(MapColor.).requiresCorrectToolForDrops()));

//    public static final DeferredBlock<Block> BLOCK = registerBlock("block",
//            () -> new Block(BlockBehaviour.Properties.ofFullCopy()));
//    public static final DeferredBlock<StairBlock> BLOCK_STAIRS = registerBlock("block_stairs",
//            () -> new StairBlock(ModBlocks.BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy()));
//    public static final DeferredBlock<SlabBlock> BLOCK_SLAB = registerBlock("block_slab",
//            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy()));
//    public static final DeferredBlock<WallBlock> BLOCK_WALL = registerBlock("block_wall",
//            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy()));

    public static final DeferredBlock<WallBlock> STONE_WALL = registerBlock("stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<Block> POLISHED_STONE = registerBlock("polished_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_STONE.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<WallBlock> POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<Block> MOSSY_POLISHED_STONE = registerBlock("mossy_polished_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> MOSSY_POLISHED_STONE_STAIRS = registerBlock("mossy_polished_stone_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_POLISHED_STONE.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> MOSSY_POLISHED_STONE_SLAB = registerBlock("mossy_polished_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<WallBlock> MOSSY_POLISHED_STONE_WALL = registerBlock("mossy_polished_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<Block> CRACKED_CHISELED_STONE_BRICKS = registerBlock("cracked_chiseled_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> MOSSY_CHISELED_STONE_BRICKS = registerBlock("mossy_chiseled_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<Block> STONE_TILES = registerBlock("stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            () -> new StairBlock(ModBlocks.STONE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<Block> MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> MOSSY_STONE_TILE_STAIRS = registerBlock("mossy_stone_tile_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_STONE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<Block> SMALL_STONE_BRICKS = registerBlock("small_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> CRACKED_SMALL_STONE_BRICKS = registerBlock("cracked_small_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> SMALL_STONE_BRICK_STAIRS = registerBlock("small_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.SMALL_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> SMALL_STONE_BRICK_SLAB = registerBlock("small_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<WallBlock> SMALL_STONE_BRICK_WALL = registerBlock("small_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<Block> MOSSY_SMALL_STONE_BRICKS = registerBlock("mossy_small_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<StairBlock> MOSSY_SMALL_STONE_BRICK_STAIRS = registerBlock("mossy_small_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_SMALL_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<SlabBlock> MOSSY_SMALL_STONE_BRICK_SLAB = registerBlock("mossy_small_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<WallBlock> MOSSY_SMALL_STONE_BRICK_WALL = registerBlock("mossy_small_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));

    public static final DeferredBlock<WallBlock> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)));

    public static final DeferredBlock<Block> POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)));
    public static final DeferredBlock<Block> CRACKED_POLISHED_GRANITE_BRICKS = registerBlock("cracked_polished_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)));
    public static final DeferredBlock<StairBlock> POLISHED_GRANITE_BRICK_STAIRS = registerBlock("polished_granite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_GRANITE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)));
    public static final DeferredBlock<SlabBlock> POLISHED_GRANITE_BRICK_SLAB = registerBlock("polished_granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)));
    public static final DeferredBlock<WallBlock> POLISHED_GRANITE_BRICK_WALL = registerBlock("polished_granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)));

    public static final DeferredBlock<Block> CHISELED_POLISHED_GRANITE_BRICKS = registerBlock("chiseled_polished_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)));

    public static final DeferredBlock<Block> POLISHED_GRANITE_TILES = registerBlock("polished_granite_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)));
    public static final DeferredBlock<Block> CRACKED_POLISHED_GRANITE_TILES = registerBlock("cracked_polished_granite_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)));
    public static final DeferredBlock<StairBlock> POLISHED_GRANITE_TILE_STAIRS = registerBlock("polished_granite_tile_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_GRANITE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)));
    public static final DeferredBlock<SlabBlock> POLISHED_GRANITE_TILE_SLAB = registerBlock("polished_granite_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)));

    public static final DeferredBlock<WallBlock> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));

    public static final DeferredBlock<Block> POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));
    public static final DeferredBlock<Block> CRACKED_POLISHED_DIORITE_BRICKS = registerBlock("cracked_polished_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));
    public static final DeferredBlock<StairBlock> POLISHED_DIORITE_BRICK_STAIRS = registerBlock("polished_diorite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DIORITE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));
    public static final DeferredBlock<SlabBlock> POLISHED_DIORITE_BRICK_SLAB = registerBlock("polished_diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));
    public static final DeferredBlock<WallBlock> POLISHED_DIORITE_BRICK_WALL = registerBlock("polished_diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));

    public static final DeferredBlock<Block> CHISELED_POLISHED_DIORITE_BRICKS = registerBlock("chiseled_polished_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));

    public static final DeferredBlock<Block> POLISHED_DIORITE_TILES = registerBlock("polished_diorite_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));
    public static final DeferredBlock<Block> CRACKED_POLISHED_DIORITE_TILES = registerBlock("cracked_polished_diorite_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));
    public static final DeferredBlock<StairBlock> POLISHED_DIORITE_TILE_STAIRS = registerBlock("polished_diorite_tile_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DIORITE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));
    public static final DeferredBlock<SlabBlock> POLISHED_DIORITE_TILE_SLAB = registerBlock("polished_diorite_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));

    public static final DeferredBlock<WallBlock> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));

    public static final DeferredBlock<Block> POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));
    public static final DeferredBlock<Block> CRACKED_POLISHED_ANDESITE_BRICKS = registerBlock("cracked_polished_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));
    public static final DeferredBlock<StairBlock> POLISHED_ANDESITE_BRICK_STAIRS = registerBlock("polished_andesite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_ANDESITE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));
    public static final DeferredBlock<SlabBlock> POLISHED_ANDESITE_BRICK_SLAB = registerBlock("polished_andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));
    public static final DeferredBlock<WallBlock> POLISHED_ANDESITE_BRICK_WALL = registerBlock("polished_andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));

    public static final DeferredBlock<Block> CHISELED_POLISHED_ANDESITE_BRICKS = registerBlock("chiseled_polished_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));

    public static final DeferredBlock<Block> POLISHED_ANDESITE_TILES = registerBlock("polished_andesite_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));
    public static final DeferredBlock<Block> CRACKED_POLISHED_ANDESITE_TILES = registerBlock("cracked_polished_andesite_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));
    public static final DeferredBlock<StairBlock> POLISHED_ANDESITE_TILE_STAIRS = registerBlock("polished_andesite_tile_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_ANDESITE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));
    public static final DeferredBlock<SlabBlock> POLISHED_ANDESITE_TILE_SLAB = registerBlock("polished_andesite_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));

    public static final DeferredBlock<Block> DEEPSLATE_TILES = registerBlock("deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_TILES = registerBlock("cracked_deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<StairBlock> DEEPSLATE_TILE_STAIRS = registerBlock("deepslate_tile_stairs",
            () -> new StairBlock(ModBlocks.DEEPSLATE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)));
    public static final DeferredBlock<SlabBlock> DEEPSLATE_TILE_SLAB = registerBlock("deepslate_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_BRICKS)));

    public static final DeferredBlock<Block> MOSSY_BRICKS = registerBlock("mossy_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<StairBlock> MOSSY_BRICK_STAIRS = registerBlock("mossy_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<SlabBlock> MOSSY_BRICK_SLAB = registerBlock("mossy_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<WallBlock> MOSSY_BRICK_WALL = registerBlock("mossy_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static final DeferredBlock<Block> WEATHERED_BRICKS = registerBlock("weathered_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<StairBlock> WEATHERED_BRICK_STAIRS = registerBlock("weathered_brick_stairs",
            () -> new StairBlock(ModBlocks.WEATHERED_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<SlabBlock> WEATHERED_BRICK_SLAB = registerBlock("weathered_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));
    public static final DeferredBlock<WallBlock> WEATHERED_BRICK_WALL = registerBlock("weathered_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)));

    public static final DeferredBlock<StairBlock> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            () -> new StairBlock(Blocks.PACKED_MUD.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<SlabBlock> PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));
    public static final DeferredBlock<WallBlock> PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));

    public static final DeferredBlock<Block> MOSSY_MUD_BRICKS = registerBlock("mossy_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));
    public static final DeferredBlock<StairBlock> MOSSY_MUD_BRICK_STAIRS = registerBlock("mossy_mud_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_MUD_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));
    public static final DeferredBlock<SlabBlock> MOSSY_MUD_BRICK_SLAB = registerBlock("mossy_mud_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));
    public static final DeferredBlock<WallBlock> MOSSY_MUD_BRICK_WALL = registerBlock("mossy_mud_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));

    public static final DeferredBlock<Block> MUD_TILES = registerBlock("mud_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));
    public static final DeferredBlock<StairBlock> MUD_TILE_STAIRS = registerBlock("mud_tile_stairs",
            () -> new StairBlock(ModBlocks.MUD_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));
    public static final DeferredBlock<SlabBlock> MUD_TILE_SLAB = registerBlock("mud_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));

    public static final DeferredBlock<Block> MOSSY_MUD_TILES = registerBlock("mossy_mud_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));
    public static final DeferredBlock<StairBlock> MOSSY_MUD_TILE_STAIRS = registerBlock("mossy_mud_tile_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_MUD_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));
    public static final DeferredBlock<SlabBlock> MOSSY_MUD_TILE_SLAB = registerBlock("mossy_mud_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));

    public static final DeferredBlock<Block> SMALL_MUD_BRICKS = registerBlock("small_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));
    public static final DeferredBlock<StairBlock> SMALL_MUD_BRICK_STAIRS = registerBlock("small_mud_brick_stairs",
            () -> new StairBlock(ModBlocks.SMALL_MUD_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));
    public static final DeferredBlock<SlabBlock> SMALL_MUD_BRICK_SLAB = registerBlock("small_mud_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));
    public static final DeferredBlock<WallBlock> SMALL_MUD_BRICK_WALL = registerBlock("small_mud_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));

    public static final DeferredBlock<Block> MOSSY_SMALL_MUD_BRICKS = registerBlock("mossy_small_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));
    public static final DeferredBlock<StairBlock> MOSSY_SMALL_MUD_BRICK_STAIRS = registerBlock("mossy_small_mud_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_SMALL_MUD_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));
    public static final DeferredBlock<SlabBlock> MOSSY_SMALL_MUD_BRICK_SLAB = registerBlock("mossy_small_mud_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));
    public static final DeferredBlock<WallBlock> MOSSY_SMALL_MUD_BRICK_WALL = registerBlock("mossy_small_mud_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)));

    public static final DeferredBlock<Block> SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<Block> CRACKED_SANDSTONE_BRICKS = registerBlock("cracked_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<StairBlock> SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            () -> new StairBlock(ModBlocks.SANDSTONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<SlabBlock> SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<WallBlock> SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));

    public static final DeferredBlock<Block> SANDSTONE_TILES = registerBlock("sandstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<Block> CRACKED_SANDSTONE_TILES = registerBlock("cracked_sandstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<StairBlock> SANDSTONE_TILE_STAIRS = registerBlock("sandstone_tile_stairs",
            () -> new StairBlock(ModBlocks.SANDSTONE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<SlabBlock> SANDSTONE_TILE_SLAB = registerBlock("sandstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));

    public static final DeferredBlock<Block> RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<Block> CRACKED_RED_SANDSTONE_BRICKS = registerBlock("cracked_red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<StairBlock> RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
            () -> new StairBlock(ModBlocks.RED_SANDSTONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<SlabBlock> RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<WallBlock> RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));

    public static final DeferredBlock<Block> RED_SANDSTONE_TILES = registerBlock("red_sandstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<Block> CRACKED_RED_SANDSTONE_TILES = registerBlock("cracked_red_sandstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<StairBlock> RED_SANDSTONE_TILE_STAIRS = registerBlock("red_sandstone_tile_stairs",
            () -> new StairBlock(ModBlocks.RED_SANDSTONE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<SlabBlock> RED_SANDSTONE_TILE_SLAB = registerBlock("red_sandstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));

    public static final DeferredBlock<Block> POLISHED_PRISMARINE = registerBlock("polished_prismarine",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));
    public static final DeferredBlock<StairBlock> POLISHED_PRISMARINE_STAIRS = registerBlock("polished_prismarine_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_PRISMARINE.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));
    public static final DeferredBlock<SlabBlock> POLISHED_PRISMARINE_SLAB = registerBlock("polished_prismarine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));
    public static final DeferredBlock<WallBlock> POLISHED_PRISMARINE_WALL = registerBlock("polished_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));

    public static final DeferredBlock<WallBlock> PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));

    public static final DeferredBlock<Block> PRISMARINE_TILES = registerBlock("prismarine_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));
    public static final DeferredBlock<StairBlock> PRISMARINE_TILE_STAIRS = registerBlock("prismarine_tile_stairs",
            () -> new StairBlock(ModBlocks.PRISMARINE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));
    public static final DeferredBlock<SlabBlock> PRISMARINE_TILE_SLAB = registerBlock("prismarine_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));

    public static final DeferredBlock<Block> MIXED_PRISMARINE_TILES = registerBlock("mixed_prismarine_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));
    public static final DeferredBlock<SlabBlock> MIXED_PRISMARINE_TILE_SLAB = registerBlock("mixed_prismarine_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));

    public static final DeferredBlock<WallBlock> DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE)));

    public static final DeferredBlock<Block> DARK_PRISMARINE_TILES = registerBlock("dark_prismarine_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE)));
    public static final DeferredBlock<StairBlock> DARK_PRISMARINE_TILE_STAIRS = registerBlock("dark_prismarine_tile_stairs",
            () -> new StairBlock(ModBlocks.DARK_PRISMARINE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE)));
    public static final DeferredBlock<SlabBlock> DARK_PRISMARINE_TILE_SLAB = registerBlock("dark_prismarine_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE)));

    public static final DeferredBlock<StairBlock> GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            () -> new StairBlock(Blocks.GILDED_BLACKSTONE.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<SlabBlock> GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<WallBlock> GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));

    public static final DeferredBlock<Block> GILDED_POLISHED_BLACKSTONE_BRICKS = registerBlock("gilded_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<StairBlock> GILDED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("gilded_polished_blackstone_brick_stairs",
            () -> new StairBlock(Blocks.GILDED_BLACKSTONE.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<SlabBlock> GILDED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("gilded_polished_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<WallBlock> GILDED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("gilded_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));

    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<Block> CRACKED_POLISHED_BLACKSTONE_TILES = registerBlock("cracked_polished_blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<StairBlock> POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("polished_blackstone_tile_stairs",
            () -> new StairBlock(Blocks.BLACKSTONE.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<SlabBlock> POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));

    public static final DeferredBlock<Block> GILDED_POLISHED_BLACKSTONE_TILES = registerBlock("gilded_polished_blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<StairBlock> GILDED_POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("gilded_polished_blackstone_tile_stairs",
            () -> new StairBlock(Blocks.GILDED_BLACKSTONE.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<SlabBlock> GILDED_POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("gilded_polished_blackstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));

    public static final DeferredBlock<Block> SMALL_POLISHED_BLACKSTONE_BRICKS = registerBlock("small_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<Block> CRACKED_SMALL_POLISHED_BLACKSTONE_BRICKS = registerBlock("cracked_small_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<StairBlock> SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("small_polished_blackstone_brick_stairs",
            () -> new StairBlock(Blocks.BLACKSTONE.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<SlabBlock> SMALL_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("small_polished_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<WallBlock> SMALL_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("small_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));

    public static final DeferredBlock<Block> GILDED_SMALL_POLISHED_BLACKSTONE_BRICKS = registerBlock("gilded_small_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<StairBlock> GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("gilded_small_polished_blackstone_brick_stairs",
            () -> new StairBlock(Blocks.BLACKSTONE.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<SlabBlock> GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("gilded_small_polished_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));
    public static final DeferredBlock<WallBlock> GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("gilded_small_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACKSTONE)));

    public static final DeferredBlock<StairBlock> END_STONE_STAIRS = registerBlock("end_stone_stairs",
            () -> new StairBlock(Blocks.END_STONE.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<SlabBlock> END_STONE_SLAB = registerBlock("end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<WallBlock> END_STONE_WALL = registerBlock("end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));

    public static final DeferredBlock<Block> POLISHED_END_STONE = registerBlock("polished_end_stone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<StairBlock> POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_END_STONE.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<SlabBlock> POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<WallBlock> POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));

    public static final DeferredBlock<Block> CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));

    public static final DeferredBlock<Block> END_STONE_TILES = registerBlock("end_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> CRACKED_END_STONE_TILES = registerBlock("cracked_end_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<StairBlock> END_STONE_TILE_STAIRS = registerBlock("end_stone_tile_stairs",
            () -> new StairBlock(Blocks.END_STONE.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<SlabBlock> END_STONE_TILE_SLAB = registerBlock("end_stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));

    public static final DeferredBlock<Block> SMALL_END_STONE_BRICKS = registerBlock("small_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> CRACKED_SMALL_END_STONE_BRICKS = registerBlock("cracked_small_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<StairBlock> SMALL_END_STONE_BRICK_STAIRS = registerBlock("small_end_stone_brick_stairs",
            () -> new StairBlock(Blocks.END_STONE.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<SlabBlock> SMALL_END_STONE_BRICK_SLAB = registerBlock("small_end_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<WallBlock> SMALL_END_STONE_BRICK_WALL = registerBlock("small_end_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
            }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}