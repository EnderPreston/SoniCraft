package net.mcreator.sonicraft.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;
import java.util.Collections;

@SonicraftModElements.ModElement.Tag
public class ChaosEmeraldGreenRightClickedInAirProcedure extends SonicraftModElements.ModElement {
	public ChaosEmeraldGreenRightClickedInAirProcedure(SonicraftModElements instance) {
		super(instance, 400);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure ChaosEmeraldGreenRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				SonicraftMod.LOGGER.warn("Failed to load dependency itemstack for procedure ChaosEmeraldGreenRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate(((entity.getPosX()) + (Math.random() * 5)), (entity.getPosY()), ((entity.getPosZ()) + (Math.random() * 5)));
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation(((entity.getPosX()) + (Math.random() * 5)), (entity.getPosY()),
						((entity.getPosZ()) + (Math.random() * 5)), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 100);
	}
}
