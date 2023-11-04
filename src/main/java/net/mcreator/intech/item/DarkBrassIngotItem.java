
package net.mcreator.intech.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DarkBrassIngotItem extends Item {
	public DarkBrassIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
