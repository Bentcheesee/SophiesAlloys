package com.sophiecheese.alloys.setup;

import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.init.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Registration {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SophiesAlloys.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SOPH_ALLOY = CREATIVE_MODE_TAB.register("sophies_alloys",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.FOXITE_INGOT.get()))
                    .title(Component.translatable("creativetab.sophies_alloys.alloys"))
                    .displayItems((itemDisplayParameters, output) -> {
						output.accept(ItemInit.BABULYMN_NUGGET);
						output.accept(ItemInit.ELECTRUM_NUGGET);
						output.accept(ItemInit.FOXITE_NUGGET);
						output.accept(ItemInit.LAGOMITE_NUGGET);
						output.accept(ItemInit.LEAD_NUGGET);
						output.accept(ItemInit.LYCALITE_NUGGET);
						output.accept(ItemInit.MITHRIL_NUGGET);
						output.accept(ItemInit.NETHERITE_NUGGET);
						output.accept(ItemInit.OBERITE_NUGGET);
						output.accept(ItemInit.SILVER_NUGGET);
						output.accept(ItemInit.STEEL_NUGGET);
						output.accept(ItemInit.TUNGSTEN_NUGGET);
						output.accept(ItemInit.TRITONIUM_NUGGET);

						output.accept(ItemInit.RAW_ELECTRUM);
						output.accept(ItemInit.RAW_FOXITE);
						output.accept(ItemInit.RAW_LAGOMITE);
						output.accept(ItemInit.RAW_LEAD);
						output.accept(ItemInit.RAW_MITHRIL);
						output.accept(ItemInit.RAW_SILVER);
						output.accept(ItemInit.RAW_TUNGSTEN);
						output.accept(ItemInit.RAW_TRITONIUM);

						output.accept(ItemInit.CRUSHED_ENDSTONE);
						output.accept(ItemInit.CRUSHED_ELECTRUM);
						output.accept(ItemInit.CRUSHED_FOXITE);
						output.accept(ItemInit.CRUSHED_LAGOMITE);
						output.accept(ItemInit.CRUSHED_MITHRIL);
						output.accept(ItemInit.CRUSHED_SILVER);
						output.accept(ItemInit.CRUSHED_TUNGSTEN);
						output.accept(ItemInit.CRUSHED_TRITONIUM);

						output.accept(ItemInit.LAGOMITE_SCRAP);
						output.accept(ItemInit.MITHRIL_SCRAP);
						output.accept(ItemInit.TRITONIUM_SCRAP);

						output.accept(ItemInit.BABULYMN_INGOT);
						output.accept(ItemInit.ELECTRUM_INGOT);
						output.accept(ItemInit.FOXITE_INGOT);
						output.accept(ItemInit.LAGOMITE_INGOT);
						output.accept(ItemInit.LEAD_INGOT);
						output.accept(ItemInit.LYCALITE_INGOT);
						output.accept(ItemInit.OBERITE_INGOT);
						output.accept(ItemInit.MITHRIL_INGOT);
						output.accept(ItemInit.SILVER_INGOT);
						output.accept(ItemInit.STEEL_INGOT);
						output.accept(ItemInit.TRITONIUM_INGOT);
						output.accept(ItemInit.TUNGSTEN_INGOT);

						output.accept(ItemInit.BABULYMN_PLATE);
						output.accept(ItemInit.ELECTRUM_PLATE);
						output.accept(ItemInit.ROUGH_DIAMOND_PLATE);
						output.accept(ItemInit.ROUGH_FOXITE_PLATE);
						output.accept(ItemInit.FOXITE_PLATE);
						output.accept(ItemInit.LAGOMITE_PLATE);
						output.accept(ItemInit.LAPIS_PLATE);
						output.accept(ItemInit.ROUGH_LAPIS_PLATE);
						output.accept(ItemInit.LYCALITE_PLATE);
						output.accept(ItemInit.ROUGH_MITHRIL_PLATE);
						output.accept(ItemInit.MITHRIL_PLATE);
						output.accept(ItemInit.NETHERITE_PLATE);
						output.accept(ItemInit.OBERITE_PLATE);
						output.accept(ItemInit.SILVER_PLATE);
						output.accept(ItemInit.SLATE_SHEET);
						output.accept(ItemInit.STEEL_PLATE);
						output.accept(ItemInit.TUNGSTEN_PLATE);

						output.accept(ItemInit.TEMPLATE_UPGRADE);
						output.accept(ItemInit.AD_TEMPLATE_UPGRADE);
						output.accept(ItemInit.ELECTRUM_UPGRADE);
						output.accept(ItemInit.BABULYMN_UPGRADE);
						output.accept(ItemInit.FOXITE_UPGRADE);
						output.accept(ItemInit.IRON_UPGRADE);
						output.accept(ItemInit.LAGOMITE_UPGRADE);
						output.accept(ItemInit.LYCALITE_UPGRADE);
						output.accept(ItemInit.MITHRIL_UPGRADE);
						output.accept(ItemInit.STEEL_UPGRADE);
						output.accept(ItemInit.TUNGSTEN_UPGRADE);

						output.accept(ItemInit.JADE_GEM);
						output.accept(ItemInit.QUINGUM_GEM);

						output.accept(ItemInit.DIAMOND_SHARD);
						output.accept(ItemInit.EMERALD_SHARD);
						output.accept(ItemInit.JADE_SHARD);
						output.accept(ItemInit.LAPIS_SHARD);
						output.accept(ItemInit.QUINGUM_SHARD);

						output.accept(ItemInit.AMETHYST_DUST);
						output.accept(ItemInit.BABULYMN_DUST);
						output.accept(ItemInit.BRASS_DUST);
						output.accept(ItemInit.COAL_DUST);
						output.accept(ItemInit.COPPER_DUST);
						output.accept(ItemInit.CRIMSON_COAL_DUST);
						output.accept(ItemInit.TINY_DIAMOND_DUST);
						output.accept(ItemInit.DIAMOND_DUST);
						output.accept(ItemInit.ELECTRUM_DUST);
						output.accept(ItemInit.EMERALD_DUST);
						output.accept(ItemInit.ENDSTONE_DUST);
						output.accept(ItemInit.FLINT_DUST);
						output.accept(ItemInit.FOXITE_DUST);
						output.accept(ItemInit.GOLD_DUST);
						output.accept(ItemInit.IRON_DUST);
						output.accept(ItemInit.JADE_DUST);
						output.accept(ItemInit.LAGOMITE_DUST);
						output.accept(ItemInit.LAPIS_DUST);
						output.accept(ItemInit.LEAD_DUST);
						output.accept(ItemInit.LEADED_QUARTZ_DUST);
						output.accept(ItemInit.LYCALITE_DUST);
						output.accept(ItemInit.MITHRIL_DUST);
						output.accept(ItemInit.NETHERITE_DUST);
						output.accept(ItemInit.OBERITE_DUST);
						output.accept(ItemInit.QUARTZ_DUST);
						output.accept(ItemInit.QUINGUM_DUST);
						output.accept(ItemInit.SILVER_DUST);
						output.accept(ItemInit.STEEL_DUST);
						output.accept(ItemInit.TRITONIUM_DUST);
						output.accept(ItemInit.TUNGSTEN_DUST);
						output.accept(ItemInit.ZINC_DUST);

						output.accept(ItemInit.CRIMSON_COAL);
						output.accept(ItemInit.LEADED_QUARTZ);
						output.accept(ItemInit.PENCIL);
						output.accept(ItemInit.STIFFENED_LEAD);
						output.accept(ItemInit.NUGGET_HUNK);
						output.accept(ItemInit.NUGGET_CONGLOMERATE);
						output.accept(ItemInit.FOXITE_HANDLE);
						output.accept(ItemInit.OBERITE_HANDLE);
						output.accept(ItemInit.FUNKY_THING);
						output.accept(ItemInit.ABNORMAL_THING);

						output.accept(ItemInit.ANDESITE_CHUNK);
						output.accept(ItemInit.ASURINE_CHUNK);
						output.accept(ItemInit.BASALT_CHUNK);
						output.accept(ItemInit.BLACKSTONE_CHUNK);
						output.accept(ItemInit.CALCITE_CHUNK);
						output.accept(ItemInit.COBBLESTONE_CHUNK);
						output.accept(ItemInit.CRIMSITE_CHUNK);
						output.accept(ItemInit.DEEPSLATE_CHUNK);
						output.accept(ItemInit.DIORITE_CHUNK);
						output.accept(ItemInit.ENDSTONE_CHUNK);
						output.accept(ItemInit.GRANITE_CHUNK);
						output.accept(ItemInit.HOT_CHUNK);
						output.accept(ItemInit.LIMESTONE_CHUNK);
						output.accept(ItemInit.NETHERRACK_CHUNK);
						output.accept(ItemInit.OCHRUM_CHUNK);
						output.accept(ItemInit.SCORCHIA_CHUNK);
						output.accept(ItemInit.SCORIA_CHUNK);
						output.accept(ItemInit.SOUL_CHUNK);
						output.accept(ItemInit.TUFF_CHUNK);
						output.accept(ItemInit.VERIDIUM_CHUNK);
						output.accept(ItemInit.ERROR_CHUNK);
						if (CompatCheck.quarkPresent) {
							output.accept(QuarkCompat.QUARKY_LIMESTONE_CHUNK);
							output.accept(QuarkCompat.JASPER_CHUNK);
							output.accept(QuarkCompat.FROSTY_CHUNK);
							output.accept(QuarkCompat.MYALITE_CHUNK);
							output.accept(QuarkCompat.SHALE_SHEET);
						}

						output.accept(ItemInit.UNPROCESSED_BABULYMN_PLATE);
						output.accept(ItemInit.UNPROCESSED_LYCALITE_PLATE);
						output.accept(ItemInit.UNPROCESSED_LAGOMITE_PLATE);
						output.accept(ItemInit.UNPROCESSED_NETHERITE_PLATE);
						output.accept(ItemInit.UNPROCESSED_THING);
						output.accept(ItemInit.UNPROCESSED_OBJECT);
						output.accept(ItemInit.GROWING_EMERALD);

						output.accept(BlockInit.FOXITE_ORE);
						output.accept(BlockInit.DEEPSLATE_FOXITE_ORE);
						output.accept(BlockInit.NETHER_FOXITE_ORE);
						output.accept(BlockInit.SOUL_FOXITE_ORE);
						output.accept(BlockInit.RAW_FOXITE_BLOCK);
						output.accept(BlockInit.FOXITE_BLOCK);

						output.accept(BlockInit.SILVER_ORE);
                        output.accept(BlockInit.DEEPSLATE_SILVER_ORE);
                        output.accept(BlockInit.RAW_SILVER_BLOCK);
                        output.accept(BlockInit.SILVER_BLOCK);

						output.accept(BlockInit.TUNGSTEN_ORE);
						output.accept(BlockInit.DEEPSLATE_TUNGSTEN_ORE);
						output.accept(BlockInit.END_TUNGSTEN_ORE);
						output.accept(BlockInit.RAW_TUNGSTEN_BLOCK);
						output.accept(BlockInit.TUNGSTEN_BLOCK);

						output.accept(BlockInit.TRITONIUM_ORE);
						output.accept(BlockInit.DEEPSLATE_TRITONIUM_ORE);
						output.accept(BlockInit.RAW_TRITONIUM_BLOCK);
						output.accept(BlockInit.TRITONIUM_BLOCK);

						output.accept(BlockInit.ELECTRUM_ORE);
						output.accept(BlockInit.DEEPSLATE_ELECTRUM_ORE);
						output.accept(BlockInit.RAW_ELECTRUM_BLOCK);
						output.accept(BlockInit.ELECTRUM_BLOCK);

						output.accept(BlockInit.LEAD_ORE);
						output.accept(BlockInit.DEEPSLATE_LEAD_ORE);
						output.accept(BlockInit.RAW_LEAD_BLOCK);
						output.accept(BlockInit.LEAD_BLOCK);

						output.accept(BlockInit.BASALT_MITHRIL_ORE);
						output.accept(BlockInit.BLACKSTONE_MITHRIL_ORE);
						output.accept(BlockInit.NETHER_MITHRIL_ORE);
						output.accept(BlockInit.SOUL_MITHRIL_ORE);
						output.accept(BlockInit.RAW_MITHRIL_BLOCK);
						output.accept(BlockInit.MITHRIL_BLOCK);
						output.accept(BlockInit.RICH_BASALT);

						output.accept(BlockInit.END_LAGOMITE_ORE);
						output.accept(BlockInit.OBSIDIAN_LAGOMITE_ORE);
						output.accept(BlockInit.RAW_LAGOMITE_BLOCK);
						output.accept(BlockInit.LAGOMITE_BLOCK);

						output.accept(BlockInit.JADE_ORE);
						output.accept(BlockInit.DEEPSLATE_JADE_ORE);
						output.accept(BlockInit.JADE_BLOCK);

						output.accept(BlockInit.QUINGUM_ORE);
						output.accept(BlockInit.DEEPSLATE_QUINGUM_ORE);
						output.accept(BlockInit.QUINGUM_BLOCK);

						output.accept(BlockInit.CRIMSON_COAL_ORE);
						output.accept(BlockInit.CRIMSON_COAL_BLOCK);


						output.accept(BlockInit.STEEL_BLOCK);
						output.accept(BlockInit.BABULYMN_BLOCK);
						output.accept(BlockInit.LYCALITE_BLOCK);
						output.accept(BlockInit.OBERITE_BLOCK);

						output.accept(BlockInit.DEEP_SAND);
						output.accept(BlockInit.DEEP_GRAVEL);
						output.accept(BlockInit.BLACK_SAND);
						output.accept(BlockInit.BLACK_GRAVEL);

						output.accept(ItemInit.ELECTRUM_PICKAXE);
						output.accept(ItemInit.ELECTRUM_AXE);
						output.accept(ItemInit.ELECTRUM_SHOVEL);
						output.accept(ItemInit.ELECTRUM_SWORD);
						output.accept(ItemInit.ELECTRUM_HOE);
						output.accept(ItemInit.ELECTRUM_HELMET);
						output.accept(ItemInit.ELECTRUM_CHESTPLATE);
						output.accept(ItemInit.ELECTRUM_LEGGINGS);
						output.accept(ItemInit.ELECTRUM_BOOTS);

						output.accept(ItemInit.FOXITE_PICKAXE);
						output.accept(ItemInit.FOXITE_AXE);
						output.accept(ItemInit.FOXITE_SHOVEL);
						output.accept(ItemInit.FOXITE_SWORD);
						output.accept(ItemInit.FOXITE_HOE);
						output.accept(ItemInit.FOXITE_HELMET);
						output.accept(ItemInit.FOXITE_CHESTPLATE);
						output.accept(ItemInit.FOXITE_LEGGINGS);
						output.accept(ItemInit.FOXITE_BOOTS);

						output.accept(ItemInit.LAGOMITE_PICKAXE);
						output.accept(ItemInit.LAGOMITE_AXE);
						output.accept(ItemInit.LAGOMITE_SHOVEL);
						output.accept(ItemInit.LAGOMITE_HELMET);
						output.accept(ItemInit.LAGOMITE_CHESTPLATE);
						output.accept(ItemInit.LAGOMITE_LEGGINGS);
						output.accept(ItemInit.LAGOMITE_BOOTS);

						output.accept(ItemInit.LEAD_PICKAXE);
						output.accept(ItemInit.LEAD_AXE);
						output.accept(ItemInit.LEAD_SHOVEL);
						output.accept(ItemInit.LEAD_SHEARS);

						output.accept(ItemInit.LYCALITE_PICKAXE);
						output.accept(ItemInit.LYCALITE_AXE);
						output.accept(ItemInit.LYCALITE_SHOVEL);
						output.accept(ItemInit.LYCALITE_SWORD);
						output.accept(ItemInit.LYCALITE_HOE);
						output.accept(ItemInit.LYCALITE_HELMET);
						output.accept(ItemInit.LYCALITE_CHESTPLATE);
						output.accept(ItemInit.LYCALITE_LEGGINGS);
						output.accept(ItemInit.LYCALITE_BOOTS);

						output.accept(ItemInit.MITHRIL_PICKAXE);
						output.accept(ItemInit.MITHRIL_AXE);
						output.accept(ItemInit.MITHRIL_HOE);
						output.accept(ItemInit.MITHRIL_HELMET);
						output.accept(ItemInit.MITHRIL_CHESTPLATE);
						output.accept(ItemInit.MITHRIL_LEGGINGS);
						output.accept(ItemInit.MITHRIL_BOOTS);

						output.accept(ItemInit.STEEL_PICKAXE);
						output.accept(ItemInit.STEEL_AXE);
						output.accept(ItemInit.STEEL_SHOVEL);
						output.accept(ItemInit.STEEL_SWORD);
						output.accept(ItemInit.STEEL_HOE);
						output.accept(ItemInit.STEEL_HELMET);
						output.accept(ItemInit.STEEL_CHESTPLATE);
						output.accept(ItemInit.STEEL_LEGGINGS);
						output.accept(ItemInit.STEEL_BOOTS);

						output.accept(ItemInit.SILVER_AXE);
						output.accept(ItemInit.SILVER_SWORD);
						output.accept(ItemInit.SILVER_HELMET);
						output.accept(ItemInit.SILVER_CHESTPLATE);
						output.accept(ItemInit.SILVER_LEGGINGS);
						output.accept(ItemInit.SILVER_BOOTS);

						output.accept(ItemInit.TUNGSTEN_PICKAXE);
						output.accept(ItemInit.TUNGSTEN_AXE);
						output.accept(ItemInit.TUNGSTEN_SHOVEL);
						output.accept(ItemInit.TUNGSTEN_HOE);
						output.accept(ItemInit.TUNGSTEN_HELMET);
						output.accept(ItemInit.TUNGSTEN_CHESTPLATE);
						output.accept(ItemInit.TUNGSTEN_LEGGINGS);
						output.accept(ItemInit.TUNGSTEN_BOOTS);

						output.accept(ItemInit.BABULYMN_SHOVEL);
						output.accept(ItemInit.BABULYMN_HELMET);

						output.accept(BlockInit.MEAT_ORE);
						output.accept(BlockInit.DEEPSLATE_MEAT_ORE);
						output.accept(BlockInit.NETHER_MEAT_ORE);
						output.accept(BlockInit.END_MEAT_ORE);
						output.accept(BlockInit.SOUL_MEAT_ORE);
						output.accept(BlockInit.MEAT_BLOCK);

                    }).build());


	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SOPH_PALETTES = CREATIVE_MODE_TAB.register("sophies_alloys_palettes",
		() -> CreativeModeTab.builder().icon(() -> new ItemStack(BlockInit.SLATE.get()))
			.title(Component.translatable("creativetab.sophies_alloys.alloys_palettes"))
			.displayItems((itemDisplayParameters, output) -> {
				output.accept(BlockInit.SOUL_STONE);
				output.accept(BlockInit.SOUL_STONE_SLAB);
				output.accept(BlockInit.SOUL_STONE_STAIRS);
				output.accept(BlockInit.SOUL_STONE_WALL);
				output.accept(BlockInit.SOUL_STONE_BRICKS);
				output.accept(BlockInit.SOUL_STONE_BRICK_SLAB);
				output.accept(BlockInit.SOUL_STONE_BRICK_STAIRS);
				output.accept(BlockInit.SOUL_STONE_BRICK_WALL);
				output.accept(BlockInit.SOUL_STONE_BRICK_CRACKED);
				output.accept(BlockInit.SOUL_STONE_TILES);
				output.accept(BlockInit.SOUL_STONE_TILES_SLAB);
				output.accept(BlockInit.SOUL_STONE_TILES_STAIRS);
				output.accept(BlockInit.SOUL_STONE_TILES_WALL);
				output.accept(BlockInit.SOUL_STONE_TILES_CRACKED);
				output.accept(BlockInit.SOUL_STONE_BUTTON);
				output.accept(BlockInit.SOUL_STONE_LEVER);

				output.accept(BlockInit.SOUL_COBBLESTONE);
				output.accept(BlockInit.SOUL_COBBLESTONE_SLAB);
				output.accept(BlockInit.SOUL_COBBLESTONE_STAIRS);
				output.accept(BlockInit.SOUL_COBBLESTONE_WALL);

				output.accept(BlockInit.COBBLED_BLACKSTONE);
				output.accept(BlockInit.COBBLED_BLACKSTONE_SLAB);
				output.accept(BlockInit.COBBLED_BLACKSTONE_STAIRS);
				output.accept(BlockInit.COBBLED_BLACKSTONE_WALL);
				output.accept(BlockInit.COBBLED_CALCITE);
				output.accept(BlockInit.COBBLED_CALCITE_SLAB);
				output.accept(BlockInit.COBBLED_CALCITE_STAIRS);
				output.accept(BlockInit.COBBLED_CALCITE_WALL);
				output.accept(BlockInit.COBBLED_GRANITE);
				output.accept(BlockInit.COBBLED_GRANITE_SLAB);
				output.accept(BlockInit.COBBLED_GRANITE_STAIRS);
				output.accept(BlockInit.COBBLED_GRANITE_WALL);
				output.accept(BlockInit.COBBLED_DIORITE);
				output.accept(BlockInit.COBBLED_DIORITE_SLAB);
				output.accept(BlockInit.COBBLED_DIORITE_STAIRS);
				output.accept(BlockInit.COBBLED_DIORITE_WALL);

				output.accept(BlockInit.SOUL_GRAVEL);

				output.accept(BlockInit.ROUGH_SLATE);
			//	output.accept(BlockInit.SUSPICIOUS_SLATE);
				output.accept(BlockInit.SLATE);
				output.accept(BlockInit.SLATE_SLAB);
				output.accept(BlockInit.SLATE_STAIRS);
				output.accept(BlockInit.SLATE_WALL);
				output.accept(BlockInit.SLATE_BRICKS);
				output.accept(BlockInit.SLATE_BRICK_SLAB);
				output.accept(BlockInit.SLATE_BRICK_STAIRS);
				output.accept(BlockInit.SLATE_BRICK_WALL);
				output.accept(BlockInit.SLATE_BRICKS_CRACKED);
				output.accept(BlockInit.SLATE_TILES);
				output.accept(BlockInit.SLATE_TILE_SLAB);
				output.accept(BlockInit.SLATE_TILE_STAIRS);
				output.accept(BlockInit.SLATE_TILE_WALL);
				output.accept(BlockInit.SLATE_TILES_CRACKED);
				output.accept(BlockInit.SLATE_PILLAR);

				output.accept(BlockInit.MOSSY_COBBLED_DEEPSLATE);
				output.accept(BlockInit.MOSSY_COBBLED_DEEPSLATE_STAIRS);
				output.accept(BlockInit.MOSSY_COBBLED_DEEPSLATE_SLAB);
				output.accept(BlockInit.MOSSY_COBBLED_DEEPSLATE_WALL);
				output.accept(BlockInit.MOSSY_DEEPSLATE_BRICKS);
				output.accept(BlockInit.MOSSY_DEEPSLATE_BRICK_STAIRS);
				output.accept(BlockInit.MOSSY_DEEPSLATE_BRICK_SLAB);
				output.accept(BlockInit.MOSSY_DEEPSLATE_BRICK_WALL);


				output.accept(BlockInit.FOXITE_CHAIN);
				output.accept(BlockInit.FOXITE_LANTERN);
				output.accept(BlockInit.FOXITE_SOUL_LANTERN);
				output.accept(BlockInit.GOLD_CHAIN);
				output.accept(BlockInit.GOLD_LANTERN);
				output.accept(BlockInit.GOLD_SOUL_LANTERN);
				output.accept(BlockInit.NETHERITE_CHAIN);
				output.accept(BlockInit.NETHERITE_LANTERN);
				output.accept(BlockInit.NETHERITE_SOUL_LANTERN);
				output.accept(BlockInit.SILVER_CHAIN);
				output.accept(BlockInit.SILVER_LANTERN);
				output.accept(BlockInit.SILVER_SOUL_LANTERN);
				output.accept(BlockInit.TRITONIUM_CHAIN);
				output.accept(BlockInit.TRITONIUM_LANTERN);
				output.accept(BlockInit.TRITONIUM_SOUL_LANTERN);
				output.accept(BlockInit.TUNGSTEN_LANTERN);
				output.accept(BlockInit.TUNGSTEN_SOUL_LANTERN);
				output.accept(BlockInit.TUNGSTEN_CHAIN);
				output.accept(BlockInit.TUNGSTEN_LANTERN);
				output.accept(BlockInit.TUNGSTEN_SOUL_LANTERN);


				output.accept(BlockInit.LEAD_BARS);
				output.accept(BlockInit.FOXITE_BARS);
				output.accept(BlockInit.SILVER_BARS);
				output.accept(BlockInit.TRITONIUM_BARS);


				output.accept(BlockInit.DUSTY_LAMP);
				output.accept(BlockInit.DUSTY_AMETHYST_LAMP);
				output.accept(BlockInit.DUSTY_COAL_LAMP);
				output.accept(BlockInit.DUSTY_COPPER_LAMP);
				output.accept(BlockInit.DUSTY_CRIMSON_LAMP);
				output.accept(BlockInit.DUSTY_DIAMOND_LAMP);
				output.accept(BlockInit.DUSTY_ELECTRUM_LAMP);
				output.accept(BlockInit.DUSTY_EMERALD_LAMP);
				output.accept(BlockInit.DUSTY_FOXITE_LAMP);
				output.accept(BlockInit.DUSTY_GOLD_LAMP);
				output.accept(BlockInit.DUSTY_IRON_LAMP);
				output.accept(BlockInit.DUSTY_JADE_LAMP);
				output.accept(BlockInit.DUSTY_LAPIS_LAMP);
				output.accept(BlockInit.DUSTY_LEADED_QUARTZ_LAMP);
				output.accept(BlockInit.DUSTY_LYCALITE_LAMP);
				output.accept(BlockInit.DUSTY_MITHRIL_LAMP);
				output.accept(BlockInit.DUSTY_NETHERITE_LAMP);
				output.accept(BlockInit.DUSTY_OBERITE_LAMP);
				output.accept(BlockInit.DUSTY_QUARTZ_LAMP);
				output.accept(BlockInit.DUSTY_SILVER_LAMP);
				output.accept(BlockInit.DUSTY_STEEL_LAMP);
				output.accept(BlockInit.DUSTY_TRITONIUM_LAMP);
				output.accept(BlockInit.DUSTY_TUNGSTEN_LAMP);
				output.accept(BlockInit.DUSTY_ZINC_LAMP);
				output.accept(BlockInit.DUSTY_BRASS_LAMP);

				output.accept(BlockInit.LEADED_QUARTZ_SAND);
				output.accept(BlockInit.LEADED_GLASS);
				output.accept(BlockInit.WHITE_LEADED_GLASS);
				output.accept(BlockInit.ORANGE_LEADED_GLASS);
				output.accept(BlockInit.MAGENTA_LEADED_GLASS);
				output.accept(BlockInit.LIGHT_BLUE_LEADED_GLASS);
				output.accept(BlockInit.YELLOW_LEADED_GLASS);
				output.accept(BlockInit.LIME_LEADED_GLASS);
				output.accept(BlockInit.PINK_LEADED_GLASS);
				output.accept(BlockInit.GRAY_LEADED_GLASS);
				output.accept(BlockInit.LIGHT_GRAY_LEADED_GLASS);
				output.accept(BlockInit.CYAN_LEADED_GLASS);
				output.accept(BlockInit.PURPLE_LEADED_GLASS);
				output.accept(BlockInit.BLUE_LEADED_GLASS);
				output.accept(BlockInit.BROWN_LEADED_GLASS);
				output.accept(BlockInit.GREEN_LEADED_GLASS);
				output.accept(BlockInit.RED_LEADED_GLASS);
				output.accept(BlockInit.BLACK_LEADED_GLASS);
				output.accept(BlockInit.LEADED_GLASS_PANE);
				output.accept(BlockInit.WHITE_LEADED_GLASS_PANE);
				output.accept(BlockInit.ORANGE_LEADED_GLASS_PANE);
				output.accept(BlockInit.MAGENTA_LEADED_GLASS_PANE);
				output.accept(BlockInit.LIGHT_BLUE_LEADED_GLASS_PANE);
				output.accept(BlockInit.YELLOW_LEADED_GLASS_PANE);
				output.accept(BlockInit.LIME_LEADED_GLASS_PANE);
				output.accept(BlockInit.PINK_LEADED_GLASS_PANE);
				output.accept(BlockInit.GRAY_LEADED_GLASS_PANE);
				output.accept(BlockInit.LIGHT_GRAY_LEADED_GLASS_PANE);
				output.accept(BlockInit.CYAN_LEADED_GLASS_PANE);
				output.accept(BlockInit.PURPLE_LEADED_GLASS_PANE);
				output.accept(BlockInit.BLUE_LEADED_GLASS_PANE);
				output.accept(BlockInit.BROWN_LEADED_GLASS_PANE);
				output.accept(BlockInit.GREEN_LEADED_GLASS_PANE);
				output.accept(BlockInit.RED_LEADED_GLASS_PANE);
				output.accept(BlockInit.BLACK_LEADED_GLASS_PANE);

			}).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SOPH_FOOD = CREATIVE_MODE_TAB.register("sophies_foods",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.QUINGUM_GEM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SophiesAlloys.MOD_ID, "sophies_alloys"))
                    .title(Component.translatable("creativetab.sophies_food.food_stuffs"))
                    .displayItems((itemDisplayParameters, output) -> {
						output.accept(ItemInit.QUINGUM_GEM);
						output.accept(ItemInit.OREBERRIES_ITEM);
						output.accept(BlockInit.OREBERRY_CRATE);
						output.accept(ItemInit.SEARED_QUINGUM);
						output.accept(ItemInit.CHOCOLATE_GLAZED_QUINGUM);
						output.accept(ItemInit.CHOCOLATE_GLAZED_OREBERRIES);
						output.accept(ItemInit.MOSSY_MUSH);
						output.accept(ItemInit.SMUSHROOM);
						output.accept(ItemInit.LICHUORICE);
						output.accept(ItemInit.RED_LICHUORICE);
						output.accept(ItemInit.BLACK_LICHUORICE);
						output.accept(ItemInit.UNKNOWN_RAW_MEAT);
						output.accept(ItemInit.UNKNOWN_MEAT);
						output.accept(ItemInit.UNKNOWN_CORRUPT_MEAT);
						output.accept(ItemInit.MOSSY_MUSH);
						output.accept(ItemInit.QUINGUM_MIXTURE);
						output.accept(ItemInit.OREBERRY_MIXTURE);
						output.accept(ItemInit.FRUIT_MIXTURE);
						output.accept(ItemInit.GLOWBERRY_MIXTURE);
						output.accept(ItemInit.FUNKY_MIXTURE);
						output.accept(ItemInit.CORRUPT_MIXTURE);
						output.accept(ItemInit.QUINGUMMIES);
						output.accept(ItemInit.OREBERRY_QUINGUMMIES);
						output.accept(ItemInit.FRUIT_QUINGUMMIES);
						output.accept(ItemInit.GLOWBERRY_QUINGUMMIES);
						output.accept(ItemInit.FUNKY_QUINGUMMIES);
						output.accept(ItemInit.CORRUPT_QUINGUMMIES);
						output.accept(ItemInit.FLESHY_QUINGUMMIES);
						output.accept(ItemInit.GUMMY_MOLD);
						if (CompatCheck.farmersPresent) {
							output.accept(FarmerCompat.OREBERRY_SALAD);
							output.accept(FarmerCompat.OREBERRY_BURGER);
							output.accept(FarmerCompat.QUINGUM_SALAD);
							output.accept(FarmerCompat.FANCY_SOUP);
							output.accept(FarmerCompat.RAW_MEAT_STRIPS);
							output.accept(FarmerCompat.COOKED_MEAT_STRIPS);
							output.accept(FarmerCompat.DINO_NUGGET);
							output.accept(FarmerCompat.DINO_NUGGET_KETCHUP);
						}
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
