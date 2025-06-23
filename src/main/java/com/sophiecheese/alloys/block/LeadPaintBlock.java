package com.sophiecheese.alloys.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.block.MultifaceSpreader;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Fluids;

public class LeadPaintBlock extends MultifaceBlock implements SimpleWaterloggedBlock {
	private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	private final MultifaceSpreader spreader = new MultifaceSpreader(this);
	
	
	public LeadPaintBlock(Properties prop) {
		super(prop);
		this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, Boolean.valueOf(false)));
	}

	public BlockState updateShape(BlockState state, Direction direction, BlockState state2, LevelAccessor level, BlockPos pos, BlockPos pos2) {
		if (state.getValue(WATERLOGGED)) {
			level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
		}	
		return super.updateShape(state, direction, state2, level, pos, pos2);
	}

	@Override
	public MultifaceSpreader getSpreader() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stealer) {
		super.createBlockStateDefinition(stealer);
		stealer.add(WATERLOGGED);
	}

}
