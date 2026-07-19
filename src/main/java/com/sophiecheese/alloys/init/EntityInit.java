package com.sophiecheese.alloys.init;

import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.entity.SuspicousBlockBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EntityInit {
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
		DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, SophiesAlloys.MOD_ID);

	public static final Supplier<BlockEntityType<SuspicousBlockBlockEntity>> SUSPICIOUS_BLOCK_ENTITY = BLOCK_ENTITIES.register("suspicious_block",
			() -> BlockEntityType.Builder.of(SuspicousBlockBlockEntity::new, BlockInit.SUSPICIOUS_SLATE.get(),BlockInit.SUSPICIOUS_DEEP_GRAVEL.get(),BlockInit.SUSPICIOUS_DEEP_SAND.get(),BlockInit.SUSPICIOUS_BLACK_GRAVEL.get(),BlockInit.SUSPICIOUS_BLACK_SAND.get(),BlockInit.SUSPICIOUS_SOUL_GRAVEL.get(),BlockInit.SUSPICIOUS_SOUL_SOIL.get()).build(null));


	public static void register(IEventBus eventBus) {
		BLOCK_ENTITIES.register(eventBus);
	}
}
