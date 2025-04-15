package com.sophiecheese.alloys.setup;

import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.init.OtherBlocksInit;
import com.sophiecheese.alloys.init.compat.CompatCheck;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = SophiesAlloys.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModSetup {

	public static void init(FMLCommonSetupEvent event){
		event.enqueueWork(() -> {
			CompatCheck.setupModCompatPreInit();
		});
	}

	public static void setup(){
		IEventBus bus = MinecraftForge.EVENT_BUS;
	}
	
	@Mod.EventBusSubscriber(modid = SophiesAlloys.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
	public static class ClientSetupEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(OtherBlocksInit.NO_FRUIT_BUSH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(OtherBlocksInit.OREBERRY_BUSH_BLOCK.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(OtherBlocksInit.POTTED_NO_FRUIT_BUSH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(OtherBlocksInit.POTTED_OREBERRY_BUSH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(OtherBlocksInit.POTTED_SWEETBERRY_BUSH.get(), RenderType.cutout());
		}
	}
}