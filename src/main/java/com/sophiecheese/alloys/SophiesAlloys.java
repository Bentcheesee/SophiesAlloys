package com.sophiecheese.alloys;

import com.sophiecheese.alloys.init.*;
import com.sophiecheese.alloys.setup.CompatCheck;
import com.sophiecheese.alloys.setup.Registration;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(SophiesAlloys.MOD_ID)
public class SophiesAlloys {
    public static final String MOD_ID = "sophies_alloys";
    public static final Logger LOGGER = LogUtils.getLogger();
    public SophiesAlloys(IEventBus modEventBus, ModContainer modContainer) {
		CompatCheck.setupModCompatPreInit();

        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        Registration.register(modEventBus);

        ItemInit.register(modEventBus);
		BlockInit.register(modEventBus);


		if(CompatCheck.farmersPresent){
			FarmerCompat.register(modEventBus);
		}
		if(CompatCheck.quarkPresent){
			QuarkCompat.register(modEventBus);
		}
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
