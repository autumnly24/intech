package net.mcreator.intech.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.intech.init.IntechModBlockEntities;
import net.mcreator.intech.block.renderer.AncientCoilTileRenderer;
import net.mcreator.intech.IntechMod;

@Mod.EventBusSubscriber(modid = IntechMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(IntechModBlockEntities.ANCIENT_COIL.get(), context -> new AncientCoilTileRenderer());
	}
}
