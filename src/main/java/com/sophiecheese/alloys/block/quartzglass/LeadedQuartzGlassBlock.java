package com.sophiecheese.alloys.block.quartzglass;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.TransparentBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class LeadedQuartzGlassBlock extends TransparentBlock {
	public static final BooleanProperty POWERED = BooleanProperty.create("powered");

	public LeadedQuartzGlassBlock(Properties prop) {
		super(prop);
		this.registerDefaultState(this.defaultBlockState().setValue(POWERED, Boolean.valueOf(false)));
	}

	public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos pos2, boolean uh) {
		if (!level.isClientSide) {
			boolean powered = state.getValue(POWERED);
			if (powered != level.hasNeighborSignal(pos)) {
				if (powered) {
					level.scheduleTick(pos, this, 4);
				} else {
					level.setBlock(pos, state.cycle(POWERED), 2);
				}
			}
		}
	}

	public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source) {
		if (state.getValue(POWERED) && !level.hasNeighborSignal(pos)) {
			level.setBlock(pos, state.cycle(POWERED), 2);
		}
	}

	public boolean propagatesSkylightDown(BlockState state, BlockGetter getter, BlockPos pos) {
		boolean powered = state.getValue(POWERED);
		return !powered;
	}

	public int getLightBlock(BlockState state, BlockGetter getter, BlockPos pos) {
		boolean powered = state.getValue(POWERED);
		if (powered) {
			return 15;
		} else {
			return 0;
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(POWERED);
	}
}
