package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.entity.TailsEntity;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class TailsFlyingOnEntityTickUpdateProcedure extends SonicraftModElements.ModElement {
	public TailsFlyingOnEntityTickUpdateProcedure(SonicraftModElements instance) {
		super(instance, 493);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure TailsFlyingOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure TailsFlyingOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure TailsFlyingOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure TailsFlyingOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure TailsFlyingOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((world.getBlockState(new BlockPos((int) (entity.getPosX()), (int) ((entity.getPosY()) - 0.5), (int) (entity.getPosZ()))).isSolid())) {
			if (!entity.world.isRemote())
				entity.remove();
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new TailsEntity.CustomEntity(TailsEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()), world.getRandom().nextFloat() * 360F,
						0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		}
		entity.getPersistentData().putDouble("flySoundTimer", ((entity.getPersistentData().getDouble("flySoundTimer")) + 1));
		entity.getPersistentData().putDouble("flightDescend", ((entity.getPersistentData().getDouble("flightDescend")) + 1));
		if (((entity.getPersistentData().getDouble("flySoundTimer")) == 3)) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.tailsfly")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.tailsfly")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
			entity.getPersistentData().putDouble("flySoundTimer", 0);
		}
		if (((entity.isBeingRidden()) == (true))) {
			if (((entity.getPersistentData().getDouble("verticalMovement")) == 1)) {
				entity.setMotion((entity.getMotion().getX()), 0.8, (entity.getMotion().getZ()));
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private IWorld world;
					public void start(IWorld world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						entity.getPersistentData().putDouble("verticalMovement", 0);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 1);
			} else if (((entity.getPersistentData().getDouble("verticalMovement")) == 0)) {
				entity.setMotion((entity.getMotion().getX()), (0 - 0.2), (entity.getMotion().getZ()));
			}
		}
		if (((entity.getPersistentData().getDouble("flightDescend")) == 400)) {
			entity.setMotion((entity.getMotion().getX()), ((entity.getMotion().getY()) - 0.8), (entity.getMotion().getZ()));
			entity.getPersistentData().putDouble("flightDescend", 0);
		}
	}
}
