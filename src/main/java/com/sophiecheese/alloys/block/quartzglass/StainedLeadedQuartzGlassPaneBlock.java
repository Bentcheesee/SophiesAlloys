package com.sophiecheese.alloys.block.quartzglass;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BeaconBeamBlock;

public class StainedLeadedQuartzGlassPaneBlock extends LeadedQuartzGlassPaneBlock implements BeaconBeamBlock {
	private final DyeColor color;

	public StainedLeadedQuartzGlassPaneBlock(DyeColor dye, Properties prop) {
		super(prop);
		this.color = dye;
		this.registerDefaultState(this.defaultBlockState().setValue(POWERED, Boolean.valueOf(false)));
	}

	public DyeColor getColor() {
		return this.color;
	}

}
