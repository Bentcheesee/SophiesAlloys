package com.sophiecheese.alloys.block.lamps;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

public class VeryStrongDustyLampBlock extends DustyLampBlock{

	public VeryStrongDustyLampBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
	}

	@Override
	public int getSignal(BlockState state, BlockGetter getter, BlockPos pos, Direction direction) {
		return state.getValue(LIT) ? 15 : 0;
	}

}