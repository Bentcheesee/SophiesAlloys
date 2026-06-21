package com.sophiecheese.alloys.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import org.jetbrains.annotations.Nullable;

public class DropExperiencePillarBlock extends RotatedPillarBlock {
	public static final MapCodec<DropExperiencePillarBlock> CODEC_DR = RecordCodecBuilder.mapCodec(
		(inst) -> inst.group(IntProvider.codec(0, 10).fieldOf("experience").forGetter((getter) -> getter.xpRange),
			propertiesCodec()).apply(inst, DropExperiencePillarBlock::new));
	public static final EnumProperty<Direction.Axis> AXIS;
	private final IntProvider xpRange;

	public MapCodec<? extends DropExperiencePillarBlock> codec() {
		return CODEC_DR;
	}


	public DropExperiencePillarBlock(IntProvider xpRange, Properties properties) {
		super(properties);
		this.registerDefaultState(this.defaultBlockState().setValue(AXIS, Direction.Axis.Y));
		this.xpRange = xpRange;
	}

	protected void spawnAfterBreak(BlockState state, ServerLevel level, BlockPos pos, ItemStack stack, boolean dropExperience) {
		super.spawnAfterBreak(state, level, pos, stack, dropExperience);
	}

	public int getExpDrop(BlockState state, LevelAccessor level, BlockPos pos, @Nullable BlockEntity blockEntity, @Nullable Entity breaker, ItemStack tool) {
		return this.xpRange.sample(level.getRandom());
	}

	static {
		AXIS = BlockStateProperties.AXIS;
	}
}
