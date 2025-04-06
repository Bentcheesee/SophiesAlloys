package com.sophiecheese.alloys;

import java.util.Locale;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import com.sophiecheese.alloys.init.compat.CompatCheck;
import com.sophiecheese.alloys.setup.ModSetup;
import com.sophiecheese.alloys.setup.Registration;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

@Mod(value = "sophies_alloys")
public class SophiesAlloys {
	public static final String MOD_ID = "sophies_alloys";
	public static final Logger LOGGER = LogUtils.getLogger();
	public SophiesAlloys()
	{
		CompatCheck.setupModCompatPreInit();
		Registration.init();
		ModSetup.setup();
	}
	public static ResourceLocation prefix(String name) {
		return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
	}
}