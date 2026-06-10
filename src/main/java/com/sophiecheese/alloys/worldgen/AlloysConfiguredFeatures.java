package com.sophiecheese.alloys.worldgen;

import com.google.common.base.Suppliers;
import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.init.BlockInit;
import com.sophiecheese.alloys.util.AlloysTags;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

public class AlloysConfiguredFeatures {
	public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORES_CF = registerKey("silver_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> FOXITE_OVERWORLD_ORES_CF = registerKey("foxite_overworld_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> FOXITE_NETHER_ORES_CF = registerKey("foxite_nether_ore_cf");

	public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

		RuleTest stone = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
		RuleTest deepslate = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
		RuleTest netherrack = new BlockMatchTest(Blocks.NETHERRACK);
		RuleTest basalt = new BlockMatchTest(Blocks.BASALT);
		RuleTest blackstone = new BlockMatchTest(Blocks.BLACKSTONE);
		RuleTest soul = new TagMatchTest(AlloysTags.Blocks.SOUL_ORE_REPLACEABLES);
		RuleTest end = new BlockMatchTest(Blocks.END_STONE);

		List<OreConfiguration.TargetBlockState> overworldSilver = List.of(
			OreConfiguration.target(stone, BlockInit.SILVER_ORE.get().defaultBlockState()),
			OreConfiguration.target(deepslate, BlockInit.DEEPSLATE_SILVER_ORE.get().defaultBlockState())
		);
		List<OreConfiguration.TargetBlockState> foxiteOverworld = List.of(
			OreConfiguration.target(stone, BlockInit.FOXITE_ORE.get().defaultBlockState()),
			OreConfiguration.target(deepslate, BlockInit.DEEPSLATE_FOXITE_ORE.get().defaultBlockState())
		);
		List<OreConfiguration.TargetBlockState> foxiteNether = List.of(
			OreConfiguration.target(netherrack, BlockInit.NETHER_FOXITE_ORE.get().defaultBlockState()),
			OreConfiguration.target(soul, BlockInit.SOUL_FOXITE_ORE.get().defaultBlockState())
		);

		register(context, SILVER_ORES_CF, Feature.ORE, new OreConfiguration(overworldSilver, 7, 0.2f));
		register(context, FOXITE_OVERWORLD_ORES_CF, Feature.ORE, new OreConfiguration(foxiteOverworld, 7, 0.2f));
		register(context, FOXITE_NETHER_ORES_CF, Feature.ORE, new OreConfiguration(foxiteNether, 7, 0.2f));



	}


	public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(SophiesAlloys.MOD_ID, name));
	}

	private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
																						 ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
		context.register(key, new ConfiguredFeature<>(feature, configuration));

	}

}
