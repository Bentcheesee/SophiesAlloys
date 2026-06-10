package com.sophiecheese.alloys.init;

import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.item.*;
import com.sophiecheese.alloys.item.stats.SophieArmourMaterials;
import com.sophiecheese.alloys.item.stats.SophieToolTier;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SophiesAlloys.MOD_ID);

//Minecraft Materials
	public static final DeferredItem<Item> COAL_DUST = ITEMS.register("coal_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> IRON_DUST = ITEMS.register("iron_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> AMETHYST_DUST = ITEMS.register("amethyst_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> GOLD_DUST = ITEMS.register("gold_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> COPPER_DUST = ITEMS.register("copper_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> LAPIS_DUST = ITEMS.register("lapis_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> QUARTZ_DUST = ITEMS.register("quartz_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> TINY_DIAMOND_DUST = ITEMS.register("tiny_diamond_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> DIAMOND_DUST = ITEMS.register("diamond_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> EMERALD_DUST = ITEMS.register("emerald_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> NETHERITE_DUST = ITEMS.register("netherite_dust",
		() -> new Item(standardItem()));

	public static final DeferredItem<Item> ENDSTONE_DUST = ITEMS.register("end_stone_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> CRUSHED_ENDSTONE = ITEMS.register("crushed_endstone",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> FLINT_DUST = ITEMS.register("flint_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> LEADED_QUARTZ_DUST = ITEMS.register("leaded_quartz_dust",
		() -> new Item(standardItem()));

	public static final DeferredItem<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> EMERALD_SHARD = ITEMS.register("emerald_shard",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> LAPIS_SHARD = ITEMS.register("lapis_shard",
		() -> new Item(standardItem()));


//Generic Metals

	public static final DeferredItem<Item> ZINC_DUST = ITEMS.register("zinc_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> BRASS_DUST = ITEMS.register("brass_dust",
		() -> new Item(standardItem()));

	public static final DeferredItem<Item> RAW_SILVER = ITEMS.register("raw_silver",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> CRUSHED_SILVER = ITEMS.register("crushed_silver",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> SILVER_DUST = ITEMS.register("silver_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
		() -> new Item(standardItem()));

	public static final DeferredItem<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> CRUSHED_TUNGSTEN = ITEMS.register("crushed_tungsten",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> TUNGSTEN_DUST = ITEMS.register("tungsten_dust",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget",
		() -> new Item(standardItem().fireResistant()));

	public static final DeferredItem<Item> RAW_ELECTRUM = ITEMS.register("raw_electrum",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> CRUSHED_ELECTRUM = ITEMS.register("crushed_electrum",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget",
		() -> new Item(standardItem()));

	public static final DeferredItem<Item> RAW_LEAD = ITEMS.register("raw_lead",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> LEAD_DUST = ITEMS.register("lead_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
		() -> new Item(standardItem()));

	public static final DeferredItem<Item> RAW_MITHRIL = ITEMS.register("raw_mithril",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> CRUSHED_MITHRIL = ITEMS.register("crushed_mithril",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> MITHRIL_DUST = ITEMS.register("mithril_dust",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> MITHRIL_SCRAP = ITEMS.register("mithril_scrap",
		() -> new DescItem(false, standardItem().fireResistant()));

	public static final DeferredItem<Item> STEEL_DUST = ITEMS.register("steel_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
		() -> new Item(standardItem()));


//Sophie's Base Metals
	public static final DeferredItem<Item> RAW_FOXITE = ITEMS.register("raw_foxite",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> CRUSHED_FOXITE = ITEMS.register("crushed_foxite",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> FOXITE_DUST = ITEMS.register("foxite_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> FOXITE_INGOT = ITEMS.register("foxite_ingot",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> FOXITE_NUGGET = ITEMS.register("foxite_nugget",
		() -> new Item(standardItem()));

	public static final DeferredItem<Item> RAW_TRITONIUM = ITEMS.register("raw_tritonium",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> CRUSHED_TRITONIUM = ITEMS.register("crushed_tritonium",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> TRITONIUM_DUST = ITEMS.register("tritonium_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> TRITONIUM_INGOT = ITEMS.register("tritonium_ingot",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> TRITONIUM_NUGGET = ITEMS.register("tritonium_nugget",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> TRITONIUM_SCRAP = ITEMS.register("tritonium_scrap",
		() -> new Item(standardItem()));

	public static final DeferredItem<Item> RAW_LAGOMITE = ITEMS.register("raw_lagomite",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> CRUSHED_LAGOMITE = ITEMS.register("crushed_lagomite",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> LAGOMITE_DUST = ITEMS.register("lagomite_dust",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> LAGOMITE_INGOT = ITEMS.register("lagomite_ingot",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> LAGOMITE_NUGGET = ITEMS.register("lagomite_nugget",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> LAGOMITE_SCRAP = ITEMS.register("lagomite_scrap",
		() -> new Item(standardItem().fireResistant()));

//Sophie's Base Gems
	public static final DeferredItem<Item> JADE_SHARD = ITEMS.register("jade_shard",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> JADE_GEM = ITEMS.register("jade_gem",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> JADE_DUST = ITEMS.register("jade_dust",
		() -> new JadeDustItem(standardItem()));
	public static final DeferredItem<Item> QUINGUM_SHARD = ITEMS.register("quingum_shard",
		() -> new DescItem(true, standardItem().food(FoodItemProperties.QUINGUM_GEM)));
	public static final DeferredItem<Item> QUINGUM_GEM = ITEMS.register("quingum_gem",
		() -> new DescItem(true, standardItem().food(FoodItemProperties.QUINGUM_GEM)));
	public static final DeferredItem<Item> QUINGUM_DUST = ITEMS.register("quingum_dust",
		() -> new Item(standardItem()));

//Sophie's Alloy Metals
	public static final DeferredItem<Item> OBERITE_INGOT = ITEMS.register("oberite_ingot",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> OBERITE_DUST = ITEMS.register("oberite_dust",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> OBERITE_NUGGET = ITEMS.register("oberite_nugget",
		() -> new Item(standardItem().fireResistant()));

	public static final DeferredItem<Item> LYCALITE_INGOT = ITEMS.register("lycalite_ingot",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> LYCALITE_DUST = ITEMS.register("lycalite_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> LYCALITE_NUGGET = ITEMS.register("lycalite_nugget",
		() -> new Item(standardItem()));

	public static final DeferredItem<Item> BABULYMN_INGOT = ITEMS.register("babulymn_ingot",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> BABULYMN_DUST = ITEMS.register("babulymn_dust",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> BABULYMN_NUGGET = ITEMS.register("babulymn_nugget",
		() -> new Item(standardItem()));

//Sophie's Materials
	public static final DeferredItem<Item> SLATE_SHEET = ITEMS.register("slate_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> LAPIS_PLATE = ITEMS.register("lapis_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> ROUGH_LAPIS_PLATE = ITEMS.register("rough_lapis_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> SILVER_PLATE = ITEMS.register("silver_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> ELECTRUM_PLATE = ITEMS.register("electrum_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> ROUGH_FOXITE_PLATE = ITEMS.register("rough_foxite_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> FOXITE_PLATE = ITEMS.register("foxite_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> ROUGH_DIAMOND_PLATE = ITEMS.register("rough_diamond_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> ROUGH_MITHRIL_PLATE = ITEMS.register("rough_mithril_sheet",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> MITHRIL_PLATE = ITEMS.register("mithril_sheet",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> TUNGSTEN_PLATE = ITEMS.register("tungsten_sheet",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> STEEL_PLATE = ITEMS.register("steel_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> LAGOMITE_PLATE = ITEMS.register("lagomite_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> OBERITE_PLATE = ITEMS.register("oberite_sheet",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> LYCALITE_PLATE = ITEMS.register("lycalite_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> BABULYMN_PLATE = ITEMS.register("babulymn_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> NETHERITE_PLATE = ITEMS.register("netherite_sheet",
		() -> new Item(standardItem().fireResistant()));

	public static final DeferredItem<Item> CRIMSON_COAL = ITEMS.register("crimson_coal",
		() -> new Item( standardItem()));
	public static final DeferredItem<Item> CRIMSON_COAL_DUST = ITEMS.register("crimson_coal_dust",
		() -> new Item(standardItem()));

	public static final DeferredItem<Item> ANDESITE_CHUNK = ITEMS.register("andesite_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> ASURINE_CHUNK = ITEMS.register("asurine_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> BASALT_CHUNK = ITEMS.register("basalt_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> BLACKSTONE_CHUNK = ITEMS.register("blackstone_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> CALCITE_CHUNK = ITEMS.register("calcite_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> COBBLESTONE_CHUNK = ITEMS.register("cobblestone_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> CRIMSITE_CHUNK = ITEMS.register("crimsite_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> DEEPSLATE_CHUNK = ITEMS.register("deepslate_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> DIORITE_CHUNK = ITEMS.register("diorite_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> ENDSTONE_CHUNK = ITEMS.register("end_stone_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> GRANITE_CHUNK = ITEMS.register("granite_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> HOT_CHUNK = ITEMS.register("hot_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> LIMESTONE_CHUNK = ITEMS.register("limestone_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> NETHERRACK_CHUNK = ITEMS.register("netherrack_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> OCHRUM_CHUNK = ITEMS.register("ochrum_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> SCORCHIA_CHUNK = ITEMS.register("scorchia_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> SCORIA_CHUNK = ITEMS.register("scoria_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> SOUL_CHUNK = ITEMS.register("soul_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> TUFF_CHUNK = ITEMS.register("tuff_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> VERIDIUM_CHUNK = ITEMS.register("veridium_chunk", () -> new Item(standardItem()));
	public static final DeferredItem<Item> ERROR_CHUNK = ITEMS.register("error_chunk",
		() -> new DescItem(false, standardItem()));

	public static final DeferredItem<Item> TEMPLATE_UPGRADE = ITEMS.register("template_upgrade",
		() -> new DescItem(false, standardItem()));
	public static final DeferredItem<Item> AD_TEMPLATE_UPGRADE = ITEMS.register("advanced_template_upgrade",
		() -> new DescItem(false, standardItem()));
	public static final DeferredItem<Item> ELECTRUM_UPGRADE = ITEMS.register("electrum_upgrade",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> BABULYMN_UPGRADE = ITEMS.register("babulymn_upgrade",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> FOXITE_UPGRADE = ITEMS.register("foxite_upgrade",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> IRON_UPGRADE = ITEMS.register("iron_upgrade",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> STEEL_UPGRADE = ITEMS.register("steel_upgrade",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> MITHRIL_UPGRADE = ITEMS.register("mithril_upgrade",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> LYCALITE_UPGRADE = ITEMS.register("lycalite_upgrade",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> TUNGSTEN_UPGRADE = ITEMS.register("tungsten_upgrade",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> LAGOMITE_UPGRADE = ITEMS.register("lagomite_upgrade",
		() -> new Item(standardItem().fireResistant()));

	public static final DeferredItem<Item> LEADED_QUARTZ = ITEMS.register("leaded_quartz",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> NUGGET_HUNK = ITEMS.register("nugget_hunk",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> NUGGET_CONGLOMERATE = ITEMS.register("nugget_conglomerate",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> OBERITE_HANDLE = ITEMS.register("oberite_handle",
		() -> new Item(standardItem().fireResistant()));
	public static final DeferredItem<Item> FOXITE_HANDLE = ITEMS.register("foxite_handle",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> PENCIL = ITEMS.register("lead_pencil",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> STIFFENED_LEAD = ITEMS.register("stiffened_lead",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> FUNKY_THING = ITEMS.register("funky_thingamabob",
		() -> new DescItem(false, standardItem()));
	public static final DeferredItem<Item> ABNORMAL_THING = ITEMS.register("abnormal_object",
		() -> new DescItem(false, standardItem()));

// Various Foods
	public static final DeferredItem<Item> OREBERRIES_ITEM = ITEMS.register("oreberries",
		() -> new DescItemNameBlockItem(true, BlockInit.OREBERRY_BUSH_BLOCK.get(), new Item.Properties().food(FoodItemProperties.OREBERRY)));
	public static final DeferredItem<Item> MOSSY_MUSH = ITEMS.register("mossy_mush", //smushed moss
		() -> new DescItem(false, standardItem().food(FoodItemProperties.WEAK_BASIC)));
	public static final DeferredItem<Item> SMUSHROOM = ITEMS.register("smushroom", //smushed mushrooms
		() -> new Item(standardItem().food(FoodItemProperties.WEAK_BASIC)));
	public static final DeferredItem<Item> LICHUORICE = ITEMS.register("lichuorice", //glow lichen liquorice
		() -> new DescItem(false, standardItem().food(FoodItemProperties.WEAK_BASIC)));
	public static final DeferredItem<Item> RED_LICHUORICE = ITEMS.register("red_lichuorice",
		() -> new DescItem(false, standardItem().food(FoodItemProperties.WEAK_BASIC)));
	public static final DeferredItem<Item> BLACK_LICHUORICE = ITEMS.register("black_lichuorice",
		() -> new DescItem(false, standardItem().food(FoodItemProperties.WEAK_BASIC)));

	public static final DeferredItem<Item> UNKNOWN_RAW_MEAT = ITEMS.register("unknown_raw_meat",
		() -> new DescItem(false, standardItem().food(FoodItemProperties.RAW_MEAT)));
	public static final DeferredItem<Item> UNKNOWN_CORRUPT_MEAT = ITEMS.register("unknown_corrupt_meat",
		() -> new DescItem(false, standardItem().food(FoodItemProperties.RAW_MEAT)));
	public static final DeferredItem<Item> UNKNOWN_MEAT = ITEMS.register("unknown_cooked_meat",
		() -> new DescItem(false, standardItem().food(FoodItemProperties.COOKED_MEAT)));

	public static final DeferredItem<Item> SEARED_QUINGUM = ITEMS.register("seared_quingum",
		() -> new DescItem(true, standardItem().food(FoodItemProperties.SEARED_QUINGUM)));
	public static final DeferredItem<Item> CHOCOLATE_GLAZED_QUINGUM = ITEMS.register("chocolate_glazed_quingum",
		() -> new DescItem(true, standardItem().food(FoodItemProperties.CHOCOLATE_GLAZED_QUINGUM)));
	public static final DeferredItem<Item> CHOCOLATE_GLAZED_OREBERRIES = ITEMS.register("chocolate_glazed_oreberries",
		() -> new DescItem(true, standardItem().food(FoodItemProperties.CHOCOLATE_GLAZED_OREBERRIES)));

	public static final DeferredItem<Item> QUINGUM_MIXTURE = ITEMS.register("quingum_mixture",
		() -> new QuingumBottleItem(true, quingumBottleItem().food(FoodItemProperties.PLAIN_MIXTURE)));
	public static final DeferredItem<Item> OREBERRY_MIXTURE = ITEMS.register("oreberry_quingum_mixture",
		() -> new OreberryQuingumBottleItem(true, standardItem().food(FoodItemProperties.OREBERRY_MIXTURE)));
	public static final DeferredItem<Item> FRUIT_MIXTURE = ITEMS.register("fruit_quingum_mixture",
		() -> new OreberryQuingumBottleItem(true, standardItem().food(FoodItemProperties.FRUIT_MIXTURE)));
	public static final DeferredItem<Item> GLOWBERRY_MIXTURE = ITEMS.register("glowberry_quingum_mixture",
		() -> new OreberryQuingumBottleItem(true, standardItem().food(FoodItemProperties.GLOW_MIXTURE)));
	public static final DeferredItem<Item> FUNKY_MIXTURE = ITEMS.register("funky_quingum_mixture",
		() -> new OreberryQuingumBottleItem(true, standardItem().food(FoodItemProperties.FUNKY_MIXTURE)));
	public static final DeferredItem<Item> CORRUPT_MIXTURE = ITEMS.register("corrupt_quingum_mixture",
		() -> new OreberryQuingumBottleItem(true, standardItem().food(FoodItemProperties.CORRUPT_MIXTURE)));

	public static final DeferredItem<Item> QUINGUMMIES = ITEMS.register("plain_quingummies",
		() -> new QuingummyItem(true, quingumBottleItem().food(FoodItemProperties.PLAIN_QUINGUMMIES)));
	public static final DeferredItem<Item> OREBERRY_QUINGUMMIES = ITEMS.register("oreberry_quingummies",
		() -> new QuingummyItem(true, quingumBottleItem().food(FoodItemProperties.OREBERRY_QUINGUMMIES)));
	public static final DeferredItem<Item> FRUIT_QUINGUMMIES = ITEMS.register("fruit_quingummies",
		() -> new QuingummyItem(true, quingumBottleItem().food(FoodItemProperties.FRUIT_QUINGUMMIES)));
	public static final DeferredItem<Item> GLOWBERRY_QUINGUMMIES = ITEMS.register("glow_quingummies",
		() -> new QuingummyItem(true, quingumBottleItem().food(FoodItemProperties.GLOW_QUINGUMMIES)));
	public static final DeferredItem<Item> FUNKY_QUINGUMMIES = ITEMS.register("funky_quingummies",
		() -> new QuingummyItem(true, quingumBottleItem().food(FoodItemProperties.FUNKY_QUINGUMMIES)));
	public static final DeferredItem<Item> CORRUPT_QUINGUMMIES = ITEMS.register("corrupt_quingummies",
		() -> new QuingummyItem(true, quingumBottleItem().food(FoodItemProperties.CORRUPT_QUINGUMMIES)));
	public static final DeferredItem<Item> FLESHY_QUINGUMMIES = ITEMS.register("fleshy_quingummies",
		() -> new QuingummyItem(true, quingumBottleItem().food(FoodItemProperties.FLESH_QUINGUMMIES)));
	public static final DeferredItem<Item> GUMMY_MOLD = ITEMS.register("quingum_mold", () -> new Item(standardItem()));

// Unprocessed
	public static final DeferredItem<Item> UNPROCESSED_BABULYMN_PLATE = ITEMS.register("unprocessed_babulymn_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> UNPROCESSED_LYCALITE_PLATE = ITEMS.register("unprocessed_lycalite_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> UNPROCESSED_LAGOMITE_PLATE = ITEMS.register("unprocessed_lagomite_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> UNPROCESSED_NETHERITE_PLATE = ITEMS.register("unprocessed_netherite_sheet",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> UNPROCESSED_THING = ITEMS.register("unprocessed_thing",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> UNPROCESSED_OBJECT = ITEMS.register("unprocessed_object",
		() -> new Item(standardItem()));
	public static final DeferredItem<Item> GROWING_EMERALD = ITEMS.register("growing_emerald",
		() -> new Item(standardItem()));


	public static final DeferredItem<Item> ELECTRUM_PICKAXE = ITEMS.register("electrum_pickaxe",
		() -> new PickaxeItem(SophieToolTier.ELECTRUM, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.ELECTRUM, 1F, -3.0F))));
	public static final DeferredItem<Item> ELECTRUM_AXE = ITEMS.register("electrum_axe",
		() -> new AxeItem(SophieToolTier.ELECTRUM, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.ELECTRUM, 6F, -3.1F))));
	public static final DeferredItem<Item> ELECTRUM_SHOVEL = ITEMS.register("electrum_shovel",
		() -> new ShovelItem(SophieToolTier.ELECTRUM, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.ELECTRUM, 1.5F, -3.0F))));
	public static final DeferredItem<Item> ELECTRUM_SWORD = ITEMS.register("electrum_sword",
		() -> new SwordItem(SophieToolTier.ELECTRUM, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.ELECTRUM, 3.0F, -2.4F))));
	public static final DeferredItem<Item> ELECTRUM_HOE = ITEMS.register("electrum_hoe",
		() -> new HoeItem(SophieToolTier.ELECTRUM, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.ELECTRUM, -2.0F, -1.0F))));
	public static final DeferredItem<Item> ELECTRUM_HELMET = ITEMS.register("electrum_helmet",
		() -> new ArmorItem(SophieArmourMaterials.ELECTRUM, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(8))));
	public static final DeferredItem<Item> ELECTRUM_CHESTPLATE = ITEMS.register("electrum_chestplate",
		() -> new ArmorItem(SophieArmourMaterials.ELECTRUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(8))));
	public static final DeferredItem<Item> ELECTRUM_LEGGINGS = ITEMS.register("electrum_leggings",
		() -> new ArmorItem(SophieArmourMaterials.ELECTRUM, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(8))));
	public static final DeferredItem<Item> ELECTRUM_BOOTS = ITEMS.register("electrum_boots",
		() -> new ArmorItem(SophieArmourMaterials.ELECTRUM, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(8))));

	public static final DeferredItem<Item> FOXITE_PICKAXE = ITEMS.register("foxite_pickaxe",
		() -> new PickaxeItem(SophieToolTier.FOXITE, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.FOXITE, 1F, -3.0F))));
	public static final DeferredItem<Item> FOXITE_AXE = ITEMS.register("foxite_axe",
		() -> new AxeItem(SophieToolTier.FOXITE, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.FOXITE, 6F, -3.1F))));
	public static final DeferredItem<Item> FOXITE_SHOVEL = ITEMS.register("foxite_shovel",
		() -> new ShovelItem(SophieToolTier.FOXITE, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.FOXITE, 1.5F, -3.0F))));
	public static final DeferredItem<Item> FOXITE_SWORD = ITEMS.register("foxite_sword",
		() -> new SwordItem(SophieToolTier.FOXITE, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.FOXITE, 3.0F, -2.4F))));
	public static final DeferredItem<Item> FOXITE_HOE = ITEMS.register("foxite_hoe",
		() -> new HoeItem(SophieToolTier.FOXITE, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.FOXITE, -2.0F, -1.0F))));
	public static final DeferredItem<Item> FOXITE_HELMET = ITEMS.register("foxite_helmet",
		() -> new ArmorItem(SophieArmourMaterials.FOXITE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(16))));
	public static final DeferredItem<Item> FOXITE_CHESTPLATE = ITEMS.register("foxite_chestplate",
		() -> new ArmorItem(SophieArmourMaterials.FOXITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(16))));
	public static final DeferredItem<Item> FOXITE_LEGGINGS = ITEMS.register("foxite_leggings",
		() -> new ArmorItem(SophieArmourMaterials.FOXITE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(16))));
	public static final DeferredItem<Item> FOXITE_BOOTS = ITEMS.register("foxite_boots",
		() -> new ArmorItem(SophieArmourMaterials.FOXITE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(16))));

	public static final DeferredItem<Item> LAGOMITE_PICKAXE = ITEMS.register("lagomite_pickaxe",
		() -> new PickaxeItem(SophieToolTier.LAGOMITE, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.LAGOMITE, 1F, -3.0F))));
	public static final DeferredItem<Item> LAGOMITE_AXE = ITEMS.register("lagomite_axe",
		() -> new AxeItem(SophieToolTier.LAGOMITE, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.LAGOMITE, 6F, -3.1F))));
	public static final DeferredItem<Item> LAGOMITE_SHOVEL = ITEMS.register("lagomite_shovel",
		() -> new ShovelItem(SophieToolTier.LAGOMITE, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.LAGOMITE, 1.5F, -3.0F))));
	public static final DeferredItem<Item> LAGOMITE_HELMET = ITEMS.register("lagomite_helmet",
		() -> new ArmorItem(SophieArmourMaterials.LAGOMITE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35))));
	public static final DeferredItem<Item> LAGOMITE_CHESTPLATE = ITEMS.register("lagomite_chestplate",
		() -> new ArmorItem(SophieArmourMaterials.LAGOMITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));
	public static final DeferredItem<Item> LAGOMITE_LEGGINGS = ITEMS.register("lagomite_leggings",
		() -> new ArmorItem(SophieArmourMaterials.LAGOMITE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35))));
	public static final DeferredItem<Item> LAGOMITE_BOOTS = ITEMS.register("lagomite_boots",
		() -> new ArmorItem(SophieArmourMaterials.LAGOMITE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35))));

	public static final DeferredItem<Item> LEAD_PICKAXE = ITEMS.register("lead_pickaxe",
		() -> new PickaxeItem(SophieToolTier.LEAD, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.LEAD, 1F, -3.0F))));
	public static final DeferredItem<Item> LEAD_AXE = ITEMS.register("lead_axe",
		() -> new AxeItem(SophieToolTier.LEAD, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.LEAD, 6F, -3.1F))));
	public static final DeferredItem<Item> LEAD_SHOVEL = ITEMS.register("lead_shovel",
		() -> new ShovelItem(SophieToolTier.LEAD, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.LEAD, 1.5F, -3.0F))));
	public static final DeferredItem<Item> LEAD_SHEARS = ITEMS.register("lead_shears",
		() -> new ShearsItem(new Item.Properties().durability(197).component(DataComponents.TOOL, ShearsItem.createToolProperties())));

	public static final DeferredItem<Item> LYCALITE_PICKAXE = ITEMS.register("lycalite_pickaxe",
		() -> new PickaxeItem(SophieToolTier.LYCALITE, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.LYCALITE, 1F, -3.0F))));
	public static final DeferredItem<Item> LYCALITE_AXE = ITEMS.register("lycalite_axe",
		() -> new AxeItem(SophieToolTier.LYCALITE, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.LYCALITE, 6F, -3.1F))));
	public static final DeferredItem<Item> LYCALITE_SHOVEL = ITEMS.register("lycalite_shovel",
		() -> new ShovelItem(SophieToolTier.LYCALITE, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.LYCALITE, 1.5F, -3.0F))));
	public static final DeferredItem<Item> LYCALITE_SWORD = ITEMS.register("lycalite_sword",
		() -> new SwordItem(SophieToolTier.LYCALITE, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.LYCALITE, 3.0F, -2.4F))));
	public static final DeferredItem<Item> LYCALITE_HOE = ITEMS.register("lycalite_hoe",
		() -> new HoeItem(SophieToolTier.LYCALITE, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.LYCALITE, -2.0F, -1.0F))));
	public static final DeferredItem<Item> LYCALITE_HELMET = ITEMS.register("lycalite_helmet",
		() -> new ArmorItem(SophieArmourMaterials.LYCALITE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(26))));
	public static final DeferredItem<Item> LYCALITE_CHESTPLATE = ITEMS.register("lycalite_chestplate",
		() -> new ArmorItem(SophieArmourMaterials.LYCALITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(26))));
	public static final DeferredItem<Item> LYCALITE_LEGGINGS = ITEMS.register("lycalite_leggings",
		() -> new ArmorItem(SophieArmourMaterials.LYCALITE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(26))));
	public static final DeferredItem<Item> LYCALITE_BOOTS = ITEMS.register("lycalite_boots",
		() -> new ArmorItem(SophieArmourMaterials.LYCALITE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(26))));

	public static final DeferredItem<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
		() -> new PickaxeItem(SophieToolTier.MITHRIL, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.MITHRIL, 1F, -3.0F))));
	public static final DeferredItem<Item> MITHRIL_AXE = ITEMS.register("mithril_axe",
		() -> new AxeItem(SophieToolTier.MITHRIL, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.MITHRIL, 6F, -3.1F))));
	public static final DeferredItem<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe",
		() -> new HoeItem(SophieToolTier.MITHRIL, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.MITHRIL, -2.0F, -1.0F))));
	public static final DeferredItem<Item> MITHRIL_HELMET = ITEMS.register("mithril_helmet",
		() -> new ArmorItem(SophieArmourMaterials.MITHRIL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(30))));
	public static final DeferredItem<Item> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate",
		() -> new ArmorItem(SophieArmourMaterials.MITHRIL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(30))));
	public static final DeferredItem<Item> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",
		() -> new ArmorItem(SophieArmourMaterials.MITHRIL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(30))));
	public static final DeferredItem<Item> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
		() -> new ArmorItem(SophieArmourMaterials.MITHRIL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(30))));

	public static final DeferredItem<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
		() -> new PickaxeItem(SophieToolTier.STEEL, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.STEEL, 1F, -3.0F))));
	public static final DeferredItem<Item> STEEL_AXE = ITEMS.register("steel_axe",
		() -> new AxeItem(SophieToolTier.STEEL, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.STEEL, 6F, -3.1F))));
	public static final DeferredItem<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
		() -> new ShovelItem(SophieToolTier.STEEL, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.STEEL, 1.5F, -3.0F))));
	public static final DeferredItem<Item> STEEL_SWORD = ITEMS.register("steel_sword",
		() -> new SwordItem(SophieToolTier.STEEL, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.STEEL, 3.0F, -2.4F))));
	public static final DeferredItem<Item> STEEL_HOE = ITEMS.register("steel_hoe",
		() -> new HoeItem(SophieToolTier.STEEL, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.STEEL, -2.0F, -1.0F))));
	public static final DeferredItem<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
		() -> new ArmorItem(SophieArmourMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(26))));
	public static final DeferredItem<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
		() -> new ArmorItem(SophieArmourMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(26))));
	public static final DeferredItem<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
		() -> new ArmorItem(SophieArmourMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(26))));
	public static final DeferredItem<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
		() -> new ArmorItem(SophieArmourMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(26))));

	public static final DeferredItem<Item> SILVER_AXE = ITEMS.register("silver_axe",
		() -> new AxeItem(SophieToolTier.SILVER, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.SILVER, 6F, -3.1F))));
	public static final DeferredItem<Item> SILVER_SWORD = ITEMS.register("silver_sword",
		() -> new SwordItem(SophieToolTier.SILVER, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.SILVER, 3.0F, -2.4F))));
	public static final DeferredItem<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
		() -> new ArmorItem(SophieArmourMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(12))));
	public static final DeferredItem<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
		() -> new ArmorItem(SophieArmourMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(12))));
	public static final DeferredItem<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
		() -> new ArmorItem(SophieArmourMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(12))));
	public static final DeferredItem<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
		() -> new ArmorItem(SophieArmourMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(12))));

	public static final DeferredItem<Item> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe",
		() -> new PickaxeItem(SophieToolTier.TUNGSTEN, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.TUNGSTEN, 1F, -3.0F))));
	public static final DeferredItem<Item> TUNGSTEN_AXE = ITEMS.register("tungsten_axe",
		() -> new AxeItem(SophieToolTier.TUNGSTEN, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.TUNGSTEN, 6F, -3.1F))));
	public static final DeferredItem<Item> TUNGSTEN_SHOVEL = ITEMS.register("tungsten_shovel",
		() -> new ShovelItem(SophieToolTier.TUNGSTEN, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.TUNGSTEN, 1.5F, -3.0F))));
	public static final DeferredItem<Item> TUNGSTEN_HOE = ITEMS.register("tungsten_hoe",
		() -> new HoeItem(SophieToolTier.TUNGSTEN, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.TUNGSTEN, -2.0F, -1.0F))));
	public static final DeferredItem<Item> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet",
		() -> new ArmorItem(SophieArmourMaterials.TUNGSTEN, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(32))));
	public static final DeferredItem<Item> TUNGSTEN_CHESTPLATE = ITEMS.register("tungsten_chestplate",
		() -> new ArmorItem(SophieArmourMaterials.TUNGSTEN, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(32))));
	public static final DeferredItem<Item> TUNGSTEN_LEGGINGS = ITEMS.register("tungsten_leggings",
		() -> new ArmorItem(SophieArmourMaterials.TUNGSTEN, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(32))));
	public static final DeferredItem<Item> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots",
		() -> new ArmorItem(SophieArmourMaterials.TUNGSTEN, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(32))));

	public static final DeferredItem<Item> BABULYMN_SHOVEL = ITEMS.register("babulymn_shovel",
		() -> new ShovelItem(SophieToolTier.BABULYMN, new Item.Properties().attributes(ShovelItem.createAttributes(SophieToolTier.BABULYMN, 1.5F, -3.0F))));
	public static final DeferredItem<Item> BABULYMN_HELMET = ITEMS.register("babulymn_helmet",
		() -> new ArmorItem(SophieArmourMaterials.BABULYMN, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(16))));



	public static Item.Properties standardItem() {
		return new Item.Properties();
	}
	public static Item.Properties quingumBottleItem() {
		return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE);
	}

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
