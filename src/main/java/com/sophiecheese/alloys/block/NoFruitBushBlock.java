package com.sophiecheese.alloys.block;

import com.sophiecheese.alloys.worldgen.NoFruitTreeGrower;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AzaleaBlock;
import net.minecraft.world.level.block.state.BlockState;

public class NoFruitBushBlock extends AzaleaBlock{

	public NoFruitBushBlock(Properties prop) {
		super(prop);
	}
	
	private static final NoFruitTreeGrower TREE_GROWER = new NoFruitTreeGrower();
	
	@Override
	public void performBonemeal(ServerLevel Slevel, RandomSource Rsource, BlockPos blockpos, BlockState blockstate) {
		TREE_GROWER.growTree(Slevel, Slevel.getChunkSource().getGenerator(), blockpos, blockstate, Rsource);
	}
}
