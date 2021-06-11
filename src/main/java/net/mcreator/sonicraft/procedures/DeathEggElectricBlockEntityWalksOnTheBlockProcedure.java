package net.mcreator.sonicraft.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class DeathEggElectricBlockEntityWalksOnTheBlockProcedure extends SonicraftModElements.ModElement {
	public DeathEggElectricBlockEntityWalksOnTheBlockProcedure(SonicraftModElements instance) {
		super(instance, 819);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure DeathEggElectricBlockEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.LIGHTNING_BOLT, (float) 2);
	}
}
