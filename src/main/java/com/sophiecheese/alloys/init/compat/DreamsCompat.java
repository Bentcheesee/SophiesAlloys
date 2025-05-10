package com.sophiecheese.alloys.init.compat;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import com.sophiecheese.alloys.SophiesAlloys;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DreamsCompat {
	private static final Logger LOGGER = LogUtils.getLogger();

	public static void setupCompat() {
		LOGGER.info("[Sophie's Alloys] Starting Compatibility for Create: Dreams and Desires");
		CompatCheck.dreamsPresent = true;
	}
	public static final DeferredRegister<Item> CREATE_DD_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			SophiesAlloys.MOD_ID);

	public static final RegistryObject<Item> GABBRO_CHUNK = CREATE_DD_ITEMS.register("gabbro_chunk", 
			() -> new Item(tabAttributeCreate()));
	public static final RegistryObject<Item> DOLOMITE_CHUNK = CREATE_DD_ITEMS.register("dolomite_chunk", 
			() -> new Item(tabAttributeCreate()));

	public static final Item.Properties tabAttributeCreate() {
		return new Item.Properties().tab(CreateCompat.SOPH_CREATE);
	}
}
