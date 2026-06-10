package com.sophiecheese.alloys.worldgen;

import com.sophiecheese.alloys.SophiesAlloys;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class AlloysPlacedFeatures {

	public static final ResourceKey<PlacedFeature> SILVER_ORE_UNIFORM = registerKey("silver_ore_uniform_pf");
	public static final ResourceKey<PlacedFeature> SILVER_ORE_TRIANGLE = registerKey("silver_ore_triangle_pf");
	public static final ResourceKey<PlacedFeature> FOXITE_OVERWORLD_ORE = registerKey("foxite_overworld_ore_pf");
	public static final ResourceKey<PlacedFeature> FOXITE_NETHER_ORE = registerKey("foxite_nether_ore_pf");

	public static void bootstrap(BootstrapContext<PlacedFeature> context) {
		var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

		register(context, SILVER_ORE_TRIANGLE, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.SILVER_ORES_CF),
			commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.absolute(-44), VerticalAnchor.absolute(80))));
		register(context, SILVER_ORE_UNIFORM, configuredFeatures.getOrThrow(AlloysConfiguredFeatures.SILVER_ORES_CF),
			commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));

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

	private static List<PlacementModifier> rareOrePlacement(int chance, PlacementModifier heightRange) {
		return orePlacement(RarityFilter.onAverageOnceEvery(chance), heightRange);
	}
}
