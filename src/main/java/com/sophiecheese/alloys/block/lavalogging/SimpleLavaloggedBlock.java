package com.sophiecheese.alloys.block.lavalogging;

import java.util.Optional;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

public interface SimpleLavaloggedBlock extends BucketPickup, LiquidBlockContainer {
	public static final BooleanProperty LAVALOGGED = BooleanProperty.create("lavalogged");
	
	// Future planning!!  Tritonium will have a proper use soon.  Once I figure out how I want to dupe base MC code, there'll be lavalogging..
	
	default boolean canPlaceLiquid(BlockGetter getter, BlockPos pos, BlockState state, Fluid fluid) {
		return !state.getValue(LAVALOGGED) && fluid == Fluids.LAVA;
	}
	
	default boolean placeLiquid(LevelAccessor level, BlockPos pos, BlockState blockState, FluidState fluidState) {
		if (!blockState.getValue(LAVALOGGED) && fluidState.getType() == Fluids.LAVA) {
			if (!level.isClientSide()) {
				level.setBlock(pos, blockState.setValue(LAVALOGGED, Boolean.valueOf(true)), 3);
				level.scheduleTick(pos, fluidState.getType(), fluidState.getType().getTickDelay(level));
			}
			return true;
		} else {
			return false;
		}
	}
	
	default ItemStack pickupBlock(LevelAccessor level, BlockPos pos, BlockState state) {
		if (state.getValue(LAVALOGGED)) {
			level.setBlock(pos, state.setValue(LAVALOGGED, Boolean.valueOf(false)), 3);
			if (!state.canSurvive(level, pos)) {
				level.destroyBlock(pos, true);
			}			
			return new ItemStack(Items.LAVA_BUCKET);
		} else {
			return ItemStack.EMPTY;
		}
	}
	
	default Optional<SoundEvent> getPickupSound() {
		return Fluids.LAVA.getPickupSound();
	}
}