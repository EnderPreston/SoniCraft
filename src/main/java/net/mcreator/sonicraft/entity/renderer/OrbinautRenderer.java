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

import net.mcreator.sonicraft.entity.OrbinautEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class OrbinautRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(OrbinautEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelorbinaut(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/orbinaut_star_light.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelorbinaut extends EntityModel<Entity> {
		private final ModelRenderer main;
		private final ModelRenderer head;
		private final ModelRenderer orbs;
		private final ModelRenderer orb_bone1;
		private final ModelRenderer orb1;
		private final ModelRenderer orb2;
		private final ModelRenderer orb3;
		private final ModelRenderer orb4;
		private final ModelRenderer orb_bone2;
		private final ModelRenderer orb5;
		private final ModelRenderer orb6;
		private final ModelRenderer orb7;
		public Modelorbinaut() {
			textureWidth = 64;
			textureHeight = 32;
			main = new ModelRenderer(this);
			main.setRotationPoint(0.0F, 20.0F, 0.0F);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -4.0F, 0.0F);
			main.addChild(head);
			head.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			orbs = new ModelRenderer(this);
			orbs.setRotationPoint(0.0F, -4.0F, 0.0F);
			main.addChild(orbs);
			orb_bone1 = new ModelRenderer(this);
			orb_bone1.setRotationPoint(0.0F, 0.0F, 0.0F);
			orbs.addChild(orb_bone1);
			setRotationAngle(orb_bone1, 0.0F, 0.7854F, 0.0F);
			orb1 = new ModelRenderer(this);
			orb1.setRotationPoint(0.0F, 0.0F, 0.0F);
			orb_bone1.addChild(orb1);
			orb1.setTextureOffset(32, 0).addBox(-2.0F, -2.5F, -13.5F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			orb1.setTextureOffset(32, 0).addBox(-0.5F, -3.5F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb1.setTextureOffset(32, 2).addBox(-0.5F, 1.5F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb1.setTextureOffset(32, 0).addBox(2.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb1.setTextureOffset(32, 0).addBox(-3.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb1.setTextureOffset(32, 0).addBox(-0.5F, -1.0F, -14.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb1.setTextureOffset(32, 0).addBox(-0.5F, -1.0F, -9.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb2 = new ModelRenderer(this);
			orb2.setRotationPoint(0.0F, 0.0F, 0.0F);
			orb_bone1.addChild(orb2);
			setRotationAngle(orb2, 0.0F, -1.5708F, 0.0F);
			orb2.setTextureOffset(32, 0).addBox(-2.0F, -2.5F, -13.5F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			orb2.setTextureOffset(32, 0).addBox(-0.5F, -3.5F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb2.setTextureOffset(32, 2).addBox(-0.5F, 1.5F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb2.setTextureOffset(32, 0).addBox(2.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb2.setTextureOffset(32, 0).addBox(-3.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb2.setTextureOffset(32, 0).addBox(-0.5F, -1.0F, -14.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb2.setTextureOffset(32, 0).addBox(-0.5F, -1.0F, -9.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb3 = new ModelRenderer(this);
			orb3.setRotationPoint(0.0F, 0.0F, 0.0F);
			orb_bone1.addChild(orb3);
			setRotationAngle(orb3, 0.0F, 3.1416F, 0.0F);
			orb3.setTextureOffset(32, 0).addBox(-2.0F, -2.5F, -13.5F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			orb3.setTextureOffset(32, 0).addBox(-0.5F, -3.5F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb3.setTextureOffset(32, 2).addBox(-0.5F, 1.5F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb3.setTextureOffset(32, 0).addBox(2.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb3.setTextureOffset(32, 0).addBox(-3.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb3.setTextureOffset(32, 0).addBox(-0.5F, -1.0F, -14.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb3.setTextureOffset(32, 0).addBox(-0.5F, -1.0F, -9.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb4 = new ModelRenderer(this);
			orb4.setRotationPoint(0.0F, 0.0F, 0.0F);
			orb_bone1.addChild(orb4);
			setRotationAngle(orb4, 0.0F, 1.5708F, 0.0F);
			orb4.setTextureOffset(32, 0).addBox(-2.0F, -2.5F, -13.5F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			orb4.setTextureOffset(32, 0).addBox(-0.5F, -3.5F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb4.setTextureOffset(32, 2).addBox(-0.5F, 1.5F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb4.setTextureOffset(32, 0).addBox(2.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb4.setTextureOffset(32, 0).addBox(-3.0F, -1.0F, -12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb4.setTextureOffset(32, 0).addBox(-0.5F, -1.0F, -14.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb4.setTextureOffset(32, 0).addBox(-0.5F, -1.0F, -9.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			orb_bone2 = new ModelRenderer(this);
			orb_bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
			orbs.addChild(orb_bone2);
			setRotationAngle(orb_bone2, 0.0F, 1.0472F, 0.0F);
			orb5 = new ModelRenderer(this);
			orb5.setRotationPoint(0.0F, 0.0F, 0.0F);
			orb_bone2.addChild(orb5);
			orb5.setTextureOffset(0, 16).addBox(-2.0F, -2.5F, -13.5F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			orb6 = new ModelRenderer(this);
			orb6.setRotationPoint(0.0F, 0.0F, 0.0F);
			orb_bone2.addChild(orb6);
			setRotationAngle(orb6, 0.0F, -2.0944F, 0.0F);
			orb6.setTextureOffset(16, 16).addBox(-2.0F, -2.5F, -13.5F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			orb7 = new ModelRenderer(this);
			orb7.setRotationPoint(0.0F, 0.0F, 0.0F);
			orb_bone2.addChild(orb7);
			setRotationAngle(orb7, 0.0F, 2.0944F, 0.0F);
			orb7.setTextureOffset(32, 16).addBox(-2.0F, -2.5F, -13.5F, 4.0F, 4.0F, 4.0F, 0.0F, false);
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
			this.orb_bone2.rotateAngleY = f2;
			this.orb_bone1.rotateAngleY = f2 / 20.f;
		}
	}
}
