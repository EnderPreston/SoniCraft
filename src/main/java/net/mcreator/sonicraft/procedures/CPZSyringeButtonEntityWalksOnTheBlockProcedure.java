package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.state.Property;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.sonicraft.entity.SonicEntity;
import net.mcreator.sonicraft.block.MegaMackBlockLightBlueBlock;
import net.mcreator.sonicraft.block.MegaMackBlockGreenBlock;
import net.mcreator.sonicraft.block.MegaMackBlockBlock;
import net.mcreator.sonicraft.block.CPZSyringePipeLightBlueBlock;
import net.mcreator.sonicraft.block.CPZSyringePipeGreenBlock;
import net.mcreator.sonicraft.block.CPZSyringePipeBlock;
import net.mcreator.sonicraft.block.CPZSyringeNeedleBlock;
import net.mcreator.sonicraft.block.CPZSyringeButtonPressedBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class CPZSyringeButtonEntityWalksOnTheBlockProcedure extends SonicraftModElements.ModElement {
	public CPZSyringeButtonEntityWalksOnTheBlockProcedure(SonicraftModElements instance) {
		super(instance, 501);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure CPZSyringeButtonEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure CPZSyringeButtonEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure CPZSyringeButtonEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure CPZSyringeButtonEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure CPZSyringeButtonEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity instanceof PlayerEntity) || (entity instanceof SonicEntity.CustomEntity))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == CPZSyringePipeLightBlueBlock.block
					.getDefaultState().getBlock())) {
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == CPZSyringePipeLightBlueBlock.block
						.getDefaultState().getBlock())) {
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 3), (int) z))).getBlock() == CPZSyringeNeedleBlock.block
							.getDefaultState().getBlock())) {
						if (((world.getBlockState(new BlockPos((int) x, (int) (y - 4), (int) z))).getBlock() == MegaMackBlockBlock.block
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = CPZSyringeButtonPressedBlock.block.getDefaultState();
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
								BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
								BlockState _bs = CPZSyringePipeBlock.block.getDefaultState();
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
								BlockPos _bp = new BlockPos((int) x, (int) (y - 4), (int) z);
								BlockState _bs = MegaMackBlockLightBlueBlock.block.getDefaultState();
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
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("sonicraft:chemical.change")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("sonicraft:chemical.change")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
						}
					}
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == CPZSyringePipeGreenBlock.block
					.getDefaultState().getBlock())) {
				if (((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == CPZSyringePipeGreenBlock.block
						.getDefaultState().getBlock())) {
					if (((world.getBlockState(new BlockPos((int) x, (int) (y - 3), (int) z))).getBlock() == CPZSyringeNeedleBlock.block
							.getDefaultState().getBlock())) {
						if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 4), (int) z))).getBlock() == MegaMackBlockBlock.block
								.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 4), (int) z)))
										.getBlock() == MegaMackBlockLightBlueBlock.block.getDefaultState().getBlock()))) {
							{
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								BlockState _bs = CPZSyringeButtonPressedBlock.block.getDefaultState();
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
								BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
								BlockState _bs = CPZSyringePipeBlock.block.getDefaultState();
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
								BlockPos _bp = new BlockPos((int) x, (int) (y - 4), (int) z);
								BlockState _bs = MegaMackBlockGreenBlock.block.getDefaultState();
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
							if (world instanceof World && !world.isRemote()) {
								((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("sonicraft:chemical.change")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1);
							} else {
								((World) world).playSound(x, y, z,
										(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
												.getValue(new ResourceLocation("sonicraft:chemical.change")),
										SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
							}
						}
					}
				}
			}
		}
	}
}
