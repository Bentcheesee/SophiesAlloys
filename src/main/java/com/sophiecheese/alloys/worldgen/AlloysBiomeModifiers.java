package com.sophiecheese.alloys.worldgen;

import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.setup.Registration;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class AlloysBiomeModifiers {
	public static final ResourceKey<BiomeModifier> SILVER_ORE_TRIANGLE_BM = registerKey("silver_ore_triangle_bm");
	public static final ResourceKey<BiomeModifier> SILVER_ORE_UNIFORM_BM = registerKey("silver_ore_uniform_bm");


	public static void bootstrap(BootstrapContext<BiomeModifier> context) {
		var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
		var biomes = context.lookup(Registries.BIOME);


		context.register(SILVER_ORE_TRIANGLE_BM, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.SILVER_ORE_TRIANGLE)),
			GenerationStep.Decoration.UNDERGROUND_ORES));
		context.register(SILVER_ORE_UNIFORM_BM, new BiomeModifiers.AddFeaturesBiomeModifier(
			biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
			HolderSet.direct(placedFeatures.getOrThrow(AlloysPlacedFeatures.SILVER_ORE_UNIFORM)),
			GenerationStep.Decoration.UNDERGROUND_ORES));

	}


	private static ResourceKey<BiomeModifier> registerKey(String name) {
		return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(SophiesAlloys.MOD_ID, name));
	}
}
