package net.luhcarti.delightfulsandwich.item;

import net.luhcarti.delightfulsandwich.DelightfulSandwich;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class LuhItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(DelightfulSandwich.MOD_ID);
    public static final DeferredItem<Item> HAM_SANDWICH = ITEMS.register("ham_sandwich",
            () -> new Item(new Item.Properties().food(LuhFoods.HAM_SANDWICH)));
    public static final DeferredItem<Item> BACON_AND_EGG_SANDWICH = ITEMS.register("bacon_and_egg_sandwich",
            () -> new Item(new Item.Properties().food(LuhFoods.BACON_AND_EGG_SANDWICH)));
    public static final DeferredItem<Item> COOKED_SALMON_SANDWICH = ITEMS.register("cooked_salmon_sandwich",
            () -> new Item(new Item.Properties().food(LuhFoods.COOKED_SALMON_SANDWICH)));
    public static final DeferredItem<Item> TOMATO_AND_LETTUCE_SANDWICH = ITEMS.register("tomato_and_lettuce_sandwich",
            () -> new Item(new Item.Properties().food(LuhFoods.TOMATO_AND_LETTUCE_SANDWICH)));
    public static final DeferredItem<Item> COOKED_COD_SANDWICH = ITEMS.register("cooked_cod_sandwich",
            () -> new Item(new Item.Properties().food(LuhFoods.COOKED_COD_SANDWICH)));
    public static final DeferredItem<Item> MUTTON_SANDWICH = ITEMS.register("mutton_sandwich",
            () -> new Item(new Item.Properties().food(LuhFoods.MUTTON_SANDWICH)));
}
