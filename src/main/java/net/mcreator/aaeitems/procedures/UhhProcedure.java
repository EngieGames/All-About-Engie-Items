package net.mcreator.aaeitems.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.aaeitems.network.AaeItemsModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class UhhProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if (BoolArgumentType.getBool(arguments, "logic") == false) {
			AaeItemsModVariables.WorldVariables.get(world).yeah = false;
			AaeItemsModVariables.WorldVariables.get(world).syncData(world);
		} else if (BoolArgumentType.getBool(arguments, "logic") == true) {
			AaeItemsModVariables.WorldVariables.get(world).yeah = true;
			AaeItemsModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
