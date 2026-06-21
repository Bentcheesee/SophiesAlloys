package com.sophiecheese.alloys.datagen.worldgen;

import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.util.AlloysTags;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class AlloysBiomeModifiers {
	public static final ResourceKey<BiomeModifier> SLATE_HARD = registerKey("slate_hard_bm");
	public static final ResourceKey<BiomeModifier> SLATE_ROUGH = registerKey("slate_rough_bm");
	public static final ResourceKey<BiomeModifier> DEEP_GRAVEL = registerKey("deep_gravel_bm");
	public static final ResourceKey<BiomeModifier> BLACK_GRAVEL = registerKey("black_gravel_bm");
	public static final ResourceKey<BiomeModifier> SOUL_GRAVEL = registerKey("soul_gravel_bm");
	public static final ResourceKey<BiomeModifier> SOUL_STONE = registerKey("soul_stone_bm");

	public static final ResourceKey<BiomeModifier> SILVER_TRIANGLE = registerKey("silver_triangle_bm");
	public static final ResourceKey<BiomeModifier> SILVER_UNIFORM = registerKey("silver_uniform_bm");
	public static final ResourceKey<BiomeModifier> TUNGSTEN_OVERWORLD = registerKey("tungsten_overworld_bm");
	public static final ResourceKey<BiomeModifier> TUNGSTEN_END = registerKey("tungsten_end_bm");
	public static final ResourceKey<BiomeModifier> ELECTRUM = registerKey("electrum_bm");
	public static final ResourceKey<BiomeModifier> LEAD = registerKey("lead_bm");
	public static final ResourceKey<BiomeModifier> MITHRIL_NETHER = registerKey("mithril_nether_bm");
	public static final ResourceKey<BiomeModifier> MITHRIL_BONUS = registerKey("mithril_bonus_bm");
	public static final ResourceKey<BiomeModifier> MITHRIL_SPECIAL = registerKey("mithril_special_bm");
	public static final ResourceKey<BiomeModifier> RICH_BASALT = registerKey("rich_basalt_bm");
	public static final ResourceKey<BiomeModifier> FOXITE_TRIANGLE = registerKey("foxite_triangle_bm");
	public static final ResourceKey<BiomeModifier> FOXITE_UPPER = registerKey("foxite_upper_bm");
	public static final ResourceKey<BiomeModifier> FOXITE_HEAVY = registerKey("foxite_heavy_bm");
	public static final ResourceKey<BiomeModifier> FOXITE_NETHER = registerKey("foxite_nether_bm");
	public static final ResourceKey<BiomeModifier> TRITONIUM = registerKey("tritonium_bm");
	public static final ResourceKey<BiomeModifier> LAGOMITE_HEAVY = registerKey("lagomite_heavy_bm");
	public static final ResourceKey<BiomeModifier> LAGOMITE_LIGHT = registerKey("lagomite_light_bm");
	public static final ResourceKey<BiomeModifier> JADE = registerKey("jade_bm");
	public static final ResourceKey<BiomeModifier> QUINGUM_HEAVY = registerKey("quingum_heavy_bm");
	public static final ResourceKey<BiomeModifier> QUINGUM_LIGHT = registerKey("quingum_light_bm");
	public static final ResourceKey<BiomeModifier> CRIMSON_COAL = registerKey("crimson_coal_bm");
	public static final ResourceKey<BiomeModifier> MEAT_OVERWORLD = registerKey("meat_overworld_bm");
	public static final ResourceKey<BiomeModifier> MEAT_NETHER = registerKey("meat_nether_bm");
	public static final ResourceKey<BiomeModifier> MEAT_END = registerKey("meat_end_bm");

	public static final ResourceKey<BiomeModifier> OREBERRY = registerKey("oreberry_bm");


	public static void bootstrap(BootstrapContext<BiomeModifier> context) {
		var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
		var biomes = context.lookup(Registries.BIOME);


		context.register(SLATE_HARD, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.SLATE_HARD)),
			GenerationStep.Decoration.VEGETAL_DECORATION));
		context.register(SLATE_ROUGH, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.SLATE_ROUGH)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

		context.register(DEEP_GRAVEL, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.DEEP_GRAVEL)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(BLACK_GRAVEL, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(AlloysTags.Biomes.BLACK_GRAVEL_SPAWNABLE),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.BLACK_GRAVEL)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(SOUL_GRAVEL, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(AlloysTags.Biomes.IS_CORRUPT),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.SOUL_GRAVEL)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(SOUL_STONE, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(AlloysTags.Biomes.IS_CORRUPT),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.SOUL_STONE)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

		context.register(RICH_BASALT, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_NETHER),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.RICH_BASALT)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

		context.register(CRIMSON_COAL, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_NETHER),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.CRIMSON_COAL)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

		context.register(ELECTRUM, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.ELECTRUM)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

		context.register(JADE, new BiomeModifiers.AddFeaturesBiomeModifier(
			HolderSet.direct(biomes.getOrThrow(Biomes.LUSH_CAVES)),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.JADE)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

		context.register(FOXITE_HEAVY, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.FOXITE_HEAVY)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(FOXITE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.FOXITE_UPPER)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(FOXITE_TRIANGLE, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.FOXITE_TRIANGLE)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(FOXITE_NETHER, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_NETHER),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.FOXITE_NETHER)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

		context.register(LAGOMITE_HEAVY, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_END),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.LAGOMITE_HEAVY)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(LAGOMITE_LIGHT, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_END),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.LAGOMITE_LIGHT)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

		context.register(LEAD, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.LEAD)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

		context.register(MEAT_OVERWORLD, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.MEAT_OVERWORLD)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(MEAT_NETHER, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_NETHER),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.MEAT_NETHER)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(MEAT_END, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_END),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.MEAT_END)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

		context.register(MITHRIL_NETHER, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_NETHER),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.MITHRIL_NETHER)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(MITHRIL_SPECIAL, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_NETHER),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.MITHRIL_SPECIAL)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(MITHRIL_BONUS, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_NETHER),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.MITHRIL_BONUS)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

		context.register(QUINGUM_HEAVY, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.QUINGUM_HEAVY)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(QUINGUM_LIGHT, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.QUINGUM_LIGHT)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

		context.register(SILVER_TRIANGLE, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.SILVER_TRIANGLE)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(SILVER_UNIFORM, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.SILVER_UNIFORM)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

		context.register(TRITONIUM, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.TRITONIUM)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

		context.register(TUNGSTEN_OVERWORLD, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.TUNGSTEN_OVERWORLD)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(TUNGSTEN_END, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_END),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.TUNGSTEN_END)),
			GenerationStep.Decoration.UNDERGROUND_ORES));


		context.register(OREBERRY, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(AlloysTags.Biomes.OREBERRY_SPAWNABLE),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.OREBERRY)),
			GenerationStep.Decoration.VEGETAL_DECORATION));

	}


	private static ResourceKey<BiomeModifier> registerKey(String name) {
		return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(SophiesAlloys.MOD_ID, name));
	}
}
