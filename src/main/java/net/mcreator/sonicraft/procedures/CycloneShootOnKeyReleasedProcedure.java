package net.mcreator.sonicraft.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.entity.CycloneEntity;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class CycloneShootOnKeyReleasedProcedure extends SonicraftModElements.ModElement {
	public CycloneShootOnKeyReleasedProcedure(SonicraftModElements instance) {
		super(instance, 998);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure CycloneShootOnKeyReleased!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof PlayerEntity)) {
			if (((entity.getRidingEntity()) instanceof CycloneEntity.CustomEntity)) {
				(entity.getRidingEntity()).getPersistentData().putDouble("cycloneShot", 0);
			}
		}
	}
}
