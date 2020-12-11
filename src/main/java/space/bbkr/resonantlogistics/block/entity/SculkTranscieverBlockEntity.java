package space.bbkr.resonantlogistics.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.BlockPositionSource;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.event.PositionSource;
import net.minecraft.world.event.listener.GameEventListener;
import org.jetbrains.annotations.Nullable;
import space.bbkr.resonantlogistics.ResonantLogistics;

import java.util.HashSet;
import java.util.Set;

public class SculkTranscieverBlockEntity extends BlockEntity implements GameEventListener {
	private final PositionSource source;
	private final Set<BlockPos> knownNodes = new HashSet<>();

	public SculkTranscieverBlockEntity(BlockPos pos, BlockState state) {
		super(null, pos, state); //TODO: FIX ME!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		this.source = new BlockPositionSource(pos);
	}

	@Override
	public PositionSource getEvent() {
		return source;
	}

	@Override
	public int getRange() {
		return 16;
	}

	@Override
	public boolean method_32947(World world, GameEvent eventType, @Nullable Entity entity, BlockPos pos) {
		if (eventType == ResonantLogistics.HAILING_FREQUENCY) {
			BlockEntity be = world.getBlockEntity(pos);
			if (be instanceof SculkTranscieverBlockEntity) {
				if (!knownNodes.contains(pos)) {
					knownNodes.add(pos);
					((SculkTranscieverBlockEntity) be).knownNodes.add(this.pos);

				}
			} else {
				knownNodes.remove(pos);
			}
		}
		return false;
	}
}


