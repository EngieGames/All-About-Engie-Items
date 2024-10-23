
package net.mcreator.aaeitems.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.aaeitems.init.AaeItemsModTabs;

public class AngryEngieEssenceItem extends Item {
	public AngryEngieEssenceItem() {
		super(new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
