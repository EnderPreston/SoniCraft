package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.item.ChaosEmeraldFakeItem;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class ChaosEmeraldFakeLivingEntityIsHitWithItemProcedure extends SonicraftModElements.ModElement {
	public ChaosEmeraldFakeLivingEntityIsHitWithItemProcedure(SonicraftModElements instance) {
		super(instance, 563);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure ChaosEmeraldFakeLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ChaosEmeraldFakeLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure ChaosEmeraldFakeLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure ChaosEmeraldFakeLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure ChaosEmeraldFakeLivingEntityIsHitWithItem!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure ChaosEmeraldFakeLivingEntityIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((EntityTypeTags.getCollection().getTagByID(new ResourceLocation(("mod:badniks").toLowerCase(java.util.Locale.ENGLISH)))
				.contains(entity.getType()))
				|| (EntityTypeTags.getCollection().getTagByID(new ResourceLocation(("sonicraft:badniks").toLowerCase(java.util.Locale.ENGLISH)))
						.contains(entity.getType())))) {
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(ChaosEmeraldFakeItem.block, (int) (1));
				((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) sourceentity).container.func_234641_j_());
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:generic.charge")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:generic.charge")),
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
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.LARGE_SMOKE, x, y, z, (int) 5, 0.5, 0.5, 0.5, 0);
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
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.LARGE_SMOKE, x, y, z, (int) 5, 0.5, 0.5, 0.5, 0);
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
									if (world instanceof ServerWorld) {
										((ServerWorld) world).spawnParticle(ParticleTypes.LARGE_SMOKE, x, y, z, (int) 5, 0.5, 0.5, 0.5, 0);
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
											if (world instanceof ServerWorld) {
												((ServerWorld) world).spawnParticle(ParticleTypes.LARGE_SMOKE, x, y, z, (int) 5, 0.5, 0.5, 0.5, 0);
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
													if (world instanceof ServerWorld) {
														((ServerWorld) world).spawnParticle(ParticleTypes.LARGE_SMOKE, x, y, z, (int) 5, 0.5, 0.5,
																0.5, 0);
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
															if (world instanceof ServerWorld) {
																((ServerWorld) world).spawnParticle(ParticleTypes.LARGE_SMOKE, x, y, z, (int) 5, 0.5,
																		0.5, 0.5, 0);
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
																	if (world instanceof ServerWorld) {
																		((ServerWorld) world).spawnParticle(ParticleTypes.LARGE_SMOKE, x, y, z,
																				(int) 5, 0.5, 0.5, 0.5, 0);
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
																			if (world instanceof ServerWorld) {
																				((ServerWorld) world).spawnParticle(ParticleTypes.LARGE_SMOKE, x, y,
																						z, (int) 5, 0.5, 0.5, 0.5, 0);
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
																					if (world instanceof ServerWorld) {
																						((ServerWorld) world).spawnParticle(ParticleTypes.LARGE_SMOKE,
																								x, y, z, (int) 5, 0.5, 0.5, 0.5, 0);
																					}
																					MinecraftForge.EVENT_BUS.unregister(this);
																				}
																			}.start(world, (int) 5);
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, (int) 5);
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 5);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 5);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 5);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 5);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 5);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 5);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 5);
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
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.NONE);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 48);
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
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChaosEmeraldFakeItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 50);
		}
	}
}
