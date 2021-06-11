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

import net.mcreator.sonicraft.entity.PopcornEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PopcornRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PopcornEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelstudiopolis_popcorn(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/studiopolis_popcorn.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelstudiopolis_popcorn extends EntityModel<Entity> {
		private final ModelRenderer bb_main;
		public Modelstudiopolis_popcorn() {
			textureWidth = 64;
			textureHeight = 64;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 0).addBox(-8.0F, -18.0F, -7.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 20).addBox(0.0F, -20.0F, -2.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 20).addBox(1.0F, -12.0F, -6.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 0).addBox(-3.0F, -16.0F, -1.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 20).addBox(-7.0F, -11.0F, -3.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
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
