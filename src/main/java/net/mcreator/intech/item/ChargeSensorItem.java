
package net.mcreator.intech.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class ChargeSensorItem extends Item {
	public ChargeSensorItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ChargeSensorRightclickedOnBlockProcedure.execute();
		return InteractionResult.SUCCESS;
	}
}