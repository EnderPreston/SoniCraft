
package net.mcreator.sonicraft.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.sonicraft.itemgroup.SonicraftBlocksItemGroup;
import net.mcreator.sonicraft.SonicraftModElements;

import java.util.List;
import java.util.Collections;

@SonicraftModElements.ModElement.Tag
public class DeathEggInteriorWallBlock extends SonicraftModElements.ModElement {
	@ObjectHolder("sonicraft:death_egg_interior_wall")
	public static final Block block = null;
	public DeathEggInteriorWallBlock(SonicraftModElements instance) {
		super(instance, 325);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(SonicraftBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.NETHERITE).hardnessAndResistance(2.5f, 40f).setLightLevel(s -> 15)
					.harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("death_egg_interior_wall");
		}

		@Override
		public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
			return true;
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.BLACK;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
