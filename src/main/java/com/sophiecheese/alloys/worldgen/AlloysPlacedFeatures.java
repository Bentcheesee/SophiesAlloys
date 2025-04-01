package com.sophiecheese.alloys.worldgen;

import java.util.List;

import com.sophiecheese.alloys.SophiesAlloys;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AlloysPlacedFeatures {
	public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
			DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, SophiesAlloys.MOD_ID);
	

	public static final RegistryObject<PlacedFeature> SLATE = PLACED_FEATURES.register("slate_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.SLATE_GORE.getHolder().get(),
					commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60)))));

	public static final RegistryObject<PlacedFeature> SOUL_STONE = PLACED_FEATURES.register("soul_stone_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.SOUL_STONE_GORE.getHolder().get(),
					commonOrePlacement(22,   // this number means how many veins will spawn per chunk
							HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(20), VerticalAnchor.belowTop(20)))));
	


	public static final RegistryObject<PlacedFeature> SILVER_TRIANGLE = PLACED_FEATURES.register("silver_triangle_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.SILVER_ORE.getHolder().get(),
					commonOrePlacement(14,
							HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(20), VerticalAnchor.absolute(80)))));
	public static final RegistryObject<PlacedFeature> SILVER_UNIFORM = PLACED_FEATURES.register("silver_uniform_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.SILVER_ORE.getHolder().get(),
					commonOrePlacement(5,
							HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(65), VerticalAnchor.absolute(60)))));
	
	public static final RegistryObject<PlacedFeature> TUNGSTEN_OVERWORLD = PLACED_FEATURES.register("tungsten_overworld_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.TUNGSTEN_OVERWORLD_ORE.getHolder().get(),
					commonOrePlacement(3,
							HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(-30)))));
	public static final RegistryObject<PlacedFeature> TUNGSTEN_END = PLACED_FEATURES.register("tungsten_end_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.TUNGSTEN_END_ORE.getHolder().get(),
					commonOrePlacement(4,
							HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(20), VerticalAnchor.aboveBottom(100)))));
	
	public static final RegistryObject<PlacedFeature> ELECTRUM = PLACED_FEATURES.register("electrum_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.ELECTRUM_ORE.getHolder().get(),
					commonOrePlacement(1,
							HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(50), VerticalAnchor.aboveBottom(70)))));
	
	
	public static final RegistryObject<PlacedFeature> LEAD = PLACED_FEATURES.register("lead_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.LEAD_ORE.getHolder().get(),
					commonOrePlacement(16,
							HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-40), VerticalAnchor.absolute(80)))));
	
	//Mithril
	public static final RegistryObject<PlacedFeature> MITHRIL_OVERWORLD = PLACED_FEATURES.register("mithril_overworld_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.MITHRIL_OVERWORLD_ORE.getHolder().get(),
					commonOrePlacement(8,
							HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-10), VerticalAnchor.aboveBottom(70)))));
	public static final RegistryObject<PlacedFeature> MITHRIL_BONUS_OVERWORLD = PLACED_FEATURES.register("mithril_bonus_overworld_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.MITHRIL_OVERWORLD_ORE.getHolder().get(),
					commonOrePlacement(2,
							HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-10), VerticalAnchor.aboveBottom(20)))));
	public static final RegistryObject<PlacedFeature> MITHRIL_NETHER = PLACED_FEATURES.register("mithril_nether_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.MITHRIL_NETHER_ORE.getHolder().get(),
					commonOrePlacement(14, PlacementUtils.RANGE_10_10)));
	public static final RegistryObject<PlacedFeature> MITHRIL_SPECIAL = PLACED_FEATURES.register("mithril_special_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.MITHRIL_SPECIAL_ORE.getHolder().get(),
					commonOrePlacement(12, PlacementUtils.RANGE_10_10)));
	
	//Foxite
	public static final RegistryObject<PlacedFeature> FOXITE_ORE_UPPER = PLACED_FEATURES.register("foxite_upper_placed", 
			() -> new PlacedFeature(AlloysConfiguredFeatures.FOXITE_UPPER_ORE.getHolder().get(),
					commonOrePlacement(12,
							HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(136), VerticalAnchor.belowTop(60)))));
	public static final RegistryObject<PlacedFeature> FOXITE_ORE_HEAVY = PLACED_FEATURES.register("foxite_heavy_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.FOXITE_HEAVY_ORE.getHolder().get(),
					commonOrePlacement(5,
							HeightRangePlacement.triangle(VerticalAnchor.absolute(-20), VerticalAnchor.aboveBottom(55)))));
	public static final RegistryObject<PlacedFeature> FOXITE_ORE_TRIANGLE = PLACED_FEATURES.register("foxite_triangle_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.FOXITE_ORE.getHolder().get(),
					commonOrePlacement(9,
							HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(30), VerticalAnchor.aboveBottom(125)))));
	public static final RegistryObject<PlacedFeature> FOXITE_ORE_NETHER = PLACED_FEATURES.register("foxite_nether_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.FOXITE_NETHER_ORE.getHolder().get(),
					commonOrePlacement(10,
							HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(20), VerticalAnchor.absolute(70)))));

	public static final RegistryObject<PlacedFeature> TRITONIUM = PLACED_FEATURES.register("tritonium_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.TRITONIUM_ORE.getHolder().get(),
					commonOrePlacement(2,
							HeightRangePlacement.uniform(VerticalAnchor.absolute(-20), VerticalAnchor.aboveBottom(120)))));
	
	public static final RegistryObject<PlacedFeature> LAGOMITE_HEAVY = PLACED_FEATURES.register("lagomite_heavy_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.LAGOMITE_HEAVY_ORE.getHolder().get(),
					commonOrePlacement(2,
							HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(20), VerticalAnchor.aboveBottom(100)))));
	public static final RegistryObject<PlacedFeature> LAGOMITE_LIGHT = PLACED_FEATURES.register("lagomite_light_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.LAGOMITE_LIGHT_ORE.getHolder().get(),
					commonOrePlacement(3,
							HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(20), VerticalAnchor.aboveBottom(100)))));


	public static final RegistryObject<PlacedFeature> FAUNATHYST = PLACED_FEATURES.register("faunathyst_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.FAUNATHYST_ORE.getHolder().get(),
					commonOrePlacement(15,
							HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(35)))));

	
	public static final RegistryObject<PlacedFeature> QUINGUM_HEAVY = PLACED_FEATURES.register("quingum_heavy_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.QUINGUM_HEAVY_ORE.getHolder().get(),
					commonOrePlacement(6,
							HeightRangePlacement.triangle(VerticalAnchor.absolute(20), VerticalAnchor.absolute(74)))));
	public static final RegistryObject<PlacedFeature> QUINGUM_LIGHT = PLACED_FEATURES.register("quingum_light_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.QUINGUM_LIGHT_ORE.getHolder().get(),
					commonOrePlacement(10,
							HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(145)))));

	//public static final RegistryObject<PlacedFeature> WARPED_REDSTONE = PLACED_FEATURES.register("warped_redstone_placed",
	//		() -> new PlacedFeature(AlloysConfiguredFeatures.WARPED_REDSTONE_ORE.getHolder().get(),
	//				commonOrePlacement(17,
	//						HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.top()))));

	public static final RegistryObject<PlacedFeature> CRIMSON_COAL = PLACED_FEATURES.register("crimson_coal_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.CRIMSON_COAL_ORE.getHolder().get(),
					commonOrePlacement(14,
							HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(22), VerticalAnchor.belowTop(38)))));

	public static final RegistryObject<PlacedFeature> MEAT_OVERWORLD = PLACED_FEATURES.register("meat_overworld_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.MEAT_OVERWORLD_ORE.getHolder().get(),
					commonOrePlacement(6,
							HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(20), VerticalAnchor.aboveBottom(150)))));
	public static final RegistryObject<PlacedFeature> MEAT_NETHER = PLACED_FEATURES.register("meat_nether_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.MEAT_NETHER_ORE.getHolder().get(),
					commonOrePlacement(25,
							HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.top()))));
	public static final RegistryObject<PlacedFeature> MEAT_END = PLACED_FEATURES.register("meat_end_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.MEAT_END_ORE.getHolder().get(),
					commonOrePlacement(4,
							HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(20), VerticalAnchor.aboveBottom(100)))));
	

	public static final RegistryObject<PlacedFeature> OREBERRY_BUSH = PLACED_FEATURES.register("oreberry_placed",
			() -> new PlacedFeature(AlloysConfiguredFeatures.OREBERRY_PATCH_CF.getHolder().get(),
					List.of(
							RarityFilter.onAverageOnceEvery(28),CountPlacement.of(9),InSquarePlacement.spread(),
							HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.absolute(30)))));
	
	public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
		return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
	}

	public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
		return orePlacement(CountPlacement.of(p_195344_), p_195345_);
	}

	public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
		return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
	}


	public static void register(IEventBus eventBus) {
		PLACED_FEATURES.register(eventBus);
	}
}
