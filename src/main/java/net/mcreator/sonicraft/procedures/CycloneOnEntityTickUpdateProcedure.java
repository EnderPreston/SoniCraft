package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.potion.TargetedPotion;
import net.mcreator.sonicraft.particle.MetalSonicFlameParticle;
import net.mcreator.sonicraft.item.CycloneTurretItem;
import net.mcreator.sonicraft.entity.CycloneEntity;
import net.mcreator.sonicraft.SonicraftModVariables;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

@SonicraftModElements.ModElement.Tag
public class CycloneOnEntityTickUpdateProcedure extends SonicraftModElements.ModElement {
	public CycloneOnEntityTickUpdateProcedure(SonicraftModElements instance) {
		super(instance, 592);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure CycloneOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure CycloneOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure CycloneOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure CycloneOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure CycloneOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		SonicraftModVariables.MapVariables.get(world).shadow_attack_voice = (double) 0;
		SonicraftModVariables.MapVariables.get(world).syncData(world);
		if ((((entity.getMotion().getX()) != 0) || ((entity.getMotion().getZ()) != 0))) {
			world.addParticle(MetalSonicFlameParticle.particle, x, (y + 2), z, 0, 0, 0);
		}
		if (((entity.isBeingRidden()) == (true))) {
			if ((entity.isOnGround())) {
				if (((entity.getPersistentData().getDouble("verticalMovement")) == 1)) {
					entity.setMotion((entity.getMotion().getX()), ((entity.getMotion().getY()) + 0.8), (entity.getMotion().getZ()));
					if (world instanceof World && !world.isRemote()) {
						((World) world)
								.playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("sonicraft:mob.cyclonejump")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("sonicraft:mob.cyclonejump")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
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
				}
			}
			if (((entity.getPersistentData().getDouble("cycloneShot")) == 1)) {
				if (entity instanceof LivingEntity) {
					Entity _ent = entity;
					if (!_ent.world.isRemote()) {
						CycloneTurretItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 3, (float) 5, (int) 1);
					}
				}
			}
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (48 / 2d), y - (48 / 2d), z - (48 / 2d), x + (48 / 2d), y + (48 / 2d), z + (48 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (((entityiterator instanceof CycloneEntity.CustomEntity) == (false))) {
						if (entityiterator instanceof LivingEntity)
							((LivingEntity) entityiterator)
									.addPotionEffect(new EffectInstance(TargetedPotion.potion, (int) 1, (int) 0, (false), (false)));
					}
				}
			}
		}
	}
}
