package com.sophiecheese.alloys.setup;

import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.init.FarmerCompat;
import com.sophiecheese.alloys.init.QuarkCompat;
import net.neoforged.fml.ModList;

public class CompatCheck {
	public static boolean farmersPresent = false;
	public static boolean quarkPresent = false;
	public static boolean saltPresent = false;

	public static void setupModCompatPreInit() {
		String mod_id = "";
		try {

			mod_id = "farmersdelight";
			ModCompat(mod_id, FarmerCompat::setupCompat);

			mod_id = "quark";
			ModCompat(mod_id, QuarkCompat::setupCompat);
		}
		catch (Throwable tossed) {
			printErrorToLogs("classloading with " + mod_id + " broke something, idk");
			tossed.printStackTrace();
		}
	}
	private static void ModCompat(String mod_id, Runnable bolt){
		try{
			if(ModList.get().isLoaded(mod_id)){
				bolt.run();
			}
		}
		catch (Throwable tossed){
			printErrorToLogs(mod_id);
			tossed.printStackTrace();

		}
	}

	private static void printErrorToLogs(String buh) {
		SophiesAlloys.LOGGER.error("""
			\t
		  [Sophie's Alloys] ERROR: Something broke with %s. Report this to Sophie's Discord or Github!
		 \s
	\t""".formatted(buh));
	}
}
