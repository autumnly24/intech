package net.mcreator.intech.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.intech.init.IntechModBlocks;

public class LightningBulbUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "energy") > 0) {
			world.setBlock(BlockPos.containing(x, y, z), IntechModBlocks.LIT_LIGHTNING_BULB.get().defaultBlockState(), 3);
		}
	}
}
