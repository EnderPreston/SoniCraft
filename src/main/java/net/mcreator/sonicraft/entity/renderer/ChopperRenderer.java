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

import net.mcreator.sonicraft.entity.ChopperEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ChopperRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ChopperEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelchopper(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/chopper.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelchopper extends EntityModel<Entity> {
		private final ModelRenderer main;
		private final ModelRenderer tail_1;
		private final ModelRenderer right_fin;
		private final ModelRenderer bone;
		private final ModelRenderer left_fin;
		private final ModelRenderer bone2;
		private final ModelRenderer bone3;
		private final ModelRenderer jaw;
		public Modelchopper() {
			textureWidth = 64;
			textureHeight = 64;
			main = new ModelRenderer(this);
			main.setRotationPoint(4.0F, 21.0F, -7.0F);
			main.setTextureOffset(0, 0).addBox(-8.0F, -10.0F, -1.0F, 8.0F, 10.0F, 14.0F, 0.0F, false);
			main.setTextureOffset(30, 0).addBox(-7.0F, -9.0F, 9.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);
			main.setTextureOffset(16, 20).addBox(-4.0F, -15.0F, 1.0F, 0.0F, 5.0F, 10.0F, 0.0F, false);
			main.setTextureOffset(18, 22).addBox(-4.0F, -13.0F, 10.0F, 0.0F, 5.0F, 3.0F, 0.0F, false);
			main.setTextureOffset(0, 42).addBox(-8.0F, -3.0F, -1.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);
			tail_1 = new ModelRenderer(this);
			tail_1.setRotationPoint(-4.0F, -5.0F, 15.0F);
			main.addChild(tail_1);
			tail_1.setTextureOffset(44, 14).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
			tail_1.setTextureOffset(0, 22).addBox(0.0F, -6.0F, 0.75F, 0.0F, 12.0F, 8.0F, 0.0F, false);
			right_fin = new ModelRenderer(this);
			right_fin.setRotationPoint(-8.0F, -2.0F, 6.0F);
			main.addChild(right_fin);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 0.0F);
			right_fin.addChild(bone);
			setRotationAngle(bone, 0.0F, 0.0F, -0.4363F);
			bone.setTextureOffset(36, 30).addBox(-6.0F, 0.0F, -2.0F, 6.0F, 0.0F, 8.0F, 0.0F, false);
			left_fin = new ModelRenderer(this);
			left_fin.setRotationPoint(0.0F, -2.0F, 6.0F);
			main.addChild(left_fin);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
			left_fin.addChild(bone2);
			setRotationAngle(bone2, 0.0F, 0.0F, 0.4363F);
			bone2.setTextureOffset(36, 30).addBox(0.0F, 0.0F, -2.0F, 6.0F, 0.0F, 8.0F, 0.0F, true);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-4.0F, 1.5F, 13.5F);
			main.addChild(bone3);
			setRotationAngle(bone3, 3.1416F, 3.1416F, 0.0F);
			bone3.setTextureOffset(18, 22).addBox(0.0F, -1.5F, -3.5F, 0.0F, 5.0F, 3.0F, 0.0F, false);
			jaw = new ModelRenderer(this);
			jaw.setRotationPoint(-4.0F, -1.0F, 4.5F);
			main.addChild(jaw);
			setRotationAngle(jaw, 0.2182F, 0.0F, 0.0F);
			jaw.setTextureOffset(20, 35).addBox(-3.5F, -2.25F, -5.0F, 7.0F, 3.0F, 5.0F, 0.0F, false);
			jaw.setTextureOffset(24, 24).addBox(-3.5F, -0.25F, -5.0F, 7.0F, 1.0F, 5.0F, -0.1F, false);
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
			this.tail_1.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
