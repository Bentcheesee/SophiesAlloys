package com.sophiecheese.alloys.item;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class JadeDustItem extends BoneMealItem {

	private static final Map<Block, Block> FAUNA_MAP =
		Map.of(
			Blocks.DIRT, Blocks.MOSS_BLOCK,
			Blocks.GRAVEL, Blocks.MOSS_BLOCK,
			Blocks.COARSE_DIRT, Blocks.MOSS_BLOCK
		);

	public JadeDustItem(Properties prop) {
		super(prop);
	}

	public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> component, TooltipFlag flag) {
		component.add(this.getDisplayName().withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
	}

	public MutableComponent getDisplayName() {
		return Component.translatable(this.getDescriptionId() + ".desc");
	}
}
