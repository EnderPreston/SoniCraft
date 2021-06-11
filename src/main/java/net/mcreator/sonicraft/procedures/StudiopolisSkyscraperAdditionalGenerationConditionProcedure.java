package net.mcreator.sonicraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.sonicraft.block.ChaostoneBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class StudiopolisSkyscraperAdditionalGenerationConditionProcedure extends SonicraftModElements.ModElement {
	public StudiopolisSkyscraperAdditionalGenerationConditionProcedure(SonicraftModElements instance) {
		super(instance, 990);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure StudiopolisSkyscraperAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure StudiopolisSkyscraperAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure StudiopolisSkyscraperAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure StudiopolisSkyscraperAdditionalGenerationCondition!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((world.getBlockState(new BlockPos((int) x, (int) (y - 6), (int) z))).getBlock() == ChaostoneBlock.block.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 6), (int) z))).getBlock() == Blocks.STONE.getDefaultState().getBlock()))
				|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 6), (int) z))).getBlock() == Blocks.GRANITE.getDefaultState().getBlock())
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 6), (int) z))).getBlock() == Blocks.DIORITE.getDefaultState()
								.getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 6), (int) z))).getBlock() == Blocks.ANDESITE
										.getDefaultState().getBlock()))))) {
			return (true);
		}
		return (false);
	}
}
