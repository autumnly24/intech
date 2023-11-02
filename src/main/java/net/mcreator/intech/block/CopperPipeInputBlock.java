
package net.mcreator.intech.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.Containers;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.intech.block.entity.CopperPipeInputBlockEntity;

import java.util.List;
import java.util.Collections;

public class CopperPipeInputBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<AttachFace> FACE = FaceAttachedHorizontalDirectionalBlock.FACE;

	public CopperPipeInputBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.COPPER).strength(3f, 6f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(0, 0, 14, 16, 7, 16), box(14, 0, 2, 16, 7, 14), box(0, 0, 2, 2, 7, 14), box(0, 0, 0, 16, 7, 2), box(2, 0, 2, 14, 2, 14), box(2, 4, 2, 14, 5, 13));
				case WALL -> Shapes.or(box(0, 0, 0, 16, 2, 7), box(14, 2, 0, 16, 14, 7), box(0, 2, 0, 2, 14, 7), box(0, 14, 0, 16, 16, 7), box(2, 2, 0, 14, 14, 2), box(2, 3, 4, 14, 14, 5));
				case CEILING -> Shapes.or(box(0, 9, 14, 16, 16, 16), box(0, 9, 2, 2, 16, 14), box(14, 9, 2, 16, 16, 14), box(0, 9, 0, 16, 16, 2), box(2, 14, 2, 14, 16, 14), box(2, 11, 2, 14, 12, 13));
			};
			case NORTH -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(0, 0, 0, 16, 7, 2), box(0, 0, 2, 2, 7, 14), box(14, 0, 2, 16, 7, 14), box(0, 0, 14, 16, 7, 16), box(2, 0, 2, 14, 2, 14), box(2, 4, 3, 14, 5, 14));
				case WALL -> Shapes.or(box(0, 0, 9, 16, 2, 16), box(0, 2, 9, 2, 14, 16), box(14, 2, 9, 16, 14, 16), box(0, 14, 9, 16, 16, 16), box(2, 2, 14, 14, 14, 16), box(2, 3, 11, 14, 14, 12));
				case CEILING -> Shapes.or(box(0, 9, 0, 16, 16, 2), box(14, 9, 2, 16, 16, 14), box(0, 9, 2, 2, 16, 14), box(0, 9, 14, 16, 16, 16), box(2, 14, 2, 14, 16, 14), box(2, 11, 3, 14, 12, 14));
			};
			case EAST -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(14, 0, 0, 16, 7, 16), box(2, 0, 0, 14, 7, 2), box(2, 0, 14, 14, 7, 16), box(0, 0, 0, 2, 7, 16), box(2, 0, 2, 14, 2, 14), box(2, 4, 2, 13, 5, 14));
				case WALL -> Shapes.or(box(0, 0, 0, 7, 2, 16), box(0, 2, 0, 7, 14, 2), box(0, 2, 14, 7, 14, 16), box(0, 14, 0, 7, 16, 16), box(0, 2, 2, 2, 14, 14), box(4, 3, 2, 5, 14, 14));
				case CEILING -> Shapes.or(box(14, 9, 0, 16, 16, 16), box(2, 9, 14, 14, 16, 16), box(2, 9, 0, 14, 16, 2), box(0, 9, 0, 2, 16, 16), box(2, 14, 2, 14, 16, 14), box(2, 11, 2, 13, 12, 14));
			};
			case WEST -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(0, 0, 0, 2, 7, 16), box(2, 0, 14, 14, 7, 16), box(2, 0, 0, 14, 7, 2), box(14, 0, 0, 16, 7, 16), box(2, 0, 2, 14, 2, 14), box(3, 4, 2, 14, 5, 14));
				case WALL -> Shapes.or(box(9, 0, 0, 16, 2, 16), box(9, 2, 14, 16, 14, 16), box(9, 2, 0, 16, 14, 2), box(9, 14, 0, 16, 16, 16), box(14, 2, 2, 16, 14, 14), box(11, 3, 2, 12, 14, 14));
				case CEILING -> Shapes.or(box(0, 9, 0, 2, 16, 16), box(2, 9, 0, 14, 16, 2), box(2, 9, 14, 14, 16, 16), box(14, 9, 0, 16, 16, 16), box(2, 14, 2, 14, 16, 14), box(3, 11, 2, 14, 12, 14));
			};
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, FACE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACE, faceForDirection(context.getNearestLookingDirection())).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	private AttachFace faceForDirection(Direction direction) {
		if (direction.getAxis() == Direction.Axis.Y)
			return direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR;
		else
			return AttachFace.WALL;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 0;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new CopperPipeInputBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof CopperPipeInputBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof CopperPipeInputBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
