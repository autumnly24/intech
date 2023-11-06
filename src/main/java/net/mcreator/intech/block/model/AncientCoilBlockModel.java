package net.mcreator.intech.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.intech.block.entity.AncientCoilTileEntity;

public class AncientCoilBlockModel extends GeoModel<AncientCoilTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AncientCoilTileEntity animatable) {
		return new ResourceLocation("intech", "animations/ancient_coil.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AncientCoilTileEntity animatable) {
		return new ResourceLocation("intech", "geo/ancient_coil.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AncientCoilTileEntity entity) {
		return new ResourceLocation("intech", "textures/block/ancient_coil.png");
	}
}
