
package net.mcreator.intech.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ZincDoorBlock extends DoorBlock {
	public ZincDoorBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:block.zinc.break")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:block.zinc.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:block.zinc.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:block.zinc.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:block.zinc.place"))))
				.strength(3.5f, 8f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape(), BlockSetType.IRON);
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 0;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		if (state.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) != DoubleBlockHalf.LOWER)
			return Collections.emptyList();
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}