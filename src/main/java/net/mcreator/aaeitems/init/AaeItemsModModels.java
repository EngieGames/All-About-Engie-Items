
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaeitems.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.aaeitems.client.model.ModelEngieGames;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AaeItemsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelEngieGames.LAYER_LOCATION, ModelEngieGames::createBodyLayer);
	}
}
