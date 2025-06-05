package com.sophiecheese.alloys.block.quartzglasses;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BeaconBeamBlock;

public class StainedLeadedQuartzGlassBlock extends LeadedQuartzGlassBlock implements BeaconBeamBlock{
	private final DyeColor color;
	
	public StainedLeadedQuartzGlassBlock(DyeColor dye, Properties prop) {
		super(prop);
		this.color = dye;
	}
	
	public DyeColor getColor() {
		return this.color;
	}
}