package net.mcreator.sonicraft.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.sonicraft.entity.CrabmeatEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CrabmeatRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CrabmeatEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcrabmeat(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/crabmeat.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelcrabmeat extends EntityModel<Entity> {
		private final ModelRenderer main;
		private final ModelRenderer legFR;
		private final ModelRenderer legFR1;
		private final ModelRenderer legBR;
		private final ModelRenderer legBR1;
		private final ModelRenderer legFL;
		private final ModelRenderer legFL1;
		private final ModelRenderer legBL;
		private final ModelRenderer legBL1;
		private final ModelRenderer eyestockL;
		private final ModelRenderer eyeL;
		private final ModelRenderer eyeL1;
		private final ModelRenderer eyestockR;
		private final ModelRenderer eyeR;
		private final ModelRenderer eyeR1;
		private final ModelRenderer armR;
		private final ModelRenderer armR1;
		private final ModelRenderer clawR;
		private final ModelRenderer armL;
		private final ModelRenderer armL1;
		private final ModelRenderer clawL;
		public Modelcrabmeat() {
			textureWidth = 64;
			textureHeight = 64;
			main = new ModelRenderer(this);
			main.setRotationPoint(6.0F, 21.0F, -5.0F);
			main.setTextureOffset(0, 0).addBox(-11.0F, -9.0F, 0.0F, 10.0F, 8.0F, 10.0F, 0.0F, false);
			legFR = new ModelRenderer(this);
			legFR.setRotationPoint(-10.0F, -2.0F, 1.0F);
			main.addChild(legFR);
			legFR1 = new ModelRenderer(this);
			legFR1.setRotationPoint(0.0F, 0.0F, 0.0F);
			legFR.addChild(legFR1);
			setRotationAngle(legFR1, -0.5236F, 0.1309F, 0.5236F);
			legFR1.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.25F, false);
			legBR = new ModelRenderer(this);
			legBR.setRotationPoint(-10.0F, -2.0F, 9.0F);
			main.addChild(legBR);
			legBR1 = new ModelRenderer(this);
			legBR1.setRotationPoint(0.0F, 0.0F, 0.0F);
			legBR.addChild(legBR1);
			setRotationAngle(legBR1, 0.5236F, -0.1309F, 0.5236F);
			legBR1.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.25F, false);
			legFL = new ModelRenderer(this);
			legFL.setRotationPoint(-2.0F, -2.0F, 1.0F);
			main.addChild(legFL);
			legFL1 = new ModelRenderer(this);
			legFL1.setRotationPoint(0.0F, 0.0F, 0.0F);
			legFL.addChild(legFL1);
			setRotationAngle(legFL1, -0.5236F, -0.1309F, -0.5236F);
			legFL1.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.25F, true);
			legBL = new ModelRenderer(this);
			legBL.setRotationPoint(-2.0F, -2.0F, 9.0F);
			main.addChild(legBL);
			legBL1 = new ModelRenderer(this);
			legBL1.setRotationPoint(0.0F, 0.0F, 0.0F);
			legBL.addChild(legBL1);
			setRotationAngle(legBL1, 0.5236F, 0.1309F, -0.5236F);
			legBL1.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.25F, true);
			eyestockL = new ModelRenderer(this);
			eyestockL.setRotationPoint(-3.0F, -8.0F, 1.0F);
			main.addChild(eyestockL);
			setRotationAngle(eyestockL, 0.5236F, 0.0F, 0.0F);
			eyestockL.setTextureOffset(0, 18).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			eyeL = new ModelRenderer(this);
			eyeL.setRotationPoint(0.0F, -6.0F, 0.0F);
			eyestockL.addChild(eyeL);
			eyeL1 = new ModelRenderer(this);
			eyeL1.setRotationPoint(0.0F, 0.0F, 0.0F);
			eyeL.addChild(eyeL1);
			setRotationAngle(eyeL1, -0.5236F, 0.0F, 0.0F);
			eyeL1.setTextureOffset(30, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			eyestockR = new ModelRenderer(this);
			eyestockR.setRotationPoint(-9.0F, -8.0F, 1.0F);
			main.addChild(eyestockR);
			setRotationAngle(eyestockR, 0.5236F, 0.0F, 0.0F);
			eyestockR.setTextureOffset(0, 18).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			eyeR = new ModelRenderer(this);
			eyeR.setRotationPoint(0.0F, -6.0F, 0.0F);
			eyestockR.addChild(eyeR);
			eyeR1 = new ModelRenderer(this);
			eyeR1.setRotationPoint(0.0F, 0.0F, 0.0F);
			eyeR.addChild(eyeR1);
			setRotationAngle(eyeR1, -0.5236F, 0.0F, 0.0F);
			eyeR1.setTextureOffset(30, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			armR = new ModelRenderer(this);
			armR.setRotationPoint(-10.0F, -5.0F, 5.0F);
			main.addChild(armR);
			armR1 = new ModelRenderer(this);
			armR1.setRotationPoint(0.0F, 0.0F, 0.0F);
			armR.addChild(armR1);
			setRotationAngle(armR1, 0.0F, 1.5708F, -0.9599F);
			armR1.setTextureOffset(0, 18).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			armR1.setTextureOffset(22, 18).addBox(-2.0F, -8.697F, -1.8907F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			clawR = new ModelRenderer(this);
			clawR.setRotationPoint(0.0F, 0.0F, 0.0F);
			armR1.addChild(clawR);
			clawR.setTextureOffset(0, 18).addBox(-3.0F, -16.0F, -5.0F, 6.0F, 10.0F, 10.0F, 0.0F, false);
			armL = new ModelRenderer(this);
			armL.setRotationPoint(-2.0F, -5.0F, 5.0F);
			main.addChild(armL);
			armL1 = new ModelRenderer(this);
			armL1.setRotationPoint(0.0F, 0.0F, 0.0F);
			armL.addChild(armL1);
			setRotationAngle(armL1, 0.0F, -1.5708F, 0.9599F);
			armL1.setTextureOffset(0, 18).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);
			armL1.setTextureOffset(22, 18).addBox(-2.0F, -8.697F, -1.8907F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			clawL = new ModelRenderer(this);
			clawL.setRotationPoint(0.0F, 0.0F, 0.0F);
			armL1.addChild(clawL);
			clawL.setTextureOffset(32, 18).addBox(-3.0F, -16.0F, -5.0F, 6.0F, 10.0F, 10.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.legFL.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.legBL.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.legFR.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.legBR.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
