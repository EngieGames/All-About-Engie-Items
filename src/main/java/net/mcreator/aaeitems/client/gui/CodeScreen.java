package net.mcreator.aaeitems.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.aaeitems.world.inventory.CodeMenu;
import net.mcreator.aaeitems.network.CodeButtonMessage;
import net.mcreator.aaeitems.AaeItemsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CodeScreen extends AbstractContainerScreen<CodeMenu> {
	private final static HashMap<String, Object> guistate = CodeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox codeTextBox;
	Button button_submit;

	public CodeScreen(CodeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 317;
		this.imageHeight = 160;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		codeTextBox.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (codeTextBox.isFocused())
			return codeTextBox.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		codeTextBox.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.aae_items.code.label_10000101011101101001111010010110"), -18, 1, -1);
		this.font.draw(poseStack, Component.translatable("gui.aae_items.code.label_insert_code_in_text_box"), 95, 61, -1);
		this.font.draw(poseStack, Component.translatable("gui.aae_items.code.label_100001010111011010011110100101101"), 19, 10, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		codeTextBox = new EditBox(this.font, this.leftPos + 97, this.topPos + 71, 120, 20, Component.translatable("gui.aae_items.code.codeTextBox"));
		codeTextBox.setMaxLength(32767);
		guistate.put("text:codeTextBox", codeTextBox);
		this.addWidget(this.codeTextBox);
		button_submit = new Button(this.leftPos + 130, this.topPos + 93, 56, 20, Component.translatable("gui.aae_items.code.button_submit"), e -> {
			if (true) {
				AaeItemsMod.PACKET_HANDLER.sendToServer(new CodeButtonMessage(0, x, y, z));
				CodeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_submit", button_submit);
		this.addRenderableWidget(button_submit);
	}
}
