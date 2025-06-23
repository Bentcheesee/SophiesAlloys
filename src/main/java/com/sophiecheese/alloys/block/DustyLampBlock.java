package com.sophiecheese.alloys.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

public class DustyLampBlock extends Block{
	private int outputPower;
	public static final BooleanProperty LIT = BooleanProperty.create("lit");

	public DustyLampBlock(int power, Properties properties) {
		super(properties);
		this.outputPower = power;
		this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
	}
	
	@Override
	public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player,
			InteractionHand hand, BlockHitResult hitResult) {
        float f = state.getValue(LIT) ? 0.4F : 0.6F;
		if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND && player.getMainHandItem().isEmpty() && player.getOffhandItem().isEmpty()) {
			level.setBlock(pos, state.cycle(LIT), 3);
			level.playSound((Player)null, pos, SoundEvents.LEVER_CLICK, SoundSource.BLOCKS, 0.3F, f);
			level.gameEvent(player, state.getValue(LIT) ? GameEvent.BLOCK_ACTIVATE : GameEvent.BLOCK_DEACTIVATE, pos);
			return InteractionResult.CONSUME;
		}
		return super.use(state, level, pos, player, hand, hitResult);
	}
	
	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(LIT);
	}

	@Override
	public int getSignal(BlockState state, BlockGetter getter, BlockPos pos, Direction direction) {
		return state.getValue(LIT) ? this.outputPower : 0;
	}
}