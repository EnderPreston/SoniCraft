
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

import net.mcreator.sonicraft.SonicraftModVariables;
import net.mcreator.sonicraft.SonicraftMod;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MilesElectricInterfaceGuiWindow extends ContainerScreen<MilesElectricInterfaceGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public MilesElectricInterfaceGuiWindow(MilesElectricInterfaceGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 480;
		this.ySize = 240;
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
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("sonicraft:textures/miles_electric_overlay.png"));
		this.blit(ms, this.guiLeft + 104, this.guiTop + -1, 0, 0, 269, 240, 269, 240);
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
		this.font.drawString(ms, "Coordinates: " + x + " " + y + " " + z + "", 167, 98, -12985177);
		this.font.drawString(ms, "Time: " + (int) (SonicraftModVariables.WorldVariables.get(world).game_time) + "", 167, 116, -12985177);
		this.font.drawString(ms, "Temperature: " + (int) (SonicraftModVariables.WorldVariables.get(world).biome_temperature) + "", 167, 134,
				-12985177);
		this.font.drawString(ms, "Biome: \u00A7kWorkIn Progress", 167, 152, -12985177);
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
		this.addButton(new Button(this.guiLeft + 325, this.guiTop + 125, 30, 20, new StringTextComponent("Close"), e -> {
			if (true) {
				SonicraftMod.PACKET_HANDLER.sendToServer(new MilesElectricInterfaceGui.ButtonPressedMessage(0, x, y, z));
				MilesElectricInterfaceGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
