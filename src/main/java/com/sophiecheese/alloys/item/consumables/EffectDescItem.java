package com.sophiecheese.alloys.item.consumables;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class EffectDescItem extends Item {

	public EffectDescItem(Properties prop) {
		super(prop);
	}

	public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> component, TooltipFlag flag) {
		component.add(this.getDisplayName().withStyle(ChatFormatting.BLUE));
	}
	
	public MutableComponent getDisplayName() {
		return Component.translatable(this.getDescriptionId() + ".desc");
	}
}
