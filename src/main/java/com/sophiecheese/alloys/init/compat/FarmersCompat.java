package com.sophiecheese.alloys.init.compat;

import java.util.function.Function;

import org.slf4j.Logger;

import com.google.common.base.Supplier;
import com.mojang.logging.LogUtils;
import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.init.GeneralItemInit;

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
	public static final RegistryObject<Item> OREBERRY_SALAD = FARMERS_ITEMS.register("oreberry_salad", 
			() -> new Item(GeneralItemInit.tabAttributeAlloy().food(CompatFoodItemProperties.OREBERRY_SALAD)));
	

//Blocks
	public static final RegistryObject<Block> OREBERRY_CRATE = register("oreberry_crate",
			() -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN)
				.strength(3.0f).requiresCorrectToolForDrops()
				.sound(SoundType.WOOL)), 
			object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));

	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
		return FARMERS_BLOCKS.register(name, block);
	}
	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> obj = registerBlock(name, block);
		FARMERS_ITEMS.register(name, item.apply(obj));
		return obj;
	}
}
