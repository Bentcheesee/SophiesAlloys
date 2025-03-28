package com.sophiecheese.alloys.init.compat;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class CompatFoodItemProperties {
	
    public static final FoodProperties EXAMPLE = new FoodProperties.Builder()
            .nutrition(2) //hunger points
            .saturationMod(1.2F) //saturation points?
            .effect( () -> new MobEffectInstance(MobEffects.ABSORPTION, 400, 0), 0.8F)
            				//grants absorption 1 for 20 seconds              //chance of it happening
            .build();
	
    public static final FoodProperties OREBERRY_SALAD = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0F)
            .effect( () -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 800, 0), 1F)
            .effect( () -> new MobEffectInstance(MobEffects.DIG_SPEED, 1600, 0), 1F)
            .alwaysEat()
            .build();

}
