package net.mcreator.intech.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Comparator;

public class CopperPipeInputUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Entity ItemEntity = null;
		if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), 1, 1, 1), e -> true).isEmpty() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 0) == 0) {
			ItemEntity = (Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf((x + 0.5), (y + 0.5), (z + 0.5))).findFirst().orElse(null);
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final ItemStack _setstack = (ItemEntity instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY);
					_setstack.setCount((ItemEntity instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getCount());
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
			if (!ItemEntity.level().isClientSide())
				ItemEntity.discard();
		} else {
			if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.NORTH
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("face") instanceof EnumProperty _getep11 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep11).toString() : "")
							.equals("wall")) {
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("intech:pipes")))) {
					PipeInputMoveItemProcedure.execute(world, x, y, z);
				}
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.EAST
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("face") instanceof EnumProperty _getep17 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep17).toString() : "")
							.equals("wall")) {
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("intech:pipes")))) {
					PipeInputMoveItemProcedure.execute(world, x, y, z);
				}
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.SOUTH
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("face") instanceof EnumProperty _getep23 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep23).toString() : "")
							.equals("wall")) {
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("intech:pipes")))) {
					PipeInputMoveItemProcedure.execute(world, x, y, z);
				}
			} else if ((new Object() {
				public Direction getDirection(BlockPos pos) {
					BlockState _bs = world.getBlockState(pos);
					Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (property != null && _bs.getValue(property) instanceof Direction _dir)
						return _dir;
					else if (_bs.hasProperty(BlockStateProperties.AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
					else if (_bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
						return Direction.fromAxisAndDirection(_bs.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
					return Direction.NORTH;
				}
			}.getDirection(BlockPos.containing(x, y, z))) == Direction.WEST
					&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("face") instanceof EnumProperty _getep29 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep29).toString() : "")
							.equals("wall")) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("intech:pipes")))) {
					PipeInputMoveItemProcedure.execute(world, x, y, z);
				}
			} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("face") instanceof EnumProperty _getep33 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep33).toString() : "")
					.equals("floor")) {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("intech:pipes")))) {
					PipeInputMoveItemProcedure.execute(world, x, y, z);
				}
			} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("face") instanceof EnumProperty _getep37 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep37).toString() : "")
					.equals("ceiling")) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("intech:pipes")))) {
					PipeInputMoveItemProcedure.execute(world, x, y, z);
				}
			}
		}
	}
}
