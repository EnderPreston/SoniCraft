package net.mcreator.sonicraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.block.ScrapBrainIronSlabBlock;
import net.mcreator.sonicraft.block.ScrapBrainGlassBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class EggmanBossDamagedOnEntityTickUpdateProcedure extends SonicraftModElements.ModElement {
	public EggmanBossDamagedOnEntityTickUpdateProcedure(SonicraftModElements instance) {
		super(instance, 431);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure EggmanBossDamagedOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure EggmanBossDamagedOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure EggmanBossDamagedOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure EggmanBossDamagedOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure EggmanBossDamagedOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		entity.setMotion(0, 0.1, 1);
		if ((((((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == ScrapBrainGlassBlock.block.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == ScrapBrainGlassBlock.block.getDefaultState()
						.getBlock()))
				|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == ScrapBrainGlassBlock.block.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == ScrapBrainGlassBlock.block
								.getDefaultState().getBlock())))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == ScrapBrainIronSlabBlock.block.getDefaultState()
						.getBlock()))) {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 2, Explosion.Mode.DESTROY);
			}
		}
	}
}
