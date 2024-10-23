package net.mcreator.aaeitems.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.aaeitems.init.AaeItemsModItems;

public class CookedPizzaToSlicesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AaeItemsModItems.COOKED_PIZZA.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(AaeItemsModItems.COOKED_PIZZA.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p aae_items:pizza_slice 8");
			}
		}
	}
}
