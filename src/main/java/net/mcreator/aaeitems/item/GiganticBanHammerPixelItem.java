
package net.mcreator.aaeitems.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.aaeitems.init.AaeItemsModTabs;

public class GiganticBanHammerPixelItem extends SwordItem {
	public GiganticBanHammerPixelItem() {
		super(new Tier() {
			public int getUses() {
				return 10500;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 1048f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 128000;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2f, new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_PIXEL_HAMMERS));
	}
}
