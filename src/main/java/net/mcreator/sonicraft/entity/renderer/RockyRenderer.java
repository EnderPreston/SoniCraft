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

import net.mcreator.sonicraft.entity.RockyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RockyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RockyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelrocky(), 0.2f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/rocky.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelrocky extends EntityModel<Entity> {
		private final ModelRenderer main;
		private final ModelRenderer body;
		private final ModelRenderer armR;
		private final ModelRenderer armL;
		private final ModelRenderer head;
		private final ModelRenderer nose;
		private final ModelRenderer tail;
		private final ModelRenderer tail2;
		public Modelrocky() {
			textureWidth = 32;
			textureHeight = 32;
			main = new ModelRenderer(this);
			main.setRotationPoint(1.0F, 24.0F, -1.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 3.0F, 0.0F);
			main.addChild(body);
			body.setTextureOffset(0, 11).addBox(-2.5F, -5.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-2.5F, -4.75F, 1.75F, 3.0F, 2.0F, 2.0F, -0.25F, false);
			armR = new ModelRenderer(this);
			armR.setRotationPoint(-2.5F, -4.5F, 1.0F);
			body.addChild(armR);
			armR.setTextureOffset(15, 0).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			armL = new ModelRenderer(this);
			armL.setRotationPoint(0.5F, -4.5F, 1.0F);
			body.addChild(armL);
			armL.setTextureOffset(15, 0).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(-1.0F, -2.125F, 1.0F);
			main.addChild(head);
			head.setTextureOffset(0, 0).addBox(-2.5F, -4.625F, -2.5F, 5.0F, 5.0F, 5.0F, -0.25F, false);
			nose = new ModelRenderer(this);
			nose.setRotationPoint(-1.0F, 2.125F, -6.0F);
			head.addChild(nose);
			setRotationAngle(nose, 0.0F, 3.1416F, 0.0F);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(-1.0F, -0.75F, 3.5F);
			main.addChild(tail);
			tail2 = new ModelRenderer(this);
			tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
			tail.addChild(tail2);
			setRotationAngle(tail2, 0.5672F, 0.0F, 0.0F);
			tail2.setTextureOffset(19, 0).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 0.0F, 3.0F, 0.0F, false);
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
			this.tail.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.armR.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.armL.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
