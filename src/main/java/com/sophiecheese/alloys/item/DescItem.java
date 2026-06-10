package com.sophiecheese.alloys.item;

import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class DescItem extends Item {
	private boolean effect;

	public DescItem(Boolean showEffect, Properties prop) {
		super(prop);
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
