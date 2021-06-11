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

import net.mcreator.sonicraft.entity.AmyRoseEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AmyRoseRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AmyRoseEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelamy_rose(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/amy_rose_texture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelamy_rose extends EntityModel<Entity> {
		private final ModelRenderer sonic;
		private final ModelRenderer head;
		private final ModelRenderer hair;
		private final ModelRenderer hair1;
		private final ModelRenderer hair2;
		private final ModelRenderer hair3;
		private final ModelRenderer body;
		private final ModelRenderer legR;
		private final ModelRenderer legL;
		private final ModelRenderer armR;
		private final ModelRenderer shoulderR;
		private final ModelRenderer hammer;
		private final ModelRenderer part1;
		private final ModelRenderer part2;
		private final ModelRenderer armL;
		private final ModelRenderer shoulderL;
		public Modelamy_rose() {
			textureWidth = 64;
			textureHeight = 64;
			sonic = new ModelRenderer(this);
			sonic.setRotationPoint(0.0F, 14.0F, 0.0F);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -4.0F, 0.0F);
			sonic.addChild(head);
			head.setTextureOffset(0, 4).addBox(-0.5F, -3.0F, -4.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 1).addBox(-4.0F, -10.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 1).addBox(2.0F, -10.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.25F, false);
			hair = new ModelRenderer(this);
			hair.setRotationPoint(0.0F, -7.0F, -4.0F);
			head.addChild(hair);
			setRotationAngle(hair, 0.2182F, 0.0F, 0.0F);
			hair1 = new ModelRenderer(this);
			hair1.setRotationPoint(0.0F, -0.5936F, -0.3219F);
			hair.addChild(hair1);
			setRotationAngle(hair1, 0.7418F, 3.1416F, 0.0F);
			hair1.setTextureOffset(24, 1).addBox(0.0F, -1.1089F, -2.2159F, 0.0F, 2.0F, 5.0F, 0.0F, false);
			hair2 = new ModelRenderer(this);
			hair2.setRotationPoint(0.0F, 0.0F, -1.0F);
			hair.addChild(hair2);
			setRotationAngle(hair2, 0.2618F, 3.1416F, 0.0F);
			hair2.setTextureOffset(24, 1).addBox(0.0F, -0.8674F, -2.2806F, 0.0F, 2.0F, 5.0F, 0.0F, false);
			hair3 = new ModelRenderer(this);
			hair3.setRotationPoint(0.0F, 1.25F, 0.0F);
			hair.addChild(hair3);
			setRotationAngle(hair3, -0.2182F, 3.1416F, 0.0F);
			hair3.setTextureOffset(24, 1).addBox(0.0F, -1.1089F, -2.2159F, 0.0F, 2.0F, 5.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(-0.5F, 0.0F, 0.0F);
			sonic.addChild(body);
			body.setTextureOffset(0, 22).addBox(-1.5F, -4.0F, -1.0F, 4.0F, 5.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(28, 33).addBox(-3.5F, 0.0F, -4.0F, 8.0F, 2.0F, 8.0F, -0.25F, false);
			legR = new ModelRenderer(this);
			legR.setRotationPoint(-1.0F, 3.0F, 0.0F);
			sonic.addChild(legR);
			legR.setTextureOffset(22, 16).addBox(-1.0F, -2.25F, -1.0F, 2.0F, 6.0F, 2.0F, -0.25F, false);
			legR.setTextureOffset(16, 26).addBox(-2.0F, 2.25F, -2.0F, 4.0F, 3.0F, 4.0F, -0.225F, false);
			legR.setTextureOffset(34, 24).addBox(-2.0F, 5.0F, -4.0F, 4.0F, 2.0F, 6.0F, 0.025F, false);
			legL = new ModelRenderer(this);
			legL.setRotationPoint(1.0F, 3.0F, 0.0F);
			sonic.addChild(legL);
			legL.setTextureOffset(22, 16).addBox(-1.0F, -2.25F, -1.0F, 2.0F, 6.0F, 2.0F, -0.25F, true);
			legL.setTextureOffset(16, 26).addBox(-2.0F, 2.25F, -2.0F, 4.0F, 3.0F, 4.0F, -0.25F, true);
			legL.setTextureOffset(34, 24).addBox(-2.0F, 5.0F, -4.0F, 4.0F, 2.0F, 6.0F, 0.0F, true);
			armR = new ModelRenderer(this);
			armR.setRotationPoint(-2.0F, 11.0F, 0.0F);
			shoulderR = new ModelRenderer(this);
			shoulderR.setRotationPoint(0.0F, 0.0F, 0.0F);
			armR.addChild(shoulderR);
			setRotationAngle(shoulderR, 0.0F, 0.0F, 0.7418F);
			shoulderR.setTextureOffset(14, 16).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			shoulderR.setTextureOffset(36, 16).addBox(-3.0F, 2.9696F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			hammer = new ModelRenderer(this);
			hammer.setRotationPoint(-1.072F, 4.9472F, -2.0117F);
			shoulderR.addChild(hammer);
			setRotationAngle(hammer, 1.5708F, 0.0F, -2.3126F);
			hammer.setTextureOffset(0, 49).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			part1 = new ModelRenderer(this);
			part1.setRotationPoint(1.0F, -6.0F, 2.0F);
			hammer.addChild(part1);
			part1.setTextureOffset(0, 33).addBox(-7.0F, -7.0F, -6.0F, 6.0F, 8.0F, 8.0F, 0.0F, false);
			part2 = new ModelRenderer(this);
			part2.setRotationPoint(-1.0F, -6.0F, 2.0F);
			hammer.addChild(part2);
			part2.setTextureOffset(0, 33).addBox(1.0F, -7.0F, -6.0F, 6.0F, 8.0F, 8.0F, 0.0F, true);
			armL = new ModelRenderer(this);
			armL.setRotationPoint(0.0F, 24.0F, 0.0F);
			shoulderL = new ModelRenderer(this);
			shoulderL.setRotationPoint(2.0F, -13.0F, 0.0F);
			armL.addChild(shoulderL);
			setRotationAngle(shoulderL, 0.0F, 0.0F, -0.7418F);
			shoulderL.setTextureOffset(14, 16).addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);
			shoulderL.setTextureOffset(36, 16).addBox(-1.0F, 2.9696F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			sonic.render(matrixStack, buffer, packedLight, packedOverlay);
			armR.render(matrixStack, buffer, packedLight, packedOverlay);
			armL.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.shoulderR.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.legL.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.legR.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.shoulderL.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
