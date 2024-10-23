package net.mcreator.aaeitems.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.aaeitems.network.AaeItemsModVariables;
import net.mcreator.aaeitems.init.AaeItemsModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UnpixelifyHammersProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (AaeItemsModVariables.WorldVariables.get(world).yeah == false) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.MINI_BAN_HAMMER_PIXEL.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.MINI_BAN_HAMMER.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.MINI_BAN_HAMMER_PIXEL.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.BAN_HAMMER_PIXEL.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.BAN_HAMMER.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.BAN_HAMMER_PIXEL.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.BIG_BAN_HAMMER_PIXEL.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.BIG_BAN_HAMMER.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.BIG_BAN_HAMMER_PIXEL.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.BIGGER_BAN_HAMMER_PIXEL.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.BIGGER_BAN_HAMMER.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.BIGGER_BAN_HAMMER_PIXEL.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.BIGGEST_BAN_HAMMER_PIXEL.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.BIGGEST_BAN_HAMMER.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.BIGGEST_BAN_HAMMER_PIXEL.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.TRUE_BAN_HAMMER_NCMD_PIXEL.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.TRUE_BAN_HAMMER_NCMD.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.TRUE_BAN_HAMMER_NCMD_PIXEL.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.TRUE_BAN_HAMMER_PIXEL.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.TRUE_BAN_HAMMER.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.TRUE_BAN_HAMMER_PIXEL.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.KICK_BAN_HAMMER_PIXEL.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.KICK_BAN_HAMMER.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.KICK_BAN_HAMMER_PIXEL.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AaeItemsModItems.ECHDEATH_PIXEL.get())) : false) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AaeItemsModItems.ECHDEATH.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AaeItemsModItems.ECHDEATH_PIXEL.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
		}
	}
}
