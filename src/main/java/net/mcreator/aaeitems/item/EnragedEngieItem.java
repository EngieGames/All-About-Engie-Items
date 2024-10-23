
package net.mcreator.aaeitems.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.aaeitems.procedures.EEChestplateProcedure;
import net.mcreator.aaeitems.procedures.EEBootsProcedure;
import net.mcreator.aaeitems.init.AaeItemsModTabs;
import net.mcreator.aaeitems.init.AaeItemsModItems;

public abstract class EnragedEngieItem extends ArmorItem {
	public EnragedEngieItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1024;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{150, 150, 150, 150}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 15;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AaeItemsModItems.ENRAGED_ENGIE_ESSENCE.get()));
			}

			@Override
			public String getName() {
				return "enraged_engie";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends EnragedEngieItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_items:textures/models/armor/enraged__layer_1.png";
		}
	}

	public static class Chestplate extends EnragedEngieItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_items:textures/models/armor/enraged__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EEChestplateProcedure.execute(entity);
		}
	}

	public static class Leggings extends EnragedEngieItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_items:textures/models/armor/enraged__layer_2.png";
		}
	}

	public static class Boots extends EnragedEngieItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "aae_items:textures/models/armor/enraged__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			EEBootsProcedure.execute(entity);
		}
	}
}
