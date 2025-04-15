package com.sophiecheese.alloys.item.consumables;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodItemProperties {

	public static final FoodProperties WEAK_BASIC = Basic(4,0.1F).build();
	public static final FoodProperties MEDIUM_BASIC = Basic(6,0.6F).build();
	public static final FoodProperties SLIGHTLY_LESS_MEDIUM_BASIC = Basic(7,0.7F).build();
	public static final FoodProperties STRONG_BASIC = Basic(8,1F).build();

//Oreberry
	public static final FoodProperties OREBERRY = Resi(1,0.0F,15)
			.fast().alwaysEat().build();
//No Fruit
	public static final FoodProperties NO_FRUIT = Basic(2,0.0F)
			.fast().alwaysEat().build();
//Quingum
	public static final FoodProperties QUINGUM_GEM = Haste(2,0.0F,20).alwaysEat().build();
	public static final FoodProperties SEARED_QUINGUM = Haste(4,0.2F,30).alwaysEat().build();

	public static final FoodProperties CORRUPT_MIXTURE = CorruptQuingum(8,0.6F).build();
	public static final FoodProperties CORRUPT_QUINGUMMIES = CorruptQuingum(4,0.3F).build();
	public static final FoodProperties FLESH_QUINGUMMIES = CorruptQuingum(5,0.5F)
			.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1F).build();
	public static final FoodProperties FRUIT_MIXTURE = Haste(8,0.6F,45)
			.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1F).alwaysEat().build();
	public static final FoodProperties FRUIT_QUINGUMMIES = Haste(4,0.4F,45)
			.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1F).alwaysEat().build();
	public static final FoodProperties FUNKY_MIXTURE = FunkyQuingum(8,0.6F).build();
	public static final FoodProperties FUNKY_QUINGUMMIES = FunkyQuingum(4,0.4F).build();
	public static final FoodProperties GLOW_MIXTURE = Haste(7,0.4F,45)
			.effect( () -> new MobEffectInstance(MobEffects.GLOWING, 3000), 1F).alwaysEat().build();
	public static final FoodProperties GLOW_QUINGUMMIES = Haste(4,0.2F,45)
			.effect( () -> new MobEffectInstance(MobEffects.GLOWING, 3000), 1F).alwaysEat().build();
	public static final FoodProperties OREBERRY_MIXTURE = ResiHaste(8,0.6F,45,45).alwaysEat().build();
	public static final FoodProperties OREBERRY_QUINGUMMIES = ResiHaste(4,0.4F,45,45).alwaysEat().build();
	public static final FoodProperties PLAIN_MIXTURE = Haste(7,0.5F,45).alwaysEat().build();
	public static final FoodProperties PLAIN_QUINGUMMIES = Haste(4,0.3F,45).alwaysEat().build();
//Meat
	public static final FoodProperties RAW_MEAT = RawMeat(2,0.3F,2).build();
	public static final FoodProperties COOKED_MEAT = CookedMeat(6,0.8F,2).build();

//Farmer's Compat
	public static final FoodProperties OREBERRY_SALAD = Resi(8,0.6F,60)
			.effect( () -> new MobEffectInstance(MobEffects.REGENERATION, 100), 1F).build();
	public static final FoodProperties OREBERRY_BURGER = Resi(10,0.7F,45).build();
	public static final FoodProperties QUINGUM_SALAD = Haste(8,0.9F,90)
			.effect( () -> new MobEffectInstance(MobEffects.REGENERATION, 100), 1F).build();
	public static final FoodProperties FANCY_UNDERGROUND_SOUP = ResiHaste(10,1.2F,75,120).build();
	public static final FoodProperties RAW_MEAT_STRIPS = RawMeat(1,0.15F,1).build(); 
	public static final FoodProperties COOKED_MEAT_STRIPS = CookedMeat(3,0.4F,1).build();
//Create Compat
	public static final FoodProperties CHOCOLATE_GLAZED_QUINGUM = Haste(7,0.6F,45).build();
	public static final FoodProperties CHOCOLATE_GLAZED_OREBERRIES = Resi(6,0.5F,30).build();
//	CHOCOLATEY_OREBERRY_CAKE.. I'm going to wait for this one..  Don't know how I feel about it yet

//Builders
	//Basic Builders
	private static FoodProperties.Builder Basic(int nut, float sat) {
		return (new FoodProperties.Builder())
			.nutrition(nut).saturationMod(sat);
	}
	private static FoodProperties.Builder Haste(int nut, float sat, int secDigSpeed) {
		return (new FoodProperties.Builder())
			.nutrition(nut).saturationMod(sat)
			.effect( () -> new MobEffectInstance(MobEffects.DIG_SPEED, 20*secDigSpeed), 1F);
	}
	private static FoodProperties.Builder Resi(int nut, float sat, int secResistance) {
		return (new FoodProperties.Builder())
			.nutrition(nut).saturationMod(sat)
			.effect( () -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20*secResistance), 1F);
	}
	private static FoodProperties.Builder ResiHaste(int nut, float sat, int secResistance, int secDigSpeed) {
		return (new FoodProperties.Builder())
			.nutrition(nut).saturationMod(sat)
			.effect( () -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20*secResistance), 1F)
			.effect( () -> new MobEffectInstance(MobEffects.DIG_SPEED, 20*secDigSpeed), 1F);
	}
	//Quingum
	private static FoodProperties.Builder CorruptQuingum(int nut, float sat) {
		return (new FoodProperties.Builder())
			.effect( () -> new MobEffectInstance(MobEffects.DIG_SPEED, 900), 1F)
			.effect( () -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200), 1F)
			.effect( () -> new MobEffectInstance(MobEffects.LUCK, 6000, 1), 1F)
			.nutrition(nut).saturationMod(sat).alwaysEat();
	}
	private static FoodProperties.Builder FunkyQuingum(int nut, float sat) {
		return (new FoodProperties.Builder())
			.effect( () -> new MobEffectInstance(MobEffects.DIG_SPEED, 900), 1F)
			.effect( () -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 900), 1F)
			.effect( () -> new MobEffectInstance(MobEffects.NIGHT_VISION, 600), 1F)
			.nutrition(nut).saturationMod(sat).alwaysEat();
	}
	//Meat
	private static FoodProperties.Builder RawMeat(int nut, float sat, int edm) { //edm means Effect Duration Multiplier
		return (new FoodProperties.Builder())
			.nutrition(nut).saturationMod(sat)
			.effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200*edm), 1f)
			.effect(() -> new MobEffectInstance(MobEffects.GLOWING, 600*edm), 0.4f)
			.effect(() -> new MobEffectInstance(MobEffects.UNLUCK, 2400*edm), 0.3f)
			.effect(() -> new MobEffectInstance(MobEffects.DARKNESS, 250*edm), 0.2f)
			.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 50*edm, 1), 0.1f)
			.effect(() -> new MobEffectInstance(MobEffects.HUNGER, 100*edm), 0.05f)
			.meat();
	}
	private static FoodProperties.Builder CookedMeat(int nut, float sat, int edm) {
		return (new FoodProperties.Builder())
			.nutrition(nut).saturationMod(sat)
			.effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 150*edm), 1f)
			.effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 100*edm), 0.6f)
			.effect(() -> new MobEffectInstance(MobEffects.GLOWING, 600*edm), 0.4f)
			.effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 800*edm), 0.4f)
			.effect(() -> new MobEffectInstance(MobEffects.UNLUCK, 1200*edm), 0.3f)
			.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100*edm, 1), 0.1f)
			.meat();
	}
}
