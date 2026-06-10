package com.sophiecheese.alloys;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = SophiesAlloys.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = SophiesAlloys.MOD_ID, value = Dist.CLIENT)
public class SophieAlloysClient {
    public SophieAlloysClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        // Some client setup code
        SophiesAlloys.LOGGER.info("I'm inside your walls {}.", Minecraft.getInstance().getUser().getName());
    }
}
