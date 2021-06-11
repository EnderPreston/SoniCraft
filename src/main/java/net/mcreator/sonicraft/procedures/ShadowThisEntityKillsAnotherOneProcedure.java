package net.mcreator.sonicraft.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.sonicraft.SonicraftModVariables;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class ShadowThisEntityKillsAnotherOneProcedure extends SonicraftModElements.ModElement {
	public ShadowThisEntityKillsAnotherOneProcedure(SonicraftModElements instance) {
		super(instance, 568);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure ShadowThisEntityKillsAnotherOne!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		SonicraftModVariables.MapVariables.get(world).shadow_attack_voice = (double) 0;
		SonicraftModVariables.MapVariables.get(world).syncData(world);
	}
}
