package net.mcreator.sonicraft.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.entity.TornadoEntity;
import net.mcreator.sonicraft.entity.TailsFlyingEntity;
import net.mcreator.sonicraft.entity.DeathEggRobotPlayerEntity;
import net.mcreator.sonicraft.entity.CycloneEntity;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class FlightControlUpOnKeyReleasedProcedure extends SonicraftModElements.ModElement {
	public FlightControlUpOnKeyReleasedProcedure(SonicraftModElements instance) {
		super(instance, 997);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure FlightControlUpOnKeyReleased!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity.getRidingEntity()) instanceof TailsFlyingEntity.CustomEntity)
				|| ((entity.getRidingEntity()) instanceof CycloneEntity.CustomEntity))
				|| (((entity.getRidingEntity()) instanceof TornadoEntity.CustomEntity)
						|| ((entity.getRidingEntity()) instanceof DeathEggRobotPlayerEntity.CustomEntity)))) {
			(entity.getRidingEntity()).getPersistentData().putDouble("verticalMovement", 0);
		}
	}
}
