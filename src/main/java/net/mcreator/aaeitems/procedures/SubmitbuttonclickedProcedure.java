package net.mcreator.aaeitems.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.aaeitems.network.AaeItemsModVariables;

import java.util.Iterator;
import java.util.HashMap;

public class SubmitbuttonclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (entity instanceof Player _player)
			_player.closeContainer();
		if (AaeItemsModVariables.WorldVariables.get(world).yeah == false) {
			if ((guistate.containsKey("text:codeTextBox") ? ((EditBox) guistate.get("text:codeTextBox")).getValue() : "").equals("banhammerupdatecoolio")) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p aae_items:comically_massive_ban_hammer");
					}
				}
				if ((entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel
						&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("aae_items:comically_massive_obtain"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("aae_items:comically_massive_obtain"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
				}
				{
					boolean _setval = true;
					entity.getCapability(AaeItemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.coderedeemblock = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else {
			if ((guistate.containsKey("text:codeTextBox") ? ((EditBox) guistate.get("text:codeTextBox")).getValue() : "").equals("banhammerupdatecoolio")) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p aae_items:comically_massive_ban_hammer_pixel");
					}
				}
				if ((entity instanceof ServerPlayer _plr7 && _plr7.level instanceof ServerLevel
						&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("aae_items:comically_massive_obtain"))).isDone()) == false) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("aae_items:comically_massive_obtain"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
				}
				{
					boolean _setval = true;
					entity.getCapability(AaeItemsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.coderedeemblock = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
