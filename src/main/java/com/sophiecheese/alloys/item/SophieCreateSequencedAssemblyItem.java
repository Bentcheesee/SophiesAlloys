package com.sophiecheese.alloys.item;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class SophieCreateSequencedAssemblyItem extends Item {

	public SophieCreateSequencedAssemblyItem(Properties prop) {
		super(prop.stacksTo(1));
	}

	public float getProgress(ItemStack stack) {
		if (!stack.hasTag())
			return 0;
		CompoundTag tag = stack.getTag();
		if (!tag.contains("SequencedAssembly"))
			return 0;
		return tag.getCompound("SequencedAssembly")
			.getFloat("Progress");
	}

	@Override
	public boolean isBarVisible(ItemStack stack) {
		return true;
	}

	@Override
	public int getBarWidth(ItemStack stack) {
		return Math.round(getProgress(stack) * 13);
	}
}
