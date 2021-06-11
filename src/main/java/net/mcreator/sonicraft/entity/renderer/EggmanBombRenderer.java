package net.mcreator.sonicraft.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

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

import net.mcreator.sonicraft.entity.EggmanBombEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class EggmanBombRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(EggmanBombEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeleggman_bomb(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/eggman_bomb.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("sonicraft:textures/eggman_bomb_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modeleggman_bomb extends EntityModel<Entity> {
		private final ModelRenderer main;
		private final ModelRenderer spikes;
		private final ModelRenderer cornerspikes;
		private final ModelRenderer bone;
		private final ModelRenderer spikes2;
		private final ModelRenderer spikes3;
		private final ModelRenderer bone2;
		private final ModelRenderer spikes4;
		private final ModelRenderer spikes5;
		private final ModelRenderer bone3;
		private final ModelRenderer spikes6;
		private final ModelRenderer spikes7;
		private final ModelRenderer bone4;
		private final ModelRenderer spikes8;
		private final ModelRenderer spikes9;
		public Modeleggman_bomb() {
			textureWidth = 32;
			textureHeight = 16;
			main = new ModelRenderer(this);
			main.setRotationPoint(1.0F, 20.0F, 4.0F);
			main.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			spikes = new ModelRenderer(this);
			spikes.setRotationPoint(3.0F, 3.0F, -8.0F);
			main.addChild(spikes);
			spikes.setTextureOffset(0, 0).addBox(-5.0F, -10.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			spikes.setTextureOffset(0, 0).addBox(-5.0F, 0.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			spikes.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			spikes.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, 8.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			spikes.setTextureOffset(0, 0).addBox(0.0F, -5.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			spikes.setTextureOffset(0, 0).addBox(-10.0F, -5.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			cornerspikes = new ModelRenderer(this);
			cornerspikes.setRotationPoint(0.0F, 0.0F, 0.0F);
			main.addChild(cornerspikes);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(2.0F, -1.0F, -7.0F);
			cornerspikes.addChild(bone);
			setRotationAngle(bone, 0.0F, -0.7854F, 0.0F);
			spikes2 = new ModelRenderer(this);
			spikes2.setRotationPoint(0.0F, -3.5F, -0.5F);
			bone.addChild(spikes2);
			setRotationAngle(spikes2, 0.7854F, 0.0F, 0.0F);
			spikes2.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			spikes3 = new ModelRenderer(this);
			spikes3.setRotationPoint(0.0F, 3.5F, -0.5F);
			bone.addChild(spikes3);
			setRotationAngle(spikes3, -0.7854F, 0.0F, 0.0F);
			spikes3.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-4.0F, -1.0F, -7.0F);
			cornerspikes.addChild(bone2);
			setRotationAngle(bone2, 0.0F, 0.7854F, 0.0F);
			spikes4 = new ModelRenderer(this);
			spikes4.setRotationPoint(0.0F, -3.5F, -0.5F);
			bone2.addChild(spikes4);
			setRotationAngle(spikes4, 0.7854F, 0.0F, 0.0F);
			spikes4.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);
			spikes5 = new ModelRenderer(this);
			spikes5.setRotationPoint(0.0F, 3.5F, -0.5F);
			bone2.addChild(spikes5);
			setRotationAngle(spikes5, -0.7854F, 0.0F, 0.0F);
			spikes5.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-4.0F, -1.0F, -1.0F);
			cornerspikes.addChild(bone3);
			setRotationAngle(bone3, 0.0F, -0.7854F, 0.0F);
			spikes6 = new ModelRenderer(this);
			spikes6.setRotationPoint(0.0F, -3.5F, 0.5F);
			bone3.addChild(spikes6);
			setRotationAngle(spikes6, -0.7854F, 0.0F, 0.0F);
			spikes6.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);
			spikes7 = new ModelRenderer(this);
			spikes7.setRotationPoint(0.0F, 3.5F, 0.5F);
			bone3.addChild(spikes7);
			setRotationAngle(spikes7, 0.7854F, 0.0F, 0.0F);
			spikes7.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(2.0F, -1.0F, -1.0F);
			cornerspikes.addChild(bone4);
			setRotationAngle(bone4, 0.0F, 0.7854F, 0.0F);
			spikes8 = new ModelRenderer(this);
			spikes8.setRotationPoint(0.0F, -3.5F, 0.5F);
			bone4.addChild(spikes8);
			setRotationAngle(spikes8, -0.7854F, 0.0F, 0.0F);
			spikes8.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			spikes9 = new ModelRenderer(this);
			spikes9.setRotationPoint(0.0F, 3.5F, 0.5F);
			bone4.addChild(spikes9);
			setRotationAngle(spikes9, 0.7854F, 0.0F, 0.0F);
			spikes9.setTextureOffset(24, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
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
		}
	}
}
