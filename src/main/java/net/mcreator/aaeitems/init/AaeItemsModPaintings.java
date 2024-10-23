
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaeitems.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.decoration.Motive;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AaeItemsModPaintings {
	@SubscribeEvent
	public static void registerMotives(RegistryEvent.Register<Motive> event) {
		event.getRegistry().register(new Motive(32, 32).setRegistryName("developer_engie_2"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("developer_engie"));
		event.getRegistry().register(new Motive(48, 48).setRegistryName("developer_engie_3"));
		event.getRegistry().register(new Motive(64, 64).setRegistryName("developer_engie_4"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("idea_giver_blood"));
		event.getRegistry().register(new Motive(32, 32).setRegistryName("idea_giver_blood_2"));
		event.getRegistry().register(new Motive(48, 48).setRegistryName("idea_giver_blood_3"));
		event.getRegistry().register(new Motive(64, 64).setRegistryName("idea_giver_blood_4"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("tiger_shark"));
		event.getRegistry().register(new Motive(32, 32).setRegistryName("tiger_shark_2"));
		event.getRegistry().register(new Motive(48, 48).setRegistryName("tiger_shark_3"));
		event.getRegistry().register(new Motive(64, 64).setRegistryName("tiger_shark_4"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("tiger_shark_cat_onsie"));
		event.getRegistry().register(new Motive(32, 32).setRegistryName("tiger_shark_cat_onsie_2"));
		event.getRegistry().register(new Motive(48, 48).setRegistryName("tiger_shark_cat_onsie_3"));
		event.getRegistry().register(new Motive(64, 64).setRegistryName("tiger_shark_cat_onsie_4"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("aae_items_logo"));
		event.getRegistry().register(new Motive(32, 32).setRegistryName("aae_items_logo_2"));
		event.getRegistry().register(new Motive(48, 48).setRegistryName("aae_items_logo_3"));
		event.getRegistry().register(new Motive(64, 64).setRegistryName("aae_items_logo_4"));
	}
}
