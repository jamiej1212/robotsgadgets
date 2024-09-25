package com.trextherobot.robotsgadgets.items;

import com.trextherobot.robotsgadgets.RobotsGadgets;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemGadgets {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RobotsGadgets.MOD_ID);

    public static final RegistryObject<Item> MODICON01 = ITEMS.register("modicon01",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONEBOT = ITEMS.register("onebot",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIVEBOT = ITEMS.register("fivebot",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TENBOT = ITEMS.register("tenbot",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIFTYBOT = ITEMS.register("fiftybot",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TPTICKET = ITEMS.register("tpticket",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
