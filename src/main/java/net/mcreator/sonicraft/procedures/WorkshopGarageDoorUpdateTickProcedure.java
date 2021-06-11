package net.mcreator.sonicraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.sonicraft.block.WorkshopGarageDoorSymbolBlock;
import net.mcreator.sonicraft.block.WorkshopGarageDoorHandleBlock;
import net.mcreator.sonicraft.block.WorkshopGarageDoorBlock;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class WorkshopGarageDoorUpdateTickProcedure extends SonicraftModElements.ModElement {
	public WorkshopGarageDoorUpdateTickProcedure(SonicraftModElements instance) {
		super(instance, 622);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure WorkshopGarageDoorUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure WorkshopGarageDoorUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure WorkshopGarageDoorUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure WorkshopGarageDoorUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == WorkshopGarageDoorSymbolBlock.block
				.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == WorkshopGarageDoorSymbolBlock.block
						.getDefaultState().getBlock()))
				|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == WorkshopGarageDoorSymbolBlock.block
						.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == WorkshopGarageDoorSymbolBlock.block
								.getDefaultState().getBlock())))
				|| (((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == WorkshopGarageDoorSymbolBlock.block
						.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == WorkshopGarageDoorSymbolBlock.block
								.getDefaultState().getBlock()))
						|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
								.getBlock() == WorkshopGarageDoorSymbolBlock.block.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
										.getBlock() == WorkshopGarageDoorSymbolBlock.block.getDefaultState().getBlock())))
						|| ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
								.getBlock() == WorkshopGarageDoorSymbolBlock.block.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
										.getBlock() == WorkshopGarageDoorSymbolBlock.block.getDefaultState().getBlock()))
								|| ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
										.getBlock() == WorkshopGarageDoorSymbolBlock.block.getDefaultState().getBlock())
										|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
												.getBlock() == WorkshopGarageDoorSymbolBlock.block.getDefaultState().getBlock()))
										|| (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))
												.getBlock() == WorkshopGarageDoorSymbolBlock.block.getDefaultState().getBlock())
												|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))
														.getBlock() == WorkshopGarageDoorSymbolBlock.block.getDefaultState()
																.getBlock())))))) == (false))) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;
				public void start(IWorld world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == WorkshopGarageDoorBlock.block.getDefaultState()
							.getBlock())) {
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == WorkshopGarageDoorHandleBlock.block
							.getDefaultState().getBlock())) {
						world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 1);
		}
	}
}
