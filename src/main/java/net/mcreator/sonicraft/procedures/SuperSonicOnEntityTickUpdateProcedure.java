package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.potion.SuperFormPotion;
import net.mcreator.sonicraft.item.SuperFormEmeraldsItem;
import net.mcreator.sonicraft.entity.SuperSonicBallFormEntity;
import net.mcreator.sonicraft.entity.SonicEntity;
import net.mcreator.sonicraft.entity.MotobugEntity;
import net.mcreator.sonicraft.entity.MetalSonicEntity;
import net.mcreator.sonicraft.entity.EggmanBossEntity;
import net.mcreator.sonicraft.entity.CrabmeatEntity;
import net.mcreator.sonicraft.entity.BuzzBomberEntity;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

@SonicraftModElements.ModElement.Tag
public class SuperSonicOnEntityTickUpdateProcedure extends SonicraftModElements.ModElement {
	public SuperSonicOnEntityTickUpdateProcedure(SonicraftModElements instance) {
		super(instance, 631);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure SuperSonicOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure SuperSonicOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure SuperSonicOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure SuperSonicOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure SuperSonicOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(SuperFormPotion.potion, (int) 2, (int) 0, (false), (false)));
		entity.getPersistentData().putDouble("superFormTimer", ((entity.getPersistentData().getDouble("superFormTimer")) + 1));
		if (((entity.getMotion().getY()) > 0)) {
			entity.getPersistentData().putDouble("sonicJumpSound", ((entity.getPersistentData().getDouble("sonicJumpSound")) + 1));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 2, (int) 0, (false), (false)));
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new SuperSonicBallFormEntity.CustomEntity(SuperSonicBallFormEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()), (float) (entity.rotationYaw),
						(float) 0);
				entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (((entity.getPersistentData().getDouble("sonicJumpSound")) == 1)) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.sonicjump")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.sonicjump")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
			}
		} else {
			entity.getPersistentData().putDouble("sonicJumpSound", 0);
		}
		if (((((((Entity) world
				.getEntitiesWithinAABB(MotobugEntity.CustomEntity.class,
						new AxisAlignedBB(x - (2 / 2d), y - (2 / 2d), z - (2 / 2d), x + (2 / 2d), y + (2 / 2d), z + (2 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) || (((Entity) world
						.getEntitiesWithinAABB(EggmanBossEntity.CustomEntity.class,
								new AxisAlignedBB(x - (2 / 2d), y - (2 / 2d), z - (2 / 2d), x + (2 / 2d), y + (2 / 2d), z + (2 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null))
				|| ((((Entity) world
						.getEntitiesWithinAABB(MetalSonicEntity.CustomEntity.class,
								new AxisAlignedBB(x - (2 / 2d), y - (2 / 2d), z - (2 / 2d), x + (2 / 2d), y + (2 / 2d), z + (2 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) || (((Entity) world
								.getEntitiesWithinAABB(EndermanEntity.class,
										new AxisAlignedBB(x - (2 / 2d), y - (2 / 2d), z - (2 / 2d), x + (2 / 2d), y + (2 / 2d), z + (2 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)))
				|| (((((Entity) world
						.getEntitiesWithinAABB(ZombieEntity.class,
								new AxisAlignedBB(x - (2 / 2d), y - (2 / 2d), z - (2 / 2d), x + (2 / 2d), y + (2 / 2d), z + (2 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) || (((Entity) world
								.getEntitiesWithinAABB(SkeletonEntity.class,
										new AxisAlignedBB(x - (2 / 2d), y - (2 / 2d), z - (2 / 2d), x + (2 / 2d), y + (2 / 2d), z + (2 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null))
						|| ((((Entity) world
								.getEntitiesWithinAABB(BuzzBomberEntity.CustomEntity.class,
										new AxisAlignedBB(x - (2 / 2d), y - (2 / 2d), z - (2 / 2d), x + (2 / 2d), y + (2 / 2d), z + (2 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)
								|| (((Entity) world.getEntitiesWithinAABB(CrabmeatEntity.CustomEntity.class,
										new AxisAlignedBB(x - (2 / 2d), y - (2 / 2d), z - (2 / 2d), x + (2 / 2d), y + (2 / 2d), z + (2 / 2d)), null)
										.stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null))))) {
			entity.getPersistentData().putDouble("sonicDashSound", ((entity.getPersistentData().getDouble("sonicDashSound")) + 1));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 2, (int) 0, (false), (false)));
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new SuperSonicBallFormEntity.CustomEntity(SuperSonicBallFormEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()), (float) (entity.rotationYaw),
						(float) 0);
				entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (((entity.getPersistentData().getDouble("sonicDashSound")) == 1)) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.sonicroll")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.sonicroll")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
			}
		} else {
			entity.getPersistentData().putDouble("sonicDashSound", 0);
		}
		if ((entity.isAlive())) {
			if (((entity.getPersistentData().getDouble("superFormTimer")) == 2400)) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new SonicEntity.CustomEntity(SonicEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()), (float) (entity.rotationYaw),
							(float) 0);
					entityToSpawn.setRenderYawOffset((float) (entity.rotationYaw));
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, (entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
							new ItemStack(SuperFormEmeraldsItem.block, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
