package com.sophiecheese.alloys.worldgen;

import java.util.List;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.init.OreBlockInit;
import com.sophiecheese.alloys.init.OtherBlocksInit;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AlloysConfiguredFeatures {
	public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
			DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, SophiesAlloys.MOD_ID);
	
	//Silver
	public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_SILVER_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, OreBlockInit.SILVER_ORE.get().defaultBlockState()),
			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, OreBlockInit.DEEPSLATE_SILVER_ORE.get().defaultBlockState())));

	//Tungsten
	public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TUNGSTEN_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, OreBlockInit.TUNGSTEN_ORE.get().defaultBlockState()),
			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, OreBlockInit.DEEPSLATE_TUNGSTEN_ORE.get().defaultBlockState())));
	public static final Supplier<List<OreConfiguration.TargetBlockState>> END_TUNGSTEN_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), OreBlockInit.END_TUNGSTEN_ORE.get().defaultBlockState())));
	//Electrum
	public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ELECTRUM_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, OreBlockInit.ELECTRUM_ORE.get().defaultBlockState()),
			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, OreBlockInit.DEEPSLATE_ELECTRUM_ORE.get().defaultBlockState())));
	//Lead
	public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_LEAD_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, OreBlockInit.LEAD_ORE.get().defaultBlockState()),
			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, OreBlockInit.DEEPSLATE_LEAD_ORE.get().defaultBlockState())));
	//Mithril
	public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MITHRIL_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, OreBlockInit.MITHRIL_ORE.get().defaultBlockState()),
			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, OreBlockInit.DEEPSLATE_MITHRIL_ORE.get().defaultBlockState())));
	public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_MITHRIL_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), OreBlockInit.NETHER_MITHRIL_ORE.get().defaultBlockState())));
	public static final Supplier<List<OreConfiguration.TargetBlockState>> SPECIAL_MITHRIL_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(new BlockMatchTest(Blocks.BLACKSTONE), OreBlockInit.BLACKSTONE_MITHRIL_ORE.get().defaultBlockState()),
			OreConfiguration.target(new BlockMatchTest(Blocks.BASALT), OreBlockInit.BASALT_MITHRIL_ORE.get().defaultBlockState())));
	//Foxite
	public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_FOXITE_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, OreBlockInit.FOXITE_ORE.get().defaultBlockState()),
			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, OreBlockInit.DEEPSLATE_FOXITE_ORE.get().defaultBlockState())));
	public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_FOXITE_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), OreBlockInit.NETHER_FOXITE_ORE.get().defaultBlockState())));
	//Tritonium
	public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_TRITONIUM_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, OreBlockInit.TRITONIUM_ORE.get().defaultBlockState()),
			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, OreBlockInit.DEEPSLATE_TRITONIUM_ORE.get().defaultBlockState())));
	//Lagomite
	public static final Supplier<List<OreConfiguration.TargetBlockState>> END_LAGOMITE_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), OreBlockInit.END_LAGOMITE_ORE.get().defaultBlockState()),
			OreConfiguration.target(new BlockMatchTest(Blocks.OBSIDIAN), OreBlockInit.END_LAGOMITE_ORE.get().defaultBlockState())));
	//Faunathyst
	public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_FAUNATHYST_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, OreBlockInit.FAUNATHYST_ORE.get().defaultBlockState()),
			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, OreBlockInit.DEEPSLATE_FAUNATHYST_ORE.get().defaultBlockState())));
	//Quingum
	public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_QUINGUM_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, OreBlockInit.QUINGUM_ORE.get().defaultBlockState()),
			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, OreBlockInit.DEEPSLATE_QUINGUM_ORE.get().defaultBlockState())));
	//Crimson Coal
	public static final Supplier<List<OreConfiguration.TargetBlockState>> CRIMSON_COAL_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(new BlockMatchTest(Blocks.NETHERRACK), OreBlockInit.CRIMSON_COAL_ORE.get().defaultBlockState())));
	//Meat
	public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_MEAT_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, OreBlockInit.MEAT_ORE.get().defaultBlockState()),
			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, OreBlockInit.DEEPSLATE_MEAT_ORE.get().defaultBlockState())));
	public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_MEAT_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, OreBlockInit.NETHER_MEAT_ORE.get().defaultBlockState()),
			OreConfiguration.target(new BlockMatchTest(OtherBlocksInit.SOUL_STONE.get()), OreBlockInit.SOUL_MEAT_ORE.get().defaultBlockState())));
	public static final Supplier<List<OreConfiguration.TargetBlockState>> END_MEAT_ORES = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), OreBlockInit.END_MEAT_ORE.get().defaultBlockState()),
			OreConfiguration.target(new BlockMatchTest(Blocks.OBSIDIAN), OreBlockInit.END_MEAT_ORE.get().defaultBlockState())));
	

	//Slate
	public static final Supplier<List<OreConfiguration.TargetBlockState>> SLATE_ORE = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(OreFeatures.NATURAL_STONE, OtherBlocksInit.SLATE.get().defaultBlockState())));
	//Soul Stone
	public static final Supplier<List<OreConfiguration.TargetBlockState>> SOUL_STONE_ORE = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(new BlockMatchTest(Blocks.SOUL_SOIL), OtherBlocksInit.SOUL_STONE.get().defaultBlockState()),
			OreConfiguration.target(new BlockMatchTest(Blocks.SOUL_SAND), OtherBlocksInit.SOUL_COBBLESTONE.get().defaultBlockState())));


	//Silver
	public static final RegistryObject<ConfiguredFeature<?, ?>> SILVER_ORE = CONFIGURED_FEATURES.register("silver_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES.get(),
					7,// size https://minecraft.wiki/w/Ore_(feature)#Generation for size table
					0.2F// chance of discard if exposed to air
					)));
	//Tungsten
	public static final RegistryObject<ConfiguredFeature<?, ?>> TUNGSTEN_OVERWORLD_ORE = CONFIGURED_FEATURES.register("tungsten_overworld_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TUNGSTEN_ORES.get(),5,0.9F)));
	public static final RegistryObject<ConfiguredFeature<?, ?>> TUNGSTEN_END_ORE = CONFIGURED_FEATURES.register("tungsten_end_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_TUNGSTEN_ORES.get(),6)));
	//Electrum
	public static final RegistryObject<ConfiguredFeature<?, ?>> ELECTRUM_ORE = CONFIGURED_FEATURES.register("electrum_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ELECTRUM_ORES.get(),16)));
	//Lead
	public static final RegistryObject<ConfiguredFeature<?, ?>> LEAD_ORE = CONFIGURED_FEATURES.register("lead_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_LEAD_ORES.get(),11)));
	//Mithril
	public static final RegistryObject<ConfiguredFeature<?, ?>> MITHRIL_OVERWORLD_ORE = CONFIGURED_FEATURES.register("mithril_overworld_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_MITHRIL_ORES.get(),5,0.5F)));
	public static final RegistryObject<ConfiguredFeature<?, ?>> MITHRIL_NETHER_ORE = CONFIGURED_FEATURES.register("mithril_nether_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_MITHRIL_ORES.get(),4,0.35F)));
	public static final RegistryObject<ConfiguredFeature<?, ?>> MITHRIL_SPECIAL_ORE = CONFIGURED_FEATURES.register("mithril_special_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(SPECIAL_MITHRIL_ORES.get(),4,0.15F)));
	
	//Foxite
	public static final RegistryObject<ConfiguredFeature<?, ?>> FOXITE_ORE = CONFIGURED_FEATURES.register("foxite_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_FOXITE_ORES.get(),8,0.2F)));
	public static final RegistryObject<ConfiguredFeature<?, ?>> FOXITE_HEAVY_ORE = CONFIGURED_FEATURES.register("foxite_heavy_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_FOXITE_ORES.get(),11,0.2F)));
	public static final RegistryObject<ConfiguredFeature<?, ?>> FOXITE_UPPER_ORE = CONFIGURED_FEATURES.register("foxite_upper_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_FOXITE_ORES.get(),8)));
	public static final RegistryObject<ConfiguredFeature<?, ?>> FOXITE_NETHER_ORE = CONFIGURED_FEATURES.register("foxite_nether_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_FOXITE_ORES.get(), 12)));
	//Tritonium
	public static final RegistryObject<ConfiguredFeature<?, ?>> TRITONIUM_ORE = CONFIGURED_FEATURES.register("tritonium_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_TRITONIUM_ORES.get(),7,1F)));
	//Lagomite
	public static final RegistryObject<ConfiguredFeature<?, ?>> LAGOMITE_HEAVY_ORE = CONFIGURED_FEATURES.register("lagomite_heavy_end_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_LAGOMITE_ORES.get(),5)));
	public static final RegistryObject<ConfiguredFeature<?, ?>> LAGOMITE_LIGHT_ORE = CONFIGURED_FEATURES.register("lagomite_light_end_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_LAGOMITE_ORES.get(),4)));
	//Faunathyst
	public static final RegistryObject<ConfiguredFeature<?, ?>> FAUNATHYST_ORE = CONFIGURED_FEATURES.register("faunathyst_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_FAUNATHYST_ORES.get(),9)));
	//Quingum
	public static final RegistryObject<ConfiguredFeature<?, ?>> QUINGUM_HEAVY_ORE = CONFIGURED_FEATURES.register("quingum_heavy_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_QUINGUM_ORES.get(),11)));
	public static final RegistryObject<ConfiguredFeature<?, ?>> QUINGUM_LIGHT_ORE = CONFIGURED_FEATURES.register("quingum_light_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_QUINGUM_ORES.get(),6)));
	//Crimson Coal
	public static final RegistryObject<ConfiguredFeature<?, ?>> CRIMSON_COAL_ORE = CONFIGURED_FEATURES.register("crimson_coal_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(CRIMSON_COAL_ORES.get(),7)));
	//Meat
	public static final RegistryObject<ConfiguredFeature<?, ?>> MEAT_OVERWORLD_ORE = CONFIGURED_FEATURES.register("meat_overworld_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_MEAT_ORES.get(),9,1.0F)));
	public static final RegistryObject<ConfiguredFeature<?, ?>> MEAT_NETHER_ORE = CONFIGURED_FEATURES.register("meat_nether_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_MEAT_ORES.get(),9,1.0F)));
	public static final RegistryObject<ConfiguredFeature<?, ?>> MEAT_END_ORE = CONFIGURED_FEATURES.register("meat_end_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_MEAT_ORES.get(),11,1.0F)));
	//Slate
	public static final RegistryObject<ConfiguredFeature<?, ?>> SLATE_GORE = CONFIGURED_FEATURES.register("slate_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(SLATE_ORE.get(),40)));
	//Soul Stone
	public static final RegistryObject<ConfiguredFeature<?, ?>> SOUL_STONE_GORE = CONFIGURED_FEATURES.register("soul_stone_ore_cf",
			() -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(SOUL_STONE_ORE.get(),50)));
	

	//Soul Stone
	public static final RegistryObject<ConfiguredFeature<?, ?>> OREBERRY_PATCH_CF = CONFIGURED_FEATURES.register("oreberry_patch_cf",
			() -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, 
			new SimpleBlockConfiguration(BlockStateProvider.simple(OtherBlocksInit.OREBERRY_BUSH_BLOCK.get())), List.of(Blocks.GRASS_BLOCK))));
	
	public static void register(IEventBus eventBus) {
		CONFIGURED_FEATURES.register(eventBus);
	}
}