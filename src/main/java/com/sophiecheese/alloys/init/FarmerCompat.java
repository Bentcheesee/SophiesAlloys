package com.sophiecheese.alloys.init;

import com.mojang.logging.LogUtils;
import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.item.BowlDescItem;
import com.sophiecheese.alloys.item.FoodItemProperties;
import com.sophiecheese.alloys.setup.CompatCheck;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

public class FarmerCompat {
	public static final Logger LOGGER = LogUtils.getLogger();
	public static final DeferredRegister.Items FARMERS_ITEMS = DeferredRegister.createItems(SophiesAlloys.MOD_ID);

	public static void setupCompat() {
		LOGGER.info("[Sophie's Alloys] Starting Compatibility for Farmer's Delight");
		CompatCheck.farmersPresent = true;
	}

	public static final DeferredItem<Item> OREBERRY_SALAD = FARMERS_ITEMS.register("oreberry_salad",
		() -> new BowlDescItem(true, bowlItem().food(FoodItemProperties.OREBERRY_SALAD)));
	public static final DeferredItem<Item> OREBERRY_BURGER = FARMERS_ITEMS.register("oreberry_burger",
		() -> new BowlDescItem(true, ItemInit.standardItem().food(FoodItemProperties.OREBERRY_BURGER)));
	public static final DeferredItem<Item> QUINGUM_SALAD = FARMERS_ITEMS.register("quingum_salad",
		() -> new BowlDescItem(true, bowlItem().food(FoodItemProperties.QUINGUM_SALAD)));
	public static final DeferredItem<Item> FANCY_SOUP = FARMERS_ITEMS.register("fancy_soup",
		() -> new BowlDescItem(true, bowlItem().food(FoodItemProperties.FANCY_UNDERGROUND_SOUP)));
	public static final DeferredItem<Item> RAW_MEAT_STRIPS = FARMERS_ITEMS.register("raw_meat_strip",
		() -> new BowlDescItem(true, ItemInit.standardItem().food(FoodItemProperties.RAW_MEAT_STRIPS)));
	public static final DeferredItem<Item> COOKED_MEAT_STRIPS = FARMERS_ITEMS.register("cooked_meat_strip",
		() -> new BowlDescItem(true, ItemInit.standardItem().food(FoodItemProperties.COOKED_MEAT_STRIPS)));
	public static final DeferredItem<Item> DINO_NUGGET = FARMERS_ITEMS.register("dino_nugget",
		() -> new BowlDescItem(true, ItemInit.standardItem().food(FoodItemProperties.MEDIUM_BASIC)));
	public static final DeferredItem<Item> DINO_NUGGET_KETCHUP = FARMERS_ITEMS.register("dino_nugget_ketchup",
		() -> new BowlDescItem(true, ItemInit.standardItem().food(FoodItemProperties.SLIGHTLY_LESS_MEDIUM_BASIC)));

	public static Item.Properties bowlItem() {
		return new Item.Properties().stacksTo(16);
	}
	public static void register(IEventBus eventBus) {
		FARMERS_ITEMS.register(eventBus);
	}
}
