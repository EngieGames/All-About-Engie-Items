package net.mcreator.aaeitems.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.aaeitems.init.AaeItemsModEntities;
import net.mcreator.aaeitems.entity.EngieGamesGUIEntity;

public class GUIRenderProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new EngieGamesGUIEntity(AaeItemsModEntities.ENGIE_GAMES_GUI.get(), _level) : null;
	}
}
