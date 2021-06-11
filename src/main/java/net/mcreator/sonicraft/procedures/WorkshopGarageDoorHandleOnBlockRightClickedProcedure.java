package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.state.Property;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.sonicraft.block.WorkshopGarageDoorSymbolBlock;
import net.mcreator.sonicraft.block.WorkshopGarageDoorBlock;
import net.mcreator.sonicraft.block.OpenWorkshopGarageDoorHandleBlock;
import net.mcreator.sonicraft.block.OpenWorkshopGarageDoorBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class WorkshopGarageDoorHandleOnBlockRightClickedProcedure extends SonicraftModElements.ModElement {
	public WorkshopGarageDoorHandleOnBlockRightClickedProcedure(SonicraftModElements instance) {
		super(instance, 621);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure WorkshopGarageDoorHandleOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure WorkshopGarageDoorHandleOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure WorkshopGarageDoorHandleOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure WorkshopGarageDoorHandleOnBlockRightClicked!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == WorkshopGarageDoorBlock.block.getDefaultState()
				.getBlock())
				&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == WorkshopGarageDoorBlock.block.getDefaultState()
						.getBlock()))
				&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == WorkshopGarageDoorBlock.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == WorkshopGarageDoorSymbolBlock.block
								.getDefaultState().getBlock())))
				&& ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == WorkshopGarageDoorBlock.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) z))).getBlock() == WorkshopGarageDoorBlock.block
								.getDefaultState().getBlock()))
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == WorkshopGarageDoorBlock.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 2), (int) z)))
										.getBlock() == WorkshopGarageDoorBlock.block.getDefaultState().getBlock()))))) {
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 2), (int) z);
				BlockState _bs = OpenWorkshopGarageDoorBlock.block.getDefaultState();
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
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) z);
				BlockState _bs = OpenWorkshopGarageDoorHandleBlock.block.getDefaultState();
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
			{
				BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 2), (int) z);
				BlockState _bs = OpenWorkshopGarageDoorBlock.block.getDefaultState();
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
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		} else if ((((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == WorkshopGarageDoorBlock.block
				.getDefaultState().getBlock())
				&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == WorkshopGarageDoorBlock.block.getDefaultState()
						.getBlock()))
				&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == WorkshopGarageDoorBlock.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == WorkshopGarageDoorSymbolBlock.block
								.getDefaultState().getBlock())))
				&& ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == WorkshopGarageDoorBlock.block
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z + 1)))).getBlock() == WorkshopGarageDoorBlock.block
								.getDefaultState().getBlock()))
						&& (((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock() == WorkshopGarageDoorBlock.block
								.getDefaultState().getBlock())
								&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) (z - 1))))
										.getBlock() == WorkshopGarageDoorBlock.block.getDefaultState().getBlock()))))) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z + 1));
				BlockState _bs = OpenWorkshopGarageDoorBlock.block.getDefaultState();
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
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) z);
				BlockState _bs = OpenWorkshopGarageDoorHandleBlock.block.getDefaultState();
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
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y + 2), (int) (z - 1));
				BlockState _bs = OpenWorkshopGarageDoorBlock.block.getDefaultState();
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
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		}
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
	}
}
