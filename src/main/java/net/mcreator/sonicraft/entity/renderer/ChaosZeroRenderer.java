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

import net.mcreator.sonicraft.entity.ChaosZeroEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ChaosZeroRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ChaosZeroEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelchaos_0(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/chaos_zero.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("sonicraft:textures/chaos_zero_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelchaos_0 extends EntityModel<Entity> {
		private final ModelRenderer main;
		private final ModelRenderer Head;
		private final ModelRenderer spike1;
		private final ModelRenderer spike2;
		private final ModelRenderer spike3;
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public Modelchaos_0() {
			textureWidth = 96;
			textureHeight = 96;
			main = new ModelRenderer(this);
			main.setRotationPoint(-0.25F, -5.0F, 0.0F);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.25F, 5.0F, 0.0F);
			main.addChild(Head);
			Head.setTextureOffset(0, 0).addBox(-6.0F, -11.4311F, -6.1253F, 12.0F, 12.0F, 12.0F, 0.0F, false);
			spike1 = new ModelRenderer(this);
			spike1.setRotationPoint(0.0F, -17.0F, 0.0F);
			Head.addChild(spike1);
			setRotationAngle(spike1, -0.5236F, 0.0F, 0.0F);
			spike1.setTextureOffset(48, 0).addBox(-4.5F, -4.4311F, -1.3932F, 9.0F, 12.0F, 6.0F, 0.0F, false);
			spike2 = new ModelRenderer(this);
			spike2.setRotationPoint(-3.75F, -11.0F, 2.25F);
			Head.addChild(spike2);
			setRotationAngle(spike2, -2.2689F, -0.9599F, 0.0F);
			spike2.setTextureOffset(63, 18).addBox(-0.9513F, -11.4969F, 0.6421F, 6.0F, 12.0F, 6.0F, 0.0F, false);
			spike3 = new ModelRenderer(this);
			spike3.setRotationPoint(3.75F, -11.0F, 2.25F);
			Head.addChild(spike3);
			setRotationAngle(spike3, -2.2689F, 0.9599F, 0.0F);
			spike3.setTextureOffset(63, 18).addBox(-5.0487F, -11.4969F, 0.6421F, 6.0F, 12.0F, 6.0F, 0.0F, true);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, -12.0F, 0.0F);
			main.addChild(Body);
			Body.setTextureOffset(21, 24).addBox(-3.375F, 17.6939F, -2.5003F, 7.0F, 7.0F, 5.0F, 0.25F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-3.5F, 7.0F, 0.0F);
			main.addChild(RightArm);
			setRotationAngle(RightArm, 0.0F, 0.0F, 0.3491F);
			RightArm.setTextureOffset(46, 26).addBox(-3.6124F, -1.4112F, -2.3753F, 4.0F, 16.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 49).addBox(-4.8653F, 9.8245F, -3.2503F, 6.0F, 6.0F, 6.0F, 0.25F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(3.5F, 7.0F, 0.0F);
			main.addChild(LeftArm);
			setRotationAngle(LeftArm, 0.0F, 0.0F, -0.3491F);
			LeftArm.setTextureOffset(46, 25).addBox(0.1124F, -1.4112F, -2.3753F, 4.0F, 16.0F, 4.0F, 0.0F, true);
			LeftArm.setTextureOffset(0, 49).addBox(-0.8847F, 9.8245F, -3.2503F, 6.0F, 6.0F, 6.0F, 0.25F, true);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-2.1F, 13.5F, 0.0F);
			main.addChild(RightLeg);
			RightLeg.setTextureOffset(46, 25).addBox(-1.65F, -1.0561F, -2.2503F, 4.0F, 15.0F, 4.0F, -0.25F, false);
			RightLeg.setTextureOffset(8, 36).addBox(-2.9F, 12.9439F, -7.1253F, 6.0F, 3.0F, 10.0F, -0.25F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(2.1F, 13.5F, 0.0F);
			main.addChild(LeftLeg);
			LeftLeg.setTextureOffset(46, 25).addBox(-2.1F, -1.0561F, -2.2503F, 4.0F, 15.0F, 4.0F, -0.25F, true);
			LeftLeg.setTextureOffset(8, 36).addBox(-2.6F, 12.9439F, -7.1253F, 6.0F, 3.0F, 10.0F, -0.25F, true);
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
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
