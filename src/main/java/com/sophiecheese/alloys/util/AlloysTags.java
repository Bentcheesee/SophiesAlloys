package com.sophiecheese.alloys.util;

import com.sophiecheese.alloys.SophiesAlloys;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class AlloysTags {

	public static class Blocks {
	//Alloys Tags
		public static final TagKey<Block> OREBERRY_SURVIVE = createBlockTag("oreberry_survive_on");

		public static final TagKey<Block> SOUL_ORE_REPLACEABLES = createBlockTag("soul_ore_replaceables");
		public static final TagKey<Block> SOUL_GRAVEL_REPLACEABLES = createBlockTag("soul_gravel_replaceables");
		public static final TagKey<Block> SLATE_REPLACEABLES = createBlockTag("slate_replaceables");

		public static final TagKey<Block> SOUL_STONE_ALL_BLOCK = createBlockTag("soul_stone/all");
		public static final TagKey<Block> BLACKSTONE_ALL_BLOCK = createBlockTag("blackstone/all");
		public static final TagKey<Block> CALCITE_ALL_BLOCK = createBlockTag("calcite/all");
		public static final TagKey<Block> DIORITE_ALL_BLOCK = createBlockTag("diorite/all");
		public static final TagKey<Block> GRANITE_ALL_BLOCK = createBlockTag("granite/all");
		public static final TagKey<Block> SLATE_ALL_BLOCK = createBlockTag("slate/all");
		public static final TagKey<Block> MOSSY_DEEPSLATE_ALL_BLOCK = createBlockTag("mossy_deepslates");

		public static final TagKey<Block> DUSTY_LAMPS_BLOCK = createBlockTag("dusty_lamps/all");
		public static final TagKey<Block> LAMPS_WEAK_BLOCK = createBlockTag("dusty_lamps/weak");
		public static final TagKey<Block> LAMPS_MEDIUM_BLOCK = createBlockTag("dusty_lamps/medium");
		public static final TagKey<Block> LAMPS_STRONG_BLOCK = createBlockTag("dusty_lamps/strong");
		public static final TagKey<Block> LAMPS_VERY_STRONG_BLOCK = createBlockTag("dusty_lamps/very_strong");

		public static final TagKey<Block> LEADED_QUARTZ_GLASS_BLOCK = createBlockTag("leaded_quartz_glass");
		public static final TagKey<Block> LEADED_QUARTZ_GLASS_PANES_BLOCK = createBlockTag("leaded_quartz_glass_panes");
		public static final TagKey<Block> STAINED_LEADED_QUARTZ_GLASS_BLOCK = createBlockTag("leaded_quartz_glass_stained");
		public static final TagKey<Block> STAINED_LEADED_QUARTZ_GLASS_PANES_BLOCK = createBlockTag("leaded_quartz_glass_stained_panes");

		public static final TagKey<Block> SOPHIE_ORES_BLOCK = createBlockTag("sophie_ores");
		public static final TagKey<Block> RAW_STORAGE_BLOCK = createBlockTag("sophie_raw_storage");
		public static final TagKey<Block> SMELTED_STORAGE_BLOCK = createBlockTag("sophie_storage");


	//Common Tags

		public static final TagKey<Block> C_ORES_IN_GROUND_SOUL_BLOCK = createCommonBlockTag("ores_in_ground/soul");
		public static final TagKey<Block> C_ORES_IN_GROUND_BASALT_BLOCK = createCommonBlockTag("ores_in_ground/basalt");
		public static final TagKey<Block> C_ORES_IN_GROUND_BLACKSTONE_BLOCK = createCommonBlockTag("ores_in_ground/blackstone");
		public static final TagKey<Block> C_ORES_IN_GROUND_OBSIDIAN_BLOCK = createCommonBlockTag("ores_in_ground/obsidian");
		public static final TagKey<Block> C_ORE_BEARING_GROUND_SOUL_BLOCK = createCommonBlockTag("ore_bearing_ground/soul");
		public static final TagKey<Block> C_ORE_BEARING_GROUND_BASALT_BLOCK = createCommonBlockTag("ore_bearing_ground/basalt");
		public static final TagKey<Block> C_ORE_BEARING_GROUND_BLACKSTONE_BLOCK = createCommonBlockTag("ore_bearing_ground/blackstone");
		public static final TagKey<Block> C_ORE_BEARING_GROUND_OBSIDIAN_BLOCK = createCommonBlockTag("ore_bearing_ground/obsidian");

		public static final TagKey<Block> C_BARS_BLOCK = createCommonBlockTag("bars");
		public static final TagKey<Block> C_LANTERNS_BLOCK = createCommonBlockTag("lanterns");
		public static final TagKey<Block> C_SOUL_LANTERNS_BLOCK = createCommonBlockTag("soul_lanterns");

		public static final TagKey<Block> C_ORES_CRIMSON_COAL_BLOCK = createCommonBlockTag("ores/crimson_coal");
		public static final TagKey<Block> C_ORES_ELECTRUM_BLOCK = createCommonBlockTag("ores/electrum");
		public static final TagKey<Block> C_ORES_FOXITE_BLOCK = createCommonBlockTag("ores/foxite");
		public static final TagKey<Block> C_ORES_JADE_BLOCK = createCommonBlockTag("ores/jade");
		public static final TagKey<Block> C_ORES_LAGOMITE_BLOCK = createCommonBlockTag("ores/lagomite");
		public static final TagKey<Block> C_ORES_LEAD_BLOCK = createCommonBlockTag("ores/lead");
		public static final TagKey<Block> C_ORES_MEAT_BLOCK = createCommonBlockTag("ores/meat");
		public static final TagKey<Block> C_ORES_MITHRIL_BLOCK = createCommonBlockTag("ores/mithril");
		public static final TagKey<Block> C_ORES_QUINGUM_BLOCK = createCommonBlockTag("ores/quingum");
		public static final TagKey<Block> C_ORES_SILVER_BLOCK = createCommonBlockTag("ores/silver");
		public static final TagKey<Block> C_ORES_TRITONIUM_BLOCK = createCommonBlockTag("ores/tritonium");
		public static final TagKey<Block> C_ORES_TUNGSTEN_BLOCK = createCommonBlockTag("ores/tungsten");

		public static final TagKey<Block> C_STORAGE_BABULYMN_BLOCK = createCommonBlockTag("storage_blocks/babulymn");
		public static final TagKey<Block> C_STORAGE_CRIMSON_COAL_BLOCK = createCommonBlockTag("storage_blocks/crimson_coal");
		public static final TagKey<Block> C_STORAGE_ELECTRUM_BLOCK = createCommonBlockTag("storage_blocks/electrum");
		public static final TagKey<Block> C_STORAGE_FOXITE_BLOCK = createCommonBlockTag("storage_blocks/foxite");
		public static final TagKey<Block> C_STORAGE_JADE_BLOCK = createCommonBlockTag("storage_blocks/jade");
		public static final TagKey<Block> C_STORAGE_LAGOMITE_BLOCK = createCommonBlockTag("storage_blocks/lagomite");
		public static final TagKey<Block> C_STORAGE_LEAD_BLOCK = createCommonBlockTag("storage_blocks/lead");
		public static final TagKey<Block> C_STORAGE_LYCALITE_BLOCK = createCommonBlockTag("storage_blocks/lycalite");
		public static final TagKey<Block> C_STORAGE_MEAT_BLOCK = createCommonBlockTag("storage_blocks/meat");
		public static final TagKey<Block> C_STORAGE_MITHRIL_BLOCK = createCommonBlockTag("storage_blocks/mithril");
		public static final TagKey<Block> C_STORAGE_OBERITE_BLOCK = createCommonBlockTag("storage_blocks/oberite");
		public static final TagKey<Block> C_STORAGE_QUINGUM_BLOCK = createCommonBlockTag("storage_blocks/quingum");
		public static final TagKey<Block> C_STORAGE_SILVER_BLOCK = createCommonBlockTag("storage_blocks/silver");
		public static final TagKey<Block> C_STORAGE_STEEL_BLOCK = createCommonBlockTag("storage_blocks/steel");
		public static final TagKey<Block> C_STORAGE_TRITONIUM_BLOCK = createCommonBlockTag("storage_blocks/tritonium");
		public static final TagKey<Block> C_STORAGE_TUNGSTEN_BLOCK = createCommonBlockTag("storage_blocks/tungsten");

		public static final TagKey<Block> C_STORAGE_ELECTRUM_RAW_BLOCK = createCommonBlockTag("storage_blocks/raw_electrum");
		public static final TagKey<Block> C_STORAGE_FOXITE_RAW_BLOCK = createCommonBlockTag("storage_blocks/raw_foxite");
		public static final TagKey<Block> C_STORAGE_LAGOMITE_RAW_BLOCK = createCommonBlockTag("storage_blocks/raw_lagomite");
		public static final TagKey<Block> C_STORAGE_LEAD_RAW_BLOCK = createCommonBlockTag("storage_blocks/raw_lead");
		public static final TagKey<Block> C_STORAGE_MITHRIL_RAW_BLOCK = createCommonBlockTag("storage_blocks/raw_mithril");
		public static final TagKey<Block> C_STORAGE_SILVER_RAW_BLOCK = createCommonBlockTag("storage_blocks/raw_silver");
		public static final TagKey<Block> C_STORAGE_TRITONIUM_RAW_BLOCK = createCommonBlockTag("storage_blocks/raw_tritonium");
		public static final TagKey<Block> C_STORAGE_TUNGSTEN_RAW_BLOCK = createCommonBlockTag("storage_blocks/raw_tungsten");


	//Special Tags
		public static final TagKey<Block> FARMERS_COMPOST_ACTIVATOR = createSpecialBlockTag("farmersdelight", "compost_activators");

		public static final TagKey<Block> CREATE_FAN_TRANSPARENT = createSpecialBlockTag("create", "fan_transparent");
		public static final TagKey<Block> CREATE_HAUNTING_CATALYST = createSpecialBlockTag("create", "fan_processing_catalysts/haunting");
		public static final TagKey<Block> CREATE_WRENCH_PICKUP = createSpecialBlockTag("create", "wrench_pickup");


		private static TagKey<Block> createBlockTag(String name) {
			return BlockTags.create(ResourceLocation.fromNamespaceAndPath(SophiesAlloys.MOD_ID, name));
		}
		private static TagKey<Block> createCommonBlockTag(String name) {
			return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
		}
		private static TagKey<Block> createSpecialBlockTag(String namespace, String name) {
			return BlockTags.create(ResourceLocation.fromNamespaceAndPath(namespace, name));
		}


	}

	public static class Items {
		public static final TagKey<Item> LEADED_QUARTZ_GLASS_ITEM = createItemTag("leaded_quartz_glass");
		public static final TagKey<Item> LEADED_QUARTZ_GLASS_PANES_ITEM = createItemTag("leaded_quartz_glass_panes");
		public static final TagKey<Item> STAINED_LEADED_QUARTZ_GLASS_ITEM = createItemTag("leaded_quartz_glass_stained");
		public static final TagKey<Item> STAINED_LEADED_QUARTZ_GLASS_PANES_ITEM = createItemTag("leaded_quartz_glass_stained_panes");

		public static final TagKey<Item> BLACKSTONE_ALL_ITEM = createItemTag("blackstone/all");
		public static final TagKey<Item> BLACKSTONE_BLOCK_ITEM = createItemTag("blackstone/blocks");
		public static final TagKey<Item> BLACKSTONE_FULL_ITEM = createItemTag("blackstone/full");
		public static final TagKey<Item> BLACKSTONE_SLAB_ITEM = createItemTag("blackstone/slabs");

		public static final TagKey<Item> GRANITE_ALL_ITEM = createItemTag("granite/all");
		public static final TagKey<Item> GRANITE_BLOCK_ITEM = createItemTag("granite/blocks");
		public static final TagKey<Item> GRANITE_FULL_ITEM = createItemTag("granite/full");
		public static final TagKey<Item> GRANITE_SLAB_ITEM = createItemTag("granite/slabs");

		public static final TagKey<Item> DIORITE_ALL_ITEM = createItemTag("diorite/all");
		public static final TagKey<Item> DIORITE_BLOCK_ITEM = createItemTag("diorite/blocks");
		public static final TagKey<Item> DIORITE_FULL_ITEM = createItemTag("diorite/full");
		public static final TagKey<Item> DIORITE_SLAB_ITEM = createItemTag("diorite/slabs");

		public static final TagKey<Item> CALCITE_ALL_ITEM = createItemTag("calcite/all");
		public static final TagKey<Item> CALCITE_BLOCK_ITEM = createItemTag("calcite/blocks");
		public static final TagKey<Item> CALCITE_FULL_ITEM = createItemTag("calcite/full");
		public static final TagKey<Item> CALCITE_SLAB_ITEM = createItemTag("calcite/slabs");

		public static final TagKey<Item> SLATE_ALL_ITEM = createItemTag("slate/all");
		public static final TagKey<Item> SLATE_BLOCK_ITEM = createItemTag("slate/blocks");
		public static final TagKey<Item> SLATE_FULL_ITEM = createItemTag("slate/full");
		public static final TagKey<Item> SLATE_SLAB_ITEM = createItemTag("slate/slabs");

		public static final TagKey<Item> SOUL_ALL_ITEM = createItemTag("soul_stone/all");
		public static final TagKey<Item> SOUL_ALL_BLOCK_ITEM = createItemTag("soul_stone/blocks");
		public static final TagKey<Item> SOUL_PURE_BLOCK_ITEM = createItemTag("soul_stone/pure_blocks");
		public static final TagKey<Item> SOUL_PURE_FULL_ITEM = createItemTag("soul_stone/pure_full");
		public static final TagKey<Item> SOUL_PURE_SLAB_ITEM = createItemTag("soul_stone/pure_slabs");
		public static final TagKey<Item> SOUL_COBBLE_ALL_ITEM = createItemTag("soul_stone/cobble_all");
		public static final TagKey<Item> SOUL_COBBLE_FULL_ITEM = createItemTag("soul_stone/cobble_full");

		public static final TagKey<Item> MOSSY_DEEPSLATE_ALL_ITEM = createItemTag("mossy_deepslate/all");
		public static final TagKey<Item> MOSSY_DEEPSLATE_BLOCK_ITEM = createItemTag("mossy_deepslate/blocks");
		public static final TagKey<Item> MOSSY_DEEPSLATE_FULL_ITEM = createItemTag("mossy_deepslate/full");
		public static final TagKey<Item> MOSSY_DEEPSLATE_SLAB_ITEM = createItemTag("mossy_deepslate/slabs");

		public static final TagKey<Item> DUSTY_LAMPS_ITEM = createItemTag("dusty_lamps/all");
		public static final TagKey<Item> LAMPS_WEAK_ITEM = createItemTag("dusty_lamps/weak");
		public static final TagKey<Item> LAMPS_MEDIUM_ITEM = createItemTag("dusty_lamps/medium");
		public static final TagKey<Item> LAMPS_STRONG_ITEM = createItemTag("dusty_lamps/strong");
		public static final TagKey<Item> LAMPS_VERY_STRONG_ITEM = createItemTag("dusty_lamps/very_strong");


		public static final TagKey<Item> CHUNKS_ITEM = createItemTag("chunks/all");
		public static final TagKey<Item> CHUNKABLES_ITEM = createItemTag("chunks/chunkable_blocks");
		public static final TagKey<Item> CHUNKS_END_ITEM = createItemTag("chunks/end");
		public static final TagKey<Item> CHUNKS_NETHER_ITEM = createItemTag("chunks/nether");
		public static final TagKey<Item> CHUNKS_OVERWORLD_ITEM = createItemTag("chunks/overworld");
		public static final TagKey<Item> CHUNKS_CONVERT_END_ITEM = createItemTag("chunks/convert_end");
		public static final TagKey<Item> CHUNKS_CONVERT_SOUL_ITEM = createItemTag("chunks/convert_soul");
		public static final TagKey<Item> CHUNKS_CONVERT_NETHERRACK_ITEM = createItemTag("chunks/convert_netherrack");
		public static final TagKey<Item> CHUNKS_CONVERT_FREEZE_ITEM = createItemTag("chunks/convert_freeze");
		public static final TagKey<Item> CHUNKS_CONVERT_BLACKSTONE_ITEM = createItemTag("chunks/convert_blackstone");


		public static final TagKey<Item> UPGRADE_ELECTRUM_AXES = createItemTag("upgrade_electrum/axes");
		public static final TagKey<Item> UPGRADE_ELECTRUM_BOOTS = createItemTag("upgrade_electrum/boots");
		public static final TagKey<Item> UPGRADE_ELECTRUM_CHESTPLATES = createItemTag("upgrade_electrum/chestplates");
		public static final TagKey<Item> UPGRADE_ELECTRUM_HELMETS = createItemTag("upgrade_electrum/helmets");
		public static final TagKey<Item> UPGRADE_ELECTRUM_HOES = createItemTag("upgrade_electrum/hoes");
		public static final TagKey<Item> UPGRADE_ELECTRUM_LEGGINGS = createItemTag("upgrade_electrum/leggings");
		public static final TagKey<Item> UPGRADE_ELECTRUM_PICKAXES = createItemTag("upgrade_electrum/pickaxes");
		public static final TagKey<Item> UPGRADE_ELECTRUM_SHOVELS = createItemTag("upgrade_electrum/shovels");
		public static final TagKey<Item> UPGRADE_ELECTRUM_SWORDS = createItemTag("upgrade_electrum/swords");

		public static final TagKey<Item> UPGRADE_IRON_FOXIDE_AXES = createItemTag("upgrade_iron_foxite/axes");
		public static final TagKey<Item> UPGRADE_IRON_FOXIDE_BOOTS = createItemTag("upgrade_iron_foxite/boots");
		public static final TagKey<Item> UPGRADE_IRON_FOXIDE_CHESTPLATES = createItemTag("upgrade_iron_foxite/chestplates");
		public static final TagKey<Item> UPGRADE_IRON_FOXIDE_HELMETS = createItemTag("upgrade_iron_foxite/helmets");
		public static final TagKey<Item> UPGRADE_IRON_FOXIDE_HOES = createItemTag("upgrade_iron_foxite/hoes");
		public static final TagKey<Item> UPGRADE_IRON_FOXIDE_LEGGINGS = createItemTag("upgrade_iron_foxite/leggings");
		public static final TagKey<Item> UPGRADE_IRON_FOXIDE_PICKAXES = createItemTag("upgrade_iron_foxite/pickaxes");
		public static final TagKey<Item> UPGRADE_IRON_FOXIDE_SHOVELS = createItemTag("upgrade_iron_foxite/shovels");
		public static final TagKey<Item> UPGRADE_IRON_FOXIDE_SWORDS = createItemTag("upgrade_iron_foxite/swords");

		public static final TagKey<Item> UPGRADE_LAGO_TUNG_AXES = createItemTag("upgrade_lago_tung/axes");
		public static final TagKey<Item> UPGRADE_LAGO_TUNG_BOOTS = createItemTag("upgrade_lago_tung/boots");
		public static final TagKey<Item> UPGRADE_LAGO_TUNG_CHESTPLATES = createItemTag("upgrade_lago_tung/chestplates");
		public static final TagKey<Item> UPGRADE_LAGO_TUNG_HELMETS = createItemTag("upgrade_lago_tung/helmets");
		public static final TagKey<Item> UPGRADE_LAGO_TUNG_HOES = createItemTag("upgrade_lago_tung/hoes");
		public static final TagKey<Item> UPGRADE_LAGO_TUNG_LEGGINGS = createItemTag("upgrade_lago_tung/leggings");
		public static final TagKey<Item> UPGRADE_LAGO_TUNG_PICKAXES = createItemTag("upgrade_lago_tung/pickaxes");
		public static final TagKey<Item> UPGRADE_LAGO_TUNG_SHOVELS = createItemTag("upgrade_lago_tung/shovels");
		public static final TagKey<Item> UPGRADE_LAGO_TUNG_SWORDS = createItemTag("upgrade_lago_tung/swords");

		public static final TagKey<Item> UPGRADE_LYCALITE_AXES = createItemTag("upgrade_lycalite/axes");
		public static final TagKey<Item> UPGRADE_LYCALITE_BOOTS = createItemTag("upgrade_lycalite/boots");
		public static final TagKey<Item> UPGRADE_LYCALITE_CHESTPLATES = createItemTag("upgrade_lycalite/chestplates");
		public static final TagKey<Item> UPGRADE_LYCALITE_HELMETS = createItemTag("upgrade_lycalite/helmets");
		public static final TagKey<Item> UPGRADE_LYCALITE_HOES = createItemTag("upgrade_lycalite/hoes");
		public static final TagKey<Item> UPGRADE_LYCALITE_LEGGINGS = createItemTag("upgrade_lycalite/leggings");
		public static final TagKey<Item> UPGRADE_LYCALITE_PICKAXES = createItemTag("upgrade_lycalite/pickaxes");
		public static final TagKey<Item> UPGRADE_LYCALITE_SHOVELS = createItemTag("upgrade_lycalite/shovels");
		public static final TagKey<Item> UPGRADE_LYCALITE_SWORDS = createItemTag("upgrade_lycalite/swords");

		public static final TagKey<Item> UPGRADE_MITHRIL_AXES = createItemTag("upgrade_mithril/axes");
		public static final TagKey<Item> UPGRADE_MITHRIL_BOOTS = createItemTag("upgrade_mithril/boots");
		public static final TagKey<Item> UPGRADE_MITHRIL_CHESTPLATES = createItemTag("upgrade_mithril/chestplates");
		public static final TagKey<Item> UPGRADE_MITHRIL_HELMETS = createItemTag("upgrade_mithril/helmets");
		public static final TagKey<Item> UPGRADE_MITHRIL_HOES = createItemTag("upgrade_mithril/hoes");
		public static final TagKey<Item> UPGRADE_MITHRIL_LEGGINGS = createItemTag("upgrade_mithril/leggings");
		public static final TagKey<Item> UPGRADE_MITHRIL_PICKAXES = createItemTag("upgrade_mithril/pickaxes");

		public static final TagKey<Item> UPGRADE_NETHERITE_AXES = createItemTag("upgrade_netherite/axes");
		public static final TagKey<Item> UPGRADE_NETHERITE_BOOTS = createItemTag("upgrade_netherite/boots");
		public static final TagKey<Item> UPGRADE_NETHERITE_CHESTPLATES = createItemTag("upgrade_netherite/chestplates");
		public static final TagKey<Item> UPGRADE_NETHERITE_HELMETS = createItemTag("upgrade_netherite/helmets");
		public static final TagKey<Item> UPGRADE_NETHERITE_HOES = createItemTag("upgrade_netherite/hoes");
		public static final TagKey<Item> UPGRADE_NETHERITE_LEGGINGS = createItemTag("upgrade_netherite/leggings");
		public static final TagKey<Item> UPGRADE_NETHERITE_PICKAXES = createItemTag("upgrade_netherite/pickaxes");
		public static final TagKey<Item> UPGRADE_NETHERITE_SHOVELS = createItemTag("upgrade_netherite/shovels");
		public static final TagKey<Item> UPGRADE_NETHERITE_SWORDS = createItemTag("upgrade_netherite/swords");

		public static final TagKey<Item> UPGRADE_STEEL_AXES = createItemTag("upgrade_steel/axes");
		public static final TagKey<Item> UPGRADE_STEEL_BOOTS = createItemTag("upgrade_steel/boots");
		public static final TagKey<Item> UPGRADE_STEEL_CHESTPLATES = createItemTag("upgrade_steel/chestplates");
		public static final TagKey<Item> UPGRADE_STEEL_HELMETS = createItemTag("upgrade_steel/helmets");
		public static final TagKey<Item> UPGRADE_STEEL_HOES = createItemTag("upgrade_steel/hoes");
		public static final TagKey<Item> UPGRADE_STEEL_LEGGINGS = createItemTag("upgrade_steel/leggings");
		public static final TagKey<Item> UPGRADE_STEEL_PICKAXES = createItemTag("upgrade_steel/pickaxes");
		public static final TagKey<Item> UPGRADE_STEEL_SHOVELS = createItemTag("upgrade_steel/shovels");
		public static final TagKey<Item> UPGRADE_STEEL_SWORDS = createItemTag("upgrade_steel/swords");


		public static final TagKey<Item> C_ORES_IN_GROUND_SOUL_ITEM = createCommonItemTag("ores_in_ground/soul");
		public static final TagKey<Item> C_ORES_IN_GROUND_BASALT_ITEM = createCommonItemTag("ores_in_ground/basalt");
		public static final TagKey<Item> C_ORES_IN_GROUND_BLACKSTONE_ITEM = createCommonItemTag("ores_in_ground/blackstone");
		public static final TagKey<Item> C_ORES_IN_GROUND_OBSIDIAN_ITEM = createCommonItemTag("ores_in_ground/obsidian");
		public static final TagKey<Item> C_ORE_BEARING_GROUND_SOUL_ITEM = createCommonItemTag("ore_bearing_ground/soul");
		public static final TagKey<Item> C_ORE_BEARING_GROUND_BASALT_ITEM = createCommonItemTag("ore_bearing_ground/basalt");
		public static final TagKey<Item> C_ORE_BEARING_GROUND_BLACKSTONE_ITEM = createCommonItemTag("ore_bearing_ground/blackstone");
		public static final TagKey<Item> C_ORE_BEARING_GROUND_OBSIDIAN_ITEM = createCommonItemTag("ore_bearing_ground/obsidian");

		public static final TagKey<Item> C_ORES_CRIMSON_COAL_ITEM = createCommonItemTag("ores/crimson_coal");
		public static final TagKey<Item> C_ORES_ELECTRUM_ITEM = createCommonItemTag("ores/electrum");
		public static final TagKey<Item> C_ORES_FOXITE_ITEM = createCommonItemTag("ores/foxite");
		public static final TagKey<Item> C_ORES_JADE_ITEM = createCommonItemTag("ores/jade");
		public static final TagKey<Item> C_ORES_LAGOMITE_ITEM = createCommonItemTag("ores/lagomite");
		public static final TagKey<Item> C_ORES_LEAD_ITEM = createCommonItemTag("ores/lead");
		public static final TagKey<Item> C_ORES_MEAT_ITEM = createCommonItemTag("ores/meat");
		public static final TagKey<Item> C_ORES_MITHRIL_ITEM = createCommonItemTag("ores/mithril");
		public static final TagKey<Item> C_ORES_QUINGUM_ITEM = createCommonItemTag("ores/quingum");
		public static final TagKey<Item> C_ORES_SILVER_ITEM = createCommonItemTag("ores/silver");
		public static final TagKey<Item> C_ORES_TRITONIUM_ITEM = createCommonItemTag("ores/tritonium");
		public static final TagKey<Item> C_ORES_TUNGSTEN_ITEM = createCommonItemTag("ores/tungsten");

		public static final TagKey<Item> C_STORAGE_BABULYMN_ITEM = createCommonItemTag("storage_blocks/babulymn");
		public static final TagKey<Item> C_STORAGE_CRIMSON_COAL_ITEM = createCommonItemTag("storage_blocks/crimson_coal");
		public static final TagKey<Item> C_STORAGE_ELECTRUM_ITEM = createCommonItemTag("storage_blocks/electrum");
		public static final TagKey<Item> C_STORAGE_FOXITE_ITEM = createCommonItemTag("storage_blocks/foxite");
		public static final TagKey<Item> C_STORAGE_JADE_ITEM = createCommonItemTag("storage_blocks/jade");
		public static final TagKey<Item> C_STORAGE_LAGOMITE_ITEM = createCommonItemTag("storage_blocks/lagomite");
		public static final TagKey<Item> C_STORAGE_LEAD_ITEM = createCommonItemTag("storage_blocks/lead");
		public static final TagKey<Item> C_STORAGE_LYCALITE_ITEM = createCommonItemTag("storage_blocks/lycalite");
		public static final TagKey<Item> C_STORAGE_MEAT_ITEM = createCommonItemTag("storage_blocks/meat");
		public static final TagKey<Item> C_STORAGE_MITHRIL_ITEM = createCommonItemTag("storage_blocks/mithril");
		public static final TagKey<Item> C_STORAGE_OBERITE_ITEM = createCommonItemTag("storage_blocks/oberite");
		public static final TagKey<Item> C_STORAGE_QUINGUM_ITEM = createCommonItemTag("storage_blocks/quingum");
		public static final TagKey<Item> C_STORAGE_SILVER_ITEM = createCommonItemTag("storage_blocks/silver");
		public static final TagKey<Item> C_STORAGE_STEEL_ITEM = createCommonItemTag("storage_blocks/steel");
		public static final TagKey<Item> C_STORAGE_TRITONIUM_ITEM = createCommonItemTag("storage_blocks/tritonium");
		public static final TagKey<Item> C_STORAGE_TUNGSTEN_ITEM = createCommonItemTag("storage_blocks/tungsten");

		public static final TagKey<Item> C_STORAGE_ELECTRUM_RAW_ITEM = createCommonItemTag("storage_blocks/raw_electrum");
		public static final TagKey<Item> C_STORAGE_FOXITE_RAW_ITEM = createCommonItemTag("storage_blocks/raw_foxite");
		public static final TagKey<Item> C_STORAGE_LAGOMITE_RAW_ITEM = createCommonItemTag("storage_blocks/raw_lagomite");
		public static final TagKey<Item> C_STORAGE_LEAD_RAW_ITEM = createCommonItemTag("storage_blocks/raw_lead");
		public static final TagKey<Item> C_STORAGE_MITHRIL_RAW_ITEM = createCommonItemTag("storage_blocks/raw_mithril");
		public static final TagKey<Item> C_STORAGE_SILVER_RAW_ITEM = createCommonItemTag("storage_blocks/raw_silver");
		public static final TagKey<Item> C_STORAGE_TRITONIUM_RAW_ITEM = createCommonItemTag("storage_blocks/raw_tritonium");
		public static final TagKey<Item> C_STORAGE_TUNGSTEN_RAW_ITEM = createCommonItemTag("storage_blocks/raw_tungsten");

		public static final TagKey<Item> C_CRIMSON_COAL = createCommonItemTag("crimson_coals");

		public static final TagKey<Item> C_GEMS_JADE = createCommonItemTag("gems/jade");
		public static final TagKey<Item> C_GEMS_QUINGUM = createCommonItemTag("gems/quingum");

		public static final TagKey<Item> C_RAW_ELECTRUM_ITEM = createCommonItemTag("raw_materials/electrum");
		public static final TagKey<Item> C_RAW_FOXITE_ITEM = createCommonItemTag("raw_materials/foxite");
		public static final TagKey<Item> C_RAW_LAGOMITE_ITEM = createCommonItemTag("raw_materials/lagomite");
		public static final TagKey<Item> C_RAW_LEAD_ITEM = createCommonItemTag("raw_materials/lead");
		public static final TagKey<Item> C_RAW_MITHRIL_ITEM = createCommonItemTag("raw_materials/mithril");
		public static final TagKey<Item> C_RAW_SILVER_ITEM = createCommonItemTag("raw_materials/silver");
		public static final TagKey<Item> C_RAW_TRITONIUM_ITEM = createCommonItemTag("raw_materials/tritonium");
		public static final TagKey<Item> C_RAW_TUNGSTEN_ITEM = createCommonItemTag("raw_materials/tungsten");

		public static final TagKey<Item> C_INGOT_BABULYMN_ITEM = createCommonItemTag("ingots/babulymn");
		public static final TagKey<Item> C_INGOT_ELECTRUM_ITEM = createCommonItemTag("ingots/electrum");
		public static final TagKey<Item> C_INGOT_FOXITE_ITEM = createCommonItemTag("ingots/foxite");
		public static final TagKey<Item> C_INGOT_LAGOMITE_ITEM = createCommonItemTag("ingots/lagomite");
		public static final TagKey<Item> C_INGOT_LEAD_ITEM = createCommonItemTag("ingots/lead");
		public static final TagKey<Item> C_INGOT_LYCALITE_ITEM = createCommonItemTag("ingots/lycalite");
		public static final TagKey<Item> C_INGOT_MITHRIL_ITEM = createCommonItemTag("ingots/mithril");
		public static final TagKey<Item> C_INGOT_OBERITE_ITEM = createCommonItemTag("ingots/oberite");
		public static final TagKey<Item> C_INGOT_SILVER_ITEM = createCommonItemTag("ingots/silver");
		public static final TagKey<Item> C_INGOT_STEEL_ITEM = createCommonItemTag("ingots/steel");
		public static final TagKey<Item> C_INGOT_TRITONIUM_ITEM = createCommonItemTag("ingots/tritonium");
		public static final TagKey<Item> C_INGOT_TUNGSTEN_ITEM = createCommonItemTag("ingots/tungsten");

		public static final TagKey<Item> C_PLATES_ITEM = createCommonItemTag("plates");

		public static final TagKey<Item> C_PLATE_BABULYMN_ITEM = createCommonItemTag("plates/babulymn");
		public static final TagKey<Item> C_PLATE_ELECTRUM_ITEM = createCommonItemTag("plates/electrum");
		public static final TagKey<Item> C_PLATE_FOXITE_ITEM = createCommonItemTag("plates/foxite");
		public static final TagKey<Item> C_PLATE_LAGOMITE_ITEM = createCommonItemTag("plates/lagomite");
		public static final TagKey<Item> C_PLATE_LAPIS_ITEM = createCommonItemTag("plates/lapis");
		public static final TagKey<Item> C_PLATE_LYCALITE_ITEM = createCommonItemTag("plates/lycalite");
		public static final TagKey<Item> C_PLATE_MITHRIL_ITEM = createCommonItemTag("plates/mithril");
		public static final TagKey<Item> C_PLATE_NETHERITE_ITEM = createCommonItemTag("plates/netherite");
		public static final TagKey<Item> C_PLATE_OBERITE_ITEM = createCommonItemTag("plates/oberite");
		public static final TagKey<Item> C_PLATE_SILVER_ITEM = createCommonItemTag("plates/silver");
		public static final TagKey<Item> C_PLATE_SLATE_ITEM = createCommonItemTag("plates/slate");
		public static final TagKey<Item> C_PLATE_STEEL_ITEM = createCommonItemTag("plates/steel");
		public static final TagKey<Item> C_PLATE_TUNGSTEN_ITEM = createCommonItemTag("plates/tungsten");

		public static final TagKey<Item> C_DUST_AMETHYST_ITEM = createCommonItemTag("dusts/amethyst");
		public static final TagKey<Item> C_DUST_BABULYMN_ITEM = createCommonItemTag("dusts/babulymn");
		public static final TagKey<Item> C_DUST_BRASS_ITEM = createCommonItemTag("dusts/brass");
		public static final TagKey<Item> C_DUST_COAL_ITEM = createCommonItemTag("dusts/coal");
		public static final TagKey<Item> C_DUST_COPPER_ITEM = createCommonItemTag("dusts/copper");
		public static final TagKey<Item> C_DUST_CRIMSON_COAL_ITEM = createCommonItemTag("dusts/crimson_coal");
		public static final TagKey<Item> C_DUST_DIAMOND_ITEM = createCommonItemTag("dusts/diamond");
		public static final TagKey<Item> C_DUST_ELECTRUM_ITEM = createCommonItemTag("dusts/electrum");
		public static final TagKey<Item> C_DUST_EMERALD_ITEM = createCommonItemTag("dusts/emerald");
		public static final TagKey<Item> C_DUST_END_STONE_ITEM = createCommonItemTag("dusts/end_stone");
		public static final TagKey<Item> C_DUST_FLINT_ITEM = createCommonItemTag("dusts/flint");
		public static final TagKey<Item> C_DUST_FOXITE_ITEM = createCommonItemTag("dusts/foxite");
		public static final TagKey<Item> C_DUST_GOLD_ITEM = createCommonItemTag("dusts/gold");
		public static final TagKey<Item> C_DUST_IRON_ITEM = createCommonItemTag("dusts/iron");
		public static final TagKey<Item> C_DUST_JADE_ITEM = createCommonItemTag("dusts/jade");
		public static final TagKey<Item> C_DUST_LAGOMITE_ITEM = createCommonItemTag("dusts/lagomite");
		public static final TagKey<Item> C_DUST_LAPIS_ITEM = createCommonItemTag("dusts/lapis");
		public static final TagKey<Item> C_DUST_LEAD_ITEM = createCommonItemTag("dusts/lead");
		public static final TagKey<Item> C_DUST_LYCALITE_ITEM = createCommonItemTag("dusts/lycalite");
		public static final TagKey<Item> C_DUST_MITHRIL_ITEM = createCommonItemTag("dusts/mithril");
		public static final TagKey<Item> C_DUST_NETHERITE_ITEM = createCommonItemTag("dusts/netherite");
		public static final TagKey<Item> C_DUST_OBERITE_ITEM = createCommonItemTag("dusts/oberite");
		public static final TagKey<Item> C_DUST_QUINGUM_ITEM = createCommonItemTag("dusts/quingum");
		public static final TagKey<Item> C_DUST_SILVER_ITEM = createCommonItemTag("dusts/silver");
		public static final TagKey<Item> C_DUST_STEEL_ITEM = createCommonItemTag("dusts/steel");
		public static final TagKey<Item> C_DUST_TRITONIUM_ITEM = createCommonItemTag("dusts/tritonium");
		public static final TagKey<Item> C_DUST_TUNGSTEN_ITEM = createCommonItemTag("dusts/tungsten");
		public static final TagKey<Item> C_DUST_ZINC_ITEM = createCommonItemTag("dusts/zinc");

		public static final TagKey<Item> C_NUGGET_BABULYMN = createCommonItemTag("nuggets/babulymn");
		public static final TagKey<Item> C_NUGGET_ELECTRUM = createCommonItemTag("nuggets/electrum");
		public static final TagKey<Item> C_NUGGET_FOXITE = createCommonItemTag("nuggets/foxite");
		public static final TagKey<Item> C_NUGGET_LAGOMITE = createCommonItemTag("nuggets/lagomite");
		public static final TagKey<Item> C_NUGGET_LEAD = createCommonItemTag("nuggets/lead");
		public static final TagKey<Item> C_NUGGET_LYCALITE = createCommonItemTag("nuggets/lycalite");
		public static final TagKey<Item> C_NUGGET_MITHRIL = createCommonItemTag("nuggets/mithril");
		public static final TagKey<Item> C_NUGGET_NETHERITE = createCommonItemTag("nuggets/netherite");
		public static final TagKey<Item> C_NUGGET_OBERITE = createCommonItemTag("nuggets/oberite");
		public static final TagKey<Item> C_NUGGET_SILVER = createCommonItemTag("nuggets/silver");
		public static final TagKey<Item> C_NUGGET_STEEL = createCommonItemTag("nuggets/steel");
		public static final TagKey<Item> C_NUGGET_TRITONIUM = createCommonItemTag("nuggets/tritonium");
		public static final TagKey<Item> C_NUGGET_TUNGSTEN = createCommonItemTag("nuggets/tungsten");

		public static final TagKey<Item> C_SHARDS_ITEM = createCommonItemTag("shards");
		public static final TagKey<Item> C_SHARD_AMETHYST_ITEM = createCommonItemTag("shards/amethyst");
		public static final TagKey<Item> C_SHARD_DIAMOND_ITEM = createCommonItemTag("shards/diamond");
		public static final TagKey<Item> C_SHARD_EMERALD_ITEM = createCommonItemTag("shards/emerald");
		public static final TagKey<Item> C_SHARD_JADE_ITEM = createCommonItemTag("shards/jade");
		public static final TagKey<Item> C_SHARD_LAPIS_ITEM = createCommonItemTag("shards/lapis");
		public static final TagKey<Item> C_SHARD_QUINGUM_ITEM = createCommonItemTag("shards/quingum");

		public static final TagKey<Item> C_BARS_ITEM = createCommonItemTag("bars");
		public static final TagKey<Item> C_LANTERNS_ITEM = createCommonItemTag("lanterns");
		public static final TagKey<Item> C_SOUL_LANTERNS_ITEM = createCommonItemTag("soul_lanterns");

		public static final TagKey<Item> C_FOODS_STRANGE_MEAT = createCommonItemTag("foods/strange_meat");
		public static final TagKey<Item> C_FOODS_STRANGE_RAW_MEAT = createCommonItemTag("foods/strange_raw_meat");


		public static final TagKey<Item> MOSS_MUSH_ITEM = createItemTag("moss_mush");


		public static final TagKey<Item> SALT_CAN_BE_SALTED = createSpecialItemTag("salt", "can_be_salted");

		public static final TagKey<Item> CREATE_CRUSHED_RAW_MATERIALS = createSpecialItemTag("create", "crushed_raw_materials");
		public static final TagKey<Item> CREATE_UPRIGHT_ON_BELT = createSpecialItemTag("create", "upright_on_belt");

		private static TagKey<Item> createItemTag(String name) {
			return ItemTags.create(ResourceLocation.fromNamespaceAndPath(SophiesAlloys.MOD_ID, name));
		}
		private static TagKey<Item> createCommonItemTag(String name) {
			return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
		}
		private static TagKey<Item> createSpecialItemTag(String namespace, String name) {
			return ItemTags.create(ResourceLocation.fromNamespaceAndPath(namespace, name));
		}
	}

	public static class Biomes {
		public static final TagKey<Biome> IS_CORRUPT = createBiomeTag("is_corrupt");
		public static final TagKey<Biome> BLACK_GRAVEL_SPAWNABLE = createBiomeTag("black_gravel_spawnable");
		public static final TagKey<Biome> OREBERRY_SPAWNABLE = createBiomeTag("oreberry_spawnable");


		private static TagKey<Biome> createBiomeTag(String name) {
			return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(SophiesAlloys.MOD_ID, name));
		}
	}
}
