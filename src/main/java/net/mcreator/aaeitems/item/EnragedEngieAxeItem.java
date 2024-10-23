
package net.mcreator.aaeitems.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.aaeitems.init.AaeItemsModTabs;
import net.mcreator.aaeitems.init.AaeItemsModItems;

public class EnragedEngieAxeItem extends AxeItem {
	public EnragedEngieAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1750;
			}

			public float getSpeed() {
				return 19f;
			}

			public float getAttackDamageBonus() {
				return 73f;
			}

			public int getLevel() {
				return 9;
			}

			public int getEnchantmentValue() {
				return 19;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AaeItemsModItems.ENRAGED_ENGIE_ESSENCE.get()));
			}
		}, 1, -2.2f, new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_ITEMS));
	}
}