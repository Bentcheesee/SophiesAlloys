package com.sophiecheese.alloys.block;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

import javax.annotation.Nullable;
import java.util.List;

public class DustyLampBlock extends Block {
	private int outputPower;
	public static final BooleanProperty LIT = BooleanProperty.create("lit");

	public DustyLampBlock(int power, Properties properties) {
		super(properties);
		this.outputPower = power;
		this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
	}


	@Override
	protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
		if (level.isClientSide) {
			return InteractionResult.SUCCESS;
		} else {
			this.toggle(state, level, pos, null);
			return InteractionResult.CONSUME;
		}
	}

	public void toggle(BlockState state, Level level, BlockPos pos, @Nullable Player player) {
		state = state.cycle(LIT);
		level.setBlock(pos, state, 3);
		this.updateNeighbours(state, level, pos);
		playSound(player, level, pos, state);
		level.gameEvent(player, state.getValue(LIT) ? GameEvent.BLOCK_ACTIVATE : GameEvent.BLOCK_DEACTIVATE, pos);
	}

	protected static void playSound(@Nullable Player player, LevelAccessor level, BlockPos pos, BlockState state) {
		float f = state.getValue(LIT) ? 0.4F : 0.6F;
		level.playSound(player, pos, SoundEvents.LEVER_CLICK, SoundSource.BLOCKS, 0.3F, f);
	}


	private void updateNeighbours(BlockState state, Level level, BlockPos pos) {
		level.updateNeighborsAt(pos, this);
	}

	@Override
	public int getSignal(BlockState state, BlockGetter getter, BlockPos pos, Direction direction) {
		return state.getValue(LIT) ? this.outputPower : 0;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(LIT);
	}

	@Override
	public void appendHoverText(ItemStack itemStack, Item.TooltipContext context, List<Component> component, TooltipFlag flag) {
		component.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
		super.appendHoverText(itemStack, context, component, flag);
	}
}
