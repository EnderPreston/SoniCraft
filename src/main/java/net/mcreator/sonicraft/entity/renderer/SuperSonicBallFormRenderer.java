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

import net.mcreator.sonicraft.entity.SuperSonicBallFormEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SuperSonicBallFormRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SuperSonicBallFormEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsonic_ball(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/super_sonic_ball.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelsonic_ball extends EntityModel<Entity> {
		private final ModelRenderer main;
		private final ModelRenderer cube;
		private final ModelRenderer spinegroup1;
		private final ModelRenderer spine1;
		private final ModelRenderer spine2;
		private final ModelRenderer spine3;
		private final ModelRenderer spine4;
		private final ModelRenderer spine5;
		private final ModelRenderer spine6;
		private final ModelRenderer spine7;
		private final ModelRenderer spine8;
		private final ModelRenderer spinegroup2;
		private final ModelRenderer spine9;
		private final ModelRenderer spine10;
		private final ModelRenderer spine11;
		private final ModelRenderer spine12;
		private final ModelRenderer spine13;
		private final ModelRenderer spine14;
		private final ModelRenderer spine15;
		private final ModelRenderer spine16;
		private final ModelRenderer spinegroup3;
		private final ModelRenderer spine17;
		private final ModelRenderer spine18;
		private final ModelRenderer spine19;
		private final ModelRenderer spine20;
		private final ModelRenderer spine21;
		private final ModelRenderer spine22;
		private final ModelRenderer spine23;
		private final ModelRenderer spine24;
		public Modelsonic_ball() {
			textureWidth = 64;
			textureHeight = 32;
			main = new ModelRenderer(this);
			main.setRotationPoint(0.0F, 17.0F, 0.0F);
			cube = new ModelRenderer(this);
			cube.setRotationPoint(0.0F, 0.0F, 0.0F);
			main.addChild(cube);
			cube.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			spinegroup1 = new ModelRenderer(this);
			spinegroup1.setRotationPoint(0.0F, 0.0F, 0.0F);
			main.addChild(spinegroup1);
			spine1 = new ModelRenderer(this);
			spine1.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup1.addChild(spine1);
			spine1.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine2 = new ModelRenderer(this);
			spine2.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup1.addChild(spine2);
			setRotationAngle(spine2, -0.7854F, 0.0F, 0.0F);
			spine2.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine3 = new ModelRenderer(this);
			spine3.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup1.addChild(spine3);
			setRotationAngle(spine3, -1.5708F, 0.0F, 0.0F);
			spine3.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine4 = new ModelRenderer(this);
			spine4.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup1.addChild(spine4);
			setRotationAngle(spine4, -2.3562F, 0.0F, 0.0F);
			spine4.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine5 = new ModelRenderer(this);
			spine5.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup1.addChild(spine5);
			setRotationAngle(spine5, 3.1416F, 0.0F, 0.0F);
			spine5.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine6 = new ModelRenderer(this);
			spine6.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup1.addChild(spine6);
			setRotationAngle(spine6, 2.3562F, 0.0F, 0.0F);
			spine6.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine7 = new ModelRenderer(this);
			spine7.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup1.addChild(spine7);
			setRotationAngle(spine7, 1.5708F, 0.0F, 0.0F);
			spine7.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine8 = new ModelRenderer(this);
			spine8.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup1.addChild(spine8);
			setRotationAngle(spine8, 0.7854F, 0.0F, 0.0F);
			spine8.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -11.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spinegroup2 = new ModelRenderer(this);
			spinegroup2.setRotationPoint(-3.0F, 0.0F, 0.0F);
			main.addChild(spinegroup2);
			spine9 = new ModelRenderer(this);
			spine9.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup2.addChild(spine9);
			spine9.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine10 = new ModelRenderer(this);
			spine10.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup2.addChild(spine10);
			setRotationAngle(spine10, -0.7854F, 0.0F, 0.0F);
			spine10.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine11 = new ModelRenderer(this);
			spine11.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup2.addChild(spine11);
			setRotationAngle(spine11, -1.5708F, 0.0F, 0.0F);
			spine11.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine12 = new ModelRenderer(this);
			spine12.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup2.addChild(spine12);
			setRotationAngle(spine12, -2.3562F, 0.0F, 0.0F);
			spine12.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine13 = new ModelRenderer(this);
			spine13.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup2.addChild(spine13);
			setRotationAngle(spine13, 3.1416F, 0.0F, 0.0F);
			spine13.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine14 = new ModelRenderer(this);
			spine14.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup2.addChild(spine14);
			setRotationAngle(spine14, 2.3562F, 0.0F, 0.0F);
			spine14.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine15 = new ModelRenderer(this);
			spine15.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup2.addChild(spine15);
			setRotationAngle(spine15, 1.5708F, 0.0F, 0.0F);
			spine15.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine16 = new ModelRenderer(this);
			spine16.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup2.addChild(spine16);
			setRotationAngle(spine16, 0.7854F, 0.0F, 0.0F);
			spine16.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spinegroup3 = new ModelRenderer(this);
			spinegroup3.setRotationPoint(3.0F, 0.0F, 0.0F);
			main.addChild(spinegroup3);
			spine17 = new ModelRenderer(this);
			spine17.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup3.addChild(spine17);
			spine17.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine18 = new ModelRenderer(this);
			spine18.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup3.addChild(spine18);
			setRotationAngle(spine18, -0.7854F, 0.0F, 0.0F);
			spine18.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine19 = new ModelRenderer(this);
			spine19.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup3.addChild(spine19);
			setRotationAngle(spine19, -1.5708F, 0.0F, 0.0F);
			spine19.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine20 = new ModelRenderer(this);
			spine20.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup3.addChild(spine20);
			setRotationAngle(spine20, -2.3562F, 0.0F, 0.0F);
			spine20.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine21 = new ModelRenderer(this);
			spine21.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup3.addChild(spine21);
			setRotationAngle(spine21, 3.1416F, 0.0F, 0.0F);
			spine21.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine22 = new ModelRenderer(this);
			spine22.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup3.addChild(spine22);
			setRotationAngle(spine22, 2.3562F, 0.0F, 0.0F);
			spine22.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine23 = new ModelRenderer(this);
			spine23.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup3.addChild(spine23);
			setRotationAngle(spine23, 1.5708F, 0.0F, 0.0F);
			spine23.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
			spine24 = new ModelRenderer(this);
			spine24.setRotationPoint(0.0F, 0.0F, 0.0F);
			spinegroup3.addChild(spine24);
			setRotationAngle(spine24, 0.7854F, 0.0F, 0.0F);
			spine24.setTextureOffset(0, 12).addBox(0.0F, -5.0F, -10.0F, 0.0F, 10.0F, 8.0F, 0.0F, false);
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
			this.main.rotateAngleX = f2;
			this.cube.rotateAngleZ = f2;
		}
	}
}
