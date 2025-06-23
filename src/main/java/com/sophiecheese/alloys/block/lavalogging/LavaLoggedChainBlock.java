package com.sophiecheese.alloys.block.lavalogging;

import java.util.Optional;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

public class LavaLoggedChainBlock extends ChainBlock implements SimpleLavaloggedBlock{

	public LavaLoggedChainBlock(Properties prop) {
		super(prop);
		this.registerDefaultState(this.defaultBlockState().setValue(LAVALOGGED, Boolean.valueOf(false)));
	}

	@Override
	public boolean canPlaceLiquid(BlockGetter getter, BlockPos pos, BlockState state, Fluid fluid) {
		// TODO Auto-generated method stub
		return SimpleLavaloggedBlock.super.canPlaceLiquid(getter, pos, state, fluid);
	}

	@Override
	public boolean placeLiquid(LevelAccessor level, BlockPos pos, BlockState blockState, FluidState fluidState) {
		// TODO Auto-generated method stub
		return SimpleLavaloggedBlock.super.placeLiquid(level, pos, blockState, fluidState);
	}

	@Override
	public ItemStack pickupBlock(LevelAccessor level, BlockPos pos, BlockState state) {
		// TODO Auto-generated method stub
		return SimpleLavaloggedBlock.super.pickupBlock(level, pos, state);
	}

	@Override
	public Optional<SoundEvent> getPickupSound() {
		// TODO Auto-generated method stub
		return SimpleLavaloggedBlock.super.getPickupSound();
	}
	
	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(LAVALOGGED) ? Fluids.LAVA.getSource(false) : super.getFluidState(state);
	}

	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stealer) {
		super.createBlockStateDefinition(stealer);
		stealer.add(LAVALOGGED);
	}

}
