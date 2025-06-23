package com.sophiecheese.alloys.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class SophieFallingDustyBlock extends FallingBlock{
	private final int dustColour;

	public SophieFallingDustyBlock(int colour, BlockBehaviour.Properties prop) {
		super(prop);
		this.dustColour = colour;
	}

	public int getDustColor(BlockState state, BlockGetter getter, BlockPos pos) {
		return this.dustColour;
	}
}