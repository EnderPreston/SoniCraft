
package net.mcreator.sonicraft.block;

import net.minecraftforge.registries.ObjectHolder;

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
public class DeathEggFloorStairsBlock extends SonicraftModElements.ModElement {
	@ObjectHolder("sonicraft:death_egg_floor_stairs")
	public static final Block block = null;
	public DeathEggFloorStairsBlock(SonicraftModElements instance) {
		super(instance, 327);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(SonicraftBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends StairsBlock {
		public CustomBlock() {
			super(() -> new Block(
					Block.Properties.create(Material.IRON).sound(SoundType.NETHERITE).hardnessAndResistance(1.5f, 40f).setLightLevel(s -> 0))
							.getDefaultState(),
					Block.Properties.create(Material.IRON).sound(SoundType.NETHERITE).hardnessAndResistance(1.5f, 40f).setLightLevel(s -> 0));
			setRegistryName("death_egg_floor_stairs");
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.SAND;
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
