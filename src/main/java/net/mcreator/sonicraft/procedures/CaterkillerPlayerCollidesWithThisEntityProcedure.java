package net.mcreator.sonicraft.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.entity.CaterkillerHeadEntity;
import net.mcreator.sonicraft.entity.CaterkillerBodyEntity;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class CaterkillerPlayerCollidesWithThisEntityProcedure extends SonicraftModElements.ModElement {
	public CaterkillerPlayerCollidesWithThisEntityProcedure(SonicraftModElements instance) {
		super(instance, 489);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure CaterkillerPlayerCollidesWithThisEntity!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure CaterkillerPlayerCollidesWithThisEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure CaterkillerPlayerCollidesWithThisEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure CaterkillerPlayerCollidesWithThisEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure CaterkillerPlayerCollidesWithThisEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (!entity.world.isRemote())
			entity.remove();
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new CaterkillerHeadEntity.CustomEntity(CaterkillerHeadEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, y, (z + 0.5), (float) (entity.rotationYaw), (float) 0);
			entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
			entityToSpawn.setMotion(((entity.getMotion().getX()) + 0.4), ((entity.getMotion().getY()) + 0.4), ((entity.getMotion().getZ()) + 0.4));
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new CaterkillerBodyEntity.CustomEntity(CaterkillerBodyEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, y, z, (float) (entity.rotationYaw), (float) 0);
			entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
			entityToSpawn.setMotion(((entity.getMotion().getX()) - 0.4), ((entity.getMotion().getY()) + 0.4), ((entity.getMotion().getZ()) + 0.4));
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new CaterkillerBodyEntity.CustomEntity(CaterkillerBodyEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, y, (z - 0.5), (float) (entity.rotationYaw), (float) 0);
			entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
			entityToSpawn.setMotion(((entity.getMotion().getX()) + 0.4), ((entity.getMotion().getY()) + 0.4), ((entity.getMotion().getZ()) - 0.4));
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new CaterkillerBodyEntity.CustomEntity(CaterkillerBodyEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, y, (z - 1), (float) (entity.rotationYaw), (float) 0);
			entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
			entityToSpawn.setMotion(((entity.getMotion().getX()) - 0.4), ((entity.getMotion().getY()) + 0.4), ((entity.getMotion().getZ()) - 0.4));
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
	}
}
