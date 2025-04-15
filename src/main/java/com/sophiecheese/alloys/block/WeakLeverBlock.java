package com.sophiecheese.alloys.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.LeverBlock;
import net.minecraft.world.level.block.state.BlockState;

public class WeakLeverBlock extends LeverBlock{
	public WeakLeverBlock(Properties prop) {
		super(prop);
	}
	
	@Override
	public int getSignal(BlockState state, BlockGetter getter, BlockPos pos, Direction direction) {
		return state.getValue(POWERED) ? 8 : 0;
	}
	@Override
	public int getDirectSignal(BlockState state, BlockGetter getter, BlockPos pos, Direction direction) {
		return state.getValue(POWERED) && getConnectedDirection(state) == direction ? 8 : 0;
	}
}