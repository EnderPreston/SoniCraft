package net.mcreator.sonicraft.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.sonicraft.entity.ReplicaMetalSonicEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ReplicaMetalSonicRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ReplicaMetalSonicEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelmetal_sonic(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/metal_sonic_texture.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn
					.getBuffer(RenderType.getEyes(new ResourceLocation("sonicraft:textures/metal_sonic_texture_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelmetal_sonic extends EntityModel<Entity> {
		private final ModelRenderer sonic;
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer hipR;
		private final ModelRenderer hipL;
		private final ModelRenderer shoulderR;
		private final ModelRenderer shoulderL;
		public Modelmetal_sonic() {
			textureWidth = 64;
			textureHeight = 32;
			sonic = new ModelRenderer(this);
			sonic.setRotationPoint(0.0F, 12.0F, 0.0F);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -4.0F, 0.0F);
			sonic.addChild(head);
			head.setTextureOffset(0, 4).addBox(-0.5F, -3.0F, -4.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(4.125F, -8.0F, -2.75F, 0.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(-4.125F, -8.0F, -2.75F, 0.0F, 8.0F, 8.0F, 0.0F, true);
			head.setTextureOffset(0, 1).addBox(-4.0F, -10.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 1).addBox(2.0F, -10.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(-4.0F, -8.15F, -2.0F, 8.0F, 0.0F, 8.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(-0.5F, 0.0F, -0.5F);
			sonic.addChild(body);
			body.setTextureOffset(0, 16).addBox(-1.5F, -4.0F, -1.0F, 4.0F, 5.0F, 3.0F, 0.0F, false);
			hipR = new ModelRenderer(this);
			hipR.setRotationPoint(-1.0F, 1.0F, 0.0F);
			sonic.addChild(hipR);
			setRotationAngle(hipR, 0.3491F, 0.0F, 0.0F);
			hipR.setTextureOffset(22, 16).addBox(-1.0F, -0.4849F, -0.9145F, 2.0F, 8.0F, 2.0F, -0.25F, false);
			hipR.setTextureOffset(34, 24).addBox(-2.0F, 6.7651F, -3.9145F, 4.0F, 2.0F, 6.0F, 0.0F, false);
			hipL = new ModelRenderer(this);
			hipL.setRotationPoint(1.0F, 1.0F, 0.0F);
			sonic.addChild(hipL);
			setRotationAngle(hipL, 0.3491F, 0.0F, 0.0F);
			hipL.setTextureOffset(22, 16).addBox(-1.0F, -0.4849F, -0.9145F, 2.0F, 8.0F, 2.0F, -0.25F, true);
			hipL.setTextureOffset(34, 24).addBox(-2.0F, 6.7651F, -3.9145F, 4.0F, 2.0F, 6.0F, 0.0F, true);
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
			this.shoulderL.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
