package com.sophiecheese.alloys.entity;

import com.sophiecheese.alloys.init.EntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BrushableBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SuspicousBlockBlockEntity extends BrushableBlockEntity {
	public SuspicousBlockBlockEntity(BlockPos pos, BlockState state) {
		super(pos, state);
	}

	@Override
	public BlockEntityType<?> getType() {
		return EntityInit.SUSPICIOUS_BLOCK_ENTITY.get();
	}
}
