
package net.mcreator.sonicraft.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

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
public class MarbleZoneBrickTilesBlock extends SonicraftModElements.ModElement {
	@ObjectHolder("sonicraft:marble_zone_brick_tiles")
	public static final Block block = null;
	public MarbleZoneBrickTilesBlock(SonicraftModElements instance) {
		super(instance, 206);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(SonicraftBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).harvestLevel(0)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("marble_zone_brick_tiles");
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.QUARTZ;
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
