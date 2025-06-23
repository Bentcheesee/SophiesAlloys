package com.sophiecheese.alloys.block;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class NoFruitBlock extends Block{
	private static final VoxelShape FRUIT = Block.box(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);

	public NoFruitBlock(BlockBehaviour.Properties prop) {
		super(prop);
	}

	public VoxelShape getCollisionShape(BlockState blockstate, BlockGetter blockgetter, BlockPos BlockPos, CollisionContext collision) {
		return FRUIT;
	}

	public VoxelShape getBlockSupportShape(BlockState blockstate, BlockGetter blockgetter, BlockPos BlockPos) {
		return Shapes.block();
	}
	
	public VoxelShape getVisualShape(BlockState blockstate, BlockGetter blockgetter, BlockPos BlockPos, CollisionContext collision) {
		return Shapes.block();
	}
	
	public VoxelShape getShape(BlockState blockstate, BlockGetter blockgetter, BlockPos BlockPos, CollisionContext collision) {
		return FRUIT;
	}

	public boolean canSurvive(BlockState blockstate, LevelReader level, BlockPos BlockPos) {
		return !level.isEmptyBlock(BlockPos.below());
	}
	
	@Override
	public void appendHoverText(ItemStack stack, @Nullable BlockGetter getter, List<Component> component, TooltipFlag flag) {
		component.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.GRAY,ChatFormatting.ITALIC));
		super.appendHoverText(stack, getter, component, flag);
	}
	
	@Override
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.DESTROY;
	}
}