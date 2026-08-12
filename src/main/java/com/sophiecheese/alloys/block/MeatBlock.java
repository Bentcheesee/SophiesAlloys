package com.sophiecheese.alloys.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.sophiecheese.alloys.util.AlloysSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ColorRGBA;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class MeatBlock extends Block {
	public static final MapCodec<MeatBlock> CODEC = RecordCodecBuilder.mapCodec(
		particle -> particle.group(ColorRGBA.CODEC.fieldOf("falling_dust_color").forGetter(colour -> colour.dustColor), propertiesCodec())
			.apply(particle, MeatBlock::new)
	);
	private final ColorRGBA dustColor;

	@Override
	public @NotNull MapCodec<MeatBlock> codec() {
		return CODEC;
	}

	public MeatBlock(ColorRGBA dustColor, BlockBehaviour.Properties properties) {
		super(properties);
		this.dustColor = dustColor;
	}

	public static boolean isFree(BlockState state) {
		return state.isAir() || state.is(BlockTags.FIRE) || state.liquid() || state.canBeReplaced();
	}

	@Override
	public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
		if (random.nextInt(20) == 0) {
			BlockPos blockpos = pos.below();
			if (isFree(level.getBlockState(blockpos))) {
				ParticleUtils.spawnParticleBelow(level, pos, random, new BlockParticleOption(ParticleTypes.FALLING_DUST, state));
				// TODO: create new BlockParticleOption particle type for blood drips
				// ParticleUtils.spawnParticleBelow(level, pos, random, new BlockParticleOption(ParticleTypes.DRIPPING_WATER, state));
			}
		}
		if (random.nextInt(450) == 0) {
			level.playLocalSound(
				(double)pos.getX() + 0.5,
				(double)pos.getY() + 0.5,
				(double)pos.getZ() + 0.5,
				AlloysSoundEvents.HEART_BEAT.get(),
				SoundSource.BLOCKS,
				0.02F,
				0.6F,
				false
			);
		}
	}

	public int getDustColor(BlockState state, BlockGetter level, BlockPos pos) {
		return this.dustColor.rgba();
	}

}
