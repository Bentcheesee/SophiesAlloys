package com.sophiecheese.alloys.datagen;

import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.datagen.worldgen.AlloysBiomeModifiers;
import com.sophiecheese.alloys.datagen.worldgen.AlloysConfiguredFeatures;
import com.sophiecheese.alloys.datagen.worldgen.AlloysPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class AlloysDatapackProvider extends DatapackBuiltinEntriesProvider {
	public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
		.add(Registries.CONFIGURED_FEATURE, AlloysConfiguredFeatures::bootstrap)
		.add(Registries.PLACED_FEATURE, AlloysPlacedFeatures::bootstrap)
		.add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, AlloysBiomeModifiers::bootstrap);


	public AlloysDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
		super(output, registries, BUILDER, Set.of(SophiesAlloys.MOD_ID));
	}

}
