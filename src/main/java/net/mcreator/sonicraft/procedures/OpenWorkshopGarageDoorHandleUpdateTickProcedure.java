package net.mcreator.sonicraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.sonicraft.block.OpenWorkshopGarageDoorBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class OpenWorkshopGarageDoorHandleUpdateTickProcedure extends SonicraftModElements.ModElement {
	public OpenWorkshopGarageDoorHandleUpdateTickProcedure(SonicraftModElements instance) {
		super(instance, 625);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure OpenWorkshopGarageDoorHandleUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure OpenWorkshopGarageDoorHandleUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure OpenWorkshopGarageDoorHandleUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure OpenWorkshopGarageDoorHandleUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == OpenWorkshopGarageDoorBlock.block.getDefaultState()
				.getBlock())
				&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == OpenWorkshopGarageDoorBlock.block
						.getDefaultState().getBlock()))
				|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == OpenWorkshopGarageDoorBlock.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == OpenWorkshopGarageDoorBlock.block
								.getDefaultState().getBlock()))) == (false))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		}
	}
}
