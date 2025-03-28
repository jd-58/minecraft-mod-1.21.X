package com.jd58.paintballmod.item;

import com.jd58.paintballmod.PaintballMod;
import com.jd58.paintballmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PaintballMod.MOD_ID);

    public static final Supplier<CreativeModeTab> PAINTBALL_ITEMS_TAB = CREATIVE_MODE_TAB.register("paintball_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PAINTBALLGUN.get()))
                    .title(Component.translatable("creativetab.jdpaintballmod.paintball_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PAINTBALLGUN);
                        output.accept(ModBlocks.PAINTBALL_BLOCK);

                        output.accept(ModItems.PAINTBALLGUNITEM);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
