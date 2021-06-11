package net.mcreator.sonicraft.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class DeathEggRobotPlayerOnEntityTickUpdateProcedure extends SonicraftModElements.ModElement {
	public DeathEggRobotPlayerOnEntityTickUpdateProcedure(SonicraftModElements instance) {
		super(instance, 871);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure DeathEggRobotPlayerOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 10, (int) 2, (false), (false)));
		if (((entity.isBeingRidden()) == (true))) {
			if ((entity.isOnGround())) {
				if (((entity.getPersistentData().getDouble("verticalMovement")) == 1)) {
					entity.setMotion((entity.getMotion().getX()), ((entity.getMotion().getY()) + 0.8), (entity.getMotion().getZ()));
				}
			}
		}
	}
}
