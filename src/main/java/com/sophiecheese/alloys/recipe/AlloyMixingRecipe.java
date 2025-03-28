package com.sophiecheese.alloys.recipe;

import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

public class AlloyMixingRecipe implements Recipe<SimpleContainer>{
	private final NonNullList<Ingredient> inputItems;
	private final ItemStack output;
	private final ResourceLocation id;
	
	public AlloyMixingRecipe(NonNullList<Ingredient> inputItems, ItemStack output, ResourceLocation id) {
		this.inputItems = inputItems;
		this.output = output;
		this.id = id;
	}
	
	

	@Override
	public boolean matches(SimpleContainer p_44002_, Level p_44003_) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ItemStack assemble(SimpleContainer p_44001_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canCraftInDimensions(int p_43999_, int p_44000_) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ItemStack getResultItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceLocation getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecipeType<?> getType() {
		// TODO Auto-generated method stub
		return null;
	}

}
