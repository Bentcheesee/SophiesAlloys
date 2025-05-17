package com.sophiecheese.alloys.setup;

import com.sophiecheese.alloys.init.GeneralItemInit;
import com.sophiecheese.alloys.init.OreBlockInit;
import com.sophiecheese.alloys.init.OtherBlocksInit;
import com.sophiecheese.alloys.init.PaintingsInit;
import com.sophiecheese.alloys.init.ToolItemInit;
import com.sophiecheese.alloys.init.compat.CompatCheck;
import com.sophiecheese.alloys.init.compat.CreateCompat;
import com.sophiecheese.alloys.init.compat.DreamsCompat;
import com.sophiecheese.alloys.init.compat.FarmersCompat;
import com.sophiecheese.alloys.init.compat.QuarkCompat;
import com.sophiecheese.alloys.worldgen.AlloysConfiguredFeatures;
import com.sophiecheese.alloys.worldgen.AlloysPlacedFeatures;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class Registration {
	public static final String MOD_ID = "sophies_alloys";
	public static void init(){

	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ToolItemInit.ITEMS.register(bus);
		OreBlockInit.BLOCKS.register(bus);
		OtherBlocksInit.BLOCKS.register(bus);
		GeneralItemInit.ITEMS.register(bus);
		PaintingsInit.PAINTINGS.register(bus);

		AlloysConfiguredFeatures.CONFIGURED_FEATURES.register(bus);
		AlloysPlacedFeatures.PLACED_FEATURES.register(bus);

		if(CompatCheck.createPresent){
			CreateCompat.CREATE_ITEMS.register(bus);
			CreateCompat.CREATE_BLOCKS.register(bus);
		}
		if(CompatCheck.dreamsPresent){
			DreamsCompat.CREATE_DD_ITEMS.register(bus);
		}
		if(CompatCheck.farmersPresent){
			FarmersCompat.FARMERS_ITEMS.register(bus);
			FarmersCompat.FARMERS_BLOCKS.register(bus);
		}
//		if(CompatCheck.farmersPresent && CompatCheck.createPresent){
//		I might do some specific blocks that only appear if both are present, like a Chocolaty Oreberry Cake
//		}
		if(CompatCheck.quarkPresent){
			QuarkCompat.QUARK_ITEMS.register(bus);
			QuarkCompat.QUARK_BLOCKS.register(bus);
		}
	}
	
//	public static void registerCompostables() {
//		ComposterBlock.COMPOSTABLES.put(OtherBlocksInit.NO_FRUIT_BLOCK.get(), 0.6F);
//		ComposterBlock.COMPOSTABLES.put(OtherBlocksInit.NO_FRUIT_BUSH.get(), 0.3F);
//		ComposterBlock.COMPOSTABLES.put(GeneralItemInit.SMUSHROOM.get(), 0.5F);
//		ComposterBlock.COMPOSTABLES.put(GeneralItemInit.LICHUORICE.get(), 0.4F);
//		ComposterBlock.COMPOSTABLES.put(GeneralItemInit.MOSSY_MUSH.get(), 0.35F);
//		ComposterBlock.COMPOSTABLES.put(OtherBlocksInit.OREBERRY_BUSH_BLOCK.get(), 0.3F);
//	}
}