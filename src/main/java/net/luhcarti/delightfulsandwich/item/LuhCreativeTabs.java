package net.luhcarti.delightfulsandwich.item;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import vectorwing.farmersdelight.common.registry.ModCreativeTabs;

public class LuhCreativeTabs {
    @SubscribeEvent
    public static void addItemsToCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModCreativeTabs.TAB_FARMERS_DELIGHT.get())
            addItemsToFDCreativeTab(event);
    }

    private static void addItemsToFDCreativeTab(BuildCreativeModeTabContentsEvent event) {
        event.accept(LuhItems.HAM_SANDWICH);
        event.accept(LuhItems.BACON_AND_EGG_SANDWICH);
        event.accept(LuhItems.COOKED_SALMON_SANDWICH);
        event.accept(LuhItems.TOMATO_AND_LETTUCE_SANDWICH);
        event.accept(LuhItems.COOKED_COD_SANDWICH);
        event.accept(LuhItems.MUTTON_SANDWICH);
    }
}




