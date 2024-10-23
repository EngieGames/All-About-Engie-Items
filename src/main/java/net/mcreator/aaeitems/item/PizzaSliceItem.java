
package net.mcreator.aaeitems.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.aaeitems.init.AaeItemsModTabs;

public class PizzaSliceItem extends Item {
	public PizzaSliceItem() {
		super(new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_FOOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(8).saturationMod(5f)

				.build()));
	}
}
