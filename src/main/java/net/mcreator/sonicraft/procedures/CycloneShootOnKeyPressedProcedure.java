package net.mcreator.sonicraft.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.item.CycloneTurretItem;
import net.mcreator.sonicraft.entity.CycloneEntity;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Random;
import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class CycloneShootOnKeyPressedProcedure extends SonicraftModElements.ModElement {
	public CycloneShootOnKeyPressedProcedure(SonicraftModElements instance) {
		super(instance, 595);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure CycloneShootOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof PlayerEntity)) {
			if (((entity.getRidingEntity()) instanceof CycloneEntity.CustomEntity)) {
				if ((entity.getRidingEntity()) instanceof LivingEntity) {
					Entity _ent = (entity.getRidingEntity());
					if (!_ent.world.isRemote()) {
						CycloneTurretItem.shoot(_ent.world, (LivingEntity) (entity.getRidingEntity()), new Random(), (float) 1.2, (float) 5, (int) 2);
					}
				}
				(entity.getRidingEntity()).getPersistentData().putDouble("cycloneShot", 1);
			}
		}
	}
}
