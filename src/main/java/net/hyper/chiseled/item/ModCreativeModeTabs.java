package net.hyper.chiseled.item;

import net.hyper.chiseled.Chiseled;
import net.hyper.chiseled.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Chiseled.MOD_ID);

    public static final Supplier<CreativeModeTab> CHISELED_TAB = CREATIVE_MODE_TAB.register("chiseled_tab",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.POLISHED_STONE.get()))
                    .title(Component.translatable("creativetab.chiseled.chiseled_tab"))
                    .withSearchBar()
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Blocks.STONE);
                        output.accept(Blocks.STONE_STAIRS);
                        output.accept(Blocks.STONE_SLAB);
                        output.accept(ModBlocks.STONE_WALL);
                        output.accept(Blocks.STONE_PRESSURE_PLATE);
                        output.accept(Blocks.STONE_BUTTON);
                        output.accept(Blocks.COBBLESTONE);
                        output.accept(Blocks.COBBLESTONE_STAIRS);
                        output.accept(Blocks.COBBLESTONE_SLAB);
                        output.accept(Blocks.COBBLESTONE_WALL);
                        output.accept(ModBlocks.POLISHED_STONE);
                        output.accept(ModBlocks.POLISHED_STONE_STAIRS);
                        output.accept(ModBlocks.POLISHED_STONE_SLAB);
                        output.accept(ModBlocks.POLISHED_STONE_WALL);
                        output.accept(Blocks.STONE_BRICKS);
                        output.accept(Blocks.CRACKED_STONE_BRICKS);
                        output.accept(Blocks.STONE_BRICK_STAIRS);
                        output.accept(Blocks.STONE_BRICK_SLAB);
                        output.accept(Blocks.STONE_BRICK_WALL);
                        output.accept(Blocks.CHISELED_STONE_BRICKS);
                        output.accept(ModBlocks.CRACKED_CHISELED_STONE_BRICKS);
                        output.accept(ModBlocks.STONE_TILES);
                        output.accept(ModBlocks.CRACKED_STONE_TILES);
                        output.accept(ModBlocks.STONE_TILE_STAIRS);
                        output.accept(ModBlocks.STONE_TILE_SLAB);
                        output.accept(ModBlocks.SMALL_STONE_BRICKS);
                        output.accept(ModBlocks.CRACKED_SMALL_STONE_BRICKS);
                        output.accept(ModBlocks.SMALL_STONE_BRICK_STAIRS);
                        output.accept(ModBlocks.SMALL_STONE_BRICK_SLAB);
                        output.accept(ModBlocks.SMALL_STONE_BRICK_WALL);
                        output.accept(Blocks.MOSSY_COBBLESTONE);
                        output.accept(Blocks.MOSSY_COBBLESTONE_STAIRS);
                        output.accept(Blocks.MOSSY_COBBLESTONE_SLAB);
                        output.accept(Blocks.MOSSY_COBBLESTONE_WALL);
                        output.accept(ModBlocks.MOSSY_POLISHED_STONE);
                        output.accept(ModBlocks.MOSSY_POLISHED_STONE_STAIRS);
                        output.accept(ModBlocks.MOSSY_POLISHED_STONE_SLAB);
                        output.accept(ModBlocks.MOSSY_POLISHED_STONE_WALL);
                        output.accept(Blocks.MOSSY_STONE_BRICKS);
                        output.accept(Blocks.MOSSY_STONE_BRICK_STAIRS);
                        output.accept(Blocks.MOSSY_STONE_BRICK_SLAB);
                        output.accept(Blocks.MOSSY_STONE_BRICK_WALL);
                        output.accept(ModBlocks.MOSSY_CHISELED_STONE_BRICKS);
                        output.accept(ModBlocks.MOSSY_STONE_TILES);
                        output.accept(ModBlocks.MOSSY_STONE_TILE_STAIRS);
                        output.accept(ModBlocks.MOSSY_STONE_TILE_SLAB);
                        output.accept(ModBlocks.MOSSY_SMALL_STONE_BRICKS);
                        output.accept(ModBlocks.MOSSY_SMALL_STONE_BRICK_STAIRS);
                        output.accept(ModBlocks.MOSSY_SMALL_STONE_BRICK_SLAB);
                        output.accept(ModBlocks.MOSSY_SMALL_STONE_BRICK_WALL);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}