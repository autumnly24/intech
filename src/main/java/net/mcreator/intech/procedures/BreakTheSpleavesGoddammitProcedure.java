package net.mcreator.intech.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BreakTheSpleavesGoddammitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double breakcount = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == IntechModBlocks.COPPER_SPLEAVES.get()) {
			IntechMod.queueServerWork(5, () -> {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			});
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == IntechModBlocks.EXPOSED_COPPER_SPLEAVES.get()) {
			IntechMod.queueServerWork(8, () -> {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			});
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == IntechModBlocks.WEATHERED_COPPER_SPLEAVES.get()) {
			IntechMod.queueServerWork(14, () -> {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			});
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == IntechModBlocks.OXIDIZED_COPPER_SPLEAVES.get()) {
			IntechMod.queueServerWork(22, () -> {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			});
		}
	}
}
