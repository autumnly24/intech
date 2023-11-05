package net.mcreator.intech.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.intech.init.IntechModBlocks;
import net.mcreator.intech.IntechMod;

public class BreakTheSpleavesGoddammitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double breakcount = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == IntechModBlocks.COPPER_SPLEAVES.get()) {
			entity.fallDistance = 1;
			IntechMod.queueServerWork(5, () -> {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			});
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == IntechModBlocks.EXPOSED_COPPER_SPLEAVES.get()) {
			entity.fallDistance = 1;
			IntechMod.queueServerWork(8, () -> {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			});
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == IntechModBlocks.WEATHERED_COPPER_SPLEAVES.get()) {
			entity.fallDistance = 1;
			IntechMod.queueServerWork(14, () -> {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			});
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == IntechModBlocks.OXIDIZED_COPPER_SPLEAVES.get()) {
			entity.fallDistance = 1;
			IntechMod.queueServerWork(22, () -> {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
			});
		}
	}
}
