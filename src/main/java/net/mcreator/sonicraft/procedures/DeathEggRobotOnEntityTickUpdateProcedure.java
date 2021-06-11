package net.mcreator.sonicraft.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.particle.MetalSonicFlameParticle;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class DeathEggRobotOnEntityTickUpdateProcedure extends SonicraftModElements.ModElement {
	public DeathEggRobotOnEntityTickUpdateProcedure(SonicraftModElements instance) {
		super(instance, 813);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure DeathEggRobotOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure DeathEggRobotOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure DeathEggRobotOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure DeathEggRobotOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure DeathEggRobotOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity.getMotion().getY()) > 0)) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(MetalSonicFlameParticle.particle, x, y, z, (int) 3, 0.2, 0.2, 0.2, 0);
			}
			if (((world.isAirBlock(new BlockPos((int) x, (int) (y - 1), (int) z)))
					&& (((world.isAirBlock(new BlockPos((int) x, (int) (y - 2), (int) z)))
							&& (world.isAirBlock(new BlockPos((int) x, (int) (y - 3), (int) z))))
							&& ((world.isAirBlock(new BlockPos((int) x, (int) (y - 4), (int) z)))
									&& (world.isAirBlock(new BlockPos((int) x, (int) (y - 5), (int) z))))))) {
				entity.setMotion((entity.getMotion().getX()), (-1), (entity.getMotion().getZ()));
			}
		} else if (((entity.getMotion().getY()) < 0)) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(MetalSonicFlameParticle.particle, x, y, z, (int) 3, 0.2, 0.2, 0.2, 0);
			}
			entity.setMotion((entity.getMotion().getX()), (-0.4), (entity.getMotion().getZ()));
		}
	}
}
