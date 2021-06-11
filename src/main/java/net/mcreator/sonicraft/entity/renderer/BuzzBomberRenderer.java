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

import net.mcreator.sonicraft.entity.BuzzBomberEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BuzzBomberRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BuzzBomberEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbuzz_bomber(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/buzz_bomber.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelbuzz_bomber extends EntityModel<Entity> {
		private final ModelRenderer main;
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer bodyrotate;
		private final ModelRenderer wingR;
		private final ModelRenderer wingL;
		private final ModelRenderer tail;
		private final ModelRenderer tailfix;
		private final ModelRenderer thorax;
		public Modelbuzz_bomber() {
			textureWidth = 128;
			textureHeight = 64;
			main = new ModelRenderer(this);
			main.setRotationPoint(0.0F, 9.0F, 7.5F);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -11.0F, -7.5F);
			main.addChild(head);
			head.setTextureOffset(0, 28).addBox(-5.0F, -5.0F, -10.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(4.0F, -10.0F, -11.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -11.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -9.0F, -6.5F);
			main.addChild(body);
			setRotationAngle(body, -0.8727F, 0.0F, 0.0F);
			body.setTextureOffset(2, 2).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, 0.25F, false);
			body.setTextureOffset(0, 48).addBox(-2.0F, -1.8767F, -4.4088F, 4.0F, 4.0F, 7.0F, 0.0F, false);
			bodyrotate = new ModelRenderer(this);
			bodyrotate.setRotationPoint(0.0F, 0.527F, 9.4479F);
			body.addChild(bodyrotate);
			setRotationAngle(bodyrotate, 0.8727F, 0.0F, 0.0F);
			bodyrotate.setTextureOffset(44, 32).addBox(-9.0F, -4.0F, -6.0F, 4.0F, 4.0F, 16.0F, 0.0F, false);
			bodyrotate.setTextureOffset(44, 32).addBox(5.0F, -4.0F, -6.0F, 4.0F, 4.0F, 16.0F, 0.0F, true);
			wingR = new ModelRenderer(this);
			wingR.setRotationPoint(-5.0F, -8.0F, -2.0F);
			bodyrotate.addChild(wingR);
			wingR.setTextureOffset(22, 52).addBox(-18.0F, 0.0F, -1.0F, 18.0F, 0.0F, 8.0F, 0.0F, false);
			wingL = new ModelRenderer(this);
			wingL.setRotationPoint(5.0F, -8.0F, -2.0F);
			bodyrotate.addChild(wingL);
			wingL.setTextureOffset(22, 52).addBox(0.0F, 0.0F, -1.0F, 18.0F, 0.0F, 8.0F, 0.0F, true);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 0.0F, 12.5F);
			body.addChild(tail);
			setRotationAngle(tail, -1.6144F, 0.0F, 0.0F);
			tail.setTextureOffset(30, 26).addBox(-2.0F, -2.0F, 10.0F, 4.0F, 4.0F, 8.0F, 0.0F, false);
			tailfix = new ModelRenderer(this);
			tailfix.setRotationPoint(0.0F, 0.1846F, -1.4021F);
			tail.addChild(tailfix);
			setRotationAngle(tailfix, 0.9599F, 0.0F, 0.0F);
			tailfix.setTextureOffset(0, 48).addBox(-2.0F, -1.2066F, -4.1088F, 4.0F, 4.0F, 7.0F, 0.0F, false);
			thorax = new ModelRenderer(this);
			thorax.setRotationPoint(0.0F, 0.0F, 6.0F);
			tail.addChild(thorax);
			setRotationAngle(thorax, 3.1416F, 0.0F, 0.0F);
			thorax.setTextureOffset(42, 0).addBox(-5.0F, -5.0F, -7.0F, 10.0F, 10.0F, 14.0F, 0.5F, false);
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
			this.wingR.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.wingL.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
