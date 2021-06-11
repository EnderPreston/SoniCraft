package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.potion.SuperFormPotion;
import net.mcreator.sonicraft.block.GoldRingBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;
import java.util.Collection;

@SonicraftModElements.ModElement.Tag
public class SuperFormEmeraldsRightClickedInAirProcedure extends SonicraftModElements.ModElement {
	public SuperFormEmeraldsRightClickedInAirProcedure(SonicraftModElements instance) {
		super(instance, 417);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure SuperFormEmeraldsRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure SuperFormEmeraldsRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure SuperFormEmeraldsRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure SuperFormEmeraldsRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure SuperFormEmeraldsRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == SuperFormPotion.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(SuperFormPotion.potion);
			}
		} else {
			if (((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(GoldRingBlock.block, (int) (1)))
					: false)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(SuperFormPotion.potion, (int) 99999999, (int) 0, (false), (false)));
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:super.transform")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:super.transform")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
			}
		}
	}
}
