package com.sophiecheese.alloys.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class NoFruitTreeGrower extends AbstractTreeGrower{
	protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource source, boolean bool) {
		return SophieTreeFeature.NO_FRUIT;
	}

}
