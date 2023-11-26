package net.mcreator.intech.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AncientCoilBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"stopsound @a block intech:block.ancient_coil.ambient");
	}
}
