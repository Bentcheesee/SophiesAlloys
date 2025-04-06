package com.sophiecheese.alloys.init.compat;

import java.util.function.Function;

import org.slf4j.Logger;

import com.google.common.base.Supplier;
import com.mojang.logging.LogUtils;
import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.init.GeneralItemInit;
import com.sophiecheese.alloys.item.consumables.FoodItemProperties;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FarmersCompat {
	private static final Logger LOGGER = LogUtils.getLogger();

	public static void setupCompat() {
		LOGGER.info("[Sophie's Alloys] Starting Compatibility for Farmers Delight");
		CompatCheck.farmersPresent = true;
	}

	public static final DeferredRegister<Item> FARMERS_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			SophiesAlloys.MOD_ID);
	public static final DeferredRegister<Block> FARMERS_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			SophiesAlloys.MOD_ID);

//Items
	public static final RegistryObject<BowlFoodItem> OREBERRY_SALAD = FARMERS_ITEMS.register("oreberry_salad", 
			() -> new BowlFoodItem(GeneralItemInit.tabAttributeFood().food(FoodItemProperties.OREBERRY_SALAD).stacksTo(16)));
	public static final RegistryObject<Item> OREBERRY_BURGER = FARMERS_ITEMS.register("oreberry_burger", 
			() -> new Item(GeneralItemInit.tabAttributeFood().food(FoodItemProperties.OREBERRY_BURGER)));
	public static final RegistryObject<BowlFoodItem> QUINGUM_SALAD = FARMERS_ITEMS.register("quingum_salad", 
			() -> new BowlFoodItem(GeneralItemInit.tabAttributeFood().food(FoodItemProperties.QUINGUM_SALAD).stacksTo(16)));
	public static final RegistryObject<BowlFoodItem> FANCY_SOUP = FARMERS_ITEMS.register("fancy_soup", 
			() -> new BowlFoodItem(GeneralItemInit.tabAttributeFood().food(FoodItemProperties.FANCY_UNDERGROUND_SOUP).stacksTo(16)));
	public static final RegistryObject<Item> RAW_MEAT_STRIPS = FARMERS_ITEMS.register("raw_meat_strip", 
			() -> new Item(GeneralItemInit.tabAttributeFood().food(FoodItemProperties.RAW_MEAT_STRIPS)));
	public static final RegistryObject<Item> COOKED_MEAT_STRIPS = FARMERS_ITEMS.register("cooked_meat_strip", 
			() -> new Item(GeneralItemInit.tabAttributeFood().food(FoodItemProperties.COOKED_MEAT_STRIPS)));
	public static final RegistryObject<Item> DINO_NUGGET = FARMERS_ITEMS.register("dino_nugget", 
			() -> new Item(GeneralItemInit.tabAttributeFood().food(FoodItemProperties.MEDIUM_BASIC)));
	public static final RegistryObject<Item> DINO_NUGGET_WITH_KETCHUP = FARMERS_ITEMS.register("dino_nugget_ketchup", 
			() -> new Item(GeneralItemInit.tabAttributeFood().food(FoodItemProperties.SLIGHTLY_LESS_MEDIUM_BASIC)));


//Blocks
	public static final RegistryObject<Block> OREBERRY_CRATE = register("oreberry_crate",
			() -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN)
				.strength(1.0f, 1.5F).sound(SoundType.WOOL)), 
			object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeFood()));
	public static final RegistryObject<Block> NO_FRUIT_CRATE = register("no_fruit_crate",
			() -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
				.strength(2.0F, 3.0f).sound(SoundType.WOOD)), 
			object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeFood()));


	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
		return FARMERS_BLOCKS.register(name, block);
	}
	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> obj = registerBlock(name, block);
		FARMERS_ITEMS.register(name, item.apply(obj));
		return obj;
	}
}
