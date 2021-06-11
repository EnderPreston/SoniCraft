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

import net.mcreator.sonicraft.entity.SonicEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SonicRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SonicEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsonic(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/sonic_texture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelsonic extends EntityModel<Entity> {
		private final ModelRenderer sonic;
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer hipR;
		private final ModelRenderer hipL;
		private final ModelRenderer shoulderR;
		private final ModelRenderer shoulderL;
		public Modelsonic() {
			textureWidth = 64;
			textureHeight = 32;
			sonic = new ModelRenderer(this);
			sonic.setRotationPoint(0.0F, 14.0F, 0.0F);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -4.0F, 0.0F);
			sonic.addChild(head);
			head.setTextureOffset(0, 4).addBox(-0.5F, -3.0F, -4.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(4.125F, -8.0F, -2.75F, 0.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(-4.125F, -8.0F, -2.75F, 0.0F, 8.0F, 8.0F, 0.0F, true);
			head.setTextureOffset(32, 0).addBox(0.0F, -7.5F, -1.25F, 0.0F, 8.0F, 8.0F, 0.0F, true);
			head.setTextureOffset(0, 1).addBox(-4.0F, -10.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 1).addBox(2.0F, -10.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(-4.0F, -8.15F, -2.0F, 8.0F, 0.0F, 8.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(-0.5F, 0.0F, 0.0F);
			sonic.addChild(body);
			body.setTextureOffset(0, 22).addBox(-1.5F, -4.0F, -1.0F, 4.0F, 5.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(48, 8).addBox(-1.0F, -5.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(48, 8).addBox(2.0F, -5.0F, 0.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
			hipR = new ModelRenderer(this);
			hipR.setRotationPoint(-1.0F, 2.0F, 0.0F);
			sonic.addChild(hipR);
			hipR.setTextureOffset(22, 16).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 6.0F, 2.0F, -0.25F, false);
			hipR.setTextureOffset(16, 26).addBox(-2.0F, 4.25F, -2.0F, 4.0F, 2.0F, 4.0F, -0.25F, false);
			hipR.setTextureOffset(34, 24).addBox(-2.0F, 6.0F, -4.0F, 4.0F, 2.0F, 6.0F, 0.0F, false);
			hipL = new ModelRenderer(this);
			hipL.setRotationPoint(1.0F, 2.0F, 0.0F);
			sonic.addChild(hipL);
			hipL.setTextureOffset(22, 16).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 6.0F, 2.0F, -0.25F, true);
			hipL.setTextureOffset(16, 26).addBox(-2.0F, 4.25F, -2.0F, 4.0F, 2.0F, 4.0F, -0.25F, true);
			hipL.setTextureOffset(34, 24).addBox(-2.0F, 6.0F, -4.0F, 4.0F, 2.0F, 6.0F, 0.0F, true);
			shoulderR = new ModelRenderer(this);
			shoulderR.setRotationPoint(-2.0F, -3.0F, 0.0F);
			sonic.addChild(shoulderR);
			setRotationAngle(shoulderR, 0.0F, 0.0F, 0.2618F);
			shoulderR.setTextureOffset(14, 16).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			shoulderR.setTextureOffset(36, 16).addBox(-3.0F, 2.9696F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			shoulderL = new ModelRenderer(this);
			shoulderL.setRotationPoint(2.0F, -3.0F, 0.0F);
			sonic.addChild(shoulderL);
			setRotationAngle(shoulderL, 0.0F, 0.0F, -0.2618F);
			shoulderL.setTextureOffset(14, 16).addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);
			shoulderL.setTextureOffset(36, 16).addBox(-1.0F, 2.9696F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			sonic.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.shoulderR.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.hipR.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.hipL.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.shoulderL.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
