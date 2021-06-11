
package net.mcreator.sonicraft.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.sonicraft.itemgroup.SonicraftBlocksItemGroup;
import net.mcreator.sonicraft.SonicraftModElements;

import java.util.List;
import java.util.Collections;

@SonicraftModElements.ModElement.Tag
public class SmoothDeathEggOuterShellStairsBlock extends SonicraftModElements.ModElement {
	@ObjectHolder("sonicraft:smooth_death_egg_outer_shell_stairs")
	public static final Block block = null;
	public SmoothDeathEggOuterShellStairsBlock(SonicraftModElements instance) {
		super(instance, 320);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(SonicraftBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends StairsBlock {
		public CustomBlock() {
			super(() -> new Block(Block.Properties.create(Material.IRON).sound(SoundType.NETHERITE).hardnessAndResistance(2f, 8f)
					.setLightLevel(s -> 0).harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool()).getDefaultState(),
					Block.Properties.create(Material.IRON).sound(SoundType.NETHERITE).hardnessAndResistance(2f, 8f).setLightLevel(s -> 0)
							.harvestLevel(1).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("smooth_death_egg_outer_shell_stairs");
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.LIGHT_BLUE_TERRACOTTA;
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
