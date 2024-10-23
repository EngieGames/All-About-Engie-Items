
package net.mcreator.aaeitems.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.aaeitems.init.AaeItemsModTabs;

import java.util.List;

public class AAEEngieItem extends Item {
	public AAEEngieItem() {
		super(new Item.Properties().tab(AaeItemsModTabs.TAB_AAE_ITEMS_ITEMS).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("AAE = All About Engie. (It's him.)"));
	}
}
