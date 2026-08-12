package com.sophiecheese.alloys.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.ColorRGBA;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ColoredFallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;

public class RoughSlateBlock extends ColoredFallingBlock {
	public RoughSlateBlock(ColorRGBA dustColor, Properties properties) {
		super(dustColor, properties);
	}

	@Override
	protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
		if (isFree(level.getBlockState(pos.below())) && pos.getY() >= level.getMinBuildHeight()) {
			FallingBlockEntity fallingblockentity = FallingBlockEntity.fall(level, pos, state);
			fallingblockentity.disableDrop();
		}
	}

	@Override
	protected int getDelayAfterPlace() {
		return 12;
	}

	@Override
	public void onBrokenAfterFall(Level level, BlockPos pos, FallingBlockEntity fallingBlock) {
		Vec3 vec3 = fallingBlock.getBoundingBox().getCenter();
		level.levelEvent(2001, BlockPos.containing(vec3), Block.getId(fallingBlock.getBlockState()));
		level.gameEvent(fallingBlock, GameEvent.BLOCK_DESTROY, vec3);
	}
}
