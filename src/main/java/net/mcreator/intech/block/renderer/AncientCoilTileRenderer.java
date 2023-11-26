package net.mcreator.intech.block.renderer;

public class AncientCoilTileRenderer extends GeoBlockRenderer<AncientCoilTileEntity> {
	public AncientCoilTileRenderer() {
		super(new AncientCoilBlockModel());
	}

	@Override
	public RenderType getRenderType(AncientCoilTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}