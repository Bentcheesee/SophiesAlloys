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

	   private static TreeConfiguration.TreeConfigurationBuilder createStraightBlobTree(Block p_195147_, Block p_195148_, int p_195149_, int p_195150_, int p_195151_, int p_195152_) {
	      return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(p_195147_), new StraightTrunkPlacer(p_195149_, p_195150_, p_195151_), BlockStateProvider.simple(p_195148_), new BlobFoliagePlacer(ConstantInt.of(p_195152_), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1));
	   }   // yeah these are ripped directly from base mc, what about it?
	   private static TreeConfiguration.TreeConfigurationBuilder createNoFruit() {
	      return createStraightBlobTree(OtherBlocksInit.NO_LOG.get(), OtherBlocksInit.NO_FRUIT_LEAVES.get(), 6, 3, 0, 2).ignoreVines();
	   }
}
