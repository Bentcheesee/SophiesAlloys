package com.sophiecheese.alloys.datagen;

import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.init.BlockInit;
import com.sophiecheese.alloys.init.ItemInit;
import com.sophiecheese.alloys.setup.CompatCheck;
import com.sophiecheese.alloys.util.AlloysTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class AlloysItemTagProvider extends ItemTagsProvider {
	public AlloysItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, blockTags, SophiesAlloys.MOD_ID, existingFileHelper);
	}

	public static void setupCompat() {
		LOGGER.info("[Sophie's Alloys] Starting Compatibility for Salt");
		CompatCheck.saltPresent = true;
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {
	//Vanilla Tags

		tag(ItemTags.AXES)
			.add(ItemInit.ELECTRUM_AXE.get())
			.add(ItemInit.FOXITE_AXE.get())
			.add(ItemInit.LAGOMITE_AXE.get())
			.add(ItemInit.LEAD_AXE.get())
			.add(ItemInit.LYCALITE_AXE.get())
			.add(ItemInit.MITHRIL_AXE.get())
			.add(ItemInit.SILVER_AXE.get())
			.add(ItemInit.STEEL_AXE.get())
			.add(ItemInit.TUNGSTEN_AXE.get());
		tag(ItemTags.PICKAXES)
			.add(ItemInit.ELECTRUM_PICKAXE.get())
			.add(ItemInit.FOXITE_PICKAXE.get())
			.add(ItemInit.LAGOMITE_PICKAXE.get())
			.add(ItemInit.LEAD_PICKAXE.get())
			.add(ItemInit.LYCALITE_PICKAXE.get())
			.add(ItemInit.MITHRIL_PICKAXE.get())
			.add(ItemInit.STEEL_PICKAXE.get())
			.add(ItemInit.TUNGSTEN_PICKAXE.get());
		tag(ItemTags.SHOVELS)
			.add(ItemInit.BABULYMN_SHOVEL.get())
			.add(ItemInit.ELECTRUM_SHOVEL.get())
			.add(ItemInit.FOXITE_SHOVEL.get())
			.add(ItemInit.LAGOMITE_SHOVEL.get())
			.add(ItemInit.LEAD_SHOVEL.get())
			.add(ItemInit.LYCALITE_SHOVEL.get())
			.add(ItemInit.STEEL_SHOVEL.get())
			.add(ItemInit.TUNGSTEN_SHOVEL.get());
		tag(ItemTags.SWORDS)
			.add(ItemInit.ELECTRUM_SWORD.get())
			.add(ItemInit.FOXITE_SWORD.get())
			.add(ItemInit.LYCALITE_SWORD.get())
			.add(ItemInit.SILVER_SWORD.get())
			.add(ItemInit.STEEL_SWORD.get());
		tag(ItemTags.SWORDS)
			.add(ItemInit.ELECTRUM_HOE.get())
			.add(ItemInit.FOXITE_HOE.get())
			.add(ItemInit.LYCALITE_HOE.get())
			.add(ItemInit.MITHRIL_HOE.get())
			.add(ItemInit.STEEL_HOE.get())
			.add(ItemInit.TUNGSTEN_HOE.get());
		tag(ItemTags.HEAD_ARMOR)
			.add(ItemInit.BABULYMN_HELMET.get())
			.add(ItemInit.ELECTRUM_HELMET.get())
			.add(ItemInit.FOXITE_HELMET.get())
			.add(ItemInit.LAGOMITE_HELMET.get())
			.add(ItemInit.LYCALITE_HELMET.get())
			.add(ItemInit.MITHRIL_HELMET.get())
			.add(ItemInit.SILVER_HELMET.get())
			.add(ItemInit.STEEL_HELMET.get())
			.add(ItemInit.TUNGSTEN_HELMET.get());
		tag(ItemTags.CHEST_ARMOR)
			.add(ItemInit.ELECTRUM_CHESTPLATE.get())
			.add(ItemInit.FOXITE_CHESTPLATE.get())
			.add(ItemInit.LAGOMITE_CHESTPLATE.get())
			.add(ItemInit.LYCALITE_CHESTPLATE.get())
			.add(ItemInit.MITHRIL_CHESTPLATE.get())
			.add(ItemInit.SILVER_CHESTPLATE.get())
			.add(ItemInit.STEEL_CHESTPLATE.get())
			.add(ItemInit.TUNGSTEN_CHESTPLATE.get());
		tag(ItemTags.LEG_ARMOR)
			.add(ItemInit.ELECTRUM_LEGGINGS.get())
			.add(ItemInit.FOXITE_LEGGINGS.get())
			.add(ItemInit.LAGOMITE_LEGGINGS.get())
			.add(ItemInit.LYCALITE_LEGGINGS.get())
			.add(ItemInit.MITHRIL_LEGGINGS.get())
			.add(ItemInit.SILVER_LEGGINGS.get())
			.add(ItemInit.STEEL_LEGGINGS.get())
			.add(ItemInit.TUNGSTEN_LEGGINGS.get());
		tag(ItemTags.FOOT_ARMOR)
			.add(ItemInit.ELECTRUM_BOOTS.get())
			.add(ItemInit.FOXITE_BOOTS.get())
			.add(ItemInit.LAGOMITE_BOOTS.get())
			.add(ItemInit.LYCALITE_BOOTS.get())
			.add(ItemInit.MITHRIL_BOOTS.get())
			.add(ItemInit.SILVER_BOOTS.get())
			.add(ItemInit.STEEL_BOOTS.get())
			.add(ItemInit.TUNGSTEN_BOOTS.get());

		tag(ItemTags.CLUSTER_MAX_HARVESTABLES).addTag(ItemTags.PICKAXES);

		tag(ItemTags.STONE_TOOL_MATERIALS).addTag(Tags.Items.COBBLESTONES);
		tag(ItemTags.STONE_CRAFTING_MATERIALS).addTag(Tags.Items.COBBLESTONES);

		tag(ItemTags.PIGLIN_LOVED)
			.addTag(AlloysTags.Items.C_ORES_ELECTRUM_ITEM)
			.add(ItemInit.GOLD_DUST.get())
			.add(ItemInit.ELECTRUM_DUST.get())
			.add(ItemInit.CRUSHED_ELECTRUM.get())
			.add(ItemInit.ELECTRUM_NUGGET.get())
			.add(ItemInit.ELECTRUM_INGOT.get())
			.add(BlockInit.ELECTRUM_BLOCK.asItem())
			.add(ItemInit.ELECTRUM_AXE.get())
			.add(ItemInit.ELECTRUM_HOE.get())
			.add(ItemInit.ELECTRUM_PICKAXE.get())
			.add(ItemInit.ELECTRUM_SHOVEL.get())
			.add(ItemInit.ELECTRUM_SWORD.get())
			.add(ItemInit.ELECTRUM_HELMET.get())
			.add(ItemInit.ELECTRUM_CHESTPLATE.get())
			.add(ItemInit.ELECTRUM_LEGGINGS.get())
			.add(ItemInit.ELECTRUM_BOOTS.get());
		tag(ItemTags.PIGLIN_FOOD).add(ItemInit.UNKNOWN_MEAT.get());

		tag(ItemTags.PIG_FOOD).add(ItemInit.QUINGUM_GEM.get());
		tag(ItemTags.FOX_FOOD).add(ItemInit.OREBERRIES_ITEM.get());
		tag(ItemTags.MEAT)
			.add(ItemInit.UNKNOWN_MEAT.get())
			.add(ItemInit.UNKNOWN_CORRUPT_MEAT.get())
			.add(ItemInit.UNKNOWN_RAW_MEAT.get());


	//Common Tags
		tag(Tags.Items.COBBLESTONES)
			.add(BlockInit.SOUL_COBBLESTONE.asItem())
			.add(BlockInit.COBBLED_DIORITE.asItem())
			.add(BlockInit.COBBLED_BLACKSTONE.asItem())
			.add(BlockInit.COBBLED_GRANITE.asItem())
			.add(BlockInit.COBBLED_CALCITE.asItem())
			.add(BlockInit.MOSSY_COBBLED_DEEPSLATE.asItem());
		tag(Tags.Items.STONES)
			.add(BlockInit.SOUL_STONE.asItem())
			.add(BlockInit.SLATE.asItem());
		tag(Tags.Items.SANDS)
			.add(BlockInit.BLACK_SAND.asItem())
			.add(BlockInit.DEEP_SAND.asItem());



		tag(Tags.Items.ORES)
			.addTag(AlloysTags.Items.C_ORES_CRIMSON_COAL_ITEM)
			.addTag(AlloysTags.Items.C_ORES_ELECTRUM_ITEM)
			.addTag(AlloysTags.Items.C_ORES_FOXITE_ITEM)
			.addTag(AlloysTags.Items.C_ORES_JADE_ITEM)
			.addTag(AlloysTags.Items.C_ORES_LAGOMITE_ITEM)
			.addTag(AlloysTags.Items.C_ORES_LEAD_ITEM)
			.addTag(AlloysTags.Items.C_ORES_MEAT_ITEM)
			.addTag(AlloysTags.Items.C_ORES_MITHRIL_ITEM)
			.addTag(AlloysTags.Items.C_ORES_QUINGUM_ITEM)
			.addTag(AlloysTags.Items.C_ORES_SILVER_ITEM)
			.addTag(AlloysTags.Items.C_ORES_TRITONIUM_ITEM)
			.addTag(AlloysTags.Items.C_ORES_TUNGSTEN_ITEM);

		tag(Tags.Items.STORAGE_BLOCKS)
			.addTag(AlloysTags.Items.C_STORAGE_BABULYMN_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_CRIMSON_COAL_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_ELECTRUM_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_FOXITE_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_JADE_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_LAGOMITE_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_LEAD_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_LYCALITE_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_MEAT_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_MITHRIL_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_OBERITE_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_QUINGUM_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_SILVER_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_STEEL_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_TRITONIUM_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_TUNGSTEN_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_ELECTRUM_RAW_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_FOXITE_RAW_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_LAGOMITE_RAW_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_LEAD_RAW_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_MITHRIL_RAW_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_SILVER_RAW_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_TRITONIUM_RAW_ITEM)
			.addTag(AlloysTags.Items.C_STORAGE_TUNGSTEN_RAW_ITEM);

		copy(Tags.Blocks.ORE_BEARING_GROUND_DEEPSLATE, Tags.Items.ORE_BEARING_GROUND_DEEPSLATE);
		copy(Tags.Blocks.ORE_BEARING_GROUND_STONE, Tags.Items.ORE_BEARING_GROUND_STONE);
		copy(Tags.Blocks.ORE_BEARING_GROUND_NETHERRACK, Tags.Items.ORE_BEARING_GROUND_NETHERRACK);
		copy(AlloysTags.Blocks.C_ORE_BEARING_GROUND_BASALT_BLOCK, AlloysTags.Items.C_ORE_BEARING_GROUND_BASALT_ITEM);
		copy(AlloysTags.Blocks.C_ORE_BEARING_GROUND_BLACKSTONE_BLOCK, AlloysTags.Items.C_ORE_BEARING_GROUND_BLACKSTONE_ITEM);
		copy(AlloysTags.Blocks.C_ORE_BEARING_GROUND_SOUL_BLOCK, AlloysTags.Items.C_ORE_BEARING_GROUND_SOUL_ITEM);
		copy(AlloysTags.Blocks.C_ORE_BEARING_GROUND_OBSIDIAN_BLOCK, AlloysTags.Items.C_ORE_BEARING_GROUND_OBSIDIAN_ITEM);
		copy(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE, Tags.Items.ORES_IN_GROUND_DEEPSLATE);
		copy(Tags.Blocks.ORES_IN_GROUND_STONE, Tags.Items.ORES_IN_GROUND_STONE);
		copy(Tags.Blocks.ORES_IN_GROUND_NETHERRACK, Tags.Items.ORES_IN_GROUND_NETHERRACK);
		copy(AlloysTags.Blocks.C_ORES_IN_GROUND_BASALT_BLOCK, AlloysTags.Items.C_ORES_IN_GROUND_BASALT_ITEM);
		copy(AlloysTags.Blocks.C_ORES_IN_GROUND_BLACKSTONE_BLOCK, AlloysTags.Items.C_ORES_IN_GROUND_BLACKSTONE_ITEM);
		copy(AlloysTags.Blocks.C_ORES_IN_GROUND_SOUL_BLOCK, AlloysTags.Items.C_ORES_IN_GROUND_SOUL_ITEM);
		copy(AlloysTags.Blocks.C_ORES_IN_GROUND_OBSIDIAN_BLOCK, AlloysTags.Items.C_ORES_IN_GROUND_OBSIDIAN_ITEM);

		copy(AlloysTags.Blocks.C_ORES_CRIMSON_COAL_BLOCK, AlloysTags.Items.C_ORES_CRIMSON_COAL_ITEM);
		copy(AlloysTags.Blocks.C_ORES_ELECTRUM_BLOCK, AlloysTags.Items.C_ORES_ELECTRUM_ITEM);
		copy(AlloysTags.Blocks.C_ORES_FOXITE_BLOCK, AlloysTags.Items.C_ORES_FOXITE_ITEM);
		copy(AlloysTags.Blocks.C_ORES_JADE_BLOCK, AlloysTags.Items.C_ORES_JADE_ITEM);
		copy(AlloysTags.Blocks.C_ORES_LAGOMITE_BLOCK, AlloysTags.Items.C_ORES_LAGOMITE_ITEM);
		copy(AlloysTags.Blocks.C_ORES_LEAD_BLOCK, AlloysTags.Items.C_ORES_LEAD_ITEM);
		copy(AlloysTags.Blocks.C_ORES_MEAT_BLOCK, AlloysTags.Items.C_ORES_MEAT_ITEM);
		copy(AlloysTags.Blocks.C_ORES_MITHRIL_BLOCK, AlloysTags.Items.C_ORES_MITHRIL_ITEM);
		copy(AlloysTags.Blocks.C_ORES_QUINGUM_BLOCK, AlloysTags.Items.C_ORES_QUINGUM_ITEM);
		copy(AlloysTags.Blocks.C_ORES_SILVER_BLOCK, AlloysTags.Items.C_ORES_SILVER_ITEM);
		copy(AlloysTags.Blocks.C_ORES_TRITONIUM_BLOCK, AlloysTags.Items.C_ORES_TRITONIUM_ITEM);
		copy(AlloysTags.Blocks.C_ORES_TUNGSTEN_BLOCK, AlloysTags.Items.C_ORES_TUNGSTEN_ITEM);

		copy(AlloysTags.Blocks.C_STORAGE_BABULYMN_BLOCK, AlloysTags.Items.C_STORAGE_BABULYMN_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_CRIMSON_COAL_BLOCK, AlloysTags.Items.C_STORAGE_CRIMSON_COAL_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_ELECTRUM_BLOCK, AlloysTags.Items.C_STORAGE_ELECTRUM_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_FOXITE_BLOCK, AlloysTags.Items.C_STORAGE_FOXITE_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_JADE_BLOCK, AlloysTags.Items.C_STORAGE_JADE_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_LAGOMITE_BLOCK, AlloysTags.Items.C_STORAGE_LAGOMITE_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_LEAD_BLOCK, AlloysTags.Items.C_STORAGE_LEAD_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_LYCALITE_BLOCK, AlloysTags.Items.C_STORAGE_LYCALITE_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_MEAT_BLOCK, AlloysTags.Items.C_STORAGE_MEAT_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_MITHRIL_BLOCK, AlloysTags.Items.C_STORAGE_MITHRIL_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_OBERITE_BLOCK, AlloysTags.Items.C_STORAGE_OBERITE_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_QUINGUM_BLOCK, AlloysTags.Items.C_STORAGE_QUINGUM_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_SILVER_BLOCK, AlloysTags.Items.C_STORAGE_SILVER_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_STEEL_BLOCK, AlloysTags.Items.C_STORAGE_STEEL_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_TRITONIUM_BLOCK, AlloysTags.Items.C_STORAGE_TRITONIUM_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_TUNGSTEN_BLOCK, AlloysTags.Items.C_STORAGE_TUNGSTEN_ITEM);

		copy(AlloysTags.Blocks.C_STORAGE_ELECTRUM_RAW_BLOCK, AlloysTags.Items.C_STORAGE_ELECTRUM_RAW_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_FOXITE_RAW_BLOCK, AlloysTags.Items.C_STORAGE_FOXITE_RAW_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_LAGOMITE_RAW_BLOCK, AlloysTags.Items.C_STORAGE_LAGOMITE_RAW_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_LEAD_RAW_BLOCK, AlloysTags.Items.C_STORAGE_LEAD_RAW_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_MITHRIL_RAW_BLOCK, AlloysTags.Items.C_STORAGE_MITHRIL_RAW_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_SILVER_RAW_BLOCK, AlloysTags.Items.C_STORAGE_SILVER_RAW_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_TRITONIUM_RAW_BLOCK, AlloysTags.Items.C_STORAGE_TRITONIUM_RAW_ITEM);
		copy(AlloysTags.Blocks.C_STORAGE_TUNGSTEN_RAW_BLOCK, AlloysTags.Items.C_STORAGE_TUNGSTEN_RAW_ITEM);


		tag(Tags.Items.TOOLS_SHEAR).add(ItemInit.LEAD_SHEARS.get());

		tag(Tags.Items.DYED_BLACK)
			.add(BlockInit.BLACK_LEADED_GLASS.asItem())
			.add(BlockInit.BLACK_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_BLUE)
			.add(BlockInit.BLUE_LEADED_GLASS.asItem())
			.add(BlockInit.BLUE_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_BROWN)
			.add(BlockInit.BROWN_LEADED_GLASS.asItem())
			.add(BlockInit.BROWN_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_CYAN)
			.add(BlockInit.CYAN_LEADED_GLASS.asItem())
			.add(BlockInit.CYAN_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_GRAY)
			.add(BlockInit.GRAY_LEADED_GLASS.asItem())
			.add(BlockInit.GRAY_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_GREEN)
			.add(BlockInit.GREEN_LEADED_GLASS.asItem())
			.add(BlockInit.GREEN_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_LIGHT_BLUE)
			.add(BlockInit.LIGHT_BLUE_LEADED_GLASS.asItem())
			.add(BlockInit.LIGHT_BLUE_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_LIGHT_GRAY)
			.add(BlockInit.LIGHT_GRAY_LEADED_GLASS.asItem())
			.add(BlockInit.LIGHT_GRAY_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_LIME)
			.add(BlockInit.LIME_LEADED_GLASS.asItem())
			.add(BlockInit.LIME_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_MAGENTA)
			.add(BlockInit.MAGENTA_LEADED_GLASS.asItem())
			.add(BlockInit.MAGENTA_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_ORANGE)
			.add(BlockInit.ORANGE_LEADED_GLASS.asItem())
			.add(BlockInit.ORANGE_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_PINK)
			.add(BlockInit.PINK_LEADED_GLASS.asItem())
			.add(BlockInit.PINK_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_PURPLE)
			.add(BlockInit.PURPLE_LEADED_GLASS.asItem())
			.add(BlockInit.PURPLE_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_RED)
			.add(BlockInit.RED_LEADED_GLASS.asItem())
			.add(BlockInit.RED_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_WHITE)
			.add(BlockInit.WHITE_LEADED_GLASS.asItem())
			.add(BlockInit.WHITE_LEADED_GLASS_PANE.asItem());
		tag(Tags.Items.DYED_YELLOW)
			.add(BlockInit.YELLOW_LEADED_GLASS.asItem())
			.add(BlockInit.YELLOW_LEADED_GLASS_PANE.asItem());

		tag(Tags.Items.GLASS_BLOCKS).addTag(AlloysTags.Items.LEADED_QUARTZ_GLASS_ITEM);
		tag(Tags.Items.GLASS_BLOCKS_COLORLESS).add(BlockInit.LEADED_GLASS.asItem());
		tag(Tags.Items.GLASS_PANES).addTag(AlloysTags.Items.LEADED_QUARTZ_GLASS_PANES_ITEM);
		tag(Tags.Items.GLASS_PANES_COLORLESS).add(BlockInit.LEADED_GLASS_PANE.asItem());

		tag(Tags.Items.GRAVELS)
			.add(BlockInit.BLACK_GRAVEL.asItem())
			.add(BlockInit.SOUL_GRAVEL.asItem())
			.add(BlockInit.DEEP_GRAVEL.asItem());

		tag(Tags.Items.FERTILIZERS).add(ItemInit.JADE_DUST.get());

		tag(Tags.Items.RAW_MATERIALS)
			.addTag(AlloysTags.Items.C_RAW_ELECTRUM_ITEM)
			.addTag(AlloysTags.Items.C_RAW_FOXITE_ITEM)
			.addTag(AlloysTags.Items.C_RAW_LAGOMITE_ITEM)
			.addTag(AlloysTags.Items.C_RAW_LEAD_ITEM)
			.addTag(AlloysTags.Items.C_RAW_MITHRIL_ITEM)
			.addTag(AlloysTags.Items.C_RAW_SILVER_ITEM)
			.addTag(AlloysTags.Items.C_RAW_TRITONIUM_ITEM)
			.addTag(AlloysTags.Items.C_RAW_TUNGSTEN_ITEM);
		tag(AlloysTags.Items.C_RAW_ELECTRUM_ITEM)
			.add(ItemInit.RAW_ELECTRUM.get());
		tag(AlloysTags.Items.C_RAW_FOXITE_ITEM)
			.add(ItemInit.RAW_FOXITE.get());
		tag(AlloysTags.Items.C_RAW_LAGOMITE_ITEM)
			.add(ItemInit.RAW_LAGOMITE.get());
		tag(AlloysTags.Items.C_RAW_LEAD_ITEM)
			.add(ItemInit.RAW_LEAD.get());
		tag(AlloysTags.Items.C_RAW_MITHRIL_ITEM)
			.add(ItemInit.RAW_MITHRIL.get());
		tag(AlloysTags.Items.C_RAW_SILVER_ITEM)
			.add(ItemInit.RAW_SILVER.get());
		tag(AlloysTags.Items.C_RAW_TRITONIUM_ITEM)
			.add(ItemInit.RAW_TRITONIUM.get());
		tag(AlloysTags.Items.C_RAW_TUNGSTEN_ITEM)
			.add(ItemInit.RAW_TUNGSTEN.get());

		tag(Tags.Items.DUSTS)
			.addTag(AlloysTags.Items.C_DUST_AMETHYST_ITEM)
			.addTag(AlloysTags.Items.C_DUST_BABULYMN_ITEM)
			.addTag(AlloysTags.Items.C_DUST_BRASS_ITEM)
			.addTag(AlloysTags.Items.C_DUST_COAL_ITEM)
			.addTag(AlloysTags.Items.C_DUST_COPPER_ITEM)
			.addTag(AlloysTags.Items.C_DUST_DIAMOND_ITEM)
			.addTag(AlloysTags.Items.C_DUST_ELECTRUM_ITEM)
			.addTag(AlloysTags.Items.C_DUST_EMERALD_ITEM)
			.addTag(AlloysTags.Items.C_DUST_END_STONE_ITEM)
			.addTag(AlloysTags.Items.C_DUST_FLINT_ITEM)
			.addTag(AlloysTags.Items.C_DUST_FOXITE_ITEM)
			.addTag(AlloysTags.Items.C_DUST_LAGOMITE_ITEM)
			.addTag(AlloysTags.Items.C_DUST_LEAD_ITEM)
			.addTag(AlloysTags.Items.C_DUST_LYCALITE_ITEM)
			.addTag(AlloysTags.Items.C_DUST_MITHRIL_ITEM)
			.addTag(AlloysTags.Items.C_DUST_NETHERITE_ITEM)
			.addTag(AlloysTags.Items.C_DUST_OBERITE_ITEM)
			.addTag(AlloysTags.Items.C_DUST_SILVER_ITEM)
			.addTag(AlloysTags.Items.C_DUST_STEEL_ITEM)
			.addTag(AlloysTags.Items.C_DUST_TRITONIUM_ITEM)
			.addTag(AlloysTags.Items.C_DUST_TUNGSTEN_ITEM)
			.addTag(AlloysTags.Items.C_DUST_ZINC_ITEM);
		tag(AlloysTags.Items.C_DUST_AMETHYST_ITEM)
			.add(ItemInit.AMETHYST_DUST.get());
		tag(AlloysTags.Items.C_DUST_BABULYMN_ITEM)
			.add(ItemInit.BABULYMN_DUST.get());
		tag(AlloysTags.Items.C_DUST_BRASS_ITEM)
			.add(ItemInit.BRASS_DUST.get());
		tag(AlloysTags.Items.C_DUST_COAL_ITEM)
			.add(ItemInit.COAL_DUST.get());
		tag(AlloysTags.Items.C_DUST_COPPER_ITEM)
			.add(ItemInit.COPPER_DUST.get());
		tag(AlloysTags.Items.C_DUST_DIAMOND_ITEM)
			.add(ItemInit.DIAMOND_DUST.get())
			.add(ItemInit.TINY_DIAMOND_DUST.get());
		tag(AlloysTags.Items.C_DUST_ELECTRUM_ITEM)
			.add(ItemInit.ELECTRUM_DUST.get());
		tag(AlloysTags.Items.C_DUST_EMERALD_ITEM)
			.add(ItemInit.EMERALD_DUST.get());
		tag(AlloysTags.Items.C_DUST_END_STONE_ITEM)
			.add(ItemInit.ENDSTONE_DUST.get());
		tag(AlloysTags.Items.C_DUST_FLINT_ITEM)
			.add(ItemInit.FLINT_DUST.get());
		tag(AlloysTags.Items.C_DUST_FOXITE_ITEM)
			.add(ItemInit.FOXITE_DUST.get());
		tag(AlloysTags.Items.C_DUST_LAGOMITE_ITEM)
			.add(ItemInit.LAGOMITE_DUST.get());
		tag(AlloysTags.Items.C_DUST_LEAD_ITEM)
			.add(ItemInit.LEAD_DUST.get());
		tag(AlloysTags.Items.C_DUST_LYCALITE_ITEM)
			.add(ItemInit.LYCALITE_DUST.get());
		tag(AlloysTags.Items.C_DUST_MITHRIL_ITEM)
			.add(ItemInit.MITHRIL_DUST.get());
		tag(AlloysTags.Items.C_DUST_NETHERITE_ITEM)
			.add(ItemInit.NETHERITE_DUST.get());
		tag(AlloysTags.Items.C_DUST_OBERITE_ITEM)
			.add(ItemInit.OBERITE_DUST.get());
		tag(AlloysTags.Items.C_DUST_SILVER_ITEM)
			.add(ItemInit.SILVER_DUST.get());
		tag(AlloysTags.Items.C_DUST_STEEL_ITEM)
			.add(ItemInit.STEEL_DUST.get());
		tag(AlloysTags.Items.C_DUST_TRITONIUM_ITEM)
			.add(ItemInit.TRITONIUM_DUST.get());
		tag(AlloysTags.Items.C_DUST_TUNGSTEN_ITEM)
			.add(ItemInit.TUNGSTEN_DUST.get());
		tag(AlloysTags.Items.C_DUST_ZINC_ITEM)
			.add(ItemInit.ZINC_DUST.get());

		tag(Tags.Items.INGOTS)
			.add(ItemInit.SILVER_INGOT.get())
			.add(ItemInit.TUNGSTEN_INGOT.get())
			.add(ItemInit.ELECTRUM_INGOT.get())
			.add(ItemInit.LEAD_INGOT.get())
			.add(ItemInit.MITHRIL_INGOT.get())
			.add(ItemInit.STEEL_INGOT.get())
			.add(ItemInit.FOXITE_INGOT.get())
			.add(ItemInit.TRITONIUM_INGOT.get())
			.add(ItemInit.LAGOMITE_INGOT.get())
			.add(ItemInit.OBERITE_INGOT.get())
			.add(ItemInit.LYCALITE_INGOT.get())
			.add(ItemInit.BABULYMN_INGOT.get());

		tag(AlloysTags.Items.C_INGOT_BABULYMN_ITEM).add(ItemInit.BABULYMN_INGOT.get());
		tag(AlloysTags.Items.C_INGOT_ELECTRUM_ITEM).add(ItemInit.ELECTRUM_INGOT.get());
		tag(AlloysTags.Items.C_INGOT_FOXITE_ITEM).add(ItemInit.FOXITE_INGOT.get());
		tag(AlloysTags.Items.C_INGOT_LAGOMITE_ITEM).add(ItemInit.LAGOMITE_INGOT.get());
		tag(AlloysTags.Items.C_INGOT_LEAD_ITEM).add(ItemInit.LEAD_INGOT.get());
		tag(AlloysTags.Items.C_INGOT_LYCALITE_ITEM).add(ItemInit.LYCALITE_INGOT.get());
		tag(AlloysTags.Items.C_INGOT_MITHRIL_ITEM).add(ItemInit.MITHRIL_INGOT.get());
		tag(AlloysTags.Items.C_INGOT_OBERITE_ITEM).add(ItemInit.OBERITE_INGOT.get());
		tag(AlloysTags.Items.C_INGOT_SILVER_ITEM).add(ItemInit.SILVER_INGOT.get());
		tag(AlloysTags.Items.C_INGOT_STEEL_ITEM).add(ItemInit.STEEL_INGOT.get());
		tag(AlloysTags.Items.C_INGOT_TRITONIUM_ITEM).add(ItemInit.TRITONIUM_INGOT.get());
		tag(AlloysTags.Items.C_INGOT_TUNGSTEN_ITEM).add(ItemInit.TUNGSTEN_INGOT.get());

		tag(AlloysTags.Items.C_CRIMSON_COAL).add(ItemInit.CRIMSON_COAL.get());

		tag(Tags.Items.GEMS)
			.add(ItemInit.QUINGUM_GEM.get())
			.add(ItemInit.JADE_GEM.get());

		tag(AlloysTags.Items.C_GEMS_JADE).add(ItemInit.JADE_GEM.get());
		tag(AlloysTags.Items.C_GEMS_QUINGUM).add(ItemInit.QUINGUM_GEM.get());


		tag(Tags.Items.NUGGETS)
			.addTag(AlloysTags.Items.C_NUGGET_BABULYMN)
			.addTag(AlloysTags.Items.C_NUGGET_ELECTRUM)
			.addTag(AlloysTags.Items.C_NUGGET_FOXITE)
			.addTag(AlloysTags.Items.C_NUGGET_LAGOMITE)
			.addTag(AlloysTags.Items.C_NUGGET_LEAD)
			.addTag(AlloysTags.Items.C_NUGGET_LYCALITE)
			.addTag(AlloysTags.Items.C_NUGGET_MITHRIL)
			.addTag(AlloysTags.Items.C_NUGGET_NETHERITE)
			.addTag(AlloysTags.Items.C_NUGGET_OBERITE)
			.addTag(AlloysTags.Items.C_NUGGET_SILVER)
			.addTag(AlloysTags.Items.C_NUGGET_STEEL)
			.addTag(AlloysTags.Items.C_NUGGET_TRITONIUM)
			.addTag(AlloysTags.Items.C_NUGGET_TUNGSTEN);
		tag(AlloysTags.Items.C_NUGGET_BABULYMN).add(ItemInit.BABULYMN_NUGGET.get());
		tag(AlloysTags.Items.C_NUGGET_ELECTRUM).add(ItemInit.ELECTRUM_NUGGET.get());
		tag(AlloysTags.Items.C_NUGGET_FOXITE).add(ItemInit.FOXITE_NUGGET.get());
		tag(AlloysTags.Items.C_NUGGET_LAGOMITE).add(ItemInit.LAGOMITE_NUGGET.get());
		tag(AlloysTags.Items.C_NUGGET_LEAD).add(ItemInit.LEAD_NUGGET.get());
		tag(AlloysTags.Items.C_NUGGET_LYCALITE).add(ItemInit.LYCALITE_NUGGET.get());
		tag(AlloysTags.Items.C_NUGGET_MITHRIL).add(ItemInit.MITHRIL_NUGGET.get());
		tag(AlloysTags.Items.C_NUGGET_MITHRIL).add(ItemInit.NETHERITE_NUGGET.get());
		tag(AlloysTags.Items.C_NUGGET_OBERITE).add(ItemInit.OBERITE_NUGGET.get());
		tag(AlloysTags.Items.C_NUGGET_SILVER).add(ItemInit.SILVER_NUGGET.get());
		tag(AlloysTags.Items.C_NUGGET_STEEL).add(ItemInit.STEEL_NUGGET.get());
		tag(AlloysTags.Items.C_NUGGET_TRITONIUM).add(ItemInit.TRITONIUM_NUGGET.get());
		tag(AlloysTags.Items.C_NUGGET_TUNGSTEN).add(ItemInit.TUNGSTEN_NUGGET.get());

		tag(AlloysTags.Items.C_SHARDS_ITEM)
			.addTag(AlloysTags.Items.C_SHARD_AMETHYST_ITEM)
			.addTag(AlloysTags.Items.C_SHARD_DIAMOND_ITEM)
			.addTag(AlloysTags.Items.C_SHARD_EMERALD_ITEM)
			.addTag(AlloysTags.Items.C_SHARD_JADE_ITEM)
			.addTag(AlloysTags.Items.C_SHARD_LAPIS_ITEM)
			.addTag(AlloysTags.Items.C_SHARD_QUINGUM_ITEM)
			.addOptional(external("winterly", "cryomarble_shard"))
			.addOptional(external("enderscape", "nebulite_shard"));
		tag(AlloysTags.Items.C_SHARD_AMETHYST_ITEM).add(Items.AMETHYST_SHARD);
		tag(AlloysTags.Items.C_SHARD_DIAMOND_ITEM)
			.add(ItemInit.DIAMOND_SHARD.get())
			.addOptional(dreams("diamond_shard"));
		tag(AlloysTags.Items.C_SHARD_EMERALD_ITEM).add(ItemInit.EMERALD_SHARD.get());
		tag(AlloysTags.Items.C_SHARD_JADE_ITEM).add(ItemInit.JADE_SHARD.get());
		tag(AlloysTags.Items.C_SHARD_LAPIS_ITEM).add(ItemInit.LAPIS_SHARD.get())
			.addOptional(dreams("lapis_lazuli_shard"));
		tag(AlloysTags.Items.C_SHARD_QUINGUM_ITEM).add(ItemInit.QUINGUM_SHARD.get());


		tag(AlloysTags.Items.C_FOODS_STRANGE_MEAT)
			.add(ItemInit.UNKNOWN_MEAT.get())
			.addOptional(internal("cooked_meat_strip"));
		tag(AlloysTags.Items.C_FOODS_STRANGE_RAW_MEAT)
			.add(ItemInit.UNKNOWN_RAW_MEAT.get())
			.add(ItemInit.UNKNOWN_CORRUPT_MEAT.get())
			.addOptional(internal("raw_meat_strip"));
		tag(Tags.Items.FOODS)
			.add(ItemInit.OREBERRIES_ITEM.get())
			.add(ItemInit.MOSSY_MUSH.get())
			.add(ItemInit.SMUSHROOM.get())
			.add(ItemInit.LICHUORICE.get())
			.add(ItemInit.RED_LICHUORICE.get())
			.add(ItemInit.BLACK_LICHUORICE.get())
			.add(ItemInit.UNKNOWN_MEAT.get())
			.add(ItemInit.UNKNOWN_RAW_MEAT.get())
			.add(ItemInit.UNKNOWN_CORRUPT_MEAT.get())
			.add(ItemInit.QUINGUM_GEM.get())
			.add(ItemInit.SEARED_QUINGUM.get())
			.add(ItemInit.CHOCOLATE_GLAZED_QUINGUM.get())
			.add(ItemInit.CHOCOLATE_GLAZED_OREBERRIES.get())
			.add(ItemInit.QUINGUMMIES.get())
			.add(ItemInit.OREBERRY_QUINGUMMIES.get())
			.add(ItemInit.FRUIT_QUINGUMMIES.get())
			.add(ItemInit.GLOWBERRY_QUINGUMMIES.get())
			.add(ItemInit.FUNKY_QUINGUMMIES.get())
			.add(ItemInit.CORRUPT_QUINGUMMIES.get())
			.add(ItemInit.FLESHY_QUINGUMMIES.get())
			.addOptional(internal("oreberry_salad"))
			.addOptional(internal("oreberry_burger"))
			.addOptional(internal("quingum_salad"))
			.addOptional(internal("fancy_soup"))
			.addOptional(internal("raw_meat_strip"))
			.addOptional(internal("cooked_meat_strip"));
		tag(Tags.Items.FOODS_COOKED_MEAT)
			.add(ItemInit.UNKNOWN_MEAT.get())
			.addOptional(internal("cooked_meat_strip"));
		tag(Tags.Items.FOODS_CANDY)
			.add(ItemInit.CHOCOLATE_GLAZED_OREBERRIES.get())
			.add(ItemInit.QUINGUMMIES.get())
			.add(ItemInit.OREBERRY_QUINGUMMIES.get())
			.add(ItemInit.FRUIT_QUINGUMMIES.get())
			.add(ItemInit.GLOWBERRY_QUINGUMMIES.get())
			.add(ItemInit.FUNKY_QUINGUMMIES.get())
			.add(ItemInit.CORRUPT_QUINGUMMIES.get())
			.add(ItemInit.FLESHY_QUINGUMMIES.get());
		if (CompatCheck.farmersPresent) {
			tag(Tags.Items.FOODS_SOUP)
				.addOptional(internal("fancy_soup"));
		}


		tag(Tags.Items.DRINKS)
			.add(ItemInit.QUINGUM_MIXTURE.get())
			.add(ItemInit.OREBERRY_MIXTURE.get())
			.add(ItemInit.FRUIT_MIXTURE.get())
			.add(ItemInit.GLOWBERRY_MIXTURE.get())
			.add(ItemInit.FUNKY_MIXTURE.get())
			.add(ItemInit.CORRUPT_MIXTURE.get());
		tag(Tags.Items.FOODS_BERRY)
			.add(ItemInit.OREBERRIES_ITEM.get());

		copy(AlloysTags.Blocks.C_LANTERNS_BLOCK, AlloysTags.Items.C_LANTERNS_ITEM);
		copy(AlloysTags.Blocks.C_SOUL_LANTERNS_BLOCK, AlloysTags.Items.C_SOUL_LANTERNS_ITEM);


	//Alloys Tags
		tag(AlloysTags.Items.BLACKSTONE_ALL_ITEM)
			.addTag(AlloysTags.Items.BLACKSTONE_BLOCK_ITEM)
			.addTag(AlloysTags.Items.BLACKSTONE_FULL_ITEM)
			.addTag(AlloysTags.Items.BLACKSTONE_SLAB_ITEM);
		tag(AlloysTags.Items.BLACKSTONE_BLOCK_ITEM)
			.add(Blocks.BLACKSTONE.asItem())
			.add(Blocks.POLISHED_BLACKSTONE.asItem())
			.add(Blocks.POLISHED_BLACKSTONE_BRICKS.asItem())
			.add(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.asItem())
			.add(Blocks.CHISELED_POLISHED_BLACKSTONE.asItem())
			.add(BlockInit.COBBLED_BLACKSTONE.asItem())
			.addOptional(quark("blackstone_bricks"));
		tag(AlloysTags.Items.BLACKSTONE_FULL_ITEM)
			.add(Blocks.BLACKSTONE.asItem())
			.add(Blocks.BLACKSTONE_WALL.asItem())
			.add(Blocks.BLACKSTONE_STAIRS.asItem())
			.add(Blocks.POLISHED_BLACKSTONE.asItem())
			.add(Blocks.POLISHED_BLACKSTONE_WALL.asItem())
			.add(Blocks.POLISHED_BLACKSTONE_STAIRS.asItem())
			.add(Blocks.POLISHED_BLACKSTONE_BRICKS.asItem())
			.add(Blocks.POLISHED_BLACKSTONE_BRICK_WALL.asItem())
			.add(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS.asItem())
			.add(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.asItem())
			.add(Blocks.CHISELED_POLISHED_BLACKSTONE.asItem())
			.add(BlockInit.COBBLED_BLACKSTONE.asItem())
			.add(BlockInit.COBBLED_BLACKSTONE_WALL.asItem())
			.add(BlockInit.COBBLED_BLACKSTONE_STAIRS.asItem())
			.addOptional(quark("blackstone_bricks"))
			.addOptional(quark("blackstone_bricks_stairs"));
		tag(AlloysTags.Items.BLACKSTONE_SLAB_ITEM)
			.add(Blocks.BLACKSTONE_SLAB.asItem())
			.add(Blocks.POLISHED_BLACKSTONE_SLAB.asItem())
			.add(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB.asItem())
			.add(BlockInit.COBBLED_BLACKSTONE_SLAB.asItem())
			.addOptional(quark("blackstone_bricks_slab"));

		tag(AlloysTags.Items.CALCITE_ALL_ITEM)
			.addTag(AlloysTags.Items.CALCITE_BLOCK_ITEM)
			.addTag(AlloysTags.Items.CALCITE_FULL_ITEM)
			.addTag(AlloysTags.Items.CALCITE_SLAB_ITEM);
		tag(AlloysTags.Items.CALCITE_BLOCK_ITEM)
			.add(Blocks.CALCITE.asItem())
			.add(BlockInit.COBBLED_CALCITE.asItem())
			.addOptional(create("cut_calcite"))
			.addOptional(create("polished_cut_calcite"))
			.addOptional(create("cut_calcite_brick"))
			.addOptional(create("small_calcite_brick"))
			.addOptional(create("layered_calcite"))
			.addOptional(create("calcite_pillar"));
		tag(AlloysTags.Items.CALCITE_FULL_ITEM)
			.add(Blocks.CALCITE.asItem())
			.add(BlockInit.COBBLED_CALCITE.asItem())
			.add(BlockInit.COBBLED_CALCITE_WALL.asItem())
			.add(BlockInit.COBBLED_CALCITE_STAIRS.asItem())
			.addOptionalTag(create("stone_types/calcite"));
		tag(AlloysTags.Items.CALCITE_SLAB_ITEM)
			.add(BlockInit.COBBLED_CALCITE_SLAB.asItem())
			.addOptional(create("cut_calcite_slab"))
			.addOptional(create("polished_cut_calcite_slab"))
			.addOptional(create("cut_calcite_brick_slab"))
			.addOptional(create("small_calcite_brick_slab"));

		tag(AlloysTags.Items.DIORITE_ALL_ITEM)
			.addTag(AlloysTags.Items.DIORITE_BLOCK_ITEM)
			.addTag(AlloysTags.Items.DIORITE_FULL_ITEM)
			.addTag(AlloysTags.Items.DIORITE_SLAB_ITEM);
		tag(AlloysTags.Items.DIORITE_BLOCK_ITEM)
			.add(Blocks.DIORITE.asItem())
			.add(Blocks.POLISHED_DIORITE.asItem())
			.add(BlockInit.COBBLED_DIORITE.asItem());
		tag(AlloysTags.Items.DIORITE_FULL_ITEM)
			.add(Blocks.DIORITE.asItem())
			.add(Blocks.DIORITE_WALL.asItem())
			.add(Blocks.DIORITE_STAIRS.asItem())
			.add(Blocks.POLISHED_DIORITE.asItem())
			.add(Blocks.POLISHED_DIORITE_STAIRS.asItem())
			.add(BlockInit.COBBLED_DIORITE.asItem())
			.add(BlockInit.COBBLED_DIORITE_WALL.asItem())
			.add(BlockInit.COBBLED_DIORITE_STAIRS.asItem());
		tag(AlloysTags.Items.DIORITE_SLAB_ITEM)
			.add(Blocks.DIORITE_SLAB.asItem())
			.add(Blocks.POLISHED_DIORITE_SLAB.asItem())
			.add(BlockInit.COBBLED_DIORITE_SLAB.asItem());

		tag(AlloysTags.Items.GRANITE_ALL_ITEM)
			.addTag(AlloysTags.Items.GRANITE_BLOCK_ITEM)
			.addTag(AlloysTags.Items.GRANITE_FULL_ITEM)
			.addTag(AlloysTags.Items.GRANITE_SLAB_ITEM);
		tag(AlloysTags.Items.GRANITE_BLOCK_ITEM)
			.add(Blocks.GRANITE.asItem())
			.add(Blocks.POLISHED_GRANITE.asItem())
			.add(BlockInit.COBBLED_GRANITE.asItem());
		tag(AlloysTags.Items.GRANITE_FULL_ITEM)
			.add(Blocks.GRANITE.asItem())
			.add(Blocks.GRANITE_WALL.asItem())
			.add(Blocks.GRANITE_STAIRS.asItem())
			.add(Blocks.POLISHED_GRANITE.asItem())
			.add(Blocks.POLISHED_GRANITE_STAIRS.asItem())
			.add(BlockInit.COBBLED_GRANITE.asItem())
			.add(BlockInit.COBBLED_GRANITE_WALL.asItem())
			.add(BlockInit.COBBLED_GRANITE_STAIRS.asItem());
		tag(AlloysTags.Items.GRANITE_SLAB_ITEM)
			.add(Blocks.GRANITE_SLAB.asItem())
			.add(Blocks.POLISHED_GRANITE_SLAB.asItem())
			.add(BlockInit.COBBLED_GRANITE_SLAB.asItem());

		tag(AlloysTags.Items.SLATE_ALL_ITEM)
			.addTag(AlloysTags.Items.SLATE_BLOCK_ITEM)
			.addTag(AlloysTags.Items.SLATE_FULL_ITEM)
			.addTag(AlloysTags.Items.SLATE_SLAB_ITEM);
		tag(AlloysTags.Items.SLATE_BLOCK_ITEM)
			.add(BlockInit.SLATE.asItem())
			.add(BlockInit.SLATE_BRICKS.asItem())
			.add(BlockInit.SLATE_BRICKS_CRACKED.asItem())
			.add(BlockInit.SLATE_TILES.asItem())
			.add(BlockInit.SLATE_TILES_CRACKED.asItem())
			.add(BlockInit.SLATE_PILLAR.asItem());
		tag(AlloysTags.Items.SLATE_FULL_ITEM)
			.add(BlockInit.SLATE.asItem())
			.add(BlockInit.SLATE_WALL.asItem())
			.add(BlockInit.SLATE_STAIRS.asItem())
			.add(BlockInit.SLATE_BRICKS.asItem())
			.add(BlockInit.SLATE_BRICK_WALL.asItem())
			.add(BlockInit.SLATE_BRICK_STAIRS.asItem())
			.add(BlockInit.SLATE_BRICKS_CRACKED.asItem())
			.add(BlockInit.SLATE_TILES.asItem())
			.add(BlockInit.SLATE_TILE_WALL.asItem())
			.add(BlockInit.SLATE_TILE_STAIRS.asItem())
			.add(BlockInit.SLATE_TILES_CRACKED.asItem())
			.add(BlockInit.SLATE_PILLAR.asItem());
		tag(AlloysTags.Items.SLATE_SLAB_ITEM)
			.add(BlockInit.SLATE_SLAB.asItem())
			.add(BlockInit.SLATE_BRICK_SLAB.asItem())
			.add(BlockInit.SLATE_TILE_SLAB.asItem());

		tag(AlloysTags.Items.SOUL_ALL_ITEM)
			.addTag(AlloysTags.Items.SOUL_BLOCK_ITEM)
			.addTag(AlloysTags.Items.SOUL_FULL_ITEM)
			.addTag(AlloysTags.Items.SOUL_SLAB_ITEM);
		tag(AlloysTags.Items.SOUL_BLOCK_ITEM)
			.add(BlockInit.SOUL_STONE.asItem())
			.add(BlockInit.SOUL_STONE_BRICKS.asItem())
			.add(BlockInit.SOUL_STONE_BRICK_CRACKED.asItem())
			.add(BlockInit.SOUL_STONE_TILES.asItem())
			.add(BlockInit.SOUL_STONE_TILES_CRACKED.asItem());
		tag(AlloysTags.Items.SOUL_FULL_ITEM)
			.add(BlockInit.SOUL_STONE.asItem())
			.add(BlockInit.SOUL_STONE_WALL.asItem())
			.add(BlockInit.SOUL_STONE_STAIRS.asItem())
			.add(BlockInit.SOUL_STONE_BRICKS.asItem())
			.add(BlockInit.SOUL_STONE_BRICK_WALL.asItem())
			.add(BlockInit.SOUL_STONE_BRICK_STAIRS.asItem())
			.add(BlockInit.SOUL_STONE_BRICK_CRACKED.asItem())
			.add(BlockInit.SOUL_STONE_TILES.asItem())
			.add(BlockInit.SOUL_STONE_TILES_WALL.asItem())
			.add(BlockInit.SOUL_STONE_TILES_STAIRS.asItem())
			.add(BlockInit.SOUL_STONE_TILES_CRACKED.asItem());
		tag(AlloysTags.Items.SOUL_SLAB_ITEM)
			.add(BlockInit.SOUL_STONE_SLAB.asItem())
			.add(BlockInit.SOUL_STONE_BRICK_SLAB.asItem())
			.add(BlockInit.SOUL_STONE_TILES_SLAB.asItem());

		tag(AlloysTags.Items.MOSSY_DEEPSLATE_ALL_ITEM)
			.addTag(AlloysTags.Items.MOSSY_DEEPSLATE_BLOCK_ITEM)
			.addTag(AlloysTags.Items.MOSSY_DEEPSLATE_FULL_ITEM)
			.addTag(AlloysTags.Items.MOSSY_DEEPSLATE_SLAB_ITEM);
		tag(AlloysTags.Items.MOSSY_DEEPSLATE_BLOCK_ITEM)
			.add(BlockInit.MOSSY_COBBLED_DEEPSLATE.asItem())
			.add(BlockInit.MOSSY_DEEPSLATE_BRICKS.asItem());
		tag(AlloysTags.Items.MOSSY_DEEPSLATE_FULL_ITEM)
			.add(BlockInit.MOSSY_COBBLED_DEEPSLATE.asItem())
			.add(BlockInit.MOSSY_COBBLED_DEEPSLATE_WALL.asItem())
			.add(BlockInit.MOSSY_COBBLED_DEEPSLATE_STAIRS.asItem())
			.add(BlockInit.MOSSY_DEEPSLATE_BRICKS.asItem())
			.add(BlockInit.MOSSY_DEEPSLATE_BRICK_WALL.asItem())
			.add(BlockInit.MOSSY_DEEPSLATE_BRICK_STAIRS.asItem());
		tag(AlloysTags.Items.MOSSY_DEEPSLATE_SLAB_ITEM)
			.add(BlockInit.MOSSY_COBBLED_DEEPSLATE_SLAB.asItem())
			.add(BlockInit.MOSSY_DEEPSLATE_BRICK_SLAB.asItem());

		copy(AlloysTags.Blocks.LEADED_QUARTZ_GLASS_BLOCK, AlloysTags.Items.LEADED_QUARTZ_GLASS_ITEM);
		copy(AlloysTags.Blocks.LEADED_QUARTZ_GLASS_PANES_BLOCK, AlloysTags.Items.LEADED_QUARTZ_GLASS_PANES_ITEM);
		copy(AlloysTags.Blocks.STAINED_LEADED_QUARTZ_GLASS_BLOCK, AlloysTags.Items.STAINED_LEADED_QUARTZ_GLASS_ITEM);
		copy(AlloysTags.Blocks.STAINED_LEADED_QUARTZ_GLASS_PANES_BLOCK, AlloysTags.Items.STAINED_LEADED_QUARTZ_GLASS_PANES_ITEM);

		copy(AlloysTags.Blocks.DUSTY_LAMPS_BLOCK, AlloysTags.Items.DUSTY_LAMPS_ITEM);
		copy(AlloysTags.Blocks.LAMPS_WEAK_BLOCK, AlloysTags.Items.LAMPS_WEAK_ITEM);
		copy(AlloysTags.Blocks.LAMPS_MEDIUM_BLOCK, AlloysTags.Items.LAMPS_MEDIUM_ITEM);
		copy(AlloysTags.Blocks.LAMPS_STRONG_BLOCK, AlloysTags.Items.LAMPS_STRONG_ITEM);
		copy(AlloysTags.Blocks.LAMPS_VERY_STRONG_BLOCK, AlloysTags.Items.LAMPS_VERY_STRONG_ITEM);

	//Special Tags
		if (CompatCheck.saltPresent) {
			tag(AlloysTags.Items.SALT_CAN_BE_SALTED)
				.add(ItemInit.QUINGUM_GEM.get())
				.add(ItemInit.SEARED_QUINGUM.get())
				.add(ItemInit.MOSSY_MUSH.get())
				.add(ItemInit.UNKNOWN_RAW_MEAT.get())
				.add(ItemInit.UNKNOWN_MEAT.get())
				.add(ItemInit.UNKNOWN_CORRUPT_MEAT.get())
				.addOptional(internal("oreberry_salad"))
				.addOptional(internal("oreberry_burger"))
				.addOptional(internal("quingum_salad"))
				.addOptional(internal("fancy_soup"))
				.addOptional(internal("raw_meat_strip"))
				.addOptional(internal("cooked_meat_strip"));
		}

		tag(AlloysTags.Items.CREATE_CRUSHED_RAW_MATERIALS)
			.add(ItemInit.CRUSHED_ENDSTONE.get())
			.add(ItemInit.CRUSHED_ELECTRUM.get())
			.add(ItemInit.CRUSHED_FOXITE.get())
			.add(ItemInit.CRUSHED_LAGOMITE.get())
			.add(ItemInit.CRUSHED_MITHRIL.get())
			.add(ItemInit.CRUSHED_SILVER.get())
			.add(ItemInit.CRUSHED_TRITONIUM.get())
			.add(ItemInit.CRUSHED_TUNGSTEN.get());
		tag(AlloysTags.Items.CREATE_UPRIGHT_ON_BELT)
			.add(ItemInit.FUNKY_THING.get())
			.add(ItemInit.ABNORMAL_THING.get())
			.add(ItemInit.UNPROCESSED_THING.get())
			.add(ItemInit.UNPROCESSED_OBJECT.get());

	}
	private static ResourceLocation internal(String path) {
		return ResourceLocation.fromNamespaceAndPath(SophiesAlloys.MOD_ID, path);
	}
	private static ResourceLocation external(String namespace, String path) {
		return ResourceLocation.fromNamespaceAndPath(namespace, path);
	}
	private static ResourceLocation quark(String path) {
		return ResourceLocation.fromNamespaceAndPath("quark", path);
	}
	private static ResourceLocation create(String path) {
		return ResourceLocation.fromNamespaceAndPath("create", path);
	}
	private static ResourceLocation dreams(String path) {
		return ResourceLocation.fromNamespaceAndPath("dndesires", path);
	}

	private final Map<TagKey<Block>, TagKey<Item>> tagsToCopy = new HashMap<>();
	protected void copy(TagKey<Block> blockTag, TagKey<Item> itemTag) {
		this.tagsToCopy.put(blockTag, itemTag);
	}

}
