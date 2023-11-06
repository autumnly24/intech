package net.mcreator.intech.block.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.intech.block.model.AncientCoilDisplayModel;
import net.mcreator.intech.block.display.AncientCoilDisplayItem;

public class AncientCoilDisplayItemRenderer extends GeoItemRenderer<AncientCoilDisplayItem> {
	public AncientCoilDisplayItemRenderer() {
		super(new AncientCoilDisplayModel());
	}

	@Override
	public RenderType getRenderType(AncientCoilDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
