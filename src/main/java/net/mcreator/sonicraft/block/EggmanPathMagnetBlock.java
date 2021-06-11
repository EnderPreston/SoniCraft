
package net.mcreator.sonicraft.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.sonicraft.procedures.EggmanPathMagnetBlockAddedProcedure;
import net.mcreator.sonicraft.SonicraftModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;

@SonicraftModElements.ModElement.Tag
public class EggmanPathMagnetBlock extends SonicraftModElements.ModElement {
	@ObjectHolder("sonicraft:eggman_path_magnet")
	public static final Block block = null;
	public EggmanPathMagnetBlock(SonicraftModElements instance) {
		super(instance, 870);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(null)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(-1, 3600000).setLightLevel(s -> 0)
					.doesNotBlockMovement());
			setRegistryName("eggman_path_magnet");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

		@Override
		public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean moving) {
			super.onBlockAdded(state, world, pos, oldState, moving);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				EggmanPathMagnetBlockAddedProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
