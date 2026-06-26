package com.sophiecheese.alloys.item;

import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

public class DescItem extends Item {
	private boolean effect;
	private boolean dino;

	public DescItem(Boolean showEffect, Properties prop) {
		super(prop);
		this.effect = showEffect;
	}
	public DescItem(Boolean showEffect, Boolean isDinoNugget, Properties prop) {
		super(prop);
		this.effect = showEffect;
		this.dino = isDinoNugget;
	}

	@Override
	public void appendHoverText(ItemStack itemStack, Item.TooltipContext context, List<Component> component, TooltipFlag flag) {
		if(this.effect && this.dino) {
			component.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
			component.add(Component.translatable(this.getDescriptionId() + ".desc_bonus").withStyle(ChatFormatting.RED).withStyle(ChatFormatting.ITALIC));
		} else if (this.effect) {
			component.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.BLUE));
		} else {
			component.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
		}

		super.appendHoverText(itemStack, context, component, flag);
	}
}
