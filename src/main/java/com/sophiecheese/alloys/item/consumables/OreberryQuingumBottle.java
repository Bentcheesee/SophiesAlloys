package com.sophiecheese.alloys.item.consumables;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class OreberryQuingumBottle extends QuingumBottle{

	public OreberryQuingumBottle(Properties prop) {
		super(prop);
	}

	@Override
	public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
		super.finishUsingItem(stack, level, entity);
		if (entity instanceof ServerPlayer serverplayer) {
			CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, stack);
			serverplayer.awardStat(Stats.ITEM_USED.get(this));
		}
		if (!level.isClientSide) {
			 entity.removeEffect(MobEffects.WITHER);
			 entity.removeEffect(MobEffects.POISON);
			 entity.removeEffect(MobEffects.DIG_SLOWDOWN);
		}
		if (stack.isEmpty()) {
			return new ItemStack(Items.GLASS_BOTTLE);
			} else {
				if (entity instanceof Player && !((Player)entity).getAbilities().instabuild) {
					ItemStack itemstack = new ItemStack(Items.GLASS_BOTTLE);
					Player player = (Player)entity;
					if (!player.getInventory().add(itemstack)) {
						player.drop(itemstack, false);
					}
				}
			return stack;
		}
	}

}
