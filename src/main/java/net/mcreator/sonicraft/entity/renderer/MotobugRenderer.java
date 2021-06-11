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

import net.mcreator.sonicraft.entity.MotobugEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MotobugRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MotobugEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelmotobug(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/motobug.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelmotobug extends EntityModel<Entity> {
		private final ModelRenderer main;
		private final ModelRenderer wheel;
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer armR;
		private final ModelRenderer armL;
		public Modelmotobug() {
			textureWidth = 128;
			textureHeight = 64;
			main = new ModelRenderer(this);
			main.setRotationPoint(0.0F, 24.0F, 0.5F);
			wheel = new ModelRenderer(this);
			wheel.setRotationPoint(0.0F, -6.0F, -0.5F);
			main.addChild(wheel);
			wheel.setTextureOffset(68, 0).addBox(-4.0F, -6.0F, -6.0F, 8.0F, 12.0F, 12.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			main.addChild(body);
			body.setTextureOffset(0, 0).addBox(-8.0F, -19.0F, -7.5F, 16.0F, 14.0F, 18.0F, 0.0F, false);
			body.setTextureOffset(44, 32).addBox(-10.0F, -11.0F, -4.0F, 4.0F, 4.0F, 16.0F, 0.0F, false);
			body.setTextureOffset(44, 32).addBox(6.0F, -11.0F, -4.0F, 4.0F, 4.0F, 16.0F, 0.0F, true);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -11.0F, -7.5F);
			body.addChild(head);
			head.setTextureOffset(0, 32).addBox(-5.0F, -5.0F, -6.0F, 10.0F, 10.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(4.0F, -10.0F, -7.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -7.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);
			armR = new ModelRenderer(this);
			armR.setRotationPoint(-7.0F, -6.0F, -7.0F);
			body.addChild(armR);
			armR.setTextureOffset(32, 33).addBox(0.0F, -3.0F, -6.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);
			armL = new ModelRenderer(this);
			armL.setRotationPoint(7.0F, -6.0F, -7.0F);
			body.addChild(armL);
			armL.setTextureOffset(32, 33).addBox(0.0F, -3.0F, -6.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);
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
			this.armR.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.armL.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
