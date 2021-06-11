package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.item.SpecialStageKeyItem;
import net.mcreator.sonicraft.item.ChaosEmeraldYellowItem;
import net.mcreator.sonicraft.item.ChaosEmeraldWhiteItem;
import net.mcreator.sonicraft.item.ChaosEmeraldRedItem;
import net.mcreator.sonicraft.item.ChaosEmeraldPurpleItem;
import net.mcreator.sonicraft.item.ChaosEmeraldLightBlueItem;
import net.mcreator.sonicraft.item.ChaosEmeraldGreenItem;
import net.mcreator.sonicraft.item.ChaosEmeraldBlueItem;
import net.mcreator.sonicraft.block.GoldRingBlock;
import net.mcreator.sonicraft.SonicraftModVariables;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class SignpostPlayerOnBlockRightClickedProcedure extends SonicraftModElements.ModElement {
	public SignpostPlayerOnBlockRightClickedProcedure(SonicraftModElements instance) {
		super(instance, 505);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure SignpostPlayerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure SignpostPlayerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure SignpostPlayerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure SignpostPlayerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure SignpostPlayerOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(SpecialStageKeyItem.block, (int) (1)).getItem())) {
			if ((((entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new SonicraftModVariables.PlayerVariables())).emeralds_collected) == 0)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ChaosEmeraldGreenItem.block, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("sonicraft:chaosemerald.collect")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("sonicraft:chaosemerald.collect")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SpecialStageKeyItem.block, (int) (1));
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				{
					double _setval = (double) 1;
					entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.emeralds_collected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new SonicraftModVariables.PlayerVariables())).emeralds_collected) == 1)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ChaosEmeraldYellowItem.block, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("sonicraft:chaosemerald.collect")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("sonicraft:chaosemerald.collect")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SpecialStageKeyItem.block, (int) (1));
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				{
					double _setval = (double) 2;
					entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.emeralds_collected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new SonicraftModVariables.PlayerVariables())).emeralds_collected) == 2)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ChaosEmeraldBlueItem.block, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("sonicraft:chaosemerald.collect")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("sonicraft:chaosemerald.collect")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SpecialStageKeyItem.block, (int) (1));
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				{
					double _setval = (double) 3;
					entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.emeralds_collected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new SonicraftModVariables.PlayerVariables())).emeralds_collected) == 3)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ChaosEmeraldPurpleItem.block, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("sonicraft:chaosemerald.collect")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("sonicraft:chaosemerald.collect")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SpecialStageKeyItem.block, (int) (1));
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				{
					double _setval = (double) 4;
					entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.emeralds_collected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new SonicraftModVariables.PlayerVariables())).emeralds_collected) == 4)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ChaosEmeraldWhiteItem.block, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("sonicraft:chaosemerald.collect")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("sonicraft:chaosemerald.collect")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SpecialStageKeyItem.block, (int) (1));
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				{
					double _setval = (double) 5;
					entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.emeralds_collected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new SonicraftModVariables.PlayerVariables())).emeralds_collected) == 5)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ChaosEmeraldLightBlueItem.block, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("sonicraft:chaosemerald.collect")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("sonicraft:chaosemerald.collect")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SpecialStageKeyItem.block, (int) (1));
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				{
					double _setval = (double) 6;
					entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.emeralds_collected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new SonicraftModVariables.PlayerVariables())).emeralds_collected) == 6)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ChaosEmeraldRedItem.block, (int) (1));
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("sonicraft:chaosemerald.collect")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("sonicraft:chaosemerald.collect")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SpecialStageKeyItem.block, (int) (1));
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				{
					double _setval = (double) 7;
					entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.emeralds_collected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((((entity.getCapability(SonicraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new SonicraftModVariables.PlayerVariables())).emeralds_collected) == 7)) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(GoldRingBlock.block, (int) (1));
					_setstack.setCount((int) 50);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
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
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SpecialStageKeyItem.block, (int) (1));
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
	}
}
