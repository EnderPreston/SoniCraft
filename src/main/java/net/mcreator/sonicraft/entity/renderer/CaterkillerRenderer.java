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

import net.mcreator.sonicraft.entity.CaterkillerEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CaterkillerRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CaterkillerEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcaterkiller(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/caterkiller.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelcaterkiller extends EntityModel<Entity> {
		private final ModelRenderer main;
		private final ModelRenderer body;
		private final ModelRenderer bone1fix;
		private final ModelRenderer bone2;
		private final ModelRenderer bone2fix;
		private final ModelRenderer bone3;
		private final ModelRenderer bone3fix;
		private final ModelRenderer headfix;
		private final ModelRenderer headfix2;
		private final ModelRenderer head;
		public Modelcaterkiller() {
			textureWidth = 64;
			textureHeight = 64;
			main = new ModelRenderer(this);
			main.setRotationPoint(6.0F, 24.0F, -23.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(-6.0F, -6.0F, 12.0F);
			main.addChild(body);
			setRotationAngle(body, 0.0F, 0.0F, 0.0F);
			bone1fix = new ModelRenderer(this);
			bone1fix.setRotationPoint(0.0F, 0.0F, 6.0F);
			body.addChild(bone1fix);
			bone1fix.setTextureOffset(0, 24).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
			bone1fix.setTextureOffset(48, 0).addBox(-10.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			bone1fix.setTextureOffset(48, 0).addBox(6.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, -2.0F, 7.0F);
			bone1fix.addChild(bone2);
			bone2fix = new ModelRenderer(this);
			bone2fix.setRotationPoint(0.0F, -4.0F, 4.0F);
			bone2.addChild(bone2fix);
			bone2fix.setTextureOffset(0, 24).addBox(-6.0F, -4.0F, -7.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
			bone2fix.setTextureOffset(48, 0).addBox(6.0F, 0.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			bone2fix.setTextureOffset(48, 0).addBox(-10.0F, 0.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, -2.5321F, -1.2856F);
			bone2.addChild(bone3);
			bone3fix = new ModelRenderer(this);
			bone3fix.setRotationPoint(0.0F, 4.8251F, 14.5195F);
			bone3.addChild(bone3fix);
			bone3fix.setTextureOffset(0, 24).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
			bone3fix.setTextureOffset(48, 0).addBox(6.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			bone3fix.setTextureOffset(48, 0).addBox(-10.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			headfix = new ModelRenderer(this);
			headfix.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(headfix);
			headfix2 = new ModelRenderer(this);
			headfix2.setRotationPoint(0.0F, -4.0F, -4.0F);
			headfix.addChild(headfix2);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 6.0F);
			headfix2.addChild(head);
			head.setTextureOffset(0, 0).addBox(-6.0F, -6.0F, -12.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
			head.setTextureOffset(0, 48).addBox(-4.0F, -14.0F, -13.0F, 0.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 48).addBox(4.0F, -14.0F, -13.0F, 0.0F, 8.0F, 8.0F, 0.0F, true);
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
			this.headfix.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.bone2fix.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.bone3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.bone2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.headfix2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
