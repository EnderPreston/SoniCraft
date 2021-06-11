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

import net.mcreator.sonicraft.entity.TailsFlyingEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TailsFlyingRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TailsFlyingEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeltails_flying(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/tails_texture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modeltails_flying extends EntityModel<Entity> {
		private final ModelRenderer sonic;
		private final ModelRenderer head;
		private final ModelRenderer hair;
		private final ModelRenderer hair1;
		private final ModelRenderer hair2;
		private final ModelRenderer hair3;
		private final ModelRenderer body;
		private final ModelRenderer tails;
		private final ModelRenderer tailL;
		private final ModelRenderer tailL2;
		private final ModelRenderer tailR;
		private final ModelRenderer R2;
		private final ModelRenderer bone;
		private final ModelRenderer hipR;
		private final ModelRenderer hipL;
		private final ModelRenderer shoulderR;
		private final ModelRenderer shoulderL;
		public Modeltails_flying() {
			textureWidth = 64;
			textureHeight = 32;
			sonic = new ModelRenderer(this);
			sonic.setRotationPoint(0.0F, 17.0F, 0.0F);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -5.0F, -1.0F);
			sonic.addChild(head);
			setRotationAngle(head, 0.48F, 0.0F, 0.0F);
			head.setTextureOffset(0, 4).addBox(-0.5F, 0.0F, -6.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, -6.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(1.0F, -8.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 5).addBox(-5.5F, -1.0F, -5.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(24, 5).addBox(2.5F, -1.0F, -5.5F, 3.0F, 3.0F, 0.0F, 0.0F, true);
			hair = new ModelRenderer(this);
			hair.setRotationPoint(0.0F, -6.0F, -6.0F);
			head.addChild(hair);
			setRotationAngle(hair, 0.2182F, 0.0F, 0.0F);
			hair1 = new ModelRenderer(this);
			hair1.setRotationPoint(0.0F, -0.5936F, -0.3219F);
			hair.addChild(hair1);
			setRotationAngle(hair1, 0.7418F, 3.1416F, 0.0F);
			hair1.setTextureOffset(50, 6).addBox(0.0F, 0.6232F, -3.2159F, 0.0F, 2.0F, 5.0F, 0.0F, false);
			hair2 = new ModelRenderer(this);
			hair2.setRotationPoint(0.0F, 0.0F, -1.0F);
			hair.addChild(hair2);
			setRotationAngle(hair2, 0.2618F, 3.1416F, 0.0F);
			hair2.setTextureOffset(50, 6).addBox(0.0F, 1.1307F, -2.3678F, 0.0F, 2.0F, 5.0F, 0.0F, false);
			hair3 = new ModelRenderer(this);
			hair3.setRotationPoint(0.0F, 1.25F, 0.0F);
			hair.addChild(hair3);
			setRotationAngle(hair3, -0.2182F, 3.1416F, 0.0F);
			hair3.setTextureOffset(50, 6).addBox(0.0F, 0.7037F, -1.3706F, 0.0F, 2.0F, 5.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(-0.5F, -3.0F, 0.0F);
			sonic.addChild(body);
			setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
			body.setTextureOffset(0, 21).addBox(-1.5F, -2.0F, -1.5F, 4.0F, 5.0F, 3.0F, 0.0F, false);
			tails = new ModelRenderer(this);
			tails.setRotationPoint(0.5F, 3.5F, 10.0F);
			body.addChild(tails);
			setRotationAngle(tails, 0.0F, 0.0F, 0.0F);
			tailL = new ModelRenderer(this);
			tailL.setRotationPoint(1.0F, 0.0F, 2.25F);
			tails.addChild(tailL);
			setRotationAngle(tailL, 0.0F, 0.0F, -3.1416F);
			tailL2 = new ModelRenderer(this);
			tailL2.setRotationPoint(0.5F, 0.0F, 0.0F);
			tailL.addChild(tailL2);
			tailL2.setTextureOffset(32, 0).addBox(-1.5076F, 0.0F, -4.2759F, 4.0F, 9.0F, 5.0F, 0.0F, true);
			tailR = new ModelRenderer(this);
			tailR.setRotationPoint(0.5F, 0.0F, 2.25F);
			tails.addChild(tailR);
			R2 = new ModelRenderer(this);
			R2.setRotationPoint(0.0F, 0.0F, 0.0F);
			tailR.addChild(R2);
			R2.setTextureOffset(50, 0).addBox(-1.5F, -1.1548F, -3.3126F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			R2.setTextureOffset(32, 0).addBox(-2.4924F, 0.0F, -4.2759F, 4.0F, 9.0F, 5.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.5F, 3.0899F, 5.8036F);
			body.addChild(bone);
			setRotationAngle(bone, 1.3526F, 0.0F, 0.0F);
			bone.setTextureOffset(50, 0).addBox(-1.0F, -4.4924F, -1.4132F, 2.0F, 8.0F, 3.0F, 0.0F, true);
			hipR = new ModelRenderer(this);
			hipR.setRotationPoint(-1.0F, 3.0F, 0.0F);
			sonic.addChild(hipR);
			setRotationAngle(hipR, 1.0908F, -0.1745F, 0.0F);
			hipR.setTextureOffset(22, 16).addBox(-1.0F, -0.3595F, 5.7073F, 2.0F, 4.0F, 2.0F, -0.25F, false);
			hipR.setTextureOffset(16, 26).addBox(-2.0F, 3.1405F, 4.7073F, 4.0F, 2.0F, 4.0F, -0.25F, false);
			hipR.setTextureOffset(34, 24).addBox(-2.0F, 4.8905F, 2.7073F, 4.0F, 2.0F, 6.0F, 0.0F, false);
			hipL = new ModelRenderer(this);
			hipL.setRotationPoint(1.0F, 3.0F, 0.0F);
			sonic.addChild(hipL);
			setRotationAngle(hipL, 1.0908F, 0.1745F, 0.0F);
			hipL.setTextureOffset(22, 16).addBox(-1.0F, -0.3595F, 5.7073F, 2.0F, 4.0F, 2.0F, -0.25F, true);
			hipL.setTextureOffset(16, 26).addBox(-2.0F, 3.1405F, 4.7073F, 4.0F, 2.0F, 4.0F, -0.25F, true);
			hipL.setTextureOffset(34, 24).addBox(-2.0F, 4.8905F, 2.7073F, 4.0F, 2.0F, 6.0F, 0.0F, true);
			shoulderR = new ModelRenderer(this);
			shoulderR.setRotationPoint(-2.0F, -3.0F, 0.0F);
			sonic.addChild(shoulderR);
			setRotationAngle(shoulderR, 0.0F, 0.0F, 0.2618F);
			shoulderR.setTextureOffset(14, 16).addBox(-1.4824F, 0.9319F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			shoulderR.setTextureOffset(36, 16).addBox(-2.4824F, 4.9015F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			shoulderL = new ModelRenderer(this);
			shoulderL.setRotationPoint(2.0F, -3.0F, 0.0F);
			sonic.addChild(shoulderL);
			setRotationAngle(shoulderL, 0.0F, 0.0F, -0.2618F);
			shoulderL.setTextureOffset(14, 16).addBox(-0.5176F, 0.9319F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);
			shoulderL.setTextureOffset(36, 16).addBox(-1.5176F, 4.9015F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
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
			this.tails.rotateAngleZ = f2;
		}
	}
}
