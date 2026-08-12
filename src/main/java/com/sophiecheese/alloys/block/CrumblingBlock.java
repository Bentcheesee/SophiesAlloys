package com.sophiecheese.alloys.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import javax.annotation.Nullable;

public class CrumblingBlock extends Block {
	public static final IntegerProperty CRUMBLE = IntegerProperty.create("crumble", 0, 15);

	public CrumblingBlock(Properties prop) {
		super(prop);
	}

	@Override
	protected void attack(BlockState state, Level level, BlockPos pos, Player player) {
		if (!level.isClientSide) {
			state = state.cycle(CRUMBLE);
			state = state.cycle(CRUMBLE);
			state = state.cycle(CRUMBLE);
			state = state.cycle(CRUMBLE);
			level.setBlock(pos, state, 2);
			this.updateNeighbours(state, level, pos);
			crumble(pos, state, level, player);
		}
	}

	@Override
	public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
		if (!entity.isSteppingCarefully()) {
			state = state.cycle(CRUMBLE);
			level.setBlock(pos, state, 2);
			this.updateNeighbours(state, level, pos);
			this.crumble(pos, state, level, entity);
		}
		super.stepOn(level, pos, state, entity);
	}

	private void crumble(BlockPos pos, BlockState state, Level level, @Nullable Entity entity) {
		if (state.getValue(CRUMBLE) >= 12) {
			level.destroyBlock(pos, true);
		}
	}

	private void updateNeighbours(BlockState state, Level level, BlockPos pos) {
		level.updateNeighborsAt(pos, this);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(CRUMBLE);
	}
}
