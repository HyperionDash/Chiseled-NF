package net.hyper.chiseled.block;

import net.hyper.chiseled.Chiseled;
import net.hyper.chiseled.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
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
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<Block> MOSSY_CHISELED_STONE_BRICKS = registerBlock("mossy_chiseled_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));

    public static final DeferredBlock<Block> STONE_TILES = registerBlock("stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<Block> CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<StairBlock> STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            () -> new StairBlock(ModBlocks.STONE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<SlabBlock> STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));

    public static final DeferredBlock<Block> MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<StairBlock> MOSSY_STONE_TILE_STAIRS = registerBlock("mossy_stone_tile_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_STONE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<SlabBlock> MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));

    public static final DeferredBlock<Block> SMALL_STONE_BRICKS = registerBlock("small_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<Block> CRACKED_SMALL_STONE_BRICKS = registerBlock("cracked_small_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<StairBlock> SMALL_STONE_BRICK_STAIRS = registerBlock("small_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.SMALL_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<SlabBlock> SMALL_STONE_BRICK_SLAB = registerBlock("small_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<WallBlock> SMALL_STONE_BRICK_WALL = registerBlock("small_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));

    public static final DeferredBlock<Block> MOSSY_SMALL_STONE_BRICKS = registerBlock("mossy_small_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<StairBlock> MOSSY_SMALL_STONE_BRICK_STAIRS = registerBlock("mossy_small_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_SMALL_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<SlabBlock> MOSSY_SMALL_STONE_BRICK_SLAB = registerBlock("mossy_small_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<WallBlock> MOSSY_SMALL_STONE_BRICK_WALL = registerBlock("mossy_small_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));

    public static final DeferredBlock<Block> MIXED_STONE_TILES = registerBlock("mixed_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));
    public static final DeferredBlock<SlabBlock> MIXED_STONE_TILE_SLAB = registerBlock("mixed_stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)));

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
            () -> new StairBlock(ModBlocks.POLISHED_GRANITE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)));
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
            () -> new StairBlock(ModBlocks.POLISHED_DIORITE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));
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
            () -> new StairBlock(ModBlocks.POLISHED_ANDESITE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));
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

    public static final DeferredBlock<WallBlock> SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE)));

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

    public static final DeferredBlock<Block> MIXED_SANDSTONE_TILES = registerBlock("mixed_sandstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));
    public static final DeferredBlock<SlabBlock> MIXED_SANDSTONE_TILE_SLAB = registerBlock("mixed_sandstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));

    public static final DeferredBlock<WallBlock> SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_RED_SANDSTONE)));

    public static final DeferredBlock<Block> RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<Block> CRACKED_RED_SANDSTONE_BRICKS = registerBlock("cracked_red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<StairBlock> RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
            () -> new StairBlock(ModBlocks.RED_SANDSTONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<SlabBlock> RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<WallBlock> RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));

    public static final DeferredBlock<Block> RED_SANDSTONE_TILES = registerBlock("red_sandstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<Block> CRACKED_RED_SANDSTONE_TILES = registerBlock("cracked_red_sandstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<StairBlock> RED_SANDSTONE_TILE_STAIRS = registerBlock("red_sandstone_tile_stairs",
            () -> new StairBlock(ModBlocks.RED_SANDSTONE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));
    public static final DeferredBlock<SlabBlock> RED_SANDSTONE_TILE_SLAB = registerBlock("red_sandstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));

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

    public static final DeferredBlock<StairBlock> SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            () -> new StairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)));
    public static final DeferredBlock<SlabBlock> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)));
    public static final DeferredBlock<WallBlock> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)));

    public static final DeferredBlock<StairBlock> GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            () -> new StairBlock(Blocks.GILDED_BLACKSTONE.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<SlabBlock> GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<WallBlock> GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));

    public static final DeferredBlock<Block> GILDED_POLISHED_BLACKSTONE_BRICKS = registerBlock("gilded_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<StairBlock> GILDED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("gilded_polished_blackstone_brick_stairs",
            () -> new StairBlock(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<SlabBlock> GILDED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("gilded_polished_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<WallBlock> GILDED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("gilded_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));

    public static final DeferredBlock<Block> POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final DeferredBlock<Block> CRACKED_POLISHED_BLACKSTONE_TILES = registerBlock("cracked_polished_blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final DeferredBlock<StairBlock> POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("polished_blackstone_tile_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_BLACKSTONE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final DeferredBlock<SlabBlock> POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));

    public static final DeferredBlock<Block> GILDED_POLISHED_BLACKSTONE_TILES = registerBlock("gilded_polished_blackstone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<StairBlock> GILDED_POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("gilded_polished_blackstone_tile_stairs",
            () -> new StairBlock(ModBlocks.GILDED_POLISHED_BLACKSTONE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<SlabBlock> GILDED_POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("gilded_polished_blackstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));

    public static final DeferredBlock<Block> SMALL_POLISHED_BLACKSTONE_BRICKS = registerBlock("small_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final DeferredBlock<Block> CRACKED_SMALL_POLISHED_BLACKSTONE_BRICKS = registerBlock("cracked_small_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final DeferredBlock<StairBlock> SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("small_polished_blackstone_brick_stairs",
            () -> new StairBlock(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final DeferredBlock<SlabBlock> SMALL_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("small_polished_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final DeferredBlock<WallBlock> SMALL_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("small_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS)));

    public static final DeferredBlock<Block> GILDED_SMALL_POLISHED_BLACKSTONE_BRICKS = registerBlock("gilded_small_polished_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<StairBlock> GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("gilded_small_polished_blackstone_brick_stairs",
            () -> new StairBlock(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<SlabBlock> GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("gilded_small_polished_blackstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));
    public static final DeferredBlock<WallBlock> GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("gilded_small_polished_blackstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));

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
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    public static final DeferredBlock<Block> CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));

    public static final DeferredBlock<Block> END_STONE_TILES = registerBlock("end_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    public static final DeferredBlock<Block> CRACKED_END_STONE_TILES = registerBlock("cracked_end_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    public static final DeferredBlock<StairBlock> END_STONE_TILE_STAIRS = registerBlock("end_stone_tile_stairs",
            () -> new StairBlock(ModBlocks.END_STONE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    public static final DeferredBlock<SlabBlock> END_STONE_TILE_SLAB = registerBlock("end_stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));

    public static final DeferredBlock<Block> SMALL_END_STONE_BRICKS = registerBlock("small_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    public static final DeferredBlock<Block> CRACKED_SMALL_END_STONE_BRICKS = registerBlock("cracked_small_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    public static final DeferredBlock<StairBlock> SMALL_END_STONE_BRICK_STAIRS = registerBlock("small_end_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.SMALL_END_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    public static final DeferredBlock<SlabBlock> SMALL_END_STONE_BRICK_SLAB = registerBlock("small_end_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));
    public static final DeferredBlock<WallBlock> SMALL_END_STONE_BRICK_WALL = registerBlock("small_end_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE_BRICKS)));

    public static final DeferredBlock<StairBlock> NETHERITE_STAIRS = registerBlock("netherite_stairs",
            () -> new StairBlock(Blocks.NETHERITE_BLOCK.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK)));

    public static final DeferredBlock<WallBlock> QUARTZ_WALL = registerBlock("quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)));
    public static final DeferredBlock<WallBlock> SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ)));

    public static final DeferredBlock<StairBlock> QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            () -> new StairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)));
    public static final DeferredBlock<SlabBlock> QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)));
    public static final DeferredBlock<WallBlock> QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)));

    public static final DeferredBlock<Block> QUARTZ_TILES = registerBlock("quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)));
    public static final DeferredBlock<StairBlock> QUARTZ_TILE_STAIRS = registerBlock("quartz_tile_stairs",
            () -> new StairBlock(ModBlocks.QUARTZ_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)));
    public static final DeferredBlock<SlabBlock> QUARTZ_TILE_SLAB = registerBlock("quartz_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS)));

    public static final DeferredBlock<StairBlock> AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            () -> new StairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
    public static final DeferredBlock<SlabBlock> AMETHYST_SLAB = registerBlock("amethyst_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
    public static final DeferredBlock<WallBlock> AMETHYST_WALL = registerBlock("amethyst_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

    public static final DeferredBlock<Block> AMETHYST_BRICKS = registerBlock("amethyst_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
    public static final DeferredBlock<StairBlock> AMETHYST_BRICK_STAIRS = registerBlock("amethyst_brick_stairs",
            () -> new StairBlock(ModBlocks.AMETHYST_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
    public static final DeferredBlock<SlabBlock> AMETHYST_BRICK_SLAB = registerBlock("amethyst_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
    public static final DeferredBlock<WallBlock> AMETHYST_BRICK_WALL = registerBlock("amethyst_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

    public static final DeferredBlock<Block> AMETHYST_TILES = registerBlock("amethyst_tiles",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
    public static final DeferredBlock<StairBlock> AMETHYST_TILE_STAIRS = registerBlock("amethyst_tile_stairs",
            () -> new StairBlock(ModBlocks.AMETHYST_TILES.get().defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));
    public static final DeferredBlock<SlabBlock> AMETHYST_TILE_SLAB = registerBlock("amethyst_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

    public static final DeferredBlock<StairBlock> TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            () -> new StairBlock(Blocks.TERRACOTTA.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)));
    public static final DeferredBlock<WallBlock> TERRACOTTA_WALL = registerBlock("terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA)));
    public static final DeferredBlock<StairBlock> WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            () -> new StairBlock(Blocks.WHITE_TERRACOTTA.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            () -> new StairBlock(Blocks.GRAY_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            () -> new StairBlock(Blocks.BLACK_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            () -> new StairBlock(Blocks.BROWN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            () -> new StairBlock(Blocks.RED_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            () -> new StairBlock(Blocks.ORANGE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            () -> new StairBlock(Blocks.YELLOW_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            () -> new StairBlock(Blocks.LIME_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            () -> new StairBlock(Blocks.GREEN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            () -> new StairBlock(Blocks.CYAN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            () -> new StairBlock(Blocks.BLUE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            () -> new StairBlock(Blocks.PURPLE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            () -> new StairBlock(Blocks.MAGENTA_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA)));
    public static final DeferredBlock<StairBlock> PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            () -> new StairBlock(Blocks.PINK_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA)));
    public static final DeferredBlock<SlabBlock> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA)));
    public static final DeferredBlock<WallBlock> PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA)));

    public static final DeferredBlock<StairBlock> WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            () -> new StairBlock(Blocks.WHITE_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));
    public static final DeferredBlock<SlabBlock> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));
    public static final DeferredBlock<WallBlock> WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final DeferredBlock<StairBlock> GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            () -> new StairBlock(Blocks.GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));
    public static final DeferredBlock<SlabBlock> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));
    public static final DeferredBlock<WallBlock> GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)));
    public static final DeferredBlock<StairBlock> BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            () -> new StairBlock(Blocks.BLACK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)));
    public static final DeferredBlock<SlabBlock> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)));
    public static final DeferredBlock<WallBlock> BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)));
    public static final DeferredBlock<StairBlock> BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            () -> new StairBlock(Blocks.BROWN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)));
    public static final DeferredBlock<SlabBlock> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)));
    public static final DeferredBlock<WallBlock> BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)));
    public static final DeferredBlock<StairBlock> RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            () -> new StairBlock(Blocks.RED_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)));
    public static final DeferredBlock<SlabBlock> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)));
    public static final DeferredBlock<WallBlock> RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)));
    public static final DeferredBlock<StairBlock> ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            () -> new StairBlock(Blocks.ORANGE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)));
    public static final DeferredBlock<SlabBlock> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)));
    public static final DeferredBlock<WallBlock> ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)));
    public static final DeferredBlock<StairBlock> YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            () -> new StairBlock(Blocks.YELLOW_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)));
    public static final DeferredBlock<SlabBlock> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)));
    public static final DeferredBlock<WallBlock> YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)));
    public static final DeferredBlock<StairBlock> LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            () -> new StairBlock(Blocks.LIME_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)));
    public static final DeferredBlock<SlabBlock> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)));
    public static final DeferredBlock<WallBlock> LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)));
    public static final DeferredBlock<StairBlock> GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            () -> new StairBlock(Blocks.GREEN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)));
    public static final DeferredBlock<SlabBlock> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)));
    public static final DeferredBlock<WallBlock> GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)));
    public static final DeferredBlock<StairBlock> CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            () -> new StairBlock(Blocks.CYAN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)));
    public static final DeferredBlock<SlabBlock> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)));
    public static final DeferredBlock<WallBlock> CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final DeferredBlock<StairBlock> BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            () -> new StairBlock(Blocks.BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)));
    public static final DeferredBlock<SlabBlock> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)));
    public static final DeferredBlock<WallBlock> BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)));
    public static final DeferredBlock<StairBlock> PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            () -> new StairBlock(Blocks.PURPLE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)));
    public static final DeferredBlock<SlabBlock> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)));
    public static final DeferredBlock<WallBlock> PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)));
    public static final DeferredBlock<StairBlock> MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            () -> new StairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)));
    public static final DeferredBlock<SlabBlock> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)));
    public static final DeferredBlock<WallBlock> MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)));
    public static final DeferredBlock<StairBlock> PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            () -> new StairBlock(Blocks.PINK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)));
    public static final DeferredBlock<SlabBlock> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)));
    public static final DeferredBlock<WallBlock> PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)));

    public static final DeferredBlock<StainedGlassBlock> FRAMED_GLASS = registerBlock("framed_glass",
            () -> new StainedGlassBlock(DyeColor.WHITE, BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_GLASS_PANE = registerBlock("framed_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.WHITE, BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_WHITE_STAINED_GLASS = registerBlock("framed_white_stained_glass",
            () -> new StainedGlassBlock(DyeColor.WHITE, BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_WHITE_STAINED_GLASS_PANE = registerBlock("framed_white_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.WHITE, BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_LIGHT_GRAY_STAINED_GLASS = registerBlock("framed_light_gray_stained_glass",
            () -> new StainedGlassBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("framed_light_gray_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_GRAY_STAINED_GLASS = registerBlock("framed_gray_stained_glass",
            () -> new StainedGlassBlock(DyeColor.GRAY, BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_GRAY_STAINED_GLASS_PANE = registerBlock("framed_gray_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.GRAY, BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_BLACK_STAINED_GLASS = registerBlock("framed_black_stained_glass",
            () -> new StainedGlassBlock(DyeColor.BLACK, BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_BLACK_STAINED_GLASS_PANE = registerBlock("framed_black_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.BLACK, BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_BROWN_STAINED_GLASS = registerBlock("framed_brown_stained_glass",
            () -> new StainedGlassBlock(DyeColor.BROWN, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_BROWN_STAINED_GLASS_PANE = registerBlock("framed_brown_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.BROWN, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_RED_STAINED_GLASS = registerBlock("framed_red_stained_glass",
            () -> new StainedGlassBlock(DyeColor.RED, BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_RED_STAINED_GLASS_PANE = registerBlock("framed_red_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.RED, BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_ORANGE_STAINED_GLASS = registerBlock("framed_orange_stained_glass",
            () -> new StainedGlassBlock(DyeColor.ORANGE, BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_ORANGE_STAINED_GLASS_PANE = registerBlock("framed_orange_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.ORANGE, BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_YELLOW_STAINED_GLASS = registerBlock("framed_yellow_stained_glass",
            () -> new StainedGlassBlock(DyeColor.YELLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_YELLOW_STAINED_GLASS_PANE = registerBlock("framed_yellow_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.YELLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_LIME_STAINED_GLASS = registerBlock("framed_lime_stained_glass",
            () -> new StainedGlassBlock(DyeColor.LIME, BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_LIME_STAINED_GLASS_PANE = registerBlock("framed_lime_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.LIME, BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_GREEN_STAINED_GLASS = registerBlock("framed_green_stained_glass",
            () -> new StainedGlassBlock(DyeColor.GREEN, BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_GREEN_STAINED_GLASS_PANE = registerBlock("framed_green_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.GREEN, BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_CYAN_STAINED_GLASS = registerBlock("framed_cyan_stained_glass",
            () -> new StainedGlassBlock(DyeColor.CYAN, BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_CYAN_STAINED_GLASS_PANE = registerBlock("framed_cyan_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.CYAN, BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_LIGHT_BLUE_STAINED_GLASS = registerBlock("framed_light_blue_stained_glass",
            () -> new StainedGlassBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("framed_light_blue_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_BLUE_STAINED_GLASS = registerBlock("framed_blue_stained_glass",
            () -> new StainedGlassBlock(DyeColor.BLUE, BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_BLUE_STAINED_GLASS_PANE = registerBlock("framed_blue_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.BLUE, BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_PURPLE_STAINED_GLASS = registerBlock("framed_purple_stained_glass",
            () -> new StainedGlassBlock(DyeColor.PURPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_PURPLE_STAINED_GLASS_PANE = registerBlock("framed_purple_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.PURPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_MAGENTA_STAINED_GLASS = registerBlock("framed_magenta_stained_glass",
            () -> new StainedGlassBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_MAGENTA_STAINED_GLASS_PANE = registerBlock("framed_magenta_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassBlock> FRAMED_PINK_STAINED_GLASS = registerBlock("framed_pink_stained_glass",
            () -> new StainedGlassBlock(DyeColor.PINK, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS)));
    public static final DeferredBlock<StainedGlassPaneBlock> FRAMED_PINK_STAINED_GLASS_PANE = registerBlock("framed_pink_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.PINK, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS)));

    public static final DeferredBlock<StairBlock> CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairBlock(Blocks.CALCITE.defaultBlockState(),BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final DeferredBlock<SlabBlock> CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));
    public static final DeferredBlock<WallBlock> CALCITE_WALL = registerBlock("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)));

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