package com.sophiecheese.alloys.init;

import com.sophiecheese.alloys.item.tools.SophieArmorTier;
import com.sophiecheese.alloys.item.tools.SophieToolTier;
import com.sophiecheese.alloys.setup.Registration;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ToolItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			Registration.MOD_ID);

//Electrum
	public static final RegistryObject<PickaxeItem> ELECTRUM_PICKAXE = ITEMS.register("electrum_pickaxe", 
			() -> new PickaxeItem(SophieToolTier.ELECTRUM, 1, -2.8F, tabAttributeTool()));
	public static final RegistryObject<AxeItem> ELECTRUM_AXE = ITEMS.register("electrum_axe", 
			() -> new AxeItem(SophieToolTier.ELECTRUM, 6.0F, -3.F, tabAttributeTool()));
	public static final RegistryObject<ShovelItem> ELECTRUM_SHOVEL = ITEMS.register("electrum_shovel", 
			() -> new ShovelItem(SophieToolTier.ELECTRUM, 1.5F, -3.0F, tabAttributeTool()));
	public static final RegistryObject<SwordItem> ELECTRUM_SWORD = ITEMS.register("electrum_sword", 
			() -> new SwordItem(SophieToolTier.ELECTRUM, 3, -2.4F, tabAttributeTool()));
	public static final RegistryObject<HoeItem> ELECTRUM_HOE = ITEMS.register("electrum_hoe", 
			() -> new HoeItem(SophieToolTier.ELECTRUM, 0, -3.0F, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> ELECTRUM_HELMET = ITEMS.register("electrum_helmet", 
			() -> new ArmorItem(SophieArmorTier.ELECTRUM, EquipmentSlot.HEAD, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> ELECTRUM_CHESTPLATE = ITEMS.register("electrum_chestplate", 
			() -> new ArmorItem(SophieArmorTier.ELECTRUM, EquipmentSlot.CHEST, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> ELECTRUM_LEGGINGS = ITEMS.register("electrum_leggings", 
			() -> new ArmorItem(SophieArmorTier.ELECTRUM, EquipmentSlot.LEGS, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> ELECTRUM_BOOTS = ITEMS.register("electrum_boots", 
			() -> new ArmorItem(SophieArmorTier.ELECTRUM, EquipmentSlot.FEET, tabAttributeTool()));
	
//Foxite
	public static final RegistryObject<PickaxeItem> FOXITE_PICKAXE = ITEMS.register("foxite_pickaxe", 
			() -> new PickaxeItem(SophieToolTier.FOXITE, 1, -2.8F, tabAttributeTool()));
	public static final RegistryObject<AxeItem> FOXITE_AXE = ITEMS.register("foxite_axe", 
			() -> new AxeItem(SophieToolTier.FOXITE, 6.0F, -3.1F, tabAttributeTool()));
	public static final RegistryObject<ShovelItem> FOXITE_SHOVEL = ITEMS.register("foxite_shovel", 
			() -> new ShovelItem(SophieToolTier.FOXITE, 1.5F, -3.0F, tabAttributeTool()));
	public static final RegistryObject<SwordItem> FOXITE_SWORD = ITEMS.register("foxite_sword", 
			() -> new SwordItem(SophieToolTier.FOXITE, 3, -2.4F, tabAttributeTool()));
	public static final RegistryObject<HoeItem> FOXITE_HOE = ITEMS.register("foxite_hoe", 
			() -> new HoeItem(SophieToolTier.FOXITE, -2, -1.0F, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> FOXITE_HELMET = ITEMS.register("foxite_helmet", 
			() -> new ArmorItem(SophieArmorTier.FOXITE, EquipmentSlot.HEAD, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> FOXITE_CHESTPLATE = ITEMS.register("foxite_chestplate", 
			() -> new ArmorItem(SophieArmorTier.FOXITE, EquipmentSlot.CHEST, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> FOXITE_LEGGINGS = ITEMS.register("foxite_leggings", 
			() -> new ArmorItem(SophieArmorTier.FOXITE, EquipmentSlot.LEGS, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> FOXITE_BOOTS = ITEMS.register("foxite_boots", 
			() -> new ArmorItem(SophieArmorTier.FOXITE, EquipmentSlot.FEET, tabAttributeTool()));

//Lagomite
	public static final RegistryObject<PickaxeItem> LAGOMITE_PICKAXE = ITEMS.register("lagomite_pickaxe", 
			() -> new PickaxeItem(SophieToolTier.LAGOMITE, 1, -2.8F, tabAttributeTool().fireResistant()));
	public static final RegistryObject<AxeItem> LAGOMITE_AXE = ITEMS.register("lagomite_axe", 
			() -> new AxeItem(SophieToolTier.LAGOMITE, 6.0F, -3.0F, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ShovelItem> LAGOMITE_SHOVEL = ITEMS.register("lagomite_shovel", 
			() -> new ShovelItem(SophieToolTier.LAGOMITE, 1.5F, -3.0F, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> LAGOMITE_HELMET = ITEMS.register("lagomite_helmet", 
			() -> new ArmorItem(SophieArmorTier.LAGOMITE, EquipmentSlot.HEAD, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> LAGOMITE_CHESTPLATE = ITEMS.register("lagomite_chestplate", 
			() -> new ArmorItem(SophieArmorTier.LAGOMITE, EquipmentSlot.CHEST, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> LAGOMITE_LEGGINGS = ITEMS.register("lagomite_leggings", 
			() -> new ArmorItem(SophieArmorTier.LAGOMITE, EquipmentSlot.LEGS, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> LAGOMITE_BOOTS = ITEMS.register("lagomite_boots", 
			() -> new ArmorItem(SophieArmorTier.LAGOMITE, EquipmentSlot.FEET, tabAttributeTool().fireResistant()));
		
//Lead
	public static final RegistryObject<PickaxeItem> LEAD_PICKAXE = ITEMS.register("lead_pickaxe", 
			() -> new PickaxeItem(SophieToolTier.LEAD, 1, -2.8F, tabAttributeTool()));
	public static final RegistryObject<AxeItem> LEAD_AXE = ITEMS.register("lead_axe", 
			() -> new AxeItem(SophieToolTier.LEAD, 6.0F, -3.0F, tabAttributeTool()));
	public static final RegistryObject<ShovelItem> LEAD_SHOVEL = ITEMS.register("lead_shovel", 
			() -> new ShovelItem(SophieToolTier.LEAD, 1.5F, -3.0F, tabAttributeTool()));
	public static final RegistryObject<ShearsItem> LEAD_SHEARS = ITEMS.register("lead_shears", 
			() -> new ShearsItem(tabAttributeTool().durability(197)));
	
//Lycalite
	public static final RegistryObject<PickaxeItem> LYCALITE_PICKAXE = ITEMS.register("lycalite_pickaxe", 
			() -> new PickaxeItem(SophieToolTier.LYCALITE, 1, -2.8F, tabAttributeTool()));
	public static final RegistryObject<AxeItem> LYCALITE_AXE = ITEMS.register("lycalite_axe", 
			() -> new AxeItem(SophieToolTier.LYCALITE, 6.0F, -3.1F, tabAttributeTool()));
	public static final RegistryObject<ShovelItem> LYCALITE_SHOVEL = ITEMS.register("lycalite_shovel", 
			() -> new ShovelItem(SophieToolTier.LYCALITE, 1.5F, -3.0F, tabAttributeTool()));
	public static final RegistryObject<SwordItem> LYCALITE_SWORD = ITEMS.register("lycalite_sword", 
			() -> new SwordItem(SophieToolTier.LYCALITE, 3, -2.4F, tabAttributeTool()));
	public static final RegistryObject<HoeItem> LYCALITE_HOE = ITEMS.register("lycalite_hoe", 
			() -> new HoeItem(SophieToolTier.LYCALITE, -3, 0.0F, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> LYCALITE_HELMET = ITEMS.register("lycalite_helmet", 
			() -> new ArmorItem(SophieArmorTier.LYCALITE, EquipmentSlot.HEAD, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> LYCALITE_CHESTPLATE = ITEMS.register("lycalite_chestplate", 
			() -> new ArmorItem(SophieArmorTier.LYCALITE, EquipmentSlot.CHEST, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> LYCALITE_LEGGINGS = ITEMS.register("lycalite_leggings", 
			() -> new ArmorItem(SophieArmorTier.LYCALITE, EquipmentSlot.LEGS, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> LYCALITE_BOOTS = ITEMS.register("lycalite_boots", 
			() -> new ArmorItem(SophieArmorTier.LYCALITE, EquipmentSlot.FEET, tabAttributeTool()));

//Mithril
	public static final RegistryObject<PickaxeItem> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe", 
			() -> new PickaxeItem(SophieToolTier.MITHRIL, 1, -2.8F, tabAttributeTool().fireResistant()));
	public static final RegistryObject<AxeItem> MITHRIL_AXE = ITEMS.register("mithril_axe", 
			() -> new AxeItem(SophieToolTier.MITHRIL, 6.0F, -3.0F, tabAttributeTool().fireResistant()));
	public static final RegistryObject<HoeItem> MITHRIL_HOE = ITEMS.register("mithril_hoe", 
			() -> new HoeItem(SophieToolTier.MITHRIL, 0, -3.0F, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> MITHRIL_HELMET = ITEMS.register("mithril_helmet", 
			() -> new ArmorItem(SophieArmorTier.MITHRIL, EquipmentSlot.HEAD, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate", 
			() -> new ArmorItem(SophieArmorTier.MITHRIL, EquipmentSlot.CHEST, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings", 
			() -> new ArmorItem(SophieArmorTier.MITHRIL, EquipmentSlot.LEGS, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> MITHRIL_BOOTS = ITEMS.register("mithril_boots", 
			() -> new ArmorItem(SophieArmorTier.MITHRIL, EquipmentSlot.FEET, tabAttributeTool().fireResistant()));
	
//Steel
	public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", 
			() -> new PickaxeItem(SophieToolTier.STEEL, 1, -2.8F, tabAttributeTool()));
	public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe", 
			() -> new AxeItem(SophieToolTier.STEEL, 6.0F, -3.1F, tabAttributeTool()));
	public static final RegistryObject<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel", 
			() -> new ShovelItem(SophieToolTier.STEEL, 1.5F, -3.0F, tabAttributeTool()));
	public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword", 
			() -> new SwordItem(SophieToolTier.STEEL, 3, -2.4F, tabAttributeTool()));
	public static final RegistryObject<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe", 
			() -> new HoeItem(SophieToolTier.STEEL, -2, -1.0F, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet", 
			() -> new ArmorItem(SophieArmorTier.STEEL, EquipmentSlot.HEAD, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", 
			() -> new ArmorItem(SophieArmorTier.STEEL, EquipmentSlot.CHEST, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggings", 
			() -> new ArmorItem(SophieArmorTier.STEEL, EquipmentSlot.LEGS, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots", 
			() -> new ArmorItem(SophieArmorTier.STEEL, EquipmentSlot.FEET, tabAttributeTool()));
		
//Silver
	public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe", 
			() -> new AxeItem(SophieToolTier.SILVER, 4.0F, -2.0F, tabAttributeTool()));
	public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", 
			() -> new SwordItem(SophieToolTier.SILVER, 3, -2.4F, tabAttributeTool()));
	public static final RegistryObject<ArmorItem> SILVER_HELMET = ITEMS.register("silver_helmet", 
			() -> new ArmorItem(SophieArmorTier.SILVER, EquipmentSlot.HEAD, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", 
			() -> new ArmorItem(SophieArmorTier.SILVER, EquipmentSlot.CHEST, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> SILVER_LEGGINGS = ITEMS.register("silver_leggings", 
			() -> new ArmorItem(SophieArmorTier.SILVER, EquipmentSlot.LEGS, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> SILVER_BOOTS = ITEMS.register("silver_boots", 
			() -> new ArmorItem(SophieArmorTier.SILVER, EquipmentSlot.FEET, tabAttributeTool().fireResistant()));

//Tungsten
	public static final RegistryObject<PickaxeItem> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe", 
			() -> new PickaxeItem(SophieToolTier.TUNGSTEN, 1, -2.8F, tabAttributeTool().fireResistant()));
	public static final RegistryObject<AxeItem> TUNGSTEN_AXE = ITEMS.register("tungsten_axe", 
			() -> new AxeItem(SophieToolTier.TUNGSTEN, 6.0F, -3.0F, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ShovelItem> TUNGSTEN_SHOVEL = ITEMS.register("tungsten_shovel", 
			() -> new ShovelItem(SophieToolTier.TUNGSTEN, 1.5F, -3.0F, tabAttributeTool().fireResistant()));
	public static final RegistryObject<HoeItem> TUNGSTEN_HOE = ITEMS.register("tungsten_hoe", 
			() -> new HoeItem(SophieToolTier.TUNGSTEN, 0, -3.0F, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet", 
			() -> new ArmorItem(SophieArmorTier.TUNGSTEN, EquipmentSlot.HEAD, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> TUNGSTEN_CHESTPLATE = ITEMS.register("tungsten_chestplate", 
			() -> new ArmorItem(SophieArmorTier.TUNGSTEN, EquipmentSlot.CHEST, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> TUNGSTEN_LEGGINGS = ITEMS.register("tungsten_leggings", 
			() -> new ArmorItem(SophieArmorTier.TUNGSTEN, EquipmentSlot.LEGS, tabAttributeTool().fireResistant()));
	public static final RegistryObject<ArmorItem> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots", 
			() -> new ArmorItem(SophieArmorTier.TUNGSTEN, EquipmentSlot.FEET, tabAttributeTool().fireResistant()));
		
//Misc
	public static final RegistryObject<ArmorItem> BABULYMN_HELMET = ITEMS.register("babulymn_helmet", 
			() -> new ArmorItem(SophieArmorTier.BABULYMN, EquipmentSlot.HEAD, tabAttributeTool()));
	public static final RegistryObject<ShovelItem> BABULYMN_SHOVEL = ITEMS.register("babulymn_shovel", 
			() -> new ShovelItem(SophieToolTier.BABULYMN, 1.5F, -3.0F, tabAttributeTool()));


	public static final CreativeModeTab SOPH_TOOL = new CreativeModeTab("sophies_tools") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ToolItemInit.FOXITE_PICKAXE.get());
		}
	};
	public static final Item.Properties tabAttributeTool() {
		return new Item.Properties().tab(SOPH_TOOL);
	}
	
}
