package com.sophiecheese.alloys.datagen.worldgen;

import com.sophiecheese.alloys.SophiesAlloys;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class AlloysPlacedFeatures {


	public static final ResourceKey<PlacedFeature> SLATE_HARD = registerKey("slate_hard_pf");
	public static final ResourceKey<PlacedFeature> SLATE_ROUGH = registerKey("slate_rough_pf");
	public static final ResourceKey<PlacedFeature> DEEP_GRAVEL = registerKey("deep_gravel_pf");
	public static final ResourceKey<PlacedFeature> BLACK_GRAVEL = registerKey("black_gravel_pf");
	public static final ResourceKey<PlacedFeature> SOUL_GRAVEL = registerKey("soul_gravel_pf");
	public static final ResourceKey<PlacedFeature> SOUL_STONE = registerKey("soul_stone_pf");

	public static final ResourceKey<PlacedFeature> SILVER_TRIANGLE = registerKey("silver_triangle_pf");
	public static final ResourceKey<PlacedFeature> SILVER_UNIFORM = registerKey("silver_uniform_pf");
	public static final ResourceKey<PlacedFeature> TUNGSTEN_OVERWORLD = registerKey("tungsten_overworld_pf");
	public static final ResourceKey<PlacedFeature> TUNGSTEN_END = registerKey("tungsten_end_pf");
	public static final ResourceKey<PlacedFeature> ELECTRUM = registerKey("electrum_pf");
	public static final ResourceKey<PlacedFeature> LEAD = registerKey("lead_pf");
	public static final ResourceKey<PlacedFeature> MITHRIL_NETHER = registerKey("mithril_nether_pf");
	public static final ResourceKey<PlacedFeature> MITHRIL_BONUS = registerKey("mithril_bonus_pf");
	public static final ResourceKey<PlacedFeature> MITHRIL_SPECIAL = registerKey("mithril_special_pf");
	public static final ResourceKey<PlacedFeature> RICH_BASALT = registerKey("rich_basalt_pf");
	public static final ResourceKey<PlacedFeature> FOXITE_TRIANGLE = registerKey("foxite_triangle_pf");
	public static final ResourceKey<PlacedFeature> FOXITE_UPPER = registerKey("foxite_upper_pf");
	public static final ResourceKey<PlacedFeature> FOXITE_HEAVY = registerKey("foxite_heavy_pf");
	public static final ResourceKey<PlacedFeature> FOXITE_NETHER = registerKey("foxite_nether_pf");
	public static final ResourceKey<PlacedFeature> TRITONIUM = registerKey("tritonium_pf");
	public static final ResourceKey<PlacedFeature> LAGOMITE_HEAVY = registerKey("lagomite_heavy_pf");
	public static final ResourceKey<PlacedFeature> LAGOMITE_LIGHT = registerKey("lagomite_light_pf");
	public static final ResourceKey<PlacedFeature> JADE = registerKey("jade_pf");
	public static final ResourceKey<PlacedFeature> QUINGUM_HEAVY = registerKey("quingum_heavy_pf");
	public static final ResourceKey<PlacedFeature> QUINGUM_LIGHT = registerKey("quingum_light_pf");
	public static final ResourceKey<PlacedFeature> CRIMSON_COAL = registerKey("crimson_coal_pf");
	public static final ResourceKey<PlacedFeature> MEAT_OVERWORLD = registerKey("meat_overworld_pf");
	public static final ResourceKey<PlacedFeature> MEAT_NETHER = registerKey("meat_nether_pf");
	public static final ResourceKey<PlacedFeature> MEAT_END = registerKey("meat_end_pf");

	public static final ResourceKey<PlacedFeature> OREBERRY = registerKey("oreberry_pf");

	public static void bootstrap(BootstrapContext<PlacedFeature> context) {
		var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);


		register(context, SLATE_HARD, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.SLATE_HARD_CF),
			commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.absolute(-35), VerticalAnchor.absolute(35))));
		register(context, SLATE_ROUGH, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.SLATE_ROUGH_CF),
			commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.absolute(-40), VerticalAnchor.absolute(40))));
		register(context, DEEP_GRAVEL, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.DEEP_GRAVEL_CF),
			commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(-10))));
		register(context, BLACK_GRAVEL, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.BLACK_GRAVEL_CF),
			commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.belowTop(30))));
		register(context, SOUL_GRAVEL, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.SOUL_GRAVEL_CF),
			commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.top())));
		register(context, SOUL_STONE, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.SOUL_STONE_CF),
			commonOrePlacement(22, HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.belowTop(20))));
		register(context, RICH_BASALT, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.RICH_BASALT_CF),
			commonOrePlacement(80, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(5), VerticalAnchor.top())));

		register(context, SILVER_TRIANGLE, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.SILVER_ORES_CF),
			commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.absolute(-44), VerticalAnchor.absolute(80))));
		register(context, SILVER_UNIFORM, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.SILVER_ORES_CF),
			commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(65), VerticalAnchor.absolute(60))));

		register(context, TUNGSTEN_OVERWORLD, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.TUNGSTEN_OVERWORLD_ORES_CF),
			commonOrePlacement(3, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(-30))));
		register(context, TUNGSTEN_END, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.TUNGSTEN_END_ORES_CF),
			commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(20), VerticalAnchor.aboveBottom(100))));

		register(context, ELECTRUM, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.ELECTRUM_ORES_CF),
			commonOrePlacement(1, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(50), VerticalAnchor.aboveBottom(68))));

		register(context, LEAD, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.LEAD_ORES_CF),
			commonOrePlacement(14, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-40), VerticalAnchor.absolute(80))));

		register(context, MITHRIL_NETHER, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.MITHRIL_NETHER_ORES_CF),
			commonOrePlacement(14, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10))));
		register(context, MITHRIL_BONUS, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.MITHRIL_BONUS_ORES_CF),
			commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(20), VerticalAnchor.belowTop(40))));
		register(context, MITHRIL_SPECIAL, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.MITHRIL_SPECIAL_ORES_CF),
			commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10))));

		register(context, FOXITE_TRIANGLE, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.FOXITE_TRIANGLE_OVERWORLD_ORES_CF),
			commonOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(30), VerticalAnchor.aboveBottom(115))));
		register(context, FOXITE_HEAVY, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.FOXITE_HEAVY_OVERWORLD_ORES_CF),
			commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.absolute(-20), VerticalAnchor.aboveBottom(60))));
		register(context, FOXITE_UPPER, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.FOXITE_UPPER_OVERWORLD_ORES_CF),
			commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(136), VerticalAnchor.belowTop(60))));
		register(context, FOXITE_NETHER, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.FOXITE_NETHER_ORES_CF),
			commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(20), VerticalAnchor.belowTop(40))));

		register(context, TRITONIUM, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.TRITONIUM_ORES_CF),
			commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(-20), VerticalAnchor.aboveBottom(125))));

		register(context, LAGOMITE_HEAVY, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.LAGOMITE_HEAVY_ORES_CF),
			commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(20), VerticalAnchor.aboveBottom(110))));
		register(context, LAGOMITE_LIGHT, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.LAGOMITE_LIGHT_ORES_CF),
			commonOrePlacement(3, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(20), VerticalAnchor.aboveBottom(110))));

		register(context, JADE, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.JADE_ORES_CF),
			commonOrePlacement(15, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(40))));

		register(context, QUINGUM_HEAVY, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.QUINGUM_HEAVY_ORES_CF),
			commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(74))));
		register(context, QUINGUM_LIGHT, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.QUINGUM_LIGHT_ORES_CF),
			commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(145))));

		register(context, CRIMSON_COAL, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.CRIMSON_COAL_ORE_CF),
			commonOrePlacement(14, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(22), VerticalAnchor.belowTop(35))));

		register(context, MEAT_OVERWORLD, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.MEAT_OVERWORLD_CF),
			commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(15), VerticalAnchor.aboveBottom(130))));
		register(context, MEAT_NETHER, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.MEAT_NETHER_CF),
			commonOrePlacement(22, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.top())));
		register(context, MEAT_END, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.MEAT_END_CF),
			commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(20), VerticalAnchor.aboveBottom(120))));


		register(context, OREBERRY, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.OREBERRY_CF),
			List.of(RarityFilter.onAverageOnceEvery(30), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

	}


	public static ResourceKey<PlacedFeature> registerKey(String name) {
		return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(SophiesAlloys.MOD_ID, name));
	}

	private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
		context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));

	}



	private static List<PlacementModifier> orePlacement(PlacementModifier countPlacement, PlacementModifier heightRange) {
		return List.of(countPlacement, InSquarePlacement.spread(), heightRange, BiomeFilter.biome());
	}

	private static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier heightRange) {
		return orePlacement(CountPlacement.of(count), heightRange);
	}
}
