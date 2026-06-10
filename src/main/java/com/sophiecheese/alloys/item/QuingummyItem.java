package com.sophiecheese.alloys.item;

import com.sophiecheese.alloys.init.ItemInit;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class QuingummyItem extends DescItem {
	public QuingummyItem(Boolean hasEffect, Properties prop) {
		super(hasEffect, prop);
	}


	public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
		super.finishUsingItem(stack, level, entity);
		if (entity instanceof ServerPlayer serverplayer) {
			CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, stack);
			serverplayer.awardStat(Stats.ITEM_USED.get(this));
		}

		if (!level.isClientSide) {
			entity.removeEffect(MobEffects.WITHER);
			entity.removeEffect(MobEffects.POISON);
		}

		if (stack.isEmpty()) {
			return new ItemStack(ItemInit.GUMMY_MOLD.get());
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				ItemStack itemstack = new ItemStack(ItemInit.GUMMY_MOLD.get());
				if (!player.getInventory().add(itemstack)) {
					player.drop(itemstack, false);
				}
			}
			return stack;
		}
	}

	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		return ItemUtils.startUsingInstantly(level, player, hand);
	}
}
