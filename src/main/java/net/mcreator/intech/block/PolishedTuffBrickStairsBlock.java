
package net.mcreator.intech.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PolishedTuffBrickStairsBlock extends StairBlock {
	public PolishedTuffBrickStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(),
				BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM)
						.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:block.tuff_bricks.break")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:block.tuff_bricks.step")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:block.tuff_bricks.place")),
								() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.tuff.hit")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:block.tuff_bricks.place"))))
						.strength(2f, 6f).requiresCorrectToolForDrops().dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 6f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
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