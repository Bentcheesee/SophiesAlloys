package com.sophiecheese.alloys.init;

import java.util.function.Function;

import com.google.common.base.Supplier;
import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.item.CrimsonCoalBlock;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class OreBlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			SophiesAlloys.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = GeneralItemInit.ITEMS;
	

	private static final Properties STONE_ORES = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
			.requiresCorrectToolForDrops().sound(SoundType.STONE);
	private static final Properties DEEPSLATE_ORES = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE)
			.requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE);
	private static final Properties NETHERRACK_ORES = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER)
			.requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE);
	private static final Properties END_ORES = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
			.requiresCorrectToolForDrops().sound(SoundType.STONE);
	
//Silver
	public static final RegistryObject<Block> SILVER_ORE = register("silver_ore",
			() -> new DropExperienceBlock(STONE_ORES.strength(3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = register("silver_deepslate_ore",
			() -> new DropExperienceBlock(DEEPSLATE_ORES.strength(4.5f, 3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> RAW_SILVER_BLOCK = register("raw_silver_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
				.strength(5.5f,6.5f).requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> SILVER_BLOCK = register("silver_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE)
				.strength(3.6f).requiresCorrectToolForDrops()
				.sound(SoundType.COPPER)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));

//Tungsten
	public static final RegistryObject<Block> TUNGSTEN_ORE = register("tungsten_ore",
			() -> new DropExperienceBlock(STONE_ORES.strength(7.0f, 3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> DEEPSLATE_TUNGSTEN_ORE = register("tungsten_deepslate_ore",
			() -> new DropExperienceBlock(DEEPSLATE_ORES.strength(8.0f, 3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> END_TUNGSTEN_ORE = register("tungsten_end_ore",
			() -> new DropExperienceBlock(END_ORES.strength(40.0F, 9.0F)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> RAW_TUNGSTEN_BLOCK = register("raw_tungsten_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
				.strength(24.0f, 6.5f).requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> TUNGSTEN_BLOCK = register("tungsten_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ)
				.strength(45.0f, 1200.0f).requiresCorrectToolForDrops()
				.sound(SoundType.NETHERITE_BLOCK)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));

//Electrum
	public static final RegistryObject<Block> ELECTRUM_ORE = register("electrum_ore",
			() -> new DropExperienceBlock(STONE_ORES.strength(4.0F, 3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> DEEPSLATE_ELECTRUM_ORE = register("electrum_deepslate_ore",
			() -> new DropExperienceBlock(DEEPSLATE_ORES.strength(4.5f, 3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> RAW_ELECTRUM_BLOCK = register("raw_electrum_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.GOLD)
				.strength(6.5f).requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> ELECTRUM_BLOCK = register("electrum_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.GOLD)
				.strength(8f,6.5f).requiresCorrectToolForDrops()
				.sound(SoundType.METAL)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));

//Lead
	public static final RegistryObject<Block> LEAD_ORE = register("lead_ore",
			() -> new DropExperienceBlock(STONE_ORES.strength(3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = register("lead_deepslate_ore",
			() -> new DropExperienceBlock(DEEPSLATE_ORES.strength(4.5f, 3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> RAW_LEAD_BLOCK = register("raw_lead_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
				.strength(9f,6.5f).requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> LEAD_BLOCK = register("lead_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_BLACK)
				.strength(15f,6.5f).requiresCorrectToolForDrops()
				.sound(SoundType.COPPER)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));

//Mithril
	public static final RegistryObject<Block> MITHRIL_ORE = register("mithril_ore",
			() -> new DropExperienceBlock(STONE_ORES.strength(5.0f, 6.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> DEEPSLATE_MITHRIL_ORE = register("mithril_deepslate_ore",
			() -> new DropExperienceBlock(DEEPSLATE_ORES.strength(6.5f, 7.0f)),
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> NETHER_MITHRIL_ORE = register("mithril_nether_ore",
			() -> new DropExperienceBlock(NETHERRACK_ORES.strength(6.5f, 3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> BLACKSTONE_MITHRIL_ORE = register("mithril_blackstone_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
				.strength(45.0f, 30.0f).requiresCorrectToolForDrops()
				.sound(SoundType.STONE)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> BASALT_MITHRIL_ORE = register("mithril_basalt_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
				.strength(50.0f, 20.0f).requiresCorrectToolForDrops()
				.sound(SoundType.GILDED_BLACKSTONE)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<RotatedPillarBlock> RICH_BASALT = register("rich_basalt",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
				.strength(1.25F, 4.2F).requiresCorrectToolForDrops()
				.sound(SoundType.GILDED_BLACKSTONE)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> RAW_MITHRIL_BLOCK = register("raw_mithril_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_CYAN)
				.strength(12f, 9.0f).requiresCorrectToolForDrops()
				.sound(SoundType.DEEPSLATE_TILES)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> MITHRIL_BLOCK = register("mithril_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_CYAN)
				.strength(15.0f, 20.0f).requiresCorrectToolForDrops()
				.sound(SoundType.COPPER)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
		
//Steel
	public static final RegistryObject<Block> STEEL_BLOCK = register("steel_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_GRAY)
				.strength(5.5f,6.5f).requiresCorrectToolForDrops()
				.sound(SoundType.COPPER)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));

//Foxite
	public static final RegistryObject<Block> FOXITE_ORE = register("foxite_ore",
			() -> new DropExperienceBlock(STONE_ORES.strength(3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> DEEPSLATE_FOXITE_ORE = register("foxite_deepslate_ore",
			() -> new DropExperienceBlock(DEEPSLATE_ORES.strength(4.5f, 3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> NETHER_FOXITE_ORE = register("foxite_nether_ore",
			() -> new DropExperienceBlock(NETHERRACK_ORES.strength(3.3f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> RAW_FOXITE_BLOCK = register("raw_foxite_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
				.strength(5.5f,6.5f).requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> FOXITE_BLOCK = register("foxite_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
				.strength(3.6f).requiresCorrectToolForDrops()
				.sound(SoundType.METAL)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));

//Tritonium
	public static final RegistryObject<Block> TRITONIUM_ORE = register("tritonium_ore",
			() -> new DropExperienceBlock(STONE_ORES.strength(3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> DEEPSLATE_TRITONIUM_ORE = register("tritonium_deepslate_ore",
			() -> new DropExperienceBlock(DEEPSLATE_ORES.strength(4.5f, 3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> RAW_TRITONIUM_BLOCK = register("raw_tritonium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.WARPED_STEM)
				.strength(5.5f,6.5f).requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> TRITONIUM_BLOCK = register("tritonium_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
				.strength(3.6f).requiresCorrectToolForDrops()
				.sound(SoundType.METAL)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));

//Lagomite
	public static final RegistryObject<Block> END_LAGOMITE_ORE = register("lagomite_end_ore",
			() -> new DropExperienceBlock(END_ORES.strength(38.0F, 60.0F)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> OBSIDIAN_LAGOMITE_ORE = register("lagomite_obsidian_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
				.strength(50.0F, 1200.0F).requiresCorrectToolForDrops()
				.sound(SoundType.STONE)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> RAW_LAGOMITE_BLOCK = register("raw_lagomite_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.WOOD)
				.strength(6.5f,7.5f).requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> LAGOMITE_BLOCK = register("lagomite_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WOOD)
				.strength(6.6f).requiresCorrectToolForDrops()
				.sound(SoundType.METAL)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));

//Faunathyst
	public static final RegistryObject<Block> FAUNATHYST_ORE = register("faunathyst_ore",
			() -> new DropExperienceBlock(STONE_ORES.strength(4.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> DEEPSLATE_FAUNATHYST_ORE = register("faunathyst_deepslate_ore",
			() -> new DropExperienceBlock(DEEPSLATE_ORES.strength(5.5f, 3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> FAUNATHYST_BLOCK = register("faunathyst_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_GREEN)
				.strength(4.6f).requiresCorrectToolForDrops()
				.sound(SoundType.METAL)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));

//Quingum
	public static final RegistryObject<Block> QUINGUM_ORE = register("quingum_ore",
			() -> new DropExperienceBlock(STONE_ORES.strength(3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> DEEPSLATE_QUINGUM_ORE = register("quingum_deepslate_ore",
			() -> new DropExperienceBlock(DEEPSLATE_ORES.strength(4.5f, 3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> QUINGUM_BLOCK = register("quingum_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_WHITE)
				.strength(4.6f).requiresCorrectToolForDrops()
				.sound(SoundType.METAL)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
		
//Crimson Coal
	public static final RegistryObject<Block> CRIMSON_COAL_ORE = register("crimson_coal_nether_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER)
				.strength(3.0f).requiresCorrectToolForDrops()
				.sound(SoundType.NETHER_ORE)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> CRIMSON_COAL_BLOCK = register("crimson_coal_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK)
				.strength(5.0F, 6.0F).requiresCorrectToolForDrops()
				.sound(SoundType.METAL)), 
			object -> () -> new CrimsonCoalBlock(object.get(), tabAttributeOre()));
		
//Other
	public static final RegistryObject<Block> OBERITE_BLOCK = register("oberite_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY)
				.strength(8.6f).requiresCorrectToolForDrops()
				.sound(SoundType.METAL)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));

	public static final RegistryObject<Block> LYCALITE_BLOCK = register("lycalite_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK)
				.strength(7.6f).requiresCorrectToolForDrops()
				.sound(SoundType.METAL)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));

	public static final RegistryObject<Block> BABULYMN_BLOCK = register("babulymn_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PINK)
				.strength(7.6f).requiresCorrectToolForDrops()
				.sound(SoundType.METAL)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));

//Meat
	public static final RegistryObject<Block> MEAT_ORE = register("meat_ore",
			() -> new DropExperienceBlock(STONE_ORES.strength(3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> SOUL_MEAT_ORE = register("meat_soul_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
				.strength(5.0f, 4.0f).requiresCorrectToolForDrops()
				.sound(SoundType.STONE)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> DEEPSLATE_MEAT_ORE = register("meat_deepslate_ore",
			() -> new DropExperienceBlock(DEEPSLATE_ORES.strength(4.1f, 3.0f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> NETHER_MEAT_ORE = register("meat_nether_ore",
			() -> new DropExperienceBlock(NETHERRACK_ORES.strength(2.6f)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> END_MEAT_ORE = register("meat_end_ore",
			() -> new DropExperienceBlock(END_ORES.strength(3.0F, 9.0F)), 
			object -> () -> new BlockItem(object.get(), tabAttributeOre()));
	public static final RegistryObject<Block> MEAT_BLOCK = register("meat_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.SCULK, MaterialColor.NETHER)
				.strength(3.0f).sound(SoundType.WART_BLOCK)), 
			object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeFood()));


	public static final Item.Properties tabAttributeOre() {
		return new Item.Properties().tab(GeneralItemInit.SOPH_ALLOY);
	}	

	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
		return BLOCKS.register(name, block);
	}
	
	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}
}
