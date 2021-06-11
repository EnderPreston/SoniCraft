package net.mcreator.sonicraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.block.Blocks;

import net.mcreator.sonicraft.block.StrippedGHZPalmLogBlock;
import net.mcreator.sonicraft.block.GreenHillPalmSaplingBlock;
import net.mcreator.sonicraft.block.GreenHillPalmLogBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class GreenHillPalmLeavesUpdateTickProcedure extends SonicraftModElements.ModElement {
	public GreenHillPalmLeavesUpdateTickProcedure(SonicraftModElements instance) {
		super(instance, 640);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure GreenHillPalmLeavesUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure GreenHillPalmLeavesUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure GreenHillPalmLeavesUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure GreenHillPalmLeavesUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((((((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == GreenHillPalmLogBlock.block.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == StrippedGHZPalmLogBlock.block.getDefaultState()
						.getBlock()))
				|| (((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == GreenHillPalmLogBlock.block.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == StrippedGHZPalmLogBlock.block
								.getDefaultState().getBlock())))
				|| ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == GreenHillPalmLogBlock.block.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == StrippedGHZPalmLogBlock.block
								.getDefaultState().getBlock()))
						|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == GreenHillPalmLogBlock.block
								.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == StrippedGHZPalmLogBlock.block
										.getDefaultState().getBlock()))))
				|| ((((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == GreenHillPalmLogBlock.block
						.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == StrippedGHZPalmLogBlock.block
								.getDefaultState().getBlock()))
						|| (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == GreenHillPalmLogBlock.block
								.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))
										.getBlock() == StrippedGHZPalmLogBlock.block.getDefaultState().getBlock())))
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == GreenHillPalmLogBlock.block
								.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == StrippedGHZPalmLogBlock.block
										.getDefaultState().getBlock())))
						|| ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == GreenHillPalmLogBlock.block
								.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))
										.getBlock() == StrippedGHZPalmLogBlock.block.getDefaultState().getBlock()))
								|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
										.getBlock() == GreenHillPalmLogBlock.block.getDefaultState().getBlock())
										|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
												.getBlock() == StrippedGHZPalmLogBlock.block.getDefaultState().getBlock()))))) == (false))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			if ((Math.random() < 0.35)) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(GreenHillPalmSaplingBlock.block, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
