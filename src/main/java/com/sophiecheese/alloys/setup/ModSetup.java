package com.sophiecheese.alloys.setup;

import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.init.compat.CompatCheck;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
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

}
