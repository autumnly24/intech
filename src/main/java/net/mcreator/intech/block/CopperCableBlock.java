
package net.mcreator.intech.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CopperCableBlock extends Block {
	public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;

	public CopperCableBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.COPPER).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.Y));
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
		return switch (state.getValue(AXIS)) {
			case X -> Shapes.or(box(14, 6, 4, 16, 10, 6), box(14, 6, 10, 16, 10, 12), box(14, 4, 6, 16, 6, 10), box(14, 10, 6, 16, 12, 10), box(14, 5, 5, 16, 6, 6), box(14, 5, 10, 16, 6, 11), box(14, 10, 10, 16, 11, 11), box(0, 10, 5, 2, 11, 6),
					box(14, 10, 5, 16, 11, 6), box(0, 10, 6, 2, 12, 10), box(0, 10, 10, 2, 11, 11), box(0, 6, 10, 2, 10, 12), box(0, 5, 10, 2, 6, 11), box(0, 4, 6, 2, 6, 10), box(0, 6, 4, 2, 10, 6), box(0, 5, 5, 2, 6, 6), box(0, 6, 6, 16, 10, 10));
			case Y -> Shapes.or(box(4, 14, 6, 6, 16, 10), box(10, 14, 6, 12, 16, 10), box(6, 14, 4, 10, 16, 6), box(6, 14, 10, 10, 16, 12), box(5, 14, 5, 6, 16, 6), box(10, 14, 5, 11, 16, 6), box(10, 14, 10, 11, 16, 11), box(5, 0, 10, 6, 2, 11),
					box(5, 14, 10, 6, 16, 11), box(6, 0, 10, 10, 2, 12), box(10, 0, 10, 11, 2, 11), box(10, 0, 6, 12, 2, 10), box(10, 0, 5, 11, 2, 6), box(6, 0, 4, 10, 2, 6), box(4, 0, 6, 6, 2, 10), box(5, 0, 5, 6, 2, 6), box(6, 0, 6, 10, 16, 10));
			case Z -> Shapes.or(box(4, 6, 0, 6, 10, 2), box(10, 6, 0, 12, 10, 2), box(6, 4, 0, 10, 6, 2), box(6, 10, 0, 10, 12, 2), box(5, 5, 0, 6, 6, 2), box(10, 5, 0, 11, 6, 2), box(10, 10, 0, 11, 11, 2), box(5, 10, 14, 6, 11, 16),
					box(5, 10, 0, 6, 11, 2), box(6, 10, 14, 10, 12, 16), box(10, 10, 14, 11, 11, 16), box(10, 6, 14, 12, 10, 16), box(10, 5, 14, 11, 6, 16), box(6, 4, 14, 10, 6, 16), box(4, 6, 14, 6, 10, 16), box(5, 5, 14, 6, 6, 16),
					box(6, 6, 0, 10, 10, 16));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(AXIS);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(AXIS, context.getClickedFace().getAxis());
	}

	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		if (rot == Rotation.CLOCKWISE_90 || rot == Rotation.COUNTERCLOCKWISE_90) {
			if (state.getValue(AXIS) == Direction.Axis.X) {
				return state.setValue(AXIS, Direction.Axis.Z);
			} else if (state.getValue(AXIS) == Direction.Axis.Z) {
				return state.setValue(AXIS, Direction.Axis.X);
			}
		}
		return state;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}