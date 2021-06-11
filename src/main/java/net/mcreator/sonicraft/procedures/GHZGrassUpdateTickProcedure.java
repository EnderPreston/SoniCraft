package net.mcreator.sonicraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.sonicraft.block.GHZGrassStairsBlock;
import net.mcreator.sonicraft.block.GHZGrassSlabBlock;
import net.mcreator.sonicraft.block.GHZGrassRingSpawnerBlock;
import net.mcreator.sonicraft.block.GHZGrassBlock;
import net.mcreator.sonicraft.block.GHZDirtBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class GHZGrassUpdateTickProcedure extends SonicraftModElements.ModElement {
	public GHZGrassUpdateTickProcedure(SonicraftModElements instance) {
		super(instance, 639);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure GHZGrassUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure GHZGrassUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure GHZGrassUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure GHZGrassUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == GHZGrassBlock.block.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == GHZGrassRingSpawnerBlock.block
						.getDefaultState().getBlock()))
				|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == GHZGrassStairsBlock.block.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == GHZGrassSlabBlock.block
								.getDefaultState().getBlock())))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), GHZDirtBlock.block.getDefaultState(), 3);
		}
	}
}
