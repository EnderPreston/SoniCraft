package net.mcreator.sonicraft.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.block.BlockState;

import net.mcreator.sonicraft.block.SegaGenesisSonic2Block;
import net.mcreator.sonicraft.block.ItemBoxBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class ItemBoxSonic2UpdateTickProcedure extends SonicraftModElements.ModElement {
	public ItemBoxSonic2UpdateTickProcedure(SonicraftModElements instance) {
		super(instance, 855);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure ItemBoxSonic2UpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure ItemBoxSonic2UpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure ItemBoxSonic2UpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure ItemBoxSonic2UpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == SegaGenesisSonic2Block.block.getDefaultState()
				.getBlock()) == (false))
				&& (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == SegaGenesisSonic2Block.block.getDefaultState()
						.getBlock()) == (false)))
				&& ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == SegaGenesisSonic2Block.block
						.getDefaultState().getBlock()) == (false))
						&& (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == SegaGenesisSonic2Block.block
								.getDefaultState().getBlock()) == (false))))) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = ItemBoxBlock.block.getDefaultState();
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
}
