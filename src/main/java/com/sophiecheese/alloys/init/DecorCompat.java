package com.sophiecheese.alloys.init;

import com.mojang.logging.LogUtils;
import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.setup.CompatCheck;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

public class DecorCompat {
	public static final Logger LOGGER = LogUtils.getLogger();
	public static final DeferredRegister.Items DECOR_ITEMS = DeferredRegister.createItems(SophiesAlloys.MOD_ID);

	public static void setupCompat() {
		LOGGER.info("[Sophie's Alloys] Starting Compatibility for Design n Decor");
		CompatCheck.decorPresent = true;
	}

	public static final DeferredItem<Item> DOLOMITE_CHUNK = DECOR_ITEMS.register("dolomite_chunk",
		() -> new Item(ItemInit.standardItem()));
	public static final DeferredItem<Item> GABBRO_CHUNK = DECOR_ITEMS.register("gabbro_chunk",
		() -> new Item(ItemInit.standardItem()));

	public static void register(IEventBus eventBus) {
		DECOR_ITEMS.register(eventBus);
	}
}
