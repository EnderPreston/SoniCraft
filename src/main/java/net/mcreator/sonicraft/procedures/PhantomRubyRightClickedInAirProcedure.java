package net.mcreator.sonicraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.potion.EffectInstance;
import net.minecraft.network.play.server.SPlayerAbilitiesPacket;
import net.minecraft.network.play.server.SPlaySoundEventPacket;
import net.minecraft.network.play.server.SPlayEntityEffectPacket;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.world.NullSpaceAccessGameRule;
import net.mcreator.sonicraft.potion.FalseRealityPotion;
import net.mcreator.sonicraft.particle.EnergyCubesParticle;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

@SonicraftModElements.ModElement.Tag
public class PhantomRubyRightClickedInAirProcedure extends SonicraftModElements.ModElement {
	public PhantomRubyRightClickedInAirProcedure(SonicraftModElements instance) {
		super(instance, 684);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure PhantomRubyRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure PhantomRubyRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure PhantomRubyRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure PhantomRubyRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure PhantomRubyRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((entity.isSneaking())) {
			if (((world.getWorldInfo().getGameRulesInstance().getBoolean(NullSpaceAccessGameRule.gamerule)) == (true))) {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(EnergyCubesParticle.particle, x, (y + 1), z, (int) 8, 1, 1, 1, 0);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(FalseRealityPotion.potion, (int) 50, (int) 0, (false), (false)));
				if (((entity.world.getDimensionKey()) == (RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
						new ResourceLocation("sonicraft:null_space_dimension"))))) {
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
							{
								Entity _ent = entity;
								if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
									RegistryKey<World> destinationType = World.OVERWORLD;
									ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
									if (nextWorld != null) {
										((ServerPlayerEntity) _ent).connection
												.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
										((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
												nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw,
												_ent.rotationPitch);
										((ServerPlayerEntity) _ent).connection
												.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
										for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
											((ServerPlayerEntity) _ent).connection
													.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
										}
										((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
									}
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 50);
				} else if (((entity.world.getDimensionKey()) == (World.OVERWORLD))) {
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
							{
								Entity _ent = entity;
								if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
									RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
											new ResourceLocation("sonicraft:null_space_dimension"));
									ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
									if (nextWorld != null) {
										((ServerPlayerEntity) _ent).connection
												.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
										((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
												nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw,
												_ent.rotationPitch);
										((ServerPlayerEntity) _ent).connection
												.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
										for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
											((ServerPlayerEntity) _ent).connection
													.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
										}
										((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
									}
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 50);
				}
			} else {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(EnergyCubesParticle.particle, x, (y + 1), z, (int) 8, 1, 1, 1, 0);
				}
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (8 / 2d), y - (8 / 2d), z - (8 / 2d), x + (8 / 2d), y + (8 / 2d), z + (8 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity)
							((LivingEntity) entityiterator)
									.addPotionEffect(new EffectInstance(FalseRealityPotion.potion, (int) 60, (int) 0, (false), (false)));
					}
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(FalseRealityPotion.potion);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(EnergyCubesParticle.particle, x, (y + 1), z, (int) 8, 1, 1, 1, 0);
			}
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (8 / 2d), y - (8 / 2d), z - (8 / 2d), x + (8 / 2d), y + (8 / 2d), z + (8 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity)
						((LivingEntity) entityiterator)
								.addPotionEffect(new EffectInstance(FalseRealityPotion.potion, (int) 60, (int) 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(FalseRealityPotion.potion);
			}
		}
	}
}
