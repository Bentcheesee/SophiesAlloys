package com.sophiecheese.alloys.init.compat;

import java.util.function.Function;

import org.slf4j.Logger;

import com.google.common.base.Supplier;
import com.mojang.logging.LogUtils;
import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.init.GeneralItemInit;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class QuarkCompat {
	private static final Logger LOGGER = LogUtils.getLogger();

	public static void setupCompat() {
		LOGGER.info("[Sophie's Alloys] Starting Compatibility for Quark");
		CompatCheck.quarkPresent = true;
	}

	public static final DeferredRegister<Item> QUARK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			SophiesAlloys.MOD_ID);
	public static final DeferredRegister<Block> QUARK_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			SophiesAlloys.MOD_ID);

//Items
	public static final RegistryObject<Item> QUARKY_LIMESTONE_CHUNK = QUARK_ITEMS.register("quarky_limestone_chunk", 
			() -> new Item(GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Item> JASPER_CHUNK = QUARK_ITEMS.register("jasper_chunk", 
			() -> new Item(GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Item> FROSTY_CHUNK = QUARK_ITEMS.register("frost_chunk", 
			() -> new Item(GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Item> MYALITE_CHUNK = QUARK_ITEMS.register("myalite_chunk", 
			() -> new Item(GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Item> SHALE_SHEET = QUARK_ITEMS.register("shale_sheet", 
			() -> new Item(GeneralItemInit.tabAttributeAlloy()));


//Blocks


	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
		return QUARK_BLOCKS.register(name, block);
	}
	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> obj = registerBlock(name, block);
		QUARK_ITEMS.register(name, item.apply(obj));
		return obj;
	}
}
