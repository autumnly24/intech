
package net.mcreator.intech.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class GalvanizedBilletItem extends Item {
	public GalvanizedBilletItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}