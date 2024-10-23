package net.mcreator.aaeitems.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.aaeitems.network.AaeItemsModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class UhhProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if (DoubleArgumentType.getDouble(arguments, "number") == 0) {
			AaeItemsModVariables.WorldVariables.get(world).yeah = false;
			AaeItemsModVariables.WorldVariables.get(world).syncData(world);
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 1) {
			AaeItemsModVariables.WorldVariables.get(world).yeah = true;
			AaeItemsModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
