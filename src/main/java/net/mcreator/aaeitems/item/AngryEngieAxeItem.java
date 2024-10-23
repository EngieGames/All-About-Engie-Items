
package net.mcreator.aaeitems.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.aaeitems.init.AaeItemsModTabs;
import net.mcreator.aaeitems.init.AaeItemsModItems;

public class AngryEngieAxeItem extends AxeItem {
	public AngryEngieAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 48f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AaeItemsModItems.ANGRY_ENGIE_ESSENCE.get()));
			}
		}, 1, -2.6f, new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_ITEMS));
	}
}
