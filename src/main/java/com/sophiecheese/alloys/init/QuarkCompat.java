package com.sophiecheese.alloys.init;

import com.mojang.logging.LogUtils;
import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.setup.CompatCheck;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

public class QuarkCompat {
	public static final Logger LOGGER = LogUtils.getLogger();
	public static final DeferredRegister.Items QUARK_ITEMS = DeferredRegister.createItems(SophiesAlloys.MOD_ID);

	public static void setupCompat() {
		LOGGER.info("[Sophie's Alloys] Starting Compatibility for Quark");
		CompatCheck.quarkPresent = true;
	}

	public static final DeferredItem<Item> QUARKY_LIMESTONE_CHUNK = QUARK_ITEMS.register("quarky_limestone_chunk",
		() -> new Item(ItemInit.standardItem()));
	public static final DeferredItem<Item> JASPER_CHUNK = QUARK_ITEMS.register("jasper_chunk",
		() -> new Item(ItemInit.standardItem()));
	public static final DeferredItem<Item> FROSTY_CHUNK = QUARK_ITEMS.register("frost_chunk",
		() -> new Item(ItemInit.standardItem()));
	public static final DeferredItem<Item> MYALITE_CHUNK = QUARK_ITEMS.register("myalite_chunk",
		() -> new Item(ItemInit.standardItem()));
	public static final DeferredItem<Item> SHALE_SHEET = QUARK_ITEMS.register("shale_sheet",
		() -> new Item(ItemInit.standardItem()));

	public static void register(IEventBus eventBus) {
		QUARK_ITEMS.register(eventBus);
	}
}
