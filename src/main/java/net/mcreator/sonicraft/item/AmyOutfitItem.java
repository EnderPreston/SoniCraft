
package net.mcreator.sonicraft.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.sonicraft.itemgroup.SonicraftMiscItemGroup;
import net.mcreator.sonicraft.SonicraftModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@SonicraftModElements.ModElement.Tag
public class AmyOutfitItem extends SonicraftModElements.ModElement {
	@ObjectHolder("sonicraft:amy_outfit_helmet")
	public static final Item helmet = null;
	@ObjectHolder("sonicraft:amy_outfit_chestplate")
	public static final Item body = null;
	@ObjectHolder("sonicraft:amy_outfit_leggings")
	public static final Item legs = null;
	@ObjectHolder("sonicraft:amy_outfit_boots")
	public static final Item boots = null;
	public AmyOutfitItem(SonicraftModElements instance) {
		super(instance, 148);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 8;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{1, 3, 4, 1}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.LEATHER, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "amy_outfit";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(SonicraftMiscItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new Modelfox_ear_headband().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "sonicraft:textures/amy_headband.png";
			}
		}.setRegistryName("amy_outfit_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(SonicraftMiscItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new Modelamy_dress().Body;
				armorModel.bipedLeftArm = new Modelamy_dress().LeftArm;
				armorModel.bipedRightArm = new Modelamy_dress().RightArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "sonicraft:textures/amy_layer_3.png";
			}
		}.setRegistryName("amy_outfit_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(SonicraftMiscItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new Modelcustom_boots().LeftLeg;
				armorModel.bipedRightLeg = new Modelcustom_boots().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "sonicraft:textures/amy_boots.png";
			}
		}.setRegistryName("amy_outfit_boots"));
	}
	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_boots extends EntityModel<Entity> {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public Modelcustom_boots() {
			textureWidth = 64;
			textureHeight = 64;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.55F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.55F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelfox_ear_headband extends EntityModel<Entity> {
		private final ModelRenderer Head;
		public Modelfox_ear_headband() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 48).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.4F, false);
			Head.setTextureOffset(32, 60).addBox(-4.5F, -11.4F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(32, 60).addBox(1.5F, -11.4F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelamy_dress extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		public Modelamy_dress() {
			textureWidth = 64;
			textureHeight = 64;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 47).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, 0.45F, false);
			Body.setTextureOffset(12, 50).addBox(-6.0F, 11.0F, -6.0F, 12.0F, 2.0F, 12.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(49, 49).addBox(0.0F, -2.0F, -2.0F, 1.0F, 12.0F, 1.0F, 0.5F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(54, 49).addBox(2.0F, -2.0F, -2.0F, 1.0F, 12.0F, 1.0F, 0.5F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
