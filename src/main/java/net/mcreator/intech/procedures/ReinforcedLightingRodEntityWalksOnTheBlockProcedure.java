package net.mcreator.intech.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class ReinforcedLightingRodEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), 0, (Mth.nextDouble(RandomSource.create(), -0.1, 0.1))));
	}
}
