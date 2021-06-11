package net.mcreator.sonicraft.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class MilesElectricInterfaceWhileThisGUIIsOpenTickProcedure extends SonicraftModElements.ModElement {
	public MilesElectricInterfaceWhileThisGUIIsOpenTickProcedure(SonicraftModElements instance) {
		super(instance, 583);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure MilesElectricInterfaceWhileThisGUIIsOpenTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
