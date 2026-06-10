package com.sophiecheese.alloys.item.stats;

import com.sophiecheese.alloys.init.ItemInit;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class SophieArmourMaterials {
	public static final Holder<ArmorMaterial> ELECTRUM = register("electrum", Util.make(new EnumMap<>(ArmorItem.Type.class), map1 -> {
		map1.put(ArmorItem.Type.BOOTS, 3);
		map1.put(ArmorItem.Type.LEGGINGS, 6);
		map1.put(ArmorItem.Type.CHESTPLATE, 7);
		map1.put(ArmorItem.Type.HELMET, 3);
		map1.put(ArmorItem.Type.BODY, 9);
	}), 30, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.ELECTRUM_PLATE.get()));
	public static final Holder<ArmorMaterial> SILVER = register("silver", Util.make(new EnumMap<>(ArmorItem.Type.class), map1 -> {
		map1.put(ArmorItem.Type.BOOTS, 2);
		map1.put(ArmorItem.Type.LEGGINGS, 3);
		map1.put(ArmorItem.Type.CHESTPLATE, 4);
		map1.put(ArmorItem.Type.HELMET, 4);
		map1.put(ArmorItem.Type.BODY, 7);
	}), 17, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.1F, () -> Ingredient.of(ItemInit.SILVER_PLATE.get()));
	public static final Holder<ArmorMaterial> BABULYMN = register("babulymn", Util.make(new EnumMap<>(ArmorItem.Type.class), map0 -> {
		map0.put(ArmorItem.Type.BOOTS, 0);
		map0.put(ArmorItem.Type.LEGGINGS, 0);
		map0.put(ArmorItem.Type.CHESTPLATE, 0);
		map0.put(ArmorItem.Type.HELMET, 5);
		map0.put(ArmorItem.Type.BODY, 10);
	}), 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.1F, () -> Ingredient.of(ItemInit.BABULYMN_PLATE.get()));
	public static final Holder<ArmorMaterial> FOXITE = register("foxite", Util.make(new EnumMap<>(ArmorItem.Type.class), map0 -> {
		map0.put(ArmorItem.Type.BOOTS, 2);
		map0.put(ArmorItem.Type.LEGGINGS, 5);
		map0.put(ArmorItem.Type.CHESTPLATE, 6);
		map0.put(ArmorItem.Type.HELMET, 2);
		map0.put(ArmorItem.Type.BODY, 5);
	}), 9, SoundEvents.ARMOR_EQUIP_IRON, 0.5F, 0.0F, () -> Ingredient.of(ItemInit.FOXITE_PLATE.get()));
	public static final Holder<ArmorMaterial> STEEL = register("steel", Util.make(new EnumMap<>(ArmorItem.Type.class), map0 -> {
		map0.put(ArmorItem.Type.BOOTS, 3);
		map0.put(ArmorItem.Type.LEGGINGS, 6);
		map0.put(ArmorItem.Type.CHESTPLATE, 6);
		map0.put(ArmorItem.Type.HELMET, 3);
		map0.put(ArmorItem.Type.BODY, 6);
	}), 9, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, 0.4F, () -> Ingredient.of(ItemInit.STEEL_PLATE.get()));
	public static final Holder<ArmorMaterial> LYCALITE = register("lycalite", Util.make(new EnumMap<>(ArmorItem.Type.class), map0 -> {
		map0.put(ArmorItem.Type.BOOTS, 3);
		map0.put(ArmorItem.Type.LEGGINGS, 6);
		map0.put(ArmorItem.Type.CHESTPLATE, 7);
		map0.put(ArmorItem.Type.HELMET, 3);
		map0.put(ArmorItem.Type.BODY, 7);
	}), 9, SoundEvents.ARMOR_EQUIP_IRON, 1.5F, 0.2F, () -> Ingredient.of(ItemInit.LYCALITE_PLATE.get()));
	public static final Holder<ArmorMaterial> MITHRIL = register("foxite", Util.make(new EnumMap<>(ArmorItem.Type.class), map0 -> {
		map0.put(ArmorItem.Type.BOOTS, 4);
		map0.put(ArmorItem.Type.LEGGINGS, 6);
		map0.put(ArmorItem.Type.CHESTPLATE, 8);
		map0.put(ArmorItem.Type.HELMET, 3);
		map0.put(ArmorItem.Type.BODY, 10);
	}), 9, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.1F, () -> Ingredient.of(ItemInit.MITHRIL_PLATE.get()));
	public static final Holder<ArmorMaterial> TUNGSTEN = register("foxite", Util.make(new EnumMap<>(ArmorItem.Type.class), map0 -> {
		map0.put(ArmorItem.Type.BOOTS, 3);
		map0.put(ArmorItem.Type.LEGGINGS, 7);
		map0.put(ArmorItem.Type.CHESTPLATE, 9);
		map0.put(ArmorItem.Type.HELMET, 3);
		map0.put(ArmorItem.Type.BODY, 13);
	}), 9, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.75F, 0.25F, () -> Ingredient.of(ItemInit.TUNGSTEN_PLATE.get()));
	public static final Holder<ArmorMaterial> LAGOMITE = register("foxite", Util.make(new EnumMap<>(ArmorItem.Type.class), map0 -> {
		map0.put(ArmorItem.Type.BOOTS, 4);
		map0.put(ArmorItem.Type.LEGGINGS, 6);
		map0.put(ArmorItem.Type.CHESTPLATE, 8);
		map0.put(ArmorItem.Type.HELMET, 4);
		map0.put(ArmorItem.Type.BODY, 12);
	}), 9, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.5F, 0.1F, () -> Ingredient.of(ItemInit.LAGOMITE_PLATE.get()));

	private static Holder<ArmorMaterial> register(
		String name,
		EnumMap<ArmorItem.Type, Integer> defense,
		int enchantmentValue,
		Holder<SoundEvent> equipSound,
		float toughness,
		float knockbackResistance,
		Supplier<Ingredient> repairIngredient
	) {
		List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(ResourceLocation.withDefaultNamespace(name)));
		return register(name, defense, enchantmentValue, equipSound, toughness, knockbackResistance, repairIngredient, list);
	}

	private static Holder<ArmorMaterial> register(
		String name,
		EnumMap<ArmorItem.Type, Integer> defense,
		int enchantmentValue,
		Holder<SoundEvent> equipSound,
		float toughness,
		float knockbackResistance,
		Supplier<Ingredient> repairIngridient,
		List<ArmorMaterial.Layer> layers
	) {
		EnumMap<ArmorItem.Type, Integer> enummap = new EnumMap<>(ArmorItem.Type.class);

		for (ArmorItem.Type armoritem$type : ArmorItem.Type.values()) {
			enummap.put(armoritem$type, defense.get(armoritem$type));
		}

		return Registry.registerForHolder(
			BuiltInRegistries.ARMOR_MATERIAL,
			ResourceLocation.withDefaultNamespace(name),
			new ArmorMaterial(enummap, enchantmentValue, equipSound, repairIngridient, layers, toughness, knockbackResistance)
		);
	}
}
