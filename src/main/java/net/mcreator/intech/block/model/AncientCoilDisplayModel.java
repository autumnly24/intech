package net.mcreator.intech.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.intech.block.display.AncientCoilDisplayItem;

public class AncientCoilDisplayModel extends GeoModel<AncientCoilDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AncientCoilDisplayItem animatable) {
		return new ResourceLocation("intech", "animations/ancient_coil.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AncientCoilDisplayItem animatable) {
		return new ResourceLocation("intech", "geo/ancient_coil.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AncientCoilDisplayItem entity) {
		return new ResourceLocation("intech", "textures/block/ancient_coil.png");
	}
}
