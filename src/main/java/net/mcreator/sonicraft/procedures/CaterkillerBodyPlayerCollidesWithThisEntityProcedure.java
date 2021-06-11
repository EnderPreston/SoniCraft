package net.mcreator.sonicraft.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class CaterkillerBodyPlayerCollidesWithThisEntityProcedure extends SonicraftModElements.ModElement {
	public CaterkillerBodyPlayerCollidesWithThisEntityProcedure(SonicraftModElements instance) {
		super(instance, 490);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency sourceentity for procedure CaterkillerBodyPlayerCollidesWithThisEntity!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		sourceentity.attackEntityFrom(DamageSource.CACTUS, (float) 2);
	}
}
