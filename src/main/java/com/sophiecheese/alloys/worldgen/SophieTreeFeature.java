package com.sophiecheese.alloys.worldgen;

import com.sophiecheese.alloys.init.OtherBlocksInit;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class SophieTreeFeature {
	public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> NO_FRUIT = FeatureUtils.register("no_fruit", Feature.TREE, createNoFruit().build());

	private static TreeConfiguration.TreeConfigurationBuilder createStraightBlobTree(Block block, Block alsoBlock, int TrunkSize, int TrunkSizeMod, int honestlyNotSure, int leaves) {
		return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(block), new StraightTrunkPlacer(TrunkSize, TrunkSizeMod, honestlyNotSure), BlockStateProvider.simple(alsoBlock), new BlobFoliagePlacer(ConstantInt.of(leaves), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1));
	}
	private static TreeConfiguration.TreeConfigurationBuilder createNoFruit() {
		return createStraightBlobTree(OtherBlocksInit.NO_LOG.get(), OtherBlocksInit.NO_FRUIT_LEAVES.get(), 6, 3, 0, 2).ignoreVines();
	}
}