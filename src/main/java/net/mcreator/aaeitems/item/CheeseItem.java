
package net.mcreator.aaeitems.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.aaeitems.init.AaeItemsModTabs;

public class CheeseItem extends Item {
	public CheeseItem() {
		super(new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_FOOD).stacksTo(64).rarity(Rarity.COMMON));
	}
}
