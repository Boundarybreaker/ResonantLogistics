package space.bbkr.resonantlogistics.block;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.listener.GameEventListener;
import org.jetbrains.annotations.Nullable;
import space.bbkr.resonantlogistics.block.entity.SculkTranscieverBlockEntity;

public class SculkTranscieverBlock extends BlockWithEntity {
	public SculkTranscieverBlock(Settings settings) {
		super(settings);
	}

	@Override
	public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new SculkTranscieverBlockEntity(pos, state);
	}

	@Override
	public @Nullable <T extends BlockEntity> GameEventListener getGameEventListener(World world, T be) {
		return be instanceof SculkTranscieverBlockEntity? (SculkTranscieverBlockEntity) be : null;
	}

	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}

	@Override
	public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
		return null;
	}
}
