package com.sophiecheese.alloys.item;

import java.util.List;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;

public class DescItemNameBlockItem extends ItemNameBlockItem{
	private boolean effect;

	public DescItemNameBlockItem(Boolean showEffect, Block block, Properties prop) {
		super(block, prop);
		this.effect = showEffect;
	}

	@Override
	public void appendHoverText(ItemStack itemStack, Item.TooltipContext context, List<Component> component, TooltipFlag flag) {
		if(this.effect) {
			component.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.BLUE));
		}
		else {
			component.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
		}

		super.appendHoverText(itemStack, context, component, flag);
	}

}
