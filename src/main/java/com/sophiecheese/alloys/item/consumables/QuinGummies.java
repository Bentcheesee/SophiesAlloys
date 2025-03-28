package com.sophiecheese.alloys.item.consumables;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;

public class QuinGummies extends PotionItem{

	   public QuinGummies(Item.Properties p_42979_) {
	      super(p_42979_);
	   }

	   @Override
	   public ItemStack finishUsingItem(ItemStack p_42984_, Level p_42985_, LivingEntity p_42986_) {
	      Player player = p_42986_ instanceof Player ? (Player)p_42986_ : null;
	      if (player instanceof ServerPlayer) {
	         CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer)player, p_42984_);
	      }

	      if (!p_42985_.isClientSide) {
	         for(MobEffectInstance mobeffectinstance : PotionUtils.getMobEffects(p_42984_)) {
	            if (mobeffectinstance.getEffect().isInstantenous()) {
	               mobeffectinstance.getEffect().applyInstantenousEffect(player, player, p_42986_, mobeffectinstance.getAmplifier(), 1.0D);
	            } else {
	               p_42986_.addEffect(new MobEffectInstance(mobeffectinstance));
	            }
	         }
	      }

	      if (player != null) {
	         player.awardStat(Stats.ITEM_USED.get(this));
	         if (!player.getAbilities().instabuild) {
	            p_42984_.shrink(1);
	         }
	      }

	      p_42986_.gameEvent(GameEvent.EAT);
	      return p_42984_;
	   }

	   @Override
	   public int getUseDuration(ItemStack p_43001_) {
	      return 32;
	   }

	   @Override
	   public UseAnim getUseAnimation(ItemStack p_42997_) {
	      return UseAnim.EAT;
	   }

}
