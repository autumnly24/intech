
package net.mcreator.intech.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ZincTilesBlock extends Block {
	public ZincTilesBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:block.zinc.break")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:block.zinc.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:block.zinc.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:block.zinc.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:block.zinc.place"))))
				.strength(3.5f, 8f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
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
}