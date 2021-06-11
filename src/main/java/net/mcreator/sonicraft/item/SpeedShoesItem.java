
package net.mcreator.sonicraft.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.procedures.SpeedShoesBootsTickEventProcedure;
import net.mcreator.sonicraft.itemgroup.SonicraftMiscItemGroup;
import net.mcreator.sonicraft.block.GoldRingBlock;
import net.mcreator.sonicraft.SonicraftModElements;

import java.util.Map;
import java.util.HashMap;

@SonicraftModElements.ModElement.Tag
public class SpeedShoesItem extends SonicraftModElements.ModElement {
	@ObjectHolder("sonicraft:speed_shoes_helmet")
	public static final Item helmet = null;
	@ObjectHolder("sonicraft:speed_shoes_chestplate")
	public static final Item body = null;
	@ObjectHolder("sonicraft:speed_shoes_leggings")
	public static final Item legs = null;
	@ObjectHolder("sonicraft:speed_shoes_boots")
	public static final Item boots = null;
	public SpeedShoesItem(SonicraftModElements instance) {
		super(instance, 124);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 10;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{4, 0, 0, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 26;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(GoldRingBlock.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "speed_shoes";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 2f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(SonicraftMiscItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "sonicraft:textures/models/armor/sonic_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					SpeedShoesBootsTickEventProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("speed_shoes_boots"));
	}
}
