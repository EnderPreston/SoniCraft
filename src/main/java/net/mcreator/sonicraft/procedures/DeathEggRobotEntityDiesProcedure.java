package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.entity.DeathEggRobotDamagedEntity;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class DeathEggRobotEntityDiesProcedure extends SonicraftModElements.ModElement {
	public DeathEggRobotEntityDiesProcedure(SonicraftModElements instance) {
		super(instance, 815);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure DeathEggRobotEntityDies!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure DeathEggRobotEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure DeathEggRobotEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure DeathEggRobotEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure DeathEggRobotEntityDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, x, y, z, (int) 5, 3, 3, 3, 0);
		}
		if (((entity.getHorizontalFacing()) == Direction.NORTH)) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new DeathEggRobotDamagedEntity.CustomEntity(DeathEggRobotDamagedEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, (y + 1), z, (float) 0, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		} else if (((entity.getHorizontalFacing()) == Direction.SOUTH)) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new DeathEggRobotDamagedEntity.CustomEntity(DeathEggRobotDamagedEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, (y + 1), z, (float) 180, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 180);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		} else if (((entity.getHorizontalFacing()) == Direction.EAST)) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new DeathEggRobotDamagedEntity.CustomEntity(DeathEggRobotDamagedEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, (y + 1), z, (float) 90, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 90);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		} else if (((entity.getHorizontalFacing()) == Direction.WEST)) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new DeathEggRobotDamagedEntity.CustomEntity(DeathEggRobotDamagedEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, (y + 1), z, (float) (-90), (float) 0);
				entityToSpawn.setRenderYawOffset((float) (-90));
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		}
		if (!entity.world.isRemote())
			entity.remove();
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.deatheggrobot.defeat")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.deatheggrobot.defeat")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
	}
}
