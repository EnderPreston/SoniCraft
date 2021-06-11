package net.mcreator.sonicraft.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.potion.FalseRealityPotion;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class InfiniteBlasterControllerBulletHitsPlayerProcedure extends SonicraftModElements.ModElement {
	public InfiniteBlasterControllerBulletHitsPlayerProcedure(SonicraftModElements instance) {
		super(instance, 681);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure InfiniteBlasterControllerBulletHitsPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(FalseRealityPotion.potion, (int) 60, (int) 0, (false), (false)));
	}
}
