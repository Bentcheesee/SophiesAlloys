package com.sophiecheese.alloys.item.stats;

import com.google.common.base.Suppliers;

import java.util.function.Supplier;

import com.sophiecheese.alloys.init.ItemInit;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public enum SophieToolTier implements Tier {
//
	SILVER(BlockTags.INCORRECT_FOR_IRON_TOOL, 236, 6.5f, 3.0f, 17, () -> {
		return Ingredient.of(ItemInit.SILVER_INGOT.get());
	}),
	ELECTRUM(BlockTags.INCORRECT_FOR_GOLD_TOOL, 96, 10.5f, 1.0f, 27, () -> {
		return Ingredient.of(ItemInit.ELECTRUM_INGOT.get());
	}),
	BABULYMN(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1101, 11.0f, 2.75f, 25, () -> {
		return Ingredient.of(ItemInit.BABULYMN_INGOT.get());
	}),
	LEAD(BlockTags.INCORRECT_FOR_STONE_TOOL, 214, 6.3f, 1.75f, 19, () -> {
		return Ingredient.of(ItemInit.LEAD_INGOT.get());
	}),
	FOXITE(BlockTags.INCORRECT_FOR_IRON_TOOL, 432, 5.4f, 1.5f, 16, () -> {
		return Ingredient.of(ItemInit.FOXITE_INGOT.get());
	}),
	STEEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 774, 7.0f, 2.5f, 14, () -> {
		return Ingredient.of(ItemInit.STEEL_INGOT.get());
	}),
	LYCALITE(BlockTags.INCORRECT_FOR_IRON_TOOL, 1144, 7.6f, 3.0f, 9, () -> {
		return Ingredient.of(ItemInit.LYCALITE_INGOT.get());
	}),
	MITHRIL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1530, 8.0f, 3.0f, 4, () -> {
		return Ingredient.of(ItemInit.MITHRIL_INGOT.get());
	}),
	TUNGSTEN(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2400, 9.0f, 4.5f, 10, () -> {
		return Ingredient.of(ItemInit.TUNGSTEN_INGOT.get());
	}),
	LAGOMITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1984, 10.5f, 4.0f, 9, () -> {
		return Ingredient.of(ItemInit.LAGOMITE_INGOT.get());
	});



	private final TagKey<Block>  level;
	private final int uses;
	private final float speed;
	private final float damage;
	private final int enchantmentValue;
	private final LazyLoadedValue<Ingredient> repairIngredient;


	SophieToolTier(TagKey<Block>  level, int uses, float speed, float damage, int enchantValue, Supplier<Ingredient> repairIngredient) {
		this.level = level;
		this.uses = uses;
		this.speed = speed;
		this.damage = damage;
		this.enchantmentValue = enchantValue;
		this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
	}

	@Override
	public TagKey<Block> getIncorrectBlocksForDrops() {
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
