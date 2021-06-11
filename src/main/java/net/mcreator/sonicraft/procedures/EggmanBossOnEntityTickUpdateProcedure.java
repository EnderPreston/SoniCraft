package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.entity.SonicEntity;
import net.mcreator.sonicraft.entity.ShadowEntity;
import net.mcreator.sonicraft.entity.KnucklesEntity;
import net.mcreator.sonicraft.entity.EggmanBombEntity;
import net.mcreator.sonicraft.entity.AmyRoseEntity;
import net.mcreator.sonicraft.block.ScrapBrainIronSlabBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class EggmanBossOnEntityTickUpdateProcedure extends SonicraftModElements.ModElement {
	public EggmanBossOnEntityTickUpdateProcedure(SonicraftModElements instance) {
		super(instance, 428);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure EggmanBossOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure EggmanBossOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure EggmanBossOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure EggmanBossOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure EggmanBossOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) <= 50)) {
			entity.getPersistentData().putDouble("pinchmessage", ((entity.getPersistentData().getDouble("pinchmessage")) + 5));
			if (((entity.getPersistentData().getDouble("pinchmessage")) == 5)) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.eggmanpinch")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.eggmanpinch")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				entity.getPersistentData().putDouble("pinchmessage", ((entity.getPersistentData().getDouble("pinchmessage")) + 5));
			}
		}
		if ((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof PlayerEntity)) {
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) > 50)) {
				entity.getPersistentData().putDouble("bombtimer", ((entity.getPersistentData().getDouble("bombtimer")) + 1));
				if (((entity.getPersistentData().getDouble("bombtimer")) == 120)) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new EggmanBombEntity.CustomEntity(EggmanBombEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					entity.getPersistentData().putDouble("bombtimer", 0);
				}
			} else {
				entity.getPersistentData().putDouble("bombtimer", ((entity.getPersistentData().getDouble("bombtimer")) + 1));
				if (((entity.getPersistentData().getDouble("bombtimer")) == 60)) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new EggmanBombEntity.CustomEntity(EggmanBombEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					entity.getPersistentData().putDouble("bombtimer", 0);
				}
			}
		} else if ((((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof SonicEntity.CustomEntity)
				|| (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof ShadowEntity.CustomEntity))
				|| ((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof KnucklesEntity.CustomEntity)
						|| (((entity instanceof MobEntity)
								? ((MobEntity) entity).getAttackTarget()
								: null) instanceof AmyRoseEntity.CustomEntity)))) {
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) > 50)) {
				entity.getPersistentData().putDouble("bombtimer", ((entity.getPersistentData().getDouble("bombtimer")) + 1));
				if (((entity.getPersistentData().getDouble("bombtimer")) == 120)) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new EggmanBombEntity.CustomEntity(EggmanBombEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					entity.getPersistentData().putDouble("bombtimer", 0);
				}
			} else {
				entity.getPersistentData().putDouble("bombtimer", ((entity.getPersistentData().getDouble("bombtimer")) + 1));
				if (((entity.getPersistentData().getDouble("bombtimer")) == 60)) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new EggmanBombEntity.CustomEntity(EggmanBombEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
					entity.getPersistentData().putDouble("bombtimer", 0);
				}
			}
		} else {
			entity.getPersistentData().putDouble("bombtimer", 0);
		}
		if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == ScrapBrainIronSlabBlock.block.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == ScrapBrainIronSlabBlock.block.getDefaultState()
						.getBlock()))) {
			entity.setMotion((entity.getMotion().getX()), (-0.2), (entity.getMotion().getZ()));
		}
	}
}
