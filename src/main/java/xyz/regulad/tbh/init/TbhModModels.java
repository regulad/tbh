
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package xyz.regulad.tbh.init;

import xyz.regulad.tbh.client.model.Modeltbh;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TbhModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltbh.LAYER_LOCATION, Modeltbh::createBodyLayer);
	}
}
