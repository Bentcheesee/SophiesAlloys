package com.sophiecheese.alloys.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class NoFruitBlock extends Block{
	   private static final VoxelShape FRUIT = Block.box(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);

	   public NoFruitBlock(BlockBehaviour.Properties p_221545_) {
	      super(p_221545_);
	   }

	   public VoxelShape getCollisionShape(BlockState p_221561_, BlockGetter p_221562_, BlockPos p_221563_, CollisionContext p_221564_) {
	      return FRUIT;
	   }

	   public VoxelShape getBlockSupportShape(BlockState p_221566_, BlockGetter p_221567_, BlockPos p_221568_) {
	      return Shapes.block();
	   }

	   public VoxelShape getVisualShape(BlockState p_221556_, BlockGetter p_221557_, BlockPos p_221558_, CollisionContext p_221559_) {
	      return Shapes.block();
	   }

	   public VoxelShape getShape(BlockState p_54889_, BlockGetter p_54890_, BlockPos p_54891_, CollisionContext p_54892_) {
	      return FRUIT;
	   }

}
