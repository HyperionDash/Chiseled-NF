package net.hyper.chiseled.item;

import net.hyper.chiseled.Chiseled;
import net.hyper.chiseled.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Chiseled.MOD_ID);

    public static final Supplier<CreativeModeTab> CHISELED_TAB = CREATIVE_MODE_TAB.register("chiseled_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.STONE_TILES.get()))
                    .title(Component.translatable("creativetab.chiseled.chiseled_tab"))
                    .withSearchBar()
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.STONE_TILES);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}