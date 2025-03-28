package com.sophiecheese.alloys.item.consumables;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodItemProperties {

	public static final FoodProperties OREBERRY = Haste(1,0.0F,20)
			.effect( () -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 0), 1F)
			.fast().alwaysEat().build();
	public static final FoodProperties WEAK_BASIC = Basic(4,0.1F).build();
	public static final FoodProperties MEDIUM_BASIC = Basic(6,0.3F).build();
	public static final FoodProperties STRONG_BASIC = Basic(8,0.6F).build();

//Quingum
	public static final FoodProperties QUINGUM_GEM = Haste(2,0.05F,20).alwaysEat().build();
	public static final FoodProperties SEARED_QUINGUM = Haste(6,0.2F,30).alwaysEat().build();
	public static final FoodProperties QUINGUMMIES = Haste(1,0F,45).alwaysEat().build();
	public static final FoodProperties OTHER_QUINGUMMIES = Haste(1,0F,60).alwaysEat().build();
	public static final FoodProperties OREBERRY_QUINGUMMIES = Haste(1,0F,90).alwaysEat().build();
	public static final FoodProperties GLOW_QUINGUMMIES = Haste(1,0F,60)
			.effect( () -> new MobEffectInstance(MobEffects.GLOWING, 3000, 0), 1F).alwaysEat().build();
	public static final FoodProperties FUNKY_QUINGUMMIES = Haste(1,0F,45)
			.effect( () -> new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0), 1F)
			.effect( () -> new MobEffectInstance(MobEffects.CONFUSION, 60, 0), 1F)
			.effect( () -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), .5F)
			.effect( () -> new MobEffectInstance(MobEffects.WEAKNESS, 600, 0), .5F)
			.alwaysEat().build();
	public static final FoodProperties CORRUPT_QUINGUMMIES = Haste(1,0F,60)
			.effect( () -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 0), 1F)
			.effect( () -> new MobEffectInstance(MobEffects.LUCK, 6000, 1), 1F)
			.alwaysEat().build();

//Meat
    public static final FoodProperties RAW_MEAT = Basic(2,0.3F)
    		.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 0.1f)
    		.effect(() -> new MobEffectInstance(MobEffects.GLOWING, 1200, 0), 0.4f)
    		.effect(() -> new MobEffectInstance(MobEffects.DARKNESS, 500, 0), 0.2f)
    		.effect(() -> new MobEffectInstance(MobEffects.HUNGER, 200, 0), 0.05f)
    		.effect(() -> new MobEffectInstance(MobEffects.UNLUCK, 4800, 0), 0.3f)
    		.effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 400, 0), 1f)
    		.meat()
    		.build(); 
    public static final FoodProperties COOKED_MEAT = Basic(8,0.6F)
    		.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 0.1f)
    		.effect(() -> new MobEffectInstance(MobEffects.GLOWING, 1200, 0), 0.4f)
    		.effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 200, 0), 0.6f)
    		.effect(() -> new MobEffectInstance(MobEffects.UNLUCK, 2400, 0), 0.3f)
    		.effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 1f)
			.meat()
			.build();

    private static FoodProperties.Builder Haste(int nut, float sat, int sec) {
       return (new FoodProperties.Builder())
    		   .nutrition(nut)
    		   .saturationMod(sat)
    		   .effect( () -> new MobEffectInstance(MobEffects.DIG_SPEED, 20*sec, 0), 1F);
    }
    private static FoodProperties.Builder Basic(int nut, float sat) {
        return (new FoodProperties.Builder())
     		   .nutrition(nut)
     		   .saturationMod(sat);
     }
}
