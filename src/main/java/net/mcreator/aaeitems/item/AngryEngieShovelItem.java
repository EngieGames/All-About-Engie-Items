
package net.mcreator.aaeitems.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.aaeitems.init.AaeItemsModTabs;
import net.mcreator.aaeitems.init.AaeItemsModItems;

public class AngryEngieShovelItem extends ShovelItem {
	public AngryEngieShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1250;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 23f;
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
