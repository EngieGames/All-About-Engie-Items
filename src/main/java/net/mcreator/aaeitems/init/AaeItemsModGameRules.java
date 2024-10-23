
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaeitems.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AaeItemsModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DETECTIVE_FIND_ENGIE = GameRules.register("detectiveFindEngie", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}
