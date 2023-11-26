
package net.mcreator.intech.item;

import net.minecraft.network.chat.Component;

public class MusicDiscJunctionJamItem extends RecordItem {

	public MusicDiscJunctionJamItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("intech:record.junction_jam")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2560);
	}

}
