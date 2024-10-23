
package net.mcreator.aaeitems.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.aaeitems.init.AaeItemsModTabs;
import net.mcreator.aaeitems.init.AaeItemsModItems;

public abstract class EngieItem extends ArmorItem {
	public EngieItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 342;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{50, 50, 50, 50}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AaeItemsModItems.ENGIE_GEM.get()));
			}

			@Override
			public String getName() {
				return "engie";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends EngieItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_items:textures/models/armor/engi__layer_1.png";
		}
	}

	public static class Chestplate extends EngieItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_items:textures/models/armor/engi__layer_1.png";
		}
	}

	public static class Leggings extends EngieItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_items:textures/models/armor/engi__layer_2.png";
		}
	}

	public static class Boots extends EngieItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_items:textures/models/armor/engi__layer_1.png";
		}
	}
}