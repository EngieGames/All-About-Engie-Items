package net.mcreator.aaeitems.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.aaeitems.network.AaeItemsModVariables;
import net.mcreator.aaeitems.init.AaeItemsModItems;

public class PixelifyHammersProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (AaeItemsModVariables.WorldVariables.get(world).yeah == true) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.MINI_BAN_HAMMER.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.MINI_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.MINI_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.BAN_HAMMER.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.BIG_BAN_HAMMER.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.BIG_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.BIG_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.LARGE_BAN_HAMMER.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.LARGE_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.LARGE_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.HUGE_BAN_HAMMER.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.HUGE_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.HUGE_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.ENORMOUS_BAN_HAMMER.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.ENORMOUS_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.ENORMOUS_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.GIGANTIC_BAN_HAMMER.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.GIGANTIC_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.GIGANTIC_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.MASSIVE_BAN_HAMMER.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.MASSIVE_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.MASSIVE_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.COMICALLY_MASSIVE_BAN_HAMMER.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.COMICALLY_MASSIVE_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.COMICALLY_MASSIVE_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.TRUE_BAN_HAMMER_NCMD.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.TRUE_BAN_HAMMER_NCMD_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.TRUE_BAN_HAMMER_NCMD.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.TRUE_BAN_HAMMER.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.TRUE_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.TRUE_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.KICK_BAN_HAMMER.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.KICK_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.KICK_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.ECHDEATH.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.ECHDEATH_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.ECHDEATH.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
		}
	}
}
