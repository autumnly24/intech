
package net.mcreator.intech.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GalvanizedBilletItem extends Item {
	public GalvanizedBilletItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
