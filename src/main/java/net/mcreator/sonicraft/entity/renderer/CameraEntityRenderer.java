package net.mcreator.sonicraft.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.sonicraft.entity.CameraEntityEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CameraEntityRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CameraEntityEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcamera(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/camera_tripod.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelcamera extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer leg0;
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer leg3;
		private final ModelRenderer camera_head;
		private final ModelRenderer bone;
		public Modelcamera() {
			textureWidth = 64;
			textureHeight = 32;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 19.2F, 0.0F);
			leg0 = new ModelRenderer(this);
			leg0.setRotationPoint(0.0F, -15.2F, 0.0F);
			body.addChild(leg0);
			setRotationAngle(leg0, -0.3927F, 0.0F, 0.0F);
			leg0.setTextureOffset(36, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(0.0F, -15.2F, 0.0F);
			body.addChild(leg1);
			setRotationAngle(leg1, 0.0F, 0.0F, -0.3927F);
			leg1.setTextureOffset(36, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(0.0F, -15.2F, 0.0F);
			body.addChild(leg2);
			setRotationAngle(leg2, 0.0F, 0.0F, 0.3927F);
			leg2.setTextureOffset(36, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(0.0F, -15.2F, 0.0F);
			body.addChild(leg3);
			setRotationAngle(leg3, 0.3927F, 0.0F, 0.0F);
			leg3.setTextureOffset(36, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);
			camera_head = new ModelRenderer(this);
			camera_head.setRotationPoint(0.0F, -15.2F, 0.0F);
			body.addChild(camera_head);
			camera_head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 10.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, -8.0F, 1.0F);
			camera_head.addChild(bone);
			bone.setTextureOffset(0, 18).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 2.0F, 10.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.camera_head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.camera_head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
