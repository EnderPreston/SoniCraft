package net.mcreator.sonicraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.sonicraft.item.ChaosEmeraldYellowItem;
import net.mcreator.sonicraft.item.ChaosEmeraldWhiteItem;
import net.mcreator.sonicraft.item.ChaosEmeraldRedItem;
import net.mcreator.sonicraft.item.ChaosEmeraldPurpleItem;
import net.mcreator.sonicraft.item.ChaosEmeraldLightBlueItem;
import net.mcreator.sonicraft.item.ChaosEmeraldGreenItem;
import net.mcreator.sonicraft.item.ChaosEmeraldBlueItem;
import net.mcreator.sonicraft.block.PowerGeneratorYellowBlock;
import net.mcreator.sonicraft.block.PowerGeneratorWhiteBlock;
import net.mcreator.sonicraft.block.PowerGeneratorRedBlock;
import net.mcreator.sonicraft.block.PowerGeneratorPurpleBlock;
import net.mcreator.sonicraft.block.PowerGeneratorLightBlueBlock;
import net.mcreator.sonicraft.block.PowerGeneratorGreenBlock;
import net.mcreator.sonicraft.block.PowerGeneratorBlueBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class PowerGeneratorEmeraldBlockDestroyedByPlayerProcedure extends SonicraftModElements.ModElement {
	public PowerGeneratorEmeraldBlockDestroyedByPlayerProcedure(SonicraftModElements instance) {
		super(instance, 793);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure PowerGeneratorEmeraldBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure PowerGeneratorEmeraldBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure PowerGeneratorEmeraldBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure PowerGeneratorEmeraldBlockDestroyedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PowerGeneratorGreenBlock.block.getDefaultState()
				.getBlock())) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChaosEmeraldGreenItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PowerGeneratorYellowBlock.block.getDefaultState()
				.getBlock())) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChaosEmeraldYellowItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PowerGeneratorBlueBlock.block.getDefaultState()
				.getBlock())) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChaosEmeraldBlueItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PowerGeneratorPurpleBlock.block.getDefaultState()
				.getBlock())) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChaosEmeraldPurpleItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PowerGeneratorWhiteBlock.block.getDefaultState()
				.getBlock())) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChaosEmeraldWhiteItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PowerGeneratorLightBlueBlock.block.getDefaultState()
				.getBlock())) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChaosEmeraldLightBlueItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PowerGeneratorRedBlock.block.getDefaultState()
				.getBlock())) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ChaosEmeraldRedItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
