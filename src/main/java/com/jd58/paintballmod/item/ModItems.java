package com.jd58.paintballmod.item;

import com.jd58.paintballmod.PaintballMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PaintballMod.MOD_ID);

    public static final DeferredItem<Item> PAINTBALLGUN = ITEMS.register("paintballgun",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
