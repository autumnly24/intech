
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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.Containers;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.intech.procedures.ReinforcedLightingRodUpdateTickProcedure;
import net.mcreator.intech.block.entity.ReinforcedLightingRodBlockEntity;

import java.util.List;
import java.util.Collections;

public class ReinforcedLightingRodBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<AttachFace> FACE = FaceAttachedHorizontalDirectionalBlock.FACE;

	public ReinforcedLightingRodBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.COPPER).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
				case FLOOR -> Shapes.or(box(7, 0, 7, 9, 12, 9), box(6, 5, 6, 10, 6, 10), box(6, 3, 6, 10, 4, 10), box(6, 12, 6, 10, 16, 10));
				case WALL -> Shapes.or(box(7, 7, 0, 9, 9, 12), box(6, 6, 5, 10, 10, 6), box(6, 6, 3, 10, 10, 4), box(6, 6, 12, 10, 10, 16));
				case CEILING -> Shapes.or(box(7, 4, 7, 9, 16, 9), box(6, 10, 6, 10, 11, 10), box(6, 12, 6, 10, 13, 10), box(6, 0, 6, 10, 4, 10));
			};
			case NORTH -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(7, 0, 7, 9, 12, 9), box(6, 5, 6, 10, 6, 10), box(6, 3, 6, 10, 4, 10), box(6, 12, 6, 10, 16, 10));
				case WALL -> Shapes.or(box(7, 7, 4, 9, 9, 16), box(6, 6, 10, 10, 10, 11), box(6, 6, 12, 10, 10, 13), box(6, 6, 0, 10, 10, 4));
				case CEILING -> Shapes.or(box(7, 4, 7, 9, 16, 9), box(6, 10, 6, 10, 11, 10), box(6, 12, 6, 10, 13, 10), box(6, 0, 6, 10, 4, 10));
			};
			case EAST -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(7, 0, 7, 9, 12, 9), box(6, 5, 6, 10, 6, 10), box(6, 3, 6, 10, 4, 10), box(6, 12, 6, 10, 16, 10));
				case WALL -> Shapes.or(box(0, 7, 7, 12, 9, 9), box(5, 6, 6, 6, 10, 10), box(3, 6, 6, 4, 10, 10), box(12, 6, 6, 16, 10, 10));
				case CEILING -> Shapes.or(box(7, 4, 7, 9, 16, 9), box(6, 10, 6, 10, 11, 10), box(6, 12, 6, 10, 13, 10), box(6, 0, 6, 10, 4, 10));
			};
			case WEST -> switch (state.getValue(FACE)) {
				case FLOOR -> Shapes.or(box(7, 0, 7, 9, 12, 9), box(6, 5, 6, 10, 6, 10), box(6, 3, 6, 10, 4, 10), box(6, 12, 6, 10, 16, 10));
				case WALL -> Shapes.or(box(4, 7, 7, 16, 9, 9), box(10, 6, 6, 11, 10, 10), box(12, 6, 6, 13, 10, 10), box(0, 6, 6, 4, 10, 10));
				case CEILING -> Shapes.or(box(7, 4, 7, 9, 16, 9), box(6, 10, 6, 10, 11, 10), box(6, 12, 6, 10, 13, 10), box(6, 0, 6, 10, 4, 10));
			};
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, FACE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		if (context.getClickedFace().getAxis() == Direction.Axis.Y)
			return this.defaultBlockState().setValue(FACE, context.getClickedFace().getOpposite() == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR).setValue(FACING, context.getHorizontalDirection());
		return this.defaultBlockState().setValue(FACE, AttachFace.WALL).setValue(FACING, context.getClickedFace());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		ReinforcedLightingRodUpdateTickProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new ReinforcedLightingRodBlockEntity(pos, state);
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
			if (blockEntity instanceof ReinforcedLightingRodBlockEntity be) {
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
		if (tileentity instanceof ReinforcedLightingRodBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
