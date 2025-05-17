package com.sophiecheese.alloys.init;

import com.sophiecheese.alloys.SophiesAlloys;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PaintingsInit {

	public static final DeferredRegister<PaintingVariant> PAINTINGS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, 
			SophiesAlloys.MOD_ID);
	public static final RegistryObject<PaintingVariant> CORRUPTION = PAINTINGS.register("corruption", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> KNIGHT = PAINTINGS.register("knight", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> LEG = PAINTINGS.register("leg", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> MASS = PAINTINGS.register("mass", () -> new PaintingVariant(48, 32));
	public static final RegistryObject<PaintingVariant> META = PAINTINGS.register("meta", () -> new PaintingVariant(64, 32));
	public static final RegistryObject<PaintingVariant> MISSING = PAINTINGS.register("missing", () -> new PaintingVariant(16, 32));
}