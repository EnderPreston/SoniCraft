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

import net.mcreator.sonicraft.entity.PeckyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PeckyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PeckyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelpecky(), 0.2f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/pecky.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelpecky extends EntityModel<Entity> {
		private final ModelRenderer main;
		private final ModelRenderer body;
		private final ModelRenderer wingR;
		private final ModelRenderer wingL;
		private final ModelRenderer legR;
		private final ModelRenderer legL;
		private final ModelRenderer head;
		public Modelpecky() {
			textureWidth = 32;
			textureHeight = 32;
			main = new ModelRenderer(this);
			main.setRotationPoint(1.0F, 22.0F, -1.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 3.0F, 0.0F);
			main.addChild(body);
			body.setTextureOffset(0, 11).addBox(-2.5F, -5.0F, 0.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			wingR = new ModelRenderer(this);
			wingR.setRotationPoint(-2.5F, -4.5F, 1.0F);
			body.addChild(wingR);
			wingR.setTextureOffset(15, 0).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			wingL = new ModelRenderer(this);
			wingL.setRotationPoint(0.5F, -4.5F, 1.0F);
			body.addChild(wingL);
			wingL.setTextureOffset(14, 15).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			legR = new ModelRenderer(this);
			legR.setRotationPoint(-2.0F, -2.0F, 1.25F);
			body.addChild(legR);
			legR.setTextureOffset(7, 15).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			legL = new ModelRenderer(this);
			legL.setRotationPoint(0.0F, -2.0F, 1.25F);
			body.addChild(legL);
			legL.setTextureOffset(10, 11).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(-1.0F, -2.0833F, 0.8333F);
			main.addChild(head);
			head.setTextureOffset(0, 0).addBox(-2.5F, -5.6667F, -2.3333F, 5.0F, 6.0F, 5.0F, -0.25F, false);
			head.setTextureOffset(15, 2).addBox(-1.0F, -1.4167F, -2.8333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 19).addBox(-2.0F, -5.6667F, -2.3333F, 4.0F, 2.0F, 3.0F, 0.0F, false);
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
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.legR.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.wingR.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.legL.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.wingL.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
