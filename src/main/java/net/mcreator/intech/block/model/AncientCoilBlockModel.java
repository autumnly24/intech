package net.mcreator.intech.block.model;

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