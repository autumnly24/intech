
package net.mcreator.intech.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscJunctionJamItem extends RecordItem {
	public MusicDiscJunctionJamItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:record.junction_jam")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2560);
	}
}
