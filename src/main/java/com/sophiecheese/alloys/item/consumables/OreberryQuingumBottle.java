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

	public OreberryQuingumBottle(Properties p_41383_) {
		super(p_41383_);
	}

	@Override
	public ItemStack finishUsingItem(ItemStack p_41348_, Level p_41349_, LivingEntity p_41350_) {
		super.finishUsingItem(p_41348_, p_41349_, p_41350_);
		if (p_41350_ instanceof ServerPlayer serverplayer) {
			CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, p_41348_);
			serverplayer.awardStat(Stats.ITEM_USED.get(this));
		}
		if (!p_41349_.isClientSide) {
			 p_41350_.removeEffect(MobEffects.WITHER);
			 p_41350_.removeEffect(MobEffects.POISON);
			 p_41350_.removeEffect(MobEffects.DIG_SLOWDOWN);
		}
		if (p_41348_.isEmpty()) {
			return new ItemStack(Items.GLASS_BOTTLE);
			} else {
				if (p_41350_ instanceof Player && !((Player)p_41350_).getAbilities().instabuild) {
					ItemStack itemstack = new ItemStack(Items.GLASS_BOTTLE);
					Player player = (Player)p_41350_;
					if (!player.getInventory().add(itemstack)) {
						player.drop(itemstack, false);
					}
				}
			return p_41348_;
		}
	}

}
