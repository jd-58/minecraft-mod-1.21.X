package com.jd58.paintballmod.item;

import com.jd58.paintballmod.PaintballMod;
import com.jd58.paintballmod.item.custom.PaintballgunItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PaintballMod.MOD_ID);

    public static final DeferredItem<Item> PAINTBALLGUN = ITEMS.register("paintballgun",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PAINTBALLGUNITEM = ITEMS.register("paintballgunitem",
            () -> new PaintballgunItem(new Item.Properties().stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
