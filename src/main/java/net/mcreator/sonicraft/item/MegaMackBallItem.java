
package net.mcreator.sonicraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.sonicraft.itemgroup.SonicraftMiscItemGroup;
import net.mcreator.sonicraft.SonicraftModElements;

@SonicraftModElements.ModElement.Tag
public class MegaMackBallItem extends SonicraftModElements.ModElement {
	@ObjectHolder("sonicraft:mega_mack_ball")
	public static final Item block = null;
	public MegaMackBallItem(SonicraftModElements instance) {
		super(instance, 123);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SonicraftMiscItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("mega_mack_ball");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
