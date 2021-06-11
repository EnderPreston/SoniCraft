package net.mcreator.sonicraft.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class BlastProcessingPrimedOnEntityTickUpdateProcedure extends SonicraftModElements.ModElement {
	public BlastProcessingPrimedOnEntityTickUpdateProcedure(SonicraftModElements instance) {
		super(instance, 844);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure BlastProcessingPrimedOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotion(0, 0.01, 0);
	}
}
