
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaeitems.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.aaeitems.client.renderer.EngieGamesGUIRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AaeItemsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AaeItemsModEntities.ENGIE_GAMES_GUI.get(), EngieGamesGUIRenderer::new);
	}
}
