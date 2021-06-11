package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.state.Property;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.BlockState;

import net.mcreator.sonicraft.block.CasinoNightSlotWheelSpinningBlock;
import net.mcreator.sonicraft.block.CasinoNightSlotWheelRNGBlock;
import net.mcreator.sonicraft.block.CasinoNightSlotWallYellowBlock;
import net.mcreator.sonicraft.block.CasinoNightSlotSoundTriggerBlock;
import net.mcreator.sonicraft.block.CasinoNightSlotResultTriggerBlock;
import net.mcreator.sonicraft.block.CasinoNightSlotLeverOnBlock;
import net.mcreator.sonicraft.block.CasinoNightSlotLeverBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class CasinoNightSlotLeverOnBlockRightClickedProcedure extends SonicraftModElements.ModElement {
	public CasinoNightSlotLeverOnBlockRightClickedProcedure(SonicraftModElements instance) {
		super(instance, 766);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure CasinoNightSlotLeverOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure CasinoNightSlotLeverOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure CasinoNightSlotLeverOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure CasinoNightSlotLeverOnBlockRightClicked!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			BlockState _bs = CasinoNightSlotLeverOnBlock.block.getDefaultState();
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
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.piston.extend")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.piston.extend")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
		if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (property != null)
						return _bs.get(property);
					return Direction.getFacingFromAxisDirection(
							_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
							Direction.AxisDirection.POSITIVE);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST)) {
			if ((((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotWallYellowBlock.block
					.getDefaultState().getBlock())
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotResultTriggerBlock.block
							.getDefaultState().getBlock()))
					&& (BlockTags.getCollection().getTagByID(new ResourceLocation(("sonicraft:slot_wheels").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)))).getBlock())))
					&& ((BlockTags.getCollection().getTagByID(new ResourceLocation(("sonicraft:slot_wheels").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock()))
							&& (BlockTags.getCollection()
									.getTagByID(new ResourceLocation(("sonicraft:slot_wheels").toLowerCase(java.util.Locale.ENGLISH)))
									.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)))).getBlock()))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
					BlockState _bs = CasinoNightSlotSoundTriggerBlock.block.getDefaultState();
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
					BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z + 1));
					BlockState _bs = CasinoNightSlotWheelSpinningBlock.block.getDefaultState();
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
					BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) z);
					BlockState _bs = CasinoNightSlotWheelSpinningBlock.block.getDefaultState();
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
					BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z - 1));
					BlockState _bs = CasinoNightSlotWheelSpinningBlock.block.getDefaultState();
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
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1))))
								.getBlock() == CasinoNightSlotWheelSpinningBlock.block.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z - 1));
								BlockState _bs = CasinoNightSlotWheelRNGBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 40);
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
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)))
								.getBlock() == CasinoNightSlotWheelSpinningBlock.block.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) z);
								BlockState _bs = CasinoNightSlotWheelRNGBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 60);
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
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1))))
								.getBlock() == CasinoNightSlotWheelSpinningBlock.block.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z + 1));
								BlockState _bs = CasinoNightSlotWheelRNGBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 80);
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
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotWallYellowBlock.block
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
								BlockState _bs = CasinoNightSlotResultTriggerBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 85);
			}
		} else if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (property != null)
						return _bs.get(property);
					return Direction.getFacingFromAxisDirection(
							_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
							Direction.AxisDirection.POSITIVE);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH)) {
			if ((((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotWallYellowBlock.block
					.getDefaultState().getBlock())
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotResultTriggerBlock.block
							.getDefaultState().getBlock()))
					&& (BlockTags.getCollection().getTagByID(new ResourceLocation(("sonicraft:slot_wheels").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z))).getBlock())))
					&& ((BlockTags.getCollection().getTagByID(new ResourceLocation(("sonicraft:slot_wheels").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock()))
							&& (BlockTags.getCollection()
									.getTagByID(new ResourceLocation(("sonicraft:slot_wheels").toLowerCase(java.util.Locale.ENGLISH)))
									.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z))).getBlock()))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
					BlockState _bs = CasinoNightSlotSoundTriggerBlock.block.getDefaultState();
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
					BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 2), (int) z);
					BlockState _bs = CasinoNightSlotWheelSpinningBlock.block.getDefaultState();
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
					BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) z);
					BlockState _bs = CasinoNightSlotWheelSpinningBlock.block.getDefaultState();
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
					BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 2), (int) z);
					BlockState _bs = CasinoNightSlotWheelSpinningBlock.block.getDefaultState();
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
						if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z)))
								.getBlock() == CasinoNightSlotWheelSpinningBlock.block.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 2), (int) z);
								BlockState _bs = CasinoNightSlotWheelRNGBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 40);
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
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)))
								.getBlock() == CasinoNightSlotWheelSpinningBlock.block.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) z);
								BlockState _bs = CasinoNightSlotWheelRNGBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 60);
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
						if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z)))
								.getBlock() == CasinoNightSlotWheelSpinningBlock.block.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 2), (int) z);
								BlockState _bs = CasinoNightSlotWheelRNGBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 80);
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
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotWallYellowBlock.block
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
								BlockState _bs = CasinoNightSlotResultTriggerBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 85);
			}
		} else if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (property != null)
						return _bs.get(property);
					return Direction.getFacingFromAxisDirection(
							_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
							Direction.AxisDirection.POSITIVE);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.EAST)) {
			if ((((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotWallYellowBlock.block
					.getDefaultState().getBlock())
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotResultTriggerBlock.block
							.getDefaultState().getBlock()))
					&& (BlockTags.getCollection().getTagByID(new ResourceLocation(("sonicraft:slot_wheels").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)))).getBlock())))
					&& ((BlockTags.getCollection().getTagByID(new ResourceLocation(("sonicraft:slot_wheels").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock()))
							&& (BlockTags.getCollection()
									.getTagByID(new ResourceLocation(("sonicraft:slot_wheels").toLowerCase(java.util.Locale.ENGLISH)))
									.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)))).getBlock()))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
					BlockState _bs = CasinoNightSlotSoundTriggerBlock.block.getDefaultState();
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
					BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z + 1));
					BlockState _bs = CasinoNightSlotWheelSpinningBlock.block.getDefaultState();
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
					BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) z);
					BlockState _bs = CasinoNightSlotWheelSpinningBlock.block.getDefaultState();
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
					BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z - 1));
					BlockState _bs = CasinoNightSlotWheelSpinningBlock.block.getDefaultState();
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
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1))))
								.getBlock() == CasinoNightSlotWheelSpinningBlock.block.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z + 1));
								BlockState _bs = CasinoNightSlotWheelRNGBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 40);
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
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)))
								.getBlock() == CasinoNightSlotWheelSpinningBlock.block.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) z);
								BlockState _bs = CasinoNightSlotWheelRNGBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 60);
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
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1))))
								.getBlock() == CasinoNightSlotWheelSpinningBlock.block.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z - 1));
								BlockState _bs = CasinoNightSlotWheelRNGBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 80);
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
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotWallYellowBlock.block
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
								BlockState _bs = CasinoNightSlotResultTriggerBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 85);
			}
		} else if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (property != null)
						return _bs.get(property);
					return Direction.getFacingFromAxisDirection(
							_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
							Direction.AxisDirection.POSITIVE);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH)) {
			if ((((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotWallYellowBlock.block
					.getDefaultState().getBlock())
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotResultTriggerBlock.block
							.getDefaultState().getBlock()))
					&& (BlockTags.getCollection().getTagByID(new ResourceLocation(("sonicraft:slot_wheels").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z))).getBlock())))
					&& ((BlockTags.getCollection().getTagByID(new ResourceLocation(("sonicraft:slot_wheels").toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock()))
							&& (BlockTags.getCollection()
									.getTagByID(new ResourceLocation(("sonicraft:slot_wheels").toLowerCase(java.util.Locale.ENGLISH)))
									.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z))).getBlock()))))) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
					BlockState _bs = CasinoNightSlotSoundTriggerBlock.block.getDefaultState();
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
					BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 2), (int) z);
					BlockState _bs = CasinoNightSlotWheelSpinningBlock.block.getDefaultState();
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
					BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) z);
					BlockState _bs = CasinoNightSlotWheelSpinningBlock.block.getDefaultState();
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
					BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 2), (int) z);
					BlockState _bs = CasinoNightSlotWheelSpinningBlock.block.getDefaultState();
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
						if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z)))
								.getBlock() == CasinoNightSlotWheelSpinningBlock.block.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 2), (int) z);
								BlockState _bs = CasinoNightSlotWheelRNGBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 40);
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
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)))
								.getBlock() == CasinoNightSlotWheelSpinningBlock.block.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) z);
								BlockState _bs = CasinoNightSlotWheelRNGBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 60);
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
						if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z)))
								.getBlock() == CasinoNightSlotWheelSpinningBlock.block.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 2), (int) z);
								BlockState _bs = CasinoNightSlotWheelRNGBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 80);
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
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotWallYellowBlock.block
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
								BlockState _bs = CasinoNightSlotResultTriggerBlock.block.getDefaultState();
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
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 85);
			}
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
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == CasinoNightSlotLeverOnBlock.block.getDefaultState()
						.getBlock())) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						BlockState _bs = CasinoNightSlotLeverBlock.block.getDefaultState();
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
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.piston.contract")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.piston.contract")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 20);
	}
}
