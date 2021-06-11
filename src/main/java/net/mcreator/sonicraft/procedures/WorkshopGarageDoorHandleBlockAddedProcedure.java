package net.mcreator.sonicraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.sonicraft.block.WorkshopGarageDoorSymbolBlock;
import net.mcreator.sonicraft.block.WorkshopGarageDoorBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class WorkshopGarageDoorHandleBlockAddedProcedure extends SonicraftModElements.ModElement {
	public WorkshopGarageDoorHandleBlockAddedProcedure(SonicraftModElements instance) {
		super(instance, 620);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure WorkshopGarageDoorHandleBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure WorkshopGarageDoorHandleBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure WorkshopGarageDoorHandleBlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure WorkshopGarageDoorHandleBlockAdded!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == WorkshopGarageDoorSymbolBlock.block.getDefaultState()
				.getBlock()) == (false))) {
			if ((((new Object() {
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
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH) || ((new Object() {
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
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH))) {
				if ((((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z)).isSolid()) == (false))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).isSolid()) == (false)))
						&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).isSolid()) == (false))
								&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).isSolid()) == (false))))
						&& ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).isSolid()) == (false))
								&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).isSolid()) == (false)))
								&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z)).isSolid()) == (false))
										&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)).isSolid()) == (false)))))) {
					world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), WorkshopGarageDoorBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
					world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), WorkshopGarageDoorBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), WorkshopGarageDoorBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), WorkshopGarageDoorSymbolBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), WorkshopGarageDoorBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
					world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z), WorkshopGarageDoorBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
					world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), WorkshopGarageDoorBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
					world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z), WorkshopGarageDoorBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world,
								new BlockPos((int) x, (int) y, (int) z));
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					}
				}
			} else if ((((new Object() {
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
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST) || ((new Object() {
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
			}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.EAST))) {
				if ((((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).isSolid()) == (false))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).isSolid()) == (false)))
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).isSolid()) == (false))
								&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).isSolid()) == (false))))
						&& ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).isSolid()) == (false))
								&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1))).isSolid()) == (false)))
								&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)).isSolid()) == (false))
										&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1))).isSolid()) == (false)))))) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), WorkshopGarageDoorBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
					world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), WorkshopGarageDoorBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), WorkshopGarageDoorBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), WorkshopGarageDoorSymbolBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), WorkshopGarageDoorBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
					world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)), WorkshopGarageDoorBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
					world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), WorkshopGarageDoorBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
					world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)), WorkshopGarageDoorBlock.block.getDefaultState(), 3);
					try {
						BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)));
						DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
						if (_property != null) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)), _bs.with(_property, (new Object() {
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
							}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
						} else {
							world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1)),
									_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
										public Direction getDirection(BlockPos pos) {
											try {
												BlockState _bs = world.getBlockState(pos);
												DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer()
														.getProperty("facing");
												if (property != null)
													return _bs.get(property);
												return Direction.getFacingFromAxisDirection(_bs
														.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
														Direction.AxisDirection.POSITIVE);
											} catch (Exception e) {
												return Direction.NORTH;
											}
										}
									}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
						}
					} catch (Exception e) {
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world,
								new BlockPos((int) x, (int) y, (int) z));
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					}
				}
			}
		}
	}
}
