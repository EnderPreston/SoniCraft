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
import net.minecraft.state.Property;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.sonicraft.block.CapsuleWallBlock;
import net.mcreator.sonicraft.block.CapsuleRodBlock;
import net.mcreator.sonicraft.block.CapsuleGlassBlock;
import net.mcreator.sonicraft.block.CapsuleButtonPressedBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class CapsuleButtonEntityWalksOnTheBlockProcedure extends SonicraftModElements.ModElement {
	public CapsuleButtonEntityWalksOnTheBlockProcedure(SonicraftModElements instance) {
		super(instance, 454);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure CapsuleButtonEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure CapsuleButtonEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure CapsuleButtonEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure CapsuleButtonEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure CapsuleButtonEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((entity instanceof PlayerEntity)) {
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z + 1)))).getBlock() == CapsuleWallBlock.block
					.getDefaultState().getBlock())
					&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 1)))).getBlock() == CapsuleWallBlock.block
							.getDefaultState().getBlock()))) {
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) z))).getBlock() == CapsuleGlassBlock.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 1)))).getBlock() == CapsuleGlassBlock.block
								.getDefaultState().getBlock()))) {
					if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) z))).getBlock() == CapsuleGlassBlock.block
							.getDefaultState().getBlock())
							&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 1)))).getBlock() == CapsuleGlassBlock.block
									.getDefaultState().getBlock()))) {
						if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 1)))).getBlock() == CapsuleWallBlock.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z + 1))))
										.getBlock() == CapsuleWallBlock.block.getDefaultState().getBlock()))) {
							world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) z), Blocks.AIR.getDefaultState(), 3);
							world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
							world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) z), Blocks.AIR.getDefaultState(), 3);
							world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
							{
								BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 2), (int) (z + 1));
								BlockState _bs = CapsuleRodBlock.block.getDefaultState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
									if (_property != null && _bs.get(_property) != null)
										try {
											_bs = _bs.with(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlockState(_bp, _bs, 3);
							}
							{
								BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 1));
								BlockState _bs = CapsuleRodBlock.block.getDefaultState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
									if (_property != null && _bs.get(_property) != null)
										try {
											_bs = _bs.with(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlockState(_bp, _bs, 3);
							}
							{
								BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 1));
								BlockState _bs = CapsuleRodBlock.block.getDefaultState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
									if (_property != null && _bs.get(_property) != null)
										try {
											_bs = _bs.with(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlockState(_bp, _bs, 3);
							}
							{
								BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 2), (int) (z + 1));
								BlockState _bs = CapsuleRodBlock.block.getDefaultState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
									if (_property != null && _bs.get(_property) != null)
										try {
											_bs = _bs.with(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlockState(_bp, _bs, 3);
							}
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = CapsuleButtonPressedBlock.block.getDefaultState();
								BlockState _bso = world.getBlockState(_bp);
								for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
									Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
									if (_property != null && _bs.get(_property) != null)
										try {
											_bs = _bs.with(_property, (Comparable) entry.getValue());
										} catch (Exception e) {
										}
								}
								world.setBlockState(_bp, _bs, 3);
							}
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("sonicraft:monitor.destroy")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("sonicraft:monitor.destroy")),
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
									if (world instanceof World && !world.isRemote()) {
										((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
												(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
														.getValue(new ResourceLocation("sonicraft:monitor.destroy")),
												SoundCategory.NEUTRAL, (float) 1, (float) 1);
									} else {
										((World) world).playSound(x, y, z,
												(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
														.getValue(new ResourceLocation("sonicraft:monitor.destroy")),
												SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
									}
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 3);
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
										((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
												(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
														.getValue(new ResourceLocation("sonicraft:monitor.destroy")),
												SoundCategory.NEUTRAL, (float) 1, (float) 1);
									} else {
										((World) world).playSound(x, y, z,
												(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
														.getValue(new ResourceLocation("sonicraft:monitor.destroy")),
												SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
									}
									if (world instanceof ServerWorld) {
										((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, x, (y - 2), z, (int) 4, 2, 2, 2, 0);
									}
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 6);
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
										((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
												(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
														.getValue(new ResourceLocation("sonicraft:monitor.destroy")),
												SoundCategory.NEUTRAL, (float) 1, (float) 1);
									} else {
										((World) world).playSound(x, y, z,
												(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
														.getValue(new ResourceLocation("sonicraft:monitor.destroy")),
												SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
									}
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 9);
							if (world instanceof ServerWorld) {
								((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, x, (y - 2), z, (int) 4, 2, 2, 2, 0);
							}
						}
					}
				}
			}
		}
	}
}
