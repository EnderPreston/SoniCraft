package net.mcreator.sonicraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.particle.MetalSonicOverdriveParticle;
import net.mcreator.sonicraft.particle.MetalSonicFlameParticle;
import net.mcreator.sonicraft.particle.MetalSonicElectricityParticle;
import net.mcreator.sonicraft.entity.SonicEntity;
import net.mcreator.sonicraft.entity.ShadowEntity;
import net.mcreator.sonicraft.entity.KnucklesEntity;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class MetalSonicOnEntityTickUpdateProcedure extends SonicraftModElements.ModElement {
	public MetalSonicOnEntityTickUpdateProcedure(SonicraftModElements instance) {
		super(instance, 575);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure MetalSonicOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure MetalSonicOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure MetalSonicOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure MetalSonicOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure MetalSonicOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity.getMotion().getX()) != 0) || ((entity.getMotion().getZ()) != 0))) {
			world.addParticle(MetalSonicFlameParticle.particle, x, (y + 0.8), z, 0, 0, 0);
		}
		if ((((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof KnucklesEntity.CustomEntity)
				|| (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof ShadowEntity.CustomEntity))
				|| ((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof PlayerEntity)
						|| (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof SonicEntity.CustomEntity)))) {
			entity.getPersistentData().putDouble("metalAttackPattern", ((entity.getPersistentData().getDouble("metalAttackPattern")) + 1));
			entity.getPersistentData().putDouble("metalAttackPattern2", ((entity.getPersistentData().getDouble("metalAttackPattern2")) + 1));
			if ((((entity.getPersistentData().getDouble("metalAttackPattern")) >= 60)
					&& ((entity.getPersistentData().getDouble("metalAttackPattern")) <= 120))) {
				world.addParticle(MetalSonicOverdriveParticle.particle, (entity.getPosX()), ((entity.getPosY()) + 0.8), (entity.getPosZ()), 0, 0, 0);
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 2, (int) 1, (false), (false)));
			}
			if ((((entity.getPersistentData().getDouble("metalAttackPattern2")) >= 180)
					&& ((entity.getPersistentData().getDouble("metalAttackPattern2")) <= 240))) {
				world.addParticle(MetalSonicElectricityParticle.particle, (entity.getPosX()), ((entity.getPosY()) + 0.8), (entity.getPosZ()), 0, 0,
						0);
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 2, (int) 8, (false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 2, (int) 2, (false), (false)));
			}
			if ((((entity.getPersistentData().getDouble("metalAttackPattern")) == 241)
					&& ((entity.getPersistentData().getDouble("metalAttackPattern2")) == 241))) {
				entity.getPersistentData().putDouble("metalAttackPattern", 0);
				entity.getPersistentData().putDouble("metalAttackPattern2", 0);
			}
		}
	}
}
