package net.mcreator.intech.block.renderer;

public class AncientCoilDisplayItemRenderer extends GeoItemRenderer<AncientCoilDisplayItem> {
	public AncientCoilDisplayItemRenderer() {
		super(new AncientCoilDisplayModel());
	}

	@Override
	public RenderType getRenderType(AncientCoilDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}