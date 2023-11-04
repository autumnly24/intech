package net.mcreator.intech.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BreakTheSpleavesGoddammitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double breakcount = 0;
		world.destroyBlock(BlockPos.containing(x, y, z), false);
	}
}
