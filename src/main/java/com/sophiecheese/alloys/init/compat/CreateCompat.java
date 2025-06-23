package com.sophiecheese.alloys.init.compat;

import java.util.function.Function;

import org.slf4j.Logger;

import com.google.common.base.Supplier;
import com.mojang.logging.LogUtils;
import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.block.DustyLampBlock;
import com.sophiecheese.alloys.block.SophieFallingDustyBlock;
import com.sophiecheese.alloys.init.GeneralItemInit;
import com.sophiecheese.alloys.init.OtherBlocksInit;
import com.sophiecheese.alloys.item.BasicDescBlockItem;
import com.sophiecheese.alloys.item.SophieCreateSequencedAssemblyItem;
import com.sophiecheese.alloys.item.consumables.EffectDescItem;
import com.sophiecheese.alloys.item.consumables.FoodItemProperties;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CreateCompat {
	private static final Logger LOGGER = LogUtils.getLogger();

	public static void setupCompat() {
		LOGGER.info("[Sophie's Alloys] Starting Compatibility for Create");
		CompatCheck.createPresent = true;
	}
	public static final DeferredRegister<Item> CREATE_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			SophiesAlloys.MOD_ID);
	public static final DeferredRegister<Block> CREATE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			SophiesAlloys.MOD_ID);

//Items
	public static final RegistryObject<Item> ZINC_DUST = CREATE_ITEMS.register("zinc_dust", 
			() -> new Item(tabAttributeCreate()));
	public static final RegistryObject<Item> BRASS_DUST = CREATE_ITEMS.register("brass_dust", 
			() -> new Item(tabAttributeCreate()));

	public static final RegistryObject<Item> ASURINE_CHUNK = CREATE_ITEMS.register("asurine_chunk", 
			() -> new Item(tabAttributeCreate()));
	public static final RegistryObject<Item> CRIMSITE_CHUNK = CREATE_ITEMS.register("crimsite_chunk", 
			() -> new Item(tabAttributeCreate()));
	public static final RegistryObject<Item> LIMESTONE_CHUNK = CREATE_ITEMS.register("limestone_chunk", 
			() -> new Item(tabAttributeCreate()));
	public static final RegistryObject<Item> OCHRUM_CHUNK = CREATE_ITEMS.register("ochrum_chunk", 
			() -> new Item(tabAttributeCreate()));
	public static final RegistryObject<Item> SCORCHIA_CHUNK = CREATE_ITEMS.register("scorchia_chunk", 
			() -> new Item(tabAttributeCreate()));
	public static final RegistryObject<Item> SCORIA_CHUNK = CREATE_ITEMS.register("scoria_chunk", 
			() -> new Item(tabAttributeCreate()));
	public static final RegistryObject<Item> VERIDIUM_CHUNK = CREATE_ITEMS.register("veridium_chunk", 
			() -> new Item(tabAttributeCreate()));
	
	public static final RegistryObject<Item> CRUSHED_ELECTRUM = CREATE_ITEMS.register("crushed_electrum", 
			() -> new Item(tabAttributeCreate()));
	public static final RegistryObject<Item> CRUSHED_ENDSTONE = CREATE_ITEMS.register("crushed_end_stone", 
			() -> new Item(tabAttributeCreate()));
	public static final RegistryObject<Item> CRUSHED_FOXITE = CREATE_ITEMS.register("crushed_foxite", 
			() -> new Item(tabAttributeCreate()));
	public static final RegistryObject<Item> CRUSHED_LAGOMITE = CREATE_ITEMS.register("crushed_lagomite", 
			() -> new Item(tabAttributeCreate()));
	public static final RegistryObject<Item> CRUSHED_MITHRIL = CREATE_ITEMS.register("crushed_mithril", 
			() -> new Item(tabAttributeCreate()));
	public static final RegistryObject<Item> CRUSHED_TRITONIUM = CREATE_ITEMS.register("crushed_tritonium", 
			() -> new Item(tabAttributeCreate()));
	public static final RegistryObject<Item> CRUSHED_TUNGSTEN = CREATE_ITEMS.register("crushed_tungsten", 
			() -> new Item(tabAttributeCreate()));
	
	public static final RegistryObject<Item> CHOCOLATE_GLAZED_OREBERRIES = CREATE_ITEMS.register("chocolate_glazed_oreberries", 
			() -> new EffectDescItem(GeneralItemInit.tabAttributeFood().food(FoodItemProperties.CHOCOLATE_GLAZED_OREBERRIES)));
	public static final RegistryObject<Item> CHOCOLATE_GLAZED_QUINGUM = CREATE_ITEMS.register("chocolate_glazed_quingum", 
			() -> new EffectDescItem(GeneralItemInit.tabAttributeFood().food(FoodItemProperties.CHOCOLATE_GLAZED_QUINGUM)));

	public static final RegistryObject<Item> UNPROCESSED_BABULYMN_PLATE = CREATE_ITEMS.register("unprocessed_babulymn_sheet", 
			() -> new SophieCreateSequencedAssemblyItem(tabAttributeCreate()));
	public static final RegistryObject<Item> UNPROCESSED_LYCALITE_PLATE = CREATE_ITEMS.register("unprocessed_lycalite_sheet", 
			() -> new SophieCreateSequencedAssemblyItem(tabAttributeCreate()));
	public static final RegistryObject<Item> UNPROCESSED_LAGOMITE_PLATE = CREATE_ITEMS.register("unprocessed_lagomite_sheet", 
			() -> new SophieCreateSequencedAssemblyItem(tabAttributeCreate()));
	public static final RegistryObject<Item> UNPROCESSED_NETHERITE_PLATE = CREATE_ITEMS.register("unprocessed_netherite_sheet", 
			() -> new SophieCreateSequencedAssemblyItem(tabAttributeCreate()));
	public static final RegistryObject<Item> UNPROCESSED_THING = CREATE_ITEMS.register("unprocessed_thing", 
			() -> new SophieCreateSequencedAssemblyItem(tabAttributeCreate()));
	public static final RegistryObject<Item> UNPROCESSED_OBJECT = CREATE_ITEMS.register("unprocessed_object", 
			() -> new SophieCreateSequencedAssemblyItem(tabAttributeCreate()));
	public static final RegistryObject<Item> GROWING_EMERALD = CREATE_ITEMS.register("growing_emerald", 
			() -> new SophieCreateSequencedAssemblyItem(tabAttributeCreate()));

//Blocks
	public static final RegistryObject<DustyLampBlock> DUSTY_ZINC_LAMP = register("dusty_zinc_lamp",
			() -> new DustyLampBlock(6, OtherBlocksInit.LAMP_BLOCKS.lightLevel(OtherBlocksInit.dustyLight(6))), object -> () -> new BasicDescBlockItem(object.get(), tabAttributeCreate()));
	public static final RegistryObject<DustyLampBlock> DUSTY_BRASS_LAMP = register("dusty_brass_lamp",
			() -> new DustyLampBlock(9, OtherBlocksInit.LAMP_BLOCKS.lightLevel(OtherBlocksInit.dustyLight(9))), object -> () -> new BasicDescBlockItem(object.get(), tabAttributeCreate()));


	public static final RegistryObject<Block> BLACK_GRAVEL = register("black_gravel",
			() -> new SophieFallingDustyBlock(-8356741, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BLACK).sound(SoundType.GRAVEL).strength(0.8F, 0.4F)),
			object -> () -> new BlockItem(object.get(), tabAttributeCreate()));
	public static final RegistryObject<Block> BLACK_SAND = register("black_sand",
			() -> new SophieFallingDustyBlock(-2056741, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BLACK).sound(SoundType.SAND).strength(0.5F, 0.3F)),
			object -> () -> new BlockItem(object.get(), tabAttributeCreate()));
	
	
	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
		return CREATE_BLOCKS.register(name, block);
	}
	
	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> obj = registerBlock(name, block);
		CREATE_ITEMS.register(name, item.apply(obj));
		return obj;
	}

	public static final CreativeModeTab SOPH_CREATE = new CreativeModeTab("sophies_create_compat") {
		public ItemStack makeIcon() {
			return new ItemStack(GeneralItemInit.FUNKY_THING.get());
		}
	};
	public static final Item.Properties tabAttributeCreate() {
		return new Item.Properties().tab(SOPH_CREATE);
	}
}
