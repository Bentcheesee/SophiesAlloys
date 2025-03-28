package com.sophiecheese.alloys.init.compat;

import com.sophiecheese.alloys.SophiesAlloys;

import net.minecraftforge.fml.ModList;

public class CompatCheck {


    public static boolean createPresent = false;
	public static boolean farmersPresent = false;
    public static void setupModCompatPreInit(){
        String mod_id = "";

        try{

            mod_id = "create";
            ModCompat(mod_id, () -> CreateCompat.setupCompat());
            
            mod_id = "farmersdelight";
            ModCompat(mod_id, () -> FarmersCompat.setupCompat());
            
            //mod_id = "quark";  I'm going to get to these eventually, I just want to have a lot of my other stuff properly set up first. 
            //ModCompat(mod_id, () -> QuarkCompat.setupCompat());
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
        		
		  [Sophie's Fishing] ERROR: Something broke with %s. Report to Sophie's Discord in Bug Reports!
		  
		""".formatted(buh));
    }

}
