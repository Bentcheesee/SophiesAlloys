package com.sophiecheese.alloys.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.registries.RegistryObject;

public class SophieFlammableLogBlock extends RotatedPillarBlock  {
    RegistryObject<RotatedPillarBlock> stripped;
    /**
     * @param strippedBlock The Block Registry Object that replaces this block when it is stripped (right-clicked with an axe)
     * */
    public SophieFlammableLogBlock(Properties properties, RegistryObject<RotatedPillarBlock> strippedBlock) {
        super(properties);
        this.stripped = strippedBlock;
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return true;
    }
	
	@Override
	public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
		// TODO Auto-generated method stub
		return 5;
	}
	
	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
		// TODO Auto-generated method stub
		return 5;
	}

    @Override
    public @org.jetbrains.annotations.Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(toolAction.equals(ToolActions.AXE_STRIP)) {
        return stripped.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
    }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
