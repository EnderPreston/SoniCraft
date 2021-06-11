package net.mcreator.sonicraft.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class CycloneTurretRangedItemUsedProcedure extends SonicraftModElements.ModElement {
	public CycloneTurretRangedItemUsedProcedure(SonicraftModElements instance) {
		super(instance, 598);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				SonicraftMod.LOGGER.warn("Failed to load dependency itemstack for procedure CycloneTurretRangedItemUsed!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).setDamage((int) 0);
	}
}
