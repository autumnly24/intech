
package net.mcreator.intech.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class RawZincItem extends Item {
	public RawZincItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}