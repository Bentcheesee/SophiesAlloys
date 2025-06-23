package com.sophiecheese.alloys.item;

import org.jetbrains.annotations.Nullable;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class CrimsonCoalItem extends Item {
	public CrimsonCoalItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
		return 2400;
	}
}