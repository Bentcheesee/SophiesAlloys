package com.sophiecheese.alloys.item.tools;

import java.util.function.Supplier;

import com.sophiecheese.alloys.init.GeneralItemInit;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum SophieArmorTier implements ArmorMaterial{
	//GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
	ELECTRUM("electrum", 8, new int[]{3, 6, 7, 3}, 30, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
		return Ingredient.of(GeneralItemInit.ELECTRUM_PLATE.get());
	}),
	//LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F,
	SILVER("silver", 12, new int[]{2, 3, 2, 4}, 17, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
		return Ingredient.of(GeneralItemInit.SILVER_PLATE.get());
	}),
	//CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F,
	BABULYMN("babulymn", 16, new int[]{5, 0, 0, 0}, 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
		return Ingredient.of(GeneralItemInit.BABULYMN_PLATE.get());
	}),
	FOXITE("foxite", 16, new int[]{3, 5, 6, 2}, 15, SoundEvents.ARMOR_EQUIP_IRON, 0.5F, 0.0F, () -> {
		return Ingredient.of(GeneralItemInit.FOXITE_PLATE.get());
	}),
	//IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F,
	STEEL("steel", 26, new int[]{3, 6, 7, 3}, 12, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, 0.4F, () -> {
		return Ingredient.of(GeneralItemInit.STEEL_PLATE.get());
	}),
	LYCALITE("lycalite", 26, new int[]{3, 6, 7, 3}, 8, SoundEvents.ARMOR_EQUIP_IRON, 1.5F, 0.2F, () -> {
		return Ingredient.of(GeneralItemInit.LYCALITE_PLATE.get());
	}),
	//DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
	MITHRIL("mithril", 30, new int[]{4, 6, 8, 3}, 3, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.1F, () -> {
		return Ingredient.of(GeneralItemInit.MITHRIL_PLATE.get());
	}),
	//NETHERITE("netherite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F
	TUNGSTEN("tungsten", 32, new int[]{3, 7, 9, 3}, 7, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.75F, 0.25F, () -> {
		return Ingredient.of(GeneralItemInit.TUNGSTEN_PLATE.get());
	}),
	LAGOMITE("lagomite", 35, new int[]{4, 6, 8, 4}, 7, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.5F, 0.1F, () -> {
		return Ingredient.of(GeneralItemInit.LAGOMITE_PLATE.get());
	});
	

//GOLD 0, 32, 12.0F, 0.0F, 22,
//ELECTRUM(1, 96, 10.5F, 1.0F, 27,
//LEAD(1, 214, 6.3F, 1.75F, 19,
//SILVER(2, 236, 6.5F, 2.0F, 17,
//FOXITE(2, 432, 5.4F, 1.5F, 18,
//IRON 2, 250, 6.0F, 2.0F, 14,
//STEEL(2, 774, 7.0F, 2.5F, 14,
//DIAMOND 3, 1561, 8.0F, 3.0F, 10,
//LYCALITE(3, 1144, 7.6F, 3.0F, 10,
//BABULYMN(4, 1101, 11.0F, 2.5F, 25,
//MITHRIL(4, 1530, 8.0F, 3.0F, 4,
//NETHERITE 4, 2031, 9.0F, 4.0F, 15,
//TUNGSTEN(5, 2600, 9.0F, 4.5F, 10,
//LAGOMITE(5, 1984, 10.5F, 4.0F, 9,
	//level, dura, speed, damage, enchValue;

// Base code for item tier because I'm lazy
	private final String name;
	private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
	private final int durabilityMultiplier;
	private final int[] slotProtections;
	private final int enchantmentValue;
	private final SoundEvent sound;
	private final float toughness;
	private final float knockbackResistance;
	private final LazyLoadedValue<Ingredient> repairIngredient;

	private SophieArmorTier(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
		this.name = p_40474_;
		this.durabilityMultiplier = p_40475_;
		this.slotProtections = p_40476_;
		this.enchantmentValue = p_40477_;
		this.sound = p_40478_;
		this.toughness = p_40479_;
		this.knockbackResistance = p_40480_;
		this.repairIngredient = new LazyLoadedValue<>(p_40481_);
	}

	public int getDurabilityForSlot(EquipmentSlot p_40484_) {
		return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
	}
	public int getDefenseForSlot(EquipmentSlot p_40487_) {
		return this.slotProtections[p_40487_.getIndex()];
	}
	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}
	public SoundEvent getEquipSound() {
		return this.sound;
	}
	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}
	public String getName() {
		return this.name;
	}
	public float getToughness() {
		return this.toughness;
	}
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}

}
