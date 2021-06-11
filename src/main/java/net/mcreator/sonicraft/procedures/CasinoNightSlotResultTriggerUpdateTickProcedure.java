package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.state.Property;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.sonicraft.potion.ShieldEffectPotion;
import net.mcreator.sonicraft.block.GoldRingBlock;
import net.mcreator.sonicraft.block.CasinoNightSlotWheelShoesBlock;
import net.mcreator.sonicraft.block.CasinoNightSlotWheelShieldBlock;
import net.mcreator.sonicraft.block.CasinoNightSlotWheelRingsBlock;
import net.mcreator.sonicraft.block.CasinoNightSlotWheelNetheriteBlock;
import net.mcreator.sonicraft.block.CasinoNightSlotWheelJackpotBlock;
import net.mcreator.sonicraft.block.CasinoNightSlotWheelEggmanBlock;
import net.mcreator.sonicraft.block.CasinoNightSlotWallYellowBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

@SonicraftModElements.ModElement.Tag
public class CasinoNightSlotResultTriggerUpdateTickProcedure extends SonicraftModElements.ModElement {
	public CasinoNightSlotResultTriggerUpdateTickProcedure(SonicraftModElements instance) {
		super(instance, 767);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure CasinoNightSlotResultTriggerUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure CasinoNightSlotResultTriggerUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure CasinoNightSlotResultTriggerUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure CasinoNightSlotResultTriggerUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotWheelRingsBlock.block
				.getDefaultState().getBlock())
				&& ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
						.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
								.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))
						&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
								.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
										.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))))) {
			if (((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(GoldRingBlock.block, (int) (1));
				_setstack.setCount((int) 25);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) ((Entity) world
						.getEntitiesWithinAABB(PlayerEntity.class,
								new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null))), _setstack);
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:ring.collect")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:ring.collect")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		} else if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotWheelShieldBlock.block
				.getDefaultState().getBlock())
				&& ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
						.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
								.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))
						&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
								.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
										.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))))) {
			if (((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity)
				((LivingEntity) ((Entity) world
						.getEntitiesWithinAABB(PlayerEntity.class,
								new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)))
								.addPotionEffect(new EffectInstance(ShieldEffectPotion.potion, (int) 999999, (int) 0, (false), (false)));
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:shield.trigger")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:shield.trigger")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		} else if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotWheelShoesBlock.block
				.getDefaultState().getBlock())
				&& ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
						.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
								.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))
						&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
								.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
										.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))))) {
			if (((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity)
				((LivingEntity) ((Entity) world
						.getEntitiesWithinAABB(PlayerEntity.class,
								new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)))
								.addPotionEffect(new EffectInstance(Effects.SPEED, (int) 400, (int) 5, (false), (false)));
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.sonicroll")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.sonicroll")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		} else if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotWheelNetheriteBlock.block
				.getDefaultState().getBlock())
				&& ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
						.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
								.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))
						&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
								.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
										.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))))) {
			if (((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.NETHERITE_INGOT, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) ((Entity) world
						.getEntitiesWithinAABB(PlayerEntity.class,
								new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null))), _setstack);
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		} else if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotWheelEggmanBlock.block
				.getDefaultState().getBlock())
				&& ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
						.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
								.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))
						&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
								.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
										.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))))) {
			if (((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity)
				((LivingEntity) ((Entity) world
						.getEntitiesWithinAABB(PlayerEntity.class,
								new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)))
								.addPotionEffect(new EffectInstance(Effects.WITHER, (int) 100, (int) 0, (false), (true)));
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:spike.hurt")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:spike.hurt")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		} else if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == CasinoNightSlotWheelJackpotBlock.block
				.getDefaultState().getBlock())
				&& ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
						.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
								.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))
						&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
								.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
										.getBlock() == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()))))) {
			if (((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(GoldRingBlock.block, (int) (1));
				_setstack.setCount((int) 100);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) ((Entity) world
						.getEntitiesWithinAABB(PlayerEntity.class,
								new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null))), _setstack);
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:sonic.1up")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:sonic.1up")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		} else {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:action.fail")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:action.fail")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		}
		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			BlockState _bs = CasinoNightSlotWallYellowBlock.block.getDefaultState();
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
}
