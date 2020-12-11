package space.bbkr.resonantlogistics.api;

import net.minecraft.util.math.BlockPos;

import java.util.HashSet;
import java.util.Set;

public class Task {
	private final BlockPos source;
	private final Set<BlockPos> hailed;
	private final Set<BlockPos> queried;

	public Task(BlockPos source) {
		this.source = source;
		this.hailed = new HashSet<>();
		this.queried = new HashSet<>();
	}
}
