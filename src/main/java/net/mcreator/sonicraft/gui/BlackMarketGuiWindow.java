
package net.mcreator.sonicraft.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.sonicraft.SonicraftMod;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BlackMarketGuiWindow extends ContainerScreen<BlackMarketGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public BlackMarketGuiWindow(BlackMarketGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 338;
		this.ySize = 200;
	}

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("sonicraft:textures/black_market_gui.png"));
		this.blit(ms, this.guiLeft + 0, this.guiTop + 0, 0, 0, 338, 200, 338, 200);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Place your rings here!", 195, 33, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 33, this.guiTop + 24, 40, 20, new StringTextComponent("35"), e -> {
			if (true) {
				SonicraftMod.PACKET_HANDLER.sendToServer(new BlackMarketGui.ButtonPressedMessage(0, x, y, z));
				BlackMarketGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 33, this.guiTop + 51, 40, 20, new StringTextComponent("5"), e -> {
			if (true) {
				SonicraftMod.PACKET_HANDLER.sendToServer(new BlackMarketGui.ButtonPressedMessage(1, x, y, z));
				BlackMarketGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 33, this.guiTop + 78, 40, 20, new StringTextComponent("15"), e -> {
			if (true) {
				SonicraftMod.PACKET_HANDLER.sendToServer(new BlackMarketGui.ButtonPressedMessage(2, x, y, z));
				BlackMarketGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 33, this.guiTop + 105, 40, 20, new StringTextComponent("5"), e -> {
			if (true) {
				SonicraftMod.PACKET_HANDLER.sendToServer(new BlackMarketGui.ButtonPressedMessage(3, x, y, z));
				BlackMarketGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 33, this.guiTop + 132, 40, 20, new StringTextComponent("8"), e -> {
			if (true) {
				SonicraftMod.PACKET_HANDLER.sendToServer(new BlackMarketGui.ButtonPressedMessage(4, x, y, z));
				BlackMarketGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 33, this.guiTop + 159, 40, 20, new StringTextComponent("5"), e -> {
			if (true) {
				SonicraftMod.PACKET_HANDLER.sendToServer(new BlackMarketGui.ButtonPressedMessage(5, x, y, z));
				BlackMarketGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 114, this.guiTop + 24, 40, 20, new StringTextComponent("8"), e -> {
			if (true) {
				SonicraftMod.PACKET_HANDLER.sendToServer(new BlackMarketGui.ButtonPressedMessage(6, x, y, z));
				BlackMarketGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 114, this.guiTop + 51, 40, 20, new StringTextComponent("15"), e -> {
			if (true) {
				SonicraftMod.PACKET_HANDLER.sendToServer(new BlackMarketGui.ButtonPressedMessage(7, x, y, z));
				BlackMarketGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 114, this.guiTop + 78, 40, 20, new StringTextComponent("5"), e -> {
			if (true) {
				SonicraftMod.PACKET_HANDLER.sendToServer(new BlackMarketGui.ButtonPressedMessage(8, x, y, z));
				BlackMarketGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 114, this.guiTop + 105, 40, 20, new StringTextComponent("45"), e -> {
			if (true) {
				SonicraftMod.PACKET_HANDLER.sendToServer(new BlackMarketGui.ButtonPressedMessage(9, x, y, z));
				BlackMarketGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 114, this.guiTop + 132, 40, 20, new StringTextComponent("64"), e -> {
			if (true) {
				SonicraftMod.PACKET_HANDLER.sendToServer(new BlackMarketGui.ButtonPressedMessage(10, x, y, z));
				BlackMarketGui.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 114, this.guiTop + 159, 40, 20, new StringTextComponent("64"), e -> {
			if (true) {
				SonicraftMod.PACKET_HANDLER.sendToServer(new BlackMarketGui.ButtonPressedMessage(11, x, y, z));
				BlackMarketGui.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 303, this.guiTop + 1, 30, 20, new StringTextComponent("X"), e -> {
			if (true) {
				SonicraftMod.PACKET_HANDLER.sendToServer(new BlackMarketGui.ButtonPressedMessage(12, x, y, z));
				BlackMarketGui.handleButtonAction(entity, 12, x, y, z);
			}
		}));
	}
}
