package net.luhcarti.delightfulsandwich.item;

import net.minecraft.world.food.FoodProperties;

public class LuhFoods {
    private static FoodProperties.Builder stew(int pNutrition) {
        return (new FoodProperties.Builder()).nutrition(pNutrition).saturationModifier(0.6F);
    }
    public static final FoodProperties HAM_SANDWICH = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties BACON_AND_EGG_SANDWICH = (new FoodProperties.Builder())
            .nutrition(11).saturationModifier(0.8f).build();
    public static final FoodProperties COOKED_SALMON_SANDWICH = (new FoodProperties.Builder())
            .nutrition(10).saturationModifier(0.8f).build();
    public static final FoodProperties TOMATO_AND_LETTUCE_SANDWICH = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties COOKED_COD_SANDWICH = (new FoodProperties.Builder())
            .nutrition(8).saturationModifier(0.8f).build();
    public static final FoodProperties MUTTON_SANDWICH = (new FoodProperties.Builder())
            .nutrition(10).saturationModifier(0.8f).build();
}
