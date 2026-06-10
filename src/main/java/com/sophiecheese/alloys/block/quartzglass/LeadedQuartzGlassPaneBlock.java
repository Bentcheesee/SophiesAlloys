package com.sophiecheese.alloys.block.quartzglass;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public class LeadedQuartzGlassPaneBlock extends IronBarsBlock{
	public static final BooleanProperty POWERED = BooleanProperty.create("powered");

	public LeadedQuartzGlassPaneBlock(Properties prop) {
		super(prop);
		this.registerDefaultState(this.defaultBlockState().setValue(POWERED, Boolean.valueOf(false)));
	}

	public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos pos2, boolean uh) {
		if (!level.isClientSide) {
			boolean flag = state.getValue(POWERED);
			if (flag != level.hasNeighborSignal(pos)) {
				if (flag) {
					level.scheduleTick(pos, this, 4);
				} else {
					level.setBlock(pos, state.cycle(POWERED), 2);
				}
			}
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(NORTH, EAST, WEST, SOUTH, WATERLOGGED, POWERED);
	}

	public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource source) {
		if (state.getValue(POWERED) && !level.hasNeighborSignal(pos)) {
			level.setBlock(pos, state.cycle(POWERED), 2);
		}
	}

	public boolean propagatesSkylightDown(BlockState state, BlockGetter getter, BlockPos pos) {
		boolean flag = state.getValue(POWERED);
		if (flag == true) {
			return false;
		} else {
			return true;
		}
	}

	public int getLightBlock(BlockState state, BlockGetter getter, BlockPos pos) {
		boolean flag = state.getValue(POWERED);
		if (flag == true) {
			return 15;
		} else {
			return 0;
		}
	}
}
