package net.mcreator.intech.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ReinforcedLightingRodEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), 0, (Mth.nextDouble(RandomSource.create(), -0.1, 0.1))));
	}
}
