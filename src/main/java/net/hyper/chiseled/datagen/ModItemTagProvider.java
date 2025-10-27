package net.hyper.chiseled.datagen;

import net.hyper.chiseled.Chiseled;
import net.hyper.chiseled.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Chiseled.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.WALLS)
                .add(ModBlocks.STONE_WALL.asItem())
                .add(ModBlocks.POLISHED_STONE_WALL.asItem())
                .add(ModBlocks.MOSSY_POLISHED_STONE_WALL.asItem())
                .add(ModBlocks.SMALL_STONE_BRICK_WALL.asItem())
                .add(ModBlocks.MOSSY_SMALL_STONE_BRICK_WALL.asItem());

        tag(ItemTags.STONE_BRICKS)
                .add(ModBlocks.POLISHED_STONE.asItem())
                .add(ModBlocks.MOSSY_POLISHED_STONE.asItem())
                .add(ModBlocks.CRACKED_CHISELED_STONE_BRICKS.asItem())
                .add(ModBlocks.MOSSY_CHISELED_STONE_BRICKS.asItem())
                .add(ModBlocks.STONE_TILES.asItem())
                .add(ModBlocks.CRACKED_STONE_TILES.asItem())
                .add(ModBlocks.MOSSY_STONE_TILES.asItem())
                .add(ModBlocks.SMALL_STONE_BRICKS.asItem())
                .add(ModBlocks.CRACKED_SMALL_STONE_BRICKS.asItem())
                .add(ModBlocks.MOSSY_SMALL_STONE_BRICKS.asItem());
    }
}