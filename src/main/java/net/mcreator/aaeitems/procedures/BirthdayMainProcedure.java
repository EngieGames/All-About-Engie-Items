package net.mcreator.aaeitems.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.mcreator.aaeitems.network.AaeItemsModVariables;

import javax.annotation.Nullable;

import java.util.Calendar;

@Mod.EventBusSubscriber
public class BirthdayMainProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event);
		}
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		if (Calendar.getInstance().get(Calendar.MONTH) == 2) {
			if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 20) {
				AaeItemsModVariables.seasonspring = true;
				AaeItemsModVariables.seasonsummer = false;
				AaeItemsModVariables.seasonautumn = false;
				AaeItemsModVariables.seasonwinter = false;
			}
		} else if (Calendar.getInstance().get(Calendar.MONTH) == 5) {
			if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 20) {
				AaeItemsModVariables.seasonspring = false;
				AaeItemsModVariables.seasonsummer = true;
				AaeItemsModVariables.seasonautumn = false;
				AaeItemsModVariables.seasonwinter = false;
			}
		} else if (Calendar.getInstance().get(Calendar.MONTH) == 8) {
			if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 20) {
				AaeItemsModVariables.seasonspring = false;
				AaeItemsModVariables.seasonsummer = false;
				AaeItemsModVariables.seasonautumn = true;
				AaeItemsModVariables.seasonwinter = false;
			}
		} else if (Calendar.getInstance().get(Calendar.MONTH) == 11) {
			AaeItemsModVariables.decembercodeblock = false;
			if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 20) {
				AaeItemsModVariables.seasonspring = false;
				AaeItemsModVariables.seasonsummer = false;
				AaeItemsModVariables.seasonautumn = false;
				AaeItemsModVariables.seasonwinter = true;
			}
		} else if (!(Calendar.getInstance().get(Calendar.MONTH) == 11)) {
			AaeItemsModVariables.decembercodeblock = true;
		}
	}
}
