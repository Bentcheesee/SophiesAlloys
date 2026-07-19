package com.sophiecheese.alloys.block;

import com.sophiecheese.alloys.entity.SuspicousBlockBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BrushableBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class SuspiciousBlock extends BrushableBlock {

	public SuspiciousBlock(Block turnsInto, SoundEvent brushSound, SoundEvent brushCompletedSound, BlockBehaviour.Properties prop) {
		super(turnsInto, brushSound, brushCompletedSound, prop);
	}

	@Override
	public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new SuspicousBlockBlockEntity(pos, state);
	}
}
