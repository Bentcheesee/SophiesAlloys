package com.sophiecheese.alloys.item;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class BasicDescriptionItemBlock extends BlockItem{
	public BasicDescriptionItemBlock(Block block, Item.Properties prop) {
		super(block, prop);
	}

	public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> component, TooltipFlag flag) {
		component.add(this.getDisplayName().withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
	}
	
	public MutableComponent getDisplayName() {
		return Component.translatable(this.getDescriptionId() + ".desc");
	}
}