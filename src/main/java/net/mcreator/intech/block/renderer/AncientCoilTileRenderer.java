package net.mcreator.intech.block.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.intech.block.model.AncientCoilBlockModel;
import net.mcreator.intech.block.entity.AncientCoilTileEntity;

public class AncientCoilTileRenderer extends GeoBlockRenderer<AncientCoilTileEntity> {
	public AncientCoilTileRenderer() {
		super(new AncientCoilBlockModel());
	}

	@Override
	public RenderType getRenderType(AncientCoilTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
