
package net.mcreator.sonicraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.sonicraft.item.SpeedShoesItem;
import net.mcreator.sonicraft.SonicraftModElements;

@SonicraftModElements.ModElement.Tag
public class SonicraftMiscItemGroup extends SonicraftModElements.ModElement {
	public SonicraftMiscItemGroup(SonicraftModElements instance) {
		super(instance, 439);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsonicraft_misc") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SpeedShoesItem.boots, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
