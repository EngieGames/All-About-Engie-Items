
package net.mcreator.aaeitems.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.aaeitems.entity.EngieGamesGUIEntity;
import net.mcreator.aaeitems.client.model.ModelEngieGames;

public class EngieGamesGUIRenderer extends MobRenderer<EngieGamesGUIEntity, ModelEngieGames<EngieGamesGUIEntity>> {
	public EngieGamesGUIRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngieGames(context.bakeLayer(ModelEngieGames.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieGamesGUIEntity entity) {
		return new ResourceLocation("aae_items:textures/entities/engie.png");
	}
}
