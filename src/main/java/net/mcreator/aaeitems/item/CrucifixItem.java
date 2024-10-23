
package net.mcreator.aaeitems.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.aaeitems.init.AaeItemsModTabs;

public class CrucifixItem extends Item {
	public CrucifixItem() {
		super(new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_ITEMS).durability(100).rarity(Rarity.RARE));
	}
}
