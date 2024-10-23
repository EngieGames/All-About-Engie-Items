
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaeitems.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AaeItemsModTabs {
	public static CreativeModeTab TAB_AAE_ITEMS_ARMOR;
	public static CreativeModeTab TAB_AAE_ITEMS_ITEMS;
	public static CreativeModeTab TAB_AAE_ITEMS_FOOD;
	public static CreativeModeTab TAB_AAE_ITEMS_PIXEL_HAMMERS;

	public static void load() {
		TAB_AAE_ITEMS_ARMOR = new CreativeModeTab("tabaae_items_armor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AaeItemsModItems.ENGIE_HELMET.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_AAE_ITEMS_ITEMS = new CreativeModeTab("tabaae_items_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AaeItemsModItems.ENGIE_GEM.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_AAE_ITEMS_FOOD = new CreativeModeTab("tabaae_items_food") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AaeItemsModItems.COOKED_PIZZA.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_AAE_ITEMS_PIXEL_HAMMERS = new CreativeModeTab("tabaae_items_pixel_hammers") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AaeItemsModItems.BAN_HAMMER_PIXEL.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
