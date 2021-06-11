package net.mcreator.sonicraft.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.potion.SuperFormPotion;
import net.mcreator.sonicraft.particle.SuperStarsParticle;
import net.mcreator.sonicraft.block.GoldRingBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class SuperFormOnPotionActiveTickProcedure extends SonicraftModElements.ModElement {
	public SuperFormOnPotionActiveTickProcedure(SonicraftModElements instance) {
		super(instance, 415);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure SuperFormOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure SuperFormOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure SuperFormOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure SuperFormOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure SuperFormOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1));
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(SuperStarsParticle.particle, x, (y + 1), z, (int) 2, 0.3, 0.5, 0.3, 0);
		}
		entity.fallDistance = (float) (0);
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 5, (int) 10, (true), (false)));
		if ((entity instanceof PlayerEntity)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 5, (int) 20, (true), (false)));
			entity.getPersistentData().putDouble("ringtimer", ((entity.getPersistentData().getDouble("ringtimer")) + 1));
			if (((entity.getPersistentData().getDouble("ringtimer")) == 20)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(GoldRingBlock.block, (int) (1));
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				entity.getPersistentData().putDouble("ringtimer", 0);
			}
			if ((((entity instanceof PlayerEntity)
					? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(GoldRingBlock.block, (int) (1)))
					: false) == (false))) {
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(SuperFormPotion.potion);
				}
			}
		}
	}
}
