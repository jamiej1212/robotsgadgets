package com.trextherobot.robotsgadgets.items;

import com.trextherobot.robotsgadgets.RobotsGadgets;
import com.trextherobot.robotsgadgets.blocks.BlockGadgets;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class GadgetsTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RobotsGadgets.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GADGETS_TAB = CREATIVE_MODE_TABS.register("gadgets_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ItemGadgets.MODICON01.get()))
                    .title(Component.translatable("creativetab.item_gadgets_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ItemGadgets.MODICON01.get());
                        pOutput.accept(ItemGadgets.ONEBOT.get());
                        pOutput.accept(ItemGadgets.FIVEBOT.get());
                        pOutput.accept(ItemGadgets.TENBOT.get());
                        pOutput.accept(ItemGadgets.FIFTYBOT.get());
                        pOutput.accept(ItemGadgets.TPTICKET.get());
                        pOutput.accept(BlockGadgets.GOLD_BLOCK.get());
                        pOutput.accept(BlockGadgets.BIRCH_LOG.get());
                        pOutput.accept(BlockGadgets.BROWN_BRICK.get());
                        pOutput.accept(BlockGadgets.GRAY_STONE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
