package net.mcreator.sonicraft.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class CycloneTurretWhileBulletFlyingTickProcedure extends SonicraftModElements.ModElement {
	public CycloneTurretWhileBulletFlyingTickProcedure(SonicraftModElements instance) {
		super(instance, 597);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure CycloneTurretWhileBulletFlyingTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotion((entity.getMotion().getX()), 0, (entity.getMotion().getZ()));
	}
}
