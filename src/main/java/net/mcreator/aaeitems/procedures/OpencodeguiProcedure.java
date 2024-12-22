package net.mcreator.aaeitems.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.aaeitems.world.inventory.CodeMenu;
import net.mcreator.aaeitems.network.AaeItemsModVariables;

import io.netty.buffer.Unpooled;

public class OpencodeguiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AaeItemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AaeItemsModVariables.PlayerVariables())).coderedeemblock == false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Code");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new CodeMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		} else if ((entity.getCapability(AaeItemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AaeItemsModVariables.PlayerVariables())).coderedeemblock == true) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @p {\"text\":\"Hey... Sorry, but you can't redeem the code again.. If you want to do it again please create/join a new world that doesn't have the code redeemed.\",\"bold\":true,\"color\":\"gold\"}");
				}
			}
		}
	}
}
