
package net.mcreator.sonicraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.sonicraft.block.GHZGrassBlock;
import net.mcreator.sonicraft.SonicraftModElements;

@SonicraftModElements.ModElement.Tag
public class SonicraftBlocksItemGroup extends SonicraftModElements.ModElement {
	public SonicraftBlocksItemGroup(SonicraftModElements instance) {
		super(instance, 438);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsonicraft_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GHZGrassBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
