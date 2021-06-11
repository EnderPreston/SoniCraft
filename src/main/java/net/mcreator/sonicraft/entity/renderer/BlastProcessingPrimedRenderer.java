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

import net.mcreator.sonicraft.entity.BlastProcessingPrimedEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BlastProcessingPrimedRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BlastProcessingPrimedEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelblast_processing_primed(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/blast_processing_primed.png");
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
			IVertexBuilder ivertexbuilder = bufferIn
					.getBuffer(RenderType.getEyes(new ResourceLocation("sonicraft:textures/blast_processing_primed.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelblast_processing_primed extends EntityModel<Entity> {
		private final ModelRenderer main;
		private final ModelRenderer spin_xy;
		private final ModelRenderer spin_xy2;
		private final ModelRenderer spin_yz;
		private final ModelRenderer spin_yz2;
		private final ModelRenderer spin_zx;
		private final ModelRenderer spin_zx2;
		public Modelblast_processing_primed() {
			textureWidth = 64;
			textureHeight = 64;
			main = new ModelRenderer(this);
			main.setRotationPoint(0.0F, 16.0F, 0.0F);
			main.setTextureOffset(0, 0).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
			spin_xy = new ModelRenderer(this);
			spin_xy.setRotationPoint(0.0F, 0.0F, 0.0F);
			main.addChild(spin_xy);
			spin_xy2 = new ModelRenderer(this);
			spin_xy2.setRotationPoint(0.0F, 0.0F, 0.0F);
			spin_xy.addChild(spin_xy2);
			spin_xy2.setTextureOffset(0, 32).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, 2.0F, false);
			spin_yz = new ModelRenderer(this);
			spin_yz.setRotationPoint(0.0F, 0.0F, 0.0F);
			main.addChild(spin_yz);
			spin_yz2 = new ModelRenderer(this);
			spin_yz2.setRotationPoint(0.0F, 0.0F, 0.0F);
			spin_yz.addChild(spin_yz2);
			spin_yz2.setTextureOffset(0, 32).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, 2.0F, false);
			spin_zx = new ModelRenderer(this);
			spin_zx.setRotationPoint(0.0F, 0.0F, 0.0F);
			main.addChild(spin_zx);
			spin_zx2 = new ModelRenderer(this);
			spin_zx2.setRotationPoint(0.0F, 0.0F, 0.0F);
			spin_zx.addChild(spin_zx2);
			spin_zx2.setTextureOffset(0, 32).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, 2.0F, false);
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
			this.spin_xy.rotateAngleX = f2;
			this.spin_yz.rotateAngleY = f2;
			this.main.rotateAngleY = f2 / 20.f;
			this.spin_xy2.rotateAngleY = f2;
			this.spin_yz2.rotateAngleZ = f2;
			this.spin_zx.rotateAngleZ = f2;
			this.spin_zx2.rotateAngleX = f2;
		}
	}
}
