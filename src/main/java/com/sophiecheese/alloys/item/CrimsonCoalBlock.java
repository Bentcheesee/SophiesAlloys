package com.sophiecheese.alloys.item;

import org.jetbrains.annotations.Nullable;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class CrimsonCoalBlock extends BlockItem {
	public CrimsonCoalBlock(Block p_40565_, Item.Properties p_40566_) {
		super(p_40565_, p_40566_);
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
		return 24000;
	}
}