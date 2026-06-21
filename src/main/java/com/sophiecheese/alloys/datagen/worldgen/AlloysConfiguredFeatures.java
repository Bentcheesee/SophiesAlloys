package com.sophiecheese.alloys.datagen.worldgen;

import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.block.OreberryBushBlock;
import com.sophiecheese.alloys.init.BlockInit;
import com.sophiecheese.alloys.util.AlloysTags;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.neoforged.neoforge.common.Tags;

import java.util.List;

public class AlloysConfiguredFeatures {
	public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORES_CF = registerKey("silver_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> FOXITE_TRIANGLE_OVERWORLD_ORES_CF = registerKey("foxite_triangle_overworld_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> FOXITE_UPPER_OVERWORLD_ORES_CF = registerKey("foxite_upper_overworld_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> FOXITE_HEAVY_OVERWORLD_ORES_CF = registerKey("foxite_heavy_overworld_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> FOXITE_NETHER_ORES_CF = registerKey("foxite_nether_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> ELECTRUM_ORES_CF = registerKey("electrum_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> TUNGSTEN_OVERWORLD_ORES_CF = registerKey("tungsten_overworld_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> TUNGSTEN_END_ORES_CF = registerKey("tungsten_end_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORES_CF = registerKey("lead_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> MITHRIL_NETHER_ORES_CF = registerKey("mithril_nether_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> MITHRIL_BONUS_ORES_CF = registerKey("mithril_bonus_nether_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> MITHRIL_SPECIAL_ORES_CF = registerKey("mithril_special_nether_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> RICH_BASALT_CF = registerKey("rich_basalt_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> TRITONIUM_ORES_CF = registerKey("tritonium_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LAGOMITE_LIGHT_ORES_CF = registerKey("lagomite_light_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> LAGOMITE_HEAVY_ORES_CF = registerKey("lagomite_heavy_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> JADE_ORES_CF = registerKey("jade_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> QUINGUM_HEAVY_ORES_CF = registerKey("quingum_heavy_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> QUINGUM_LIGHT_ORES_CF = registerKey("quingum_light_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> CRIMSON_COAL_ORE_CF = registerKey("crimson_coal_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> MEAT_OVERWORLD_CF = registerKey("meat_overworld_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> MEAT_NETHER_CF = registerKey("meat_nether_ore_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> MEAT_END_CF = registerKey("meat_end_ore_cf");

	public static final ResourceKey<ConfiguredFeature<?, ?>> SLATE_ROUGH_CF = registerKey("slate_rough_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> SLATE_HARD_CF = registerKey("slate_hard_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> SOUL_STONE_CF = registerKey("soul_stone_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> SOUL_GRAVEL_CF = registerKey("soul_gravel_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> DEEP_GRAVEL_CF = registerKey("deep_gravel_cf");
	public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_GRAVEL_CF = registerKey("black_gravel_cf");

	public static final ResourceKey<ConfiguredFeature<?, ?>> OREBERRY_CF = registerKey("oreberry_cf");

	public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {

		RuleTest stone = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
		RuleTest deepslate = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
		RuleTest netherrack = new BlockMatchTest(Blocks.NETHERRACK);
		RuleTest basalt = new BlockMatchTest(Blocks.BASALT);
		RuleTest blackstone = new BlockMatchTest(Blocks.BLACKSTONE);
		RuleTest end = new BlockMatchTest(Blocks.END_STONE);
		RuleTest obsidian = new BlockMatchTest(Blocks.OBSIDIAN);
		RuleTest overworldStones = new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD);
		RuleTest soulOreReplaceables = new TagMatchTest(AlloysTags.Blocks.SOUL_ORE_REPLACEABLES);
		RuleTest soulGravelReplaceables = new TagMatchTest(AlloysTags.Blocks.SOUL_GRAVEL_REPLACEABLES);
		RuleTest slateReplaceables = new TagMatchTest(AlloysTags.Blocks.SLATE_REPLACEABLES);
		RuleTest slate = new BlockMatchTest(BlockInit.ROUGH_SLATE.get());

		List<OreConfiguration.TargetBlockState> silverOverworld = List.of(
			OreConfiguration.target(stone, BlockInit.SILVER_ORE.get().defaultBlockState()),
			OreConfiguration.target(deepslate, BlockInit.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> foxiteOverworld = List.of(
			OreConfiguration.target(stone, BlockInit.FOXITE_ORE.get().defaultBlockState()),
			OreConfiguration.target(deepslate, BlockInit.DEEPSLATE_FOXITE_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> foxiteNether = List.of(
			OreConfiguration.target(netherrack, BlockInit.NETHER_FOXITE_ORE.get().defaultBlockState()),
			OreConfiguration.target(soulOreReplaceables, BlockInit.SOUL_FOXITE_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> tungstenOverworld = List.of(
			OreConfiguration.target(stone, BlockInit.TUNGSTEN_ORE.get().defaultBlockState()),
			OreConfiguration.target(deepslate, BlockInit.DEEPSLATE_TUNGSTEN_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> tungstenEnd = List.of(
			OreConfiguration.target(end, BlockInit.END_TUNGSTEN_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> electrumOverworld = List.of(
			OreConfiguration.target(stone, BlockInit.ELECTRUM_ORE.get().defaultBlockState()),
			OreConfiguration.target(deepslate, BlockInit.DEEPSLATE_ELECTRUM_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> leadOverworld = List.of(
			OreConfiguration.target(stone, BlockInit.LEAD_ORE.get().defaultBlockState()),
			OreConfiguration.target(deepslate, BlockInit.DEEPSLATE_LEAD_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> mithrilNether = List.of(
			OreConfiguration.target(netherrack, BlockInit.NETHER_MITHRIL_ORE.get().defaultBlockState()),
			OreConfiguration.target(soulOreReplaceables, BlockInit.SOUL_MITHRIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> mithrilRichBasalt = List.of(
			OreConfiguration.target(basalt, BlockInit.RICH_BASALT.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> mithrilSpecial = List.of(
			OreConfiguration.target(blackstone, BlockInit.BLACKSTONE_MITHRIL_ORE.get().defaultBlockState()),
			OreConfiguration.target(new BlockMatchTest(BlockInit.RICH_BASALT.get()), BlockInit.BASALT_MITHRIL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> tritoniumOverworld = List.of(
			OreConfiguration.target(stone, BlockInit.TRITONIUM_ORE.get().defaultBlockState()),
			OreConfiguration.target(deepslate, BlockInit.DEEPSLATE_TRITONIUM_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> lagomiteEnd = List.of(
			OreConfiguration.target(end, BlockInit.END_LAGOMITE_ORE.get().defaultBlockState()),
			OreConfiguration.target(obsidian, BlockInit.OBSIDIAN_LAGOMITE_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> jadeOverworld = List.of(
			OreConfiguration.target(stone, BlockInit.JADE_ORE.get().defaultBlockState()),
			OreConfiguration.target(deepslate, BlockInit.DEEPSLATE_JADE_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> quingumOverworld = List.of(
			OreConfiguration.target(stone, BlockInit.QUINGUM_ORE.get().defaultBlockState()),
			OreConfiguration.target(deepslate, BlockInit.DEEPSLATE_QUINGUM_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> crimsonCoalNether = List.of(
			OreConfiguration.target(netherrack, BlockInit.CRIMSON_COAL_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> meatOverworld = List.of(
			OreConfiguration.target(stone, BlockInit.MEAT_ORE.get().defaultBlockState()),
			OreConfiguration.target(deepslate, BlockInit.DEEPSLATE_MEAT_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> meatNether = List.of(
			OreConfiguration.target(netherrack, BlockInit.NETHER_MEAT_ORE.get().defaultBlockState()),
			OreConfiguration.target(soulOreReplaceables, BlockInit.SOUL_MEAT_ORE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> meatEnd = List.of(
			OreConfiguration.target(end, BlockInit.END_MEAT_ORE.get().defaultBlockState()));

		List<OreConfiguration.TargetBlockState> slateRough = List.of(
			OreConfiguration.target(slateReplaceables, BlockInit.ROUGH_SLATE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> slateHard = List.of(
			OreConfiguration.target(slate, BlockInit.SLATE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> deepGravel = List.of(
			OreConfiguration.target(overworldStones, BlockInit.DEEP_GRAVEL.get().defaultBlockState()));

		List<OreConfiguration.TargetBlockState> soulStone = List.of(
			OreConfiguration.target(new BlockMatchTest(Blocks.SOUL_SAND), BlockInit.SOUL_COBBLESTONE.get().defaultBlockState()),
			OreConfiguration.target(new BlockMatchTest(Blocks.SOUL_SOIL), BlockInit.SOUL_STONE.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> soulGravel = List.of(
			OreConfiguration.target(soulGravelReplaceables, BlockInit.SOUL_GRAVEL.get().defaultBlockState()));
		List<OreConfiguration.TargetBlockState> blackGravel = List.of(
			OreConfiguration.target(new BlockMatchTest(Blocks.GRAVEL), BlockInit.BLACK_GRAVEL.get().defaultBlockState()),
			OreConfiguration.target(basalt, BlockInit.BLACK_GRAVEL.get().defaultBlockState()),
			OreConfiguration.target(blackstone, BlockInit.BLACK_GRAVEL.get().defaultBlockState()));



		register(context, SILVER_ORES_CF, Feature.ORE, new OreConfiguration(silverOverworld, 7, 0.2f));
		register(context, FOXITE_TRIANGLE_OVERWORLD_ORES_CF, Feature.ORE, new OreConfiguration(foxiteOverworld, 7, 0.25f));
		register(context, FOXITE_HEAVY_OVERWORLD_ORES_CF, Feature.ORE, new OreConfiguration(foxiteOverworld, 11, 0.2f));
		register(context, FOXITE_UPPER_OVERWORLD_ORES_CF, Feature.ORE, new OreConfiguration(foxiteOverworld, 8));
		register(context, FOXITE_NETHER_ORES_CF, Feature.ORE, new OreConfiguration(foxiteNether, 12, 0.2f));
		register(context, TUNGSTEN_OVERWORLD_ORES_CF, Feature.ORE, new OreConfiguration(tungstenOverworld, 5, 0.9f));
		register(context, TUNGSTEN_END_ORES_CF, Feature.ORE, new OreConfiguration(tungstenEnd, 6));
		register(context, TRITONIUM_ORES_CF, Feature.ORE, new OreConfiguration(tritoniumOverworld, 7, 1f));
		register(context, ELECTRUM_ORES_CF, Feature.ORE, new OreConfiguration(electrumOverworld, 15));
		register(context, LEAD_ORES_CF, Feature.ORE, new OreConfiguration(leadOverworld, 11));
		register(context, MITHRIL_NETHER_ORES_CF, Feature.ORE, new OreConfiguration(mithrilNether,5,0.5f));
		register(context, MITHRIL_BONUS_ORES_CF, Feature.ORE, new OreConfiguration(mithrilNether, 4, 0.7f));
		register(context, MITHRIL_SPECIAL_ORES_CF, Feature.ORE, new OreConfiguration(mithrilSpecial, 4, 0.15f));
		register(context, RICH_BASALT_CF, Feature.ORE, new OreConfiguration(mithrilRichBasalt, 8));
		register(context, LAGOMITE_HEAVY_ORES_CF, Feature.ORE, new OreConfiguration(lagomiteEnd, 5));
		register(context, LAGOMITE_LIGHT_ORES_CF, Feature.ORE, new OreConfiguration(lagomiteEnd, 4, 0.05f));
		register(context, JADE_ORES_CF, Feature.ORE, new OreConfiguration(jadeOverworld, 9));
		register(context, QUINGUM_HEAVY_ORES_CF, Feature.ORE, new OreConfiguration(quingumOverworld, 11));
		register(context, QUINGUM_LIGHT_ORES_CF, Feature.ORE, new OreConfiguration(quingumOverworld, 6, 0.1f));
		register(context, CRIMSON_COAL_ORE_CF, Feature.ORE, new OreConfiguration(crimsonCoalNether, 7));
		register(context, MEAT_OVERWORLD_CF, Feature.ORE, new OreConfiguration(meatOverworld, 9, 1f));
		register(context, MEAT_NETHER_CF, Feature.ORE, new OreConfiguration(meatNether, 9, 1f));
		register(context, MEAT_END_CF, Feature.ORE, new OreConfiguration(meatEnd, 9, 1f));

		register(context, SLATE_HARD_CF, Feature.ORE, new OreConfiguration(slateHard, 30));
		register(context, SLATE_ROUGH_CF, Feature.ORE, new OreConfiguration(slateRough, 40));
		register(context, SOUL_STONE_CF, Feature.ORE, new OreConfiguration(soulStone, 50));
		register(context, SOUL_GRAVEL_CF, Feature.ORE, new OreConfiguration(soulGravel, 40));
		register(context, BLACK_GRAVEL_CF, Feature.ORE, new OreConfiguration(blackGravel, 35));
		register(context, DEEP_GRAVEL_CF, Feature.ORE, new OreConfiguration(deepGravel, 44));

		register(context, OREBERRY_CF, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
			new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.OREBERRY_BUSH_BLOCK.get().defaultBlockState().setValue(OreberryBushBlock.AGE, Integer.valueOf(3)))),
			List.of(Blocks.COBBLESTONE,Blocks.STONE,Blocks.COBBLED_DEEPSLATE,Blocks.DEEPSLATE,Blocks.GRAVEL,BlockInit.DEEP_GRAVEL.get(),Blocks.DIORITE,Blocks.GRANITE,Blocks.ANDESITE)));


	}


	public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(SophiesAlloys.MOD_ID, name));
	}

	private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
																						 ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
		context.register(key, new ConfiguredFeature<>(feature, configuration));

	}

}
