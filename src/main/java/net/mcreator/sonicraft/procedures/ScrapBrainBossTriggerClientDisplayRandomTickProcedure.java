package net.mcreator.sonicraft.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.particle.InvincibilityStarsParticle;
import net.mcreator.sonicraft.block.ScrapBrainBossTriggerBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class ScrapBrainBossTriggerClientDisplayRandomTickProcedure extends SonicraftModElements.ModElement {
	public ScrapBrainBossTriggerClientDisplayRandomTickProcedure(SonicraftModElements instance) {
		super(instance, 744);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure ScrapBrainBossTriggerClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure ScrapBrainBossTriggerClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure ScrapBrainBossTriggerClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure ScrapBrainBossTriggerClientDisplayRandomTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure ScrapBrainBossTriggerClientDisplayRandomTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ScrapBrainBossTriggerBlock.block, (int) (1)).getItem())) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(InvincibilityStarsParticle.particle, x, y, z, (int) 4, 0.5, 0.5, 0.5, 0);
			}
		}
	}
}
