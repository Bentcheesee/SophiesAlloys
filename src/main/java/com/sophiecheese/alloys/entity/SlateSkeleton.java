package com.sophiecheese.alloys.entity;

import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class SlateSkeleton extends AbstractSkeleton {
	protected SlateSkeleton(EntityType<? extends AbstractSkeleton> entityType, Level level) {
		super(entityType, level);
	}

	@Override
	protected void defineSynchedData(SynchedEntityData.Builder builder) {
		super.defineSynchedData(builder);
	}

	@Override
	public boolean canFreeze() {
		return false;
	}

	// Want to make it fire immune due to being rock
//	public boolean isInvulnerableTo(DamageSource source) {
//		boolean isVanillaInvulnerable = this.isRemoved()
//			|| this.isInvulnerable() && !source.is(DamageTypeTags.BYPASSES_INVULNERABILITY) && !source.isCreativePlayer()
//			|| source.is(DamageTypeTags.IS_FIRE) && this.fireImmune()
//			|| source.is(DamageTypeTags.IS_FALL) && this.getType().is(EntityTypeTags.FALL_DAMAGE_IMMUNE);
//		return net.neoforged.neoforge.common.CommonHooks.isEntityInvulnerableTo(this, source, isVanillaInvulnerable);
//	}

	@Override
	protected SoundEvent getAmbientSound() {
		return SoundEvents.SKELETON_AMBIENT;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSource) {
		return SoundEvents.SKELETON_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundEvents.SKELETON_DEATH;
	}

	@Override
	protected SoundEvent getStepSound() {
		return SoundEvents.SKELETON_STEP;
	}

	@Override
	protected void dropCustomDeathLoot(ServerLevel level, DamageSource damageSource, boolean recentlyHit) {
		super.dropCustomDeathLoot(level, damageSource, recentlyHit);
		if (damageSource.getEntity() instanceof Creeper creeper && creeper.canDropMobsSkull()) {
			creeper.increaseDroppedSkulls();
			this.spawnAtLocation(Items.SKELETON_SKULL);
		}
	}
}
