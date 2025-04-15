package com.sophiecheese.alloys.item.tools;

import java.util.function.Supplier;

import com.sophiecheese.alloys.init.GeneralItemInit;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum SophieToolTier implements Tier{
	SILVER(2, 236, 6.5F, 3.0F, 17, () -> {
		return Ingredient.of(GeneralItemInit.SILVER_INGOT.get());
	}),
	//GOLD 0, 32, 12.0F, 0.0F, 22,
	ELECTRUM(1, 96, 10.5F, 1.0F, 27, () -> {
		return Ingredient.of(GeneralItemInit.ELECTRUM_INGOT.get());
	}),
	BABULYMN(4, 1101, 11.0F, 2.5F, 25, () -> {
		return Ingredient.of(GeneralItemInit.BABULYMN_INGOT.get());
	}),
	//WOOD 0, 59, 2.0F, 0.0F, 15,
	//STONE 1, 131, 4.0F, 1.0F, 5,
	
	LEAD(1, 214, 6.3F, 1.75F, 19, () -> {
		return Ingredient.of(GeneralItemInit.LEAD_INGOT.get());
	}),
	FOXITE(2, 432, 5.4F, 1.5F, 18, () -> {
		return Ingredient.of(GeneralItemInit.FOXITE_INGOT.get());
	}),
	//IRON 2, 250, 6.0F, 2.0F, 14,
	STEEL(2, 774, 7.0F, 2.5F, 14, () -> {
		return Ingredient.of(GeneralItemInit.STEEL_INGOT.get());
	}),
	//DIAMOND 3, 1561, 8.0F, 3.0F, 10,
	LYCALITE(3, 1144, 7.6F, 3.0F, 10, () -> {
		return Ingredient.of(GeneralItemInit.LYCALITE_INGOT.get());
	}),
	MITHRIL(4, 1530, 8.0F, 3.0F, 4, () -> {
		return Ingredient.of(GeneralItemInit.REFINED_MITHRIL.get());
	}),
	//NETHERITE 4, 2031, 9.0F, 4.0F, 15,
	TUNGSTEN(5, 2600, 9.0F, 4.5F, 10, () -> {
		return Ingredient.of(GeneralItemInit.TUNGSTEN_INGOT.get());
	}),
	LAGOMITE(5, 1984, 10.5F, 4.0F, 9, () -> {
		return Ingredient.of(GeneralItemInit.LAGOMITE_INGOT.get());
	});

	// Base code for item tier because I'm lazy

	private final int level;
	private final int uses;
	private final float speed;
	private final float damage;
	private final int enchantmentValue;
	private final LazyLoadedValue<Ingredient> repairIngredient;

	SophieToolTier(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
		this.level = level;
		this.uses = uses;
		this.speed = speed;
		this.damage = damage;
		this.enchantmentValue = enchantmentValue;
		this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
	}

	@Override
	public int getLevel() {
		return level;
	}
	@Override
	public int getUses() {
		return uses;
	}
	@Override
	public float getSpeed() {
		return speed;
	}
	@Override
	public float getAttackDamageBonus() {
		return damage;
	}
	@Override
	public int getEnchantmentValue() {
		return enchantmentValue;
	}
	@Override
	public Ingredient getRepairIngredient() {
		return repairIngredient.get();
	}

}