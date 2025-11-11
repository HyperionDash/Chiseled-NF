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

    public static final DeferredBlock<WallBlock> STONE_WALL = registerBlock("stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> POLISHED_STONE = registerBlock("polished_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MOSSY_POLISHED_STONE = registerBlock("mossy_polished_stone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> MOSSY_POLISHED_STONE_STAIRS = registerBlock("mossy_polished_stone_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_POLISHED_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> MOSSY_POLISHED_STONE_SLAB = registerBlock("mossy_polished_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> MOSSY_POLISHED_STONE_WALL = registerBlock("mossy_polished_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CRACKED_CHISELED_STONE_BRICKS = registerBlock("cracked_chiseled_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MOSSY_CHISELED_STONE_BRICKS = registerBlock("mossy_chiseled_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> STONE_TILES = registerBlock("stone_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            () -> new StairBlock(ModBlocks.STONE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> MOSSY_STONE_TILE_STAIRS = registerBlock("mossy_stone_tile_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_STONE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> SMALL_STONE_BRICKS = registerBlock("small_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CRACKED_SMALL_STONE_BRICKS = registerBlock("cracked_small_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> SMALL_STONE_BRICK_STAIRS = registerBlock("small_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.SMALL_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> SMALL_STONE_BRICK_SLAB = registerBlock("small_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> SMALL_STONE_BRICK_WALL = registerBlock("small_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MOSSY_SMALL_STONE_BRICKS = registerBlock("mossy_small_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> MOSSY_SMALL_STONE_BRICK_STAIRS = registerBlock("mossy_small_stone_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_SMALL_STONE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> MOSSY_SMALL_STONE_BRICK_SLAB = registerBlock("mossy_small_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> MOSSY_SMALL_STONE_BRICK_WALL = registerBlock("mossy_small_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.DIRT).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.DIRT).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CRACKED_POLISHED_GRANITE_BRICKS = registerBlock("cracked_polished_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.DIRT).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> POLISHED_GRANITE_BRICK_STAIRS = registerBlock("polished_granite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_GRANITE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.DIRT).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> POLISHED_GRANITE_BRICK_SLAB = registerBlock("polished_granite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.DIRT).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> POLISHED_GRANITE_BRICK_WALL = registerBlock("polished_granite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.DIRT).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> POLISHED_GRANITE_TILES = registerBlock("polished_granite_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.DIRT).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CRACKED_POLISHED_GRANITE_TILES = registerBlock("cracked_polished_granite_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.DIRT).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> POLISHED_GRANITE_TILE_STAIRS = registerBlock("polished_granite_tile_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_GRANITE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.DIRT).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> POLISHED_GRANITE_TILE_SLAB = registerBlock("polished_granite_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.DIRT).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CRACKED_POLISHED_DIORITE_BRICKS = registerBlock("cracked_polished_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> POLISHED_DIORITE_BRICK_STAIRS = registerBlock("polished_diorite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DIORITE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> POLISHED_DIORITE_BRICK_SLAB = registerBlock("polished_diorite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> POLISHED_DIORITE_BRICK_WALL = registerBlock("polished_diorite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> POLISHED_DIORITE_TILES = registerBlock("polished_diorite_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CRACKED_POLISHED_DIORITE_TILES = registerBlock("cracked_polished_diorite_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> POLISHED_DIORITE_TILE_STAIRS = registerBlock("polished_diorite_tile_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_DIORITE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> POLISHED_DIORITE_TILE_SLAB = registerBlock("polished_diorite_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.QUARTZ).requiresCorrectToolForDrops()));

    public static final DeferredBlock<WallBlock> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CRACKED_POLISHED_ANDESITE_BRICKS = registerBlock("cracked_polished_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> POLISHED_ANDESITE_BRICK_STAIRS = registerBlock("polished_andesite_brick_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_ANDESITE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> POLISHED_ANDESITE_BRICK_SLAB = registerBlock("polished_andesite_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> POLISHED_ANDESITE_BRICK_WALL = registerBlock("polished_andesite_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> POLISHED_ANDESITE_TILES = registerBlock("polished_andesite_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CRACKED_POLISHED_ANDESITE_TILES = registerBlock("cracked_polished_andesite_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> POLISHED_ANDESITE_TILE_STAIRS = registerBlock("polished_andesite_tile_stairs",
            () -> new StairBlock(ModBlocks.POLISHED_ANDESITE_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> POLISHED_ANDESITE_TILE_SLAB = registerBlock("polished_andesite_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DEEPSLATE_TILES = registerBlock("deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CRACKED_DEEPSLATE_TILES = registerBlock("cracked_deepslate_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> DEEPSLATE_TILE_STAIRS = registerBlock("deepslate_tile_stairs",
            () -> new StairBlock(ModBlocks.DEEPSLATE_TILES.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> DEEPSLATE_TILE_SLAB = registerBlock("deepslate_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MOSSY_BRICKS = registerBlock("mossy_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> MOSSY_BRICK_STAIRS = registerBlock("mossy_brick_stairs",
            () -> new StairBlock(ModBlocks.MOSSY_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> MOSSY_BRICK_SLAB = registerBlock("mossy_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> MOSSY_BRICK_WALL = registerBlock("mossy_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> WEATHERED_BRICKS = registerBlock("weathered_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<StairBlock> WEATHERED_BRICK_STAIRS = registerBlock("weathered_brick_stairs",
            () -> new StairBlock(ModBlocks.WEATHERED_BRICKS.get().defaultBlockState(),BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> WEATHERED_BRICK_SLAB = registerBlock("weathered_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));
    public static final DeferredBlock<WallBlock> WEATHERED_BRICK_WALL = registerBlock("weathered_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F).explosionResistance(6F).sound(SoundType.STONE).mapColor(MapColor.STONE).requiresCorrectToolForDrops()));

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