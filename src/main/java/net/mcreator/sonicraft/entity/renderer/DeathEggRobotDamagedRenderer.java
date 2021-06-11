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

import net.mcreator.sonicraft.entity.DeathEggRobotDamagedEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DeathEggRobotDamagedRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DeathEggRobotDamagedEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeldeath_egg_robot_damaged(), 2.8000000000000003f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("sonicraft:textures/death_egg_robot_damaged.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modeldeath_egg_robot_damaged extends EntityModel<Entity> {
		private final ModelRenderer main;
		private final ModelRenderer head;
		public Modeldeath_egg_robot_damaged() {
			textureWidth = 512;
			textureHeight = 512;
			main = new ModelRenderer(this);
			main.setRotationPoint(0.0F, 81.25F, 0.0F);
			main.setTextureOffset(0, 0).addBox(-32.0F, -107.25F, -32.0F, 64.0F, 50.0F, 64.0F, 0.0F, false);
			main.setTextureOffset(0, 266).addBox(-24.0F, -108.25F, 32.0F, 48.0F, 40.0F, 24.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -106.0F, 0.0F);
			main.addChild(head);
			head.setTextureOffset(0, 182).addBox(-30.0F, -25.25F, -30.0F, 60.0F, 24.0F, 60.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -12.25F, -36.0F, 8.0F, 8.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(348, 60).addBox(-36.0F, -19.25F, -32.0F, 72.0F, 16.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-31.0F, -35.25F, -6.0F, 0.0F, 32.0F, 32.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(31.0F, -35.25F, -6.0F, 0.0F, 32.0F, 32.0F, 0.0F, true);
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
