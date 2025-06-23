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

public class UnusedCompat {
	private static final Logger LOGGER = LogUtils.getLogger();

	public static void setupCompat() {
		LOGGER.info("[Sophie's Alloys] Starting Compatibility for who knows");
	}

	public static final DeferredRegister<Item> HOLY_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			SophiesAlloys.MOD_ID);
	public static final DeferredRegister<Block> HOLY_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			SophiesAlloys.MOD_ID);

//Items
	public static final RegistryObject<Item> ROSE_GOLD_DUST = HOLY_ITEMS.register("rose_gold_dust", 
			() -> new Item(GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Item> ROSE_GOLD_SHEET = HOLY_ITEMS.register("rose_gold_sheet", 
			() -> new Item(GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Item> ROSE_GOLD_ROUGH_SHEET = HOLY_ITEMS.register("rough_rose_gold_sheet", 
			() -> new Item(GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Item> ROSE_GOLD_UPGRADE = HOLY_ITEMS.register("rose_gold_upgrade", 
			() -> new Item(GeneralItemInit.tabAttributeAlloy()));


//Blocks


	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
		return HOLY_BLOCKS.register(name, block);
	}
	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> obj = registerBlock(name, block);
		HOLY_ITEMS.register(name, item.apply(obj));
		return obj;
	}
}
