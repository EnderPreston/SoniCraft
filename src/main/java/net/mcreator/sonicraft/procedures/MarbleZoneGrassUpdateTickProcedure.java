package net.mcreator.sonicraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.sonicraft.block.MarbleZoneStoneBlock;
import net.mcreator.sonicraft.block.MarbleZoneRingSpawnerBlock;
import net.mcreator.sonicraft.block.MarbleZoneGrassStairsBlock;
import net.mcreator.sonicraft.block.MarbleZoneGrassSlabBlock;
import net.mcreator.sonicraft.block.MarbleZoneGrassBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class MarbleZoneGrassUpdateTickProcedure extends SonicraftModElements.ModElement {
	public MarbleZoneGrassUpdateTickProcedure(SonicraftModElements instance) {
		super(instance, 644);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure MarbleZoneGrassUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure MarbleZoneGrassUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure MarbleZoneGrassUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure MarbleZoneGrassUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == MarbleZoneGrassBlock.block.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == MarbleZoneRingSpawnerBlock.block
						.getDefaultState().getBlock()))
				|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == MarbleZoneGrassStairsBlock.block
						.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == MarbleZoneGrassSlabBlock.block
								.getDefaultState().getBlock())))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MarbleZoneStoneBlock.block.getDefaultState(), 3);
		}
	}
}
