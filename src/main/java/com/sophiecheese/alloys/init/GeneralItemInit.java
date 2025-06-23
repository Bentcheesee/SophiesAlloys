package com.sophiecheese.alloys.init;

import com.sophiecheese.alloys.item.CrimsonCoal;
import com.sophiecheese.alloys.item.FaunathystDustItem;
import com.sophiecheese.alloys.item.BasicDescItem;
import com.sophiecheese.alloys.item.consumables.FoodItemProperties;
import com.sophiecheese.alloys.item.consumables.OreberryQuingumBottle;
import com.sophiecheese.alloys.item.consumables.QuingumBottle;
import com.sophiecheese.alloys.setup.Registration;

import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GeneralItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			Registration.MOD_ID);

//Minecraft Materials
	public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> AMETHYST_DUST = ITEMS.register("amethyst_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> LAPIS_DUST = ITEMS.register("lapis_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> QUARTZ_DUST = ITEMS.register("quartz_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> TINY_DIAMOND_DUST = ITEMS.register("tiny_diamond_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust", 
			() -> new BasicDescItem(tabAttributeAlloy().craftRemainder(TINY_DIAMOND_DUST.get())));
	public static final RegistryObject<Item> EMERALD_DUST = ITEMS.register("emerald_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> NETHERITE_DUST = ITEMS.register("netherite_dust", 
			() -> new Item(tabAttributeAlloy()));

	public static final RegistryObject<Item> ENDSTONE_DUST = ITEMS.register("end_stone_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> FLINT_DUST = ITEMS.register("flint_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> LEADED_QUARTZ_DUST = ITEMS.register("leaded_quartz_dust", 
			() -> new Item(tabAttributeAlloy()));
	
	public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> EMERALD_SHARD = ITEMS.register("emerald_shard", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> LAPIS_SHARD = ITEMS.register("lapis_shard", 
			() -> new Item(tabAttributeAlloy()));
	
	
//Generic Metals 
	public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", 
			() -> new Item(tabAttributeAlloy()));
	
	public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> TUNGSTEN_DUST = ITEMS.register("tungsten_dust", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", 
			() -> new Item(tabAttributeAlloy().fireResistant()));

	public static final RegistryObject<Item> RAW_ELECTRUM = ITEMS.register("raw_electrum", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget", 
			() -> new Item(tabAttributeAlloy()));

	public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", 
			() -> new Item(tabAttributeAlloy()));

	public static final RegistryObject<Item> MITHRIL_DUST = ITEMS.register("mithril_dust", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("raw_mithril", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> REFINED_MITHRIL = ITEMS.register("mithril_ingot", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> MITHRIL_SCRAP = ITEMS.register("mithril_scrap", 
			() -> new BasicDescItem(tabAttributeAlloy().fireResistant()));

	public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", 
			() -> new Item(tabAttributeAlloy()));
	
	
//Sophie's Base Metals
	public static final RegistryObject<Item> RAW_FOXITE = ITEMS.register("raw_foxite", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> FOXITE_DUST = ITEMS.register("foxite_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> FOXITE_INGOT = ITEMS.register("foxite_ingot", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> FOXITE_NUGGET = ITEMS.register("foxite_nugget", 
			() -> new Item(tabAttributeAlloy()));
	
	public static final RegistryObject<Item> RAW_TRITONIUM = ITEMS.register("raw_tritonium", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> TRITONIUM_DUST = ITEMS.register("tritonium_dust", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> TRITONIUM_INGOT = ITEMS.register("tritonium_ingot", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> TRITONIUM_NUGGET = ITEMS.register("tritonium_nugget", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	
	public static final RegistryObject<Item> RAW_LAGOMITE = ITEMS.register("raw_lagomite", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> LAGOMITE_DUST = ITEMS.register("lagomite_dust", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> LAGOMITE_INGOT = ITEMS.register("lagomite_ingot", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> LAGOMITE_NUGGET = ITEMS.register("lagomite_nugget", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> LAGOMITE_SCRAP = ITEMS.register("lagomite_scrap", 
			() -> new Item(tabAttributeAlloy().fireResistant()));

//Sophie's Base Gems
	public static final RegistryObject<Item> FAUNATHYST_SHARD = ITEMS.register("faunathyst_shard", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> FAUNATHYST_GEM = ITEMS.register("faunathyst_gem", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> FAUNATHYST_DUST = ITEMS.register("faunathyst_dust", 
			() -> new FaunathystDustItem(tabAttributeAlloy()));
	public static final RegistryObject<Item> QUINGUM_SHARD = ITEMS.register("quingum_shard", 
			() -> new Item(tabAttributeAlloy().food(FoodItemProperties.QUINGUM_GEM)));
	public static final RegistryObject<Item> QUINGUM_GEM = ITEMS.register("quingum_gem", 
			() -> new Item(tabAttributeAlloy().food(FoodItemProperties.QUINGUM_GEM)));
	public static final RegistryObject<Item> QUINGUM_DUST = ITEMS.register("quingum_dust", 
			() -> new Item(tabAttributeAlloy()));

//Sophie's Alloy Metals	
	public static final RegistryObject<Item> OBERITE_INGOT = ITEMS.register("oberite_ingot", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> OBERITE_DUST = ITEMS.register("oberite_dust", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> OBERITE_NUGGET = ITEMS.register("oberite_nugget", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	
	public static final RegistryObject<Item> LYCALITE_INGOT = ITEMS.register("lycalite_ingot", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> LYCALITE_DUST = ITEMS.register("lycalite_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> LYCALITE_NUGGET = ITEMS.register("lycalite_nugget", 
			() -> new Item(tabAttributeAlloy()));
	
	public static final RegistryObject<Item> BABULYMN_INGOT = ITEMS.register("babulymn_ingot", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> BABULYMN_DUST = ITEMS.register("babulymn_dust", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> BABULYMN_NUGGET = ITEMS.register("babulymn_nugget", 
			() -> new Item(tabAttributeAlloy()));
	
//Sophie's Materials
	public static final RegistryObject<Item> SLATE_SHEET = ITEMS.register("slate_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ROUGH_LAPIS_PLATE = ITEMS.register("rough_lapis_sheet", 
			() -> new BasicDescItem(tabAttributeAlloy()));
	public static final RegistryObject<Item> LAPIS_PLATE = ITEMS.register("lapis_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ROUGH_IRON_PLATE = ITEMS.register("rough_iron_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ROUGH_SILVER_PLATE = ITEMS.register("rough_silver_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> SILVER_PLATE = ITEMS.register("silver_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ROUGH_ELECTRUM_PLATE = ITEMS.register("rough_electrum_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ELECTRUM_PLATE = ITEMS.register("electrum_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ROUGH_FOXITE_PLATE = ITEMS.register("rough_foxite_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> FOXITE_PLATE = ITEMS.register("foxite_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ROUGH_DIAMOND_PLATE = ITEMS.register("rough_diamond_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ROUGH_MITHRIL_PLATE = ITEMS.register("rough_mithril_sheet", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> MITHRIL_PLATE = ITEMS.register("mithril_sheet", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> ROUGH_TUNGSTEN_PLATE = ITEMS.register("rough_tungsten_sheet", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> TUNGSTEN_PLATE = ITEMS.register("tungsten_sheet", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> ROUGH_STEEL_PLATE = ITEMS.register("rough_steel_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register("steel_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ROUGH_LAGOMITE_PLATE = ITEMS.register("rough_lagomite_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> LAGOMITE_PLATE = ITEMS.register("lagomite_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ROUGH_OBERITE_PLATE = ITEMS.register("rough_oberite_sheet", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> OBERITE_PLATE = ITEMS.register("oberite_sheet", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> ROUGH_LYCALITE_PLATE = ITEMS.register("rough_lycalite_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> LYCALITE_PLATE = ITEMS.register("lycalite_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ROUGH_BABULYMN_PLATE = ITEMS.register("rough_babulymn_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> BABULYMN_PLATE = ITEMS.register("babulymn_sheet", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ROUGH_NETHERITE_PLATE = ITEMS.register("rough_netherite_sheet", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> NETHERITE_PLATE = ITEMS.register("netherite_sheet", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	
	public static final RegistryObject<Item> CRIMSON_COAL = ITEMS.register("crimson_coal", 
			() -> new CrimsonCoal(tabAttributeAlloy()));
	public static final RegistryObject<Item> CRIMSON_COAL_DUST = ITEMS.register("crimson_coal_dust", 
			() -> new CrimsonCoal(tabAttributeAlloy()));

	public static final RegistryObject<Item> PENCIL = ITEMS.register("lead_pencil", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> STIFFENED_LEAD = ITEMS.register("stiffened_lead", 
			() -> new Item(tabAttributeAlloy()));
	
	public static final RegistryObject<Item> ANDESITE_CHUNK = ITEMS.register("andesite_chunk", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> CALCITE_CHUNK = ITEMS.register("calcite_chunk", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> COBBLESTONE_CHUNK = ITEMS.register("cobblestone_chunk", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> DIORITE_CHUNK = ITEMS.register("diorite_chunk", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> GRANITE_CHUNK = ITEMS.register("granite_chunk", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> TUFF_CHUNK = ITEMS.register("tuff_chunk", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> DEEPSLATE_CHUNK = ITEMS.register("deepslate_chunk", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> NETHERRACK_CHUNK = ITEMS.register("netherrack_chunk", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> HOT_CHUNK = ITEMS.register("hot_chunk", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> BASALT_CHUNK = ITEMS.register("basalt_chunk", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> BLACKSTONE_CHUNK = ITEMS.register("blackstone_chunk", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> SOUL_CHUNK = ITEMS.register("soul_chunk", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ENDSTONE_CHUNK = ITEMS.register("end_stone_chunk", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> ERROR_CHUNK = ITEMS.register("error_chunk", 
			() -> new BasicDescItem(tabAttributeAlloy()));
	
	public static final RegistryObject<Item> OBERITE_HANDLE = ITEMS.register("oberite_handle", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> FOXITE_HANDLE = ITEMS.register("foxite_handle", 
			() -> new Item(tabAttributeAlloy()));

	public static final RegistryObject<Item> TEMPLATE_UPGRADE = ITEMS.register("template_upgrade", 
			() -> new BasicDescItem(tabAttributeAlloy()));
	public static final RegistryObject<Item> AD_TEMPLATE_UPGRADE = ITEMS.register("advanced_template_upgrade", 
			() -> new BasicDescItem(tabAttributeAlloy()));
	public static final RegistryObject<Item> ELECTRUM_UPGRADE = ITEMS.register("electrum_upgrade", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> BABULYMN_UPGRADE = ITEMS.register("babulymn_upgrade", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> FOXITE_UPGRADE = ITEMS.register("foxite_upgrade", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> IRON_UPGRADE = ITEMS.register("iron_upgrade", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> STEEL_UPGRADE = ITEMS.register("steel_upgrade", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> MITHRIL_UPGRADE = ITEMS.register("mithril_upgrade", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> LYCALITE_UPGRADE = ITEMS.register("lycalite_upgrade", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> NETHERITE_UPGRADE = ITEMS.register("netherite_upgrade", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> TUNGSTEN_UPGRADE = ITEMS.register("tungsten_upgrade", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<Item> LAGOMITE_UPGRADE = ITEMS.register("lagomite_upgrade", 
			() -> new Item(tabAttributeAlloy().fireResistant()));
	
	public static final RegistryObject<Item> LEADED_QUARTZ = ITEMS.register("leaded_quartz", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> NUGGET_HUNK = ITEMS.register("nugget_hunk", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> NUGGET_CONGLOMERATE = ITEMS.register("nugget_conglomerate", 
			() -> new Item(tabAttributeAlloy()));
	public static final RegistryObject<Item> FUNKY_THING = ITEMS.register("funky_thingamabob", 
			() -> new BasicDescItem(tabAttributeAlloy()));
	public static final RegistryObject<Item> ABNORMAL_THING = ITEMS.register("abnormal_object", 
			() -> new BasicDescItem(tabAttributeAlloy()));

	public static final RegistryObject<Item> MOSSY_MUSH = ITEMS.register("mossy_mush", //smushed moss
			() -> new BasicDescItem(tabAttributeFood().food(FoodItemProperties.WEAK_BASIC)));
	public static final RegistryObject<Item> SMUSHROOM = ITEMS.register("smushroom", //smushed mushrooms
			() -> new Item(tabAttributeFood().food(FoodItemProperties.WEAK_BASIC)));
	public static final RegistryObject<Item> LICHUORICE = ITEMS.register("lichuorice", //glow lichen liquorice  
			() -> new BasicDescItem(tabAttributeFood().food(FoodItemProperties.WEAK_BASIC)));
	public static final RegistryObject<Item> RED_LICHUORICE = ITEMS.register("red_lichuorice", 
			() -> new BasicDescItem(tabAttributeFood().food(FoodItemProperties.WEAK_BASIC)));
	public static final RegistryObject<Item> BLACK_LICHUORICE = ITEMS.register("black_lichuorice", 
			() -> new BasicDescItem(tabAttributeFood().food(FoodItemProperties.WEAK_BASIC)));

	public static final RegistryObject<BowlFoodItem> FROGGY_APPLE_CRUMPLE_THUMPKIN = ITEMS.register("froggy_apple_crumple_thumpkin",  
			() -> new BowlFoodItem(tabAttributeFood().food(FoodItemProperties.STRONG_BASIC)));
	public static final RegistryObject<Item> UNKNOWN_RAW_MEAT = ITEMS.register("unknown_raw_meat", 
			() -> new BasicDescItem(tabAttributeFood().food(FoodItemProperties.RAW_MEAT)));
	public static final RegistryObject<Item> UNKNOWN_CORRUPT_MEAT = ITEMS.register("unknown_corrupt_meat", 
			() -> new BasicDescItem(tabAttributeFood().food(FoodItemProperties.RAW_MEAT)));
	public static final RegistryObject<Item> UNKNOWN_MEAT = ITEMS.register("unknown_cooked_meat", 
			() -> new BasicDescItem(tabAttributeFood().food(FoodItemProperties.COOKED_MEAT)));
	
	
	public static final RegistryObject<Item> SEARED_QUINGUM = ITEMS.register("seared_quingum", 
			() -> new Item(tabAttributeFood().food(FoodItemProperties.SEARED_QUINGUM)));

	public static final RegistryObject<Item> QUINGUM_MIXTURE = ITEMS.register("quingum_mixture", 
			() -> new QuingumBottle(tabAttributeFood().craftRemainder(Items.GLASS_BOTTLE)
					.craftRemainder(Items.GLASS_BOTTLE)
					.food(FoodItemProperties.PLAIN_MIXTURE).stacksTo(16)));
	public static final RegistryObject<Item> QUINGUMMIES = ITEMS.register("plain_quingummies", 
			() -> new Item(tabAttributeFood().food(FoodItemProperties.PLAIN_QUINGUMMIES)));
	
	public static final RegistryObject<Item> FRUIT_MIXTURE = ITEMS.register("quingum_mixture_fruit", 
			() -> new QuingumBottle(tabAttributeFood().craftRemainder(Items.GLASS_BOTTLE)
					.craftRemainder(Items.GLASS_BOTTLE)
					.food(FoodItemProperties.FRUIT_MIXTURE).stacksTo(16)));
	public static final RegistryObject<Item> FRUIT_QUINGUMMIES = ITEMS.register("fruit_quingummies", 
			() -> new Item(tabAttributeFood().food(FoodItemProperties.FRUIT_QUINGUMMIES)));
	
	public static final RegistryObject<Item> OREBERRY_MIXTURE = ITEMS.register("quingum_mixture_oreberry", 
			() -> new OreberryQuingumBottle(tabAttributeFood().craftRemainder(Items.GLASS_BOTTLE)
					.craftRemainder(Items.GLASS_BOTTLE)
					.food(FoodItemProperties.OREBERRY_MIXTURE).stacksTo(16)));
	public static final RegistryObject<Item> OREBERRY_QUINGUMMIES = ITEMS.register("oreberry_quingummies", 
			() -> new Item(tabAttributeFood().food(FoodItemProperties.OREBERRY_QUINGUMMIES)));
	
	public static final RegistryObject<Item> GLOWY_MIXTURE = ITEMS.register("quingum_mixture_glowy", 
			() -> new QuingumBottle(tabAttributeFood().craftRemainder(Items.GLASS_BOTTLE)
					.craftRemainder(Items.GLASS_BOTTLE)
					.food(FoodItemProperties.GLOW_MIXTURE).stacksTo(16)));
	public static final RegistryObject<Item> GLOWBERRY_QUINGUMMIES = ITEMS.register("glow_quingummies", 
			() -> new Item(tabAttributeFood().food(FoodItemProperties.GLOW_QUINGUMMIES)));
	
	public static final RegistryObject<Item> FUNKY_MIXTURE = ITEMS.register("quingum_mixture_funky", 
			() -> new QuingumBottle(tabAttributeFood().craftRemainder(Items.GLASS_BOTTLE)
					.craftRemainder(Items.GLASS_BOTTLE)
					.food(FoodItemProperties.FUNKY_MIXTURE).stacksTo(16)));
	public static final RegistryObject<Item> FUNKY_QUINGUMMIES = ITEMS.register("funky_quingummies", 
			() -> new BasicDescItem(tabAttributeFood().food(FoodItemProperties.FUNKY_QUINGUMMIES)));
	
	public static final RegistryObject<Item> CORRUPT_MIXTURE = ITEMS.register("quingum_mixture_corrupt", 
			() -> new QuingumBottle(tabAttributeFood().craftRemainder(Items.GLASS_BOTTLE)
					.craftRemainder(Items.GLASS_BOTTLE)
					.food(FoodItemProperties.CORRUPT_MIXTURE).stacksTo(16)));
	public static final RegistryObject<Item> CORRUPT_QUINGUMMIES = ITEMS.register("corrupt_quingummies", 
			() -> new Item(tabAttributeFood().food(FoodItemProperties.CORRUPT_QUINGUMMIES)));
	public static final RegistryObject<Item> FLESHY_QUINGUMMIES = ITEMS.register("fleshy_quingummies", 
			() -> new Item(tabAttributeFood().food(FoodItemProperties.FLESH_QUINGUMMIES)));
	
	public static final RegistryObject<Item> GUMMY_MOLD = ITEMS.register("quingum_mold", 
			() -> new Item(tabAttributeFood().stacksTo(16)));
	

	
	public static final CreativeModeTab SOPH_ALLOY = new CreativeModeTab("sophies_alloys") {
		public ItemStack makeIcon() {
			return new ItemStack(GeneralItemInit.FOXITE_INGOT.get());
		}
	};
	public static final CreativeModeTab SOPH_FOOD = new CreativeModeTab("sophies_food") {
		public ItemStack makeIcon() {
			return new ItemStack(OtherBlocksInit.OREBERRY_BUSH_BLOCK.get());
		}
	};
	public static final Item.Properties tabAttributeAlloy() {
		return new Item.Properties().tab(SOPH_ALLOY);
	}
	public static final Item.Properties tabAttributeFood() {
		return new Item.Properties().tab(SOPH_FOOD);
	}
}
