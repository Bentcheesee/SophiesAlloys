package com.sophiecheese.alloys.util;

import com.sophiecheese.alloys.SophiesAlloys;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class AlloysSoundEvents {
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, SophiesAlloys.MOD_ID);


	public static final Supplier<SoundEvent> POWERED_LANTERN_ON = registerSoundEvent("block.powered_lantern.turn_on");
	public static final Supplier<SoundEvent> POWERED_LANTERN_OFF = registerSoundEvent("block.powered_lantern.turn_off");
	public static final Supplier<SoundEvent> POWERED_LANTERN_LOCKED = registerSoundEvent("block.powered_lantern.lock");
	public static final Supplier<SoundEvent> POWERED_LANTERN_UNLOCKED = registerSoundEvent("block.powered_lantern.unlock");

	//public static final Supplier<SoundEvent> DUSTY_LAMP_TOGGLE = registerSoundEvent("block.dusty_lamp.toggles");



	private static Supplier<SoundEvent> registerSoundEvent(String name) {
		ResourceLocation id = ResourceLocation.fromNamespaceAndPath(SophiesAlloys.MOD_ID, name);
		return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
	}

	public static void register(IEventBus eventBus) {
		SOUND_EVENTS.register(eventBus);
	}
}
