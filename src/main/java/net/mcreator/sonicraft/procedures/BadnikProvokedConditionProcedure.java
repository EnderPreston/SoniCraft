package net.mcreator.sonicraft.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class BadnikProvokedConditionProcedure extends SonicraftModElements.ModElement {
	public BadnikProvokedConditionProcedure(SonicraftModElements instance) {
		super(instance, 1033);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure BadnikProvokedCondition!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof PlayerEntity) == (false))) {
			return (true);
		}
		return (false);
	}
}
