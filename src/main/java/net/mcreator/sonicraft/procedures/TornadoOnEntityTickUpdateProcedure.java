package net.mcreator.sonicraft.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class TornadoOnEntityTickUpdateProcedure extends SonicraftModElements.ModElement {
	public TornadoOnEntityTickUpdateProcedure(SonicraftModElements instance) {
		super(instance, 628);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure TornadoOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.isBeingRidden()) == (true))) {
			if (((entity.getPersistentData().getDouble("verticalMovement")) == 1)) {
				entity.setMotion((entity.getMotion().getX()), ((entity.getMotion().getY()) + 0.2), (entity.getMotion().getZ()));
			} else {
				entity.setMotion((entity.getMotion().getX()), (-0.2), (entity.getMotion().getZ()));
			}
		}
	}
}
