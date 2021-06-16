package net.mcreator.sonicraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.world.Difficulty;

import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class BadnikAttackConditionProcedure extends SonicraftModElements.ModElement {
	public BadnikAttackConditionProcedure(SonicraftModElements instance) {
		super(instance, 1032);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure BadnikAttackCondition!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getDifficulty() == Difficulty.PEACEFUL) == (false))) {
			return (true);
		}
		return (false);
	}
}
