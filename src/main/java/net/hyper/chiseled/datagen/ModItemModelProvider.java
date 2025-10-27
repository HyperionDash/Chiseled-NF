package net.hyper.chiseled.datagen;

import net.hyper.chiseled.Chiseled;
import net.hyper.chiseled.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Chiseled.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        wallItem(ModBlocks.POLISHED_STONE_WALL, ModBlocks.POLISHED_STONE);
        wallItem(ModBlocks.MOSSY_POLISHED_STONE_WALL, ModBlocks.MOSSY_POLISHED_STONE);
        wallItem(ModBlocks.SMALL_STONE_BRICK_WALL, ModBlocks.SMALL_STONE_BRICKS);
        wallItem(ModBlocks.MOSSY_SMALL_STONE_BRICK_WALL, ModBlocks.MOSSY_SMALL_STONE_BRICKS);
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(Chiseled.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}