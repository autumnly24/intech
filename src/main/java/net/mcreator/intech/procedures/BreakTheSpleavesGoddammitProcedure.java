package net.mcreator.intech.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BreakTheSpleavesGoddammitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double breakcount = 0;
		world.destroyBlock(BlockPos.containing(x, y, z), false);
	}
}
