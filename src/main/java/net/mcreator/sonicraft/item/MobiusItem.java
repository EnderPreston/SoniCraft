
package net.mcreator.sonicraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ActionResultType;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;

import net.mcreator.sonicraft.world.dimension.MobiusDimension;
import net.mcreator.sonicraft.procedures.MobiusPortalTriggerUsedProcedure;
import net.mcreator.sonicraft.itemgroup.SonicraftMiscItemGroup;

import java.util.Map;
import java.util.HashMap;

public class MobiusItem extends Item {
	@ObjectHolder("sonicraft:mobius")
	public static final Item block = null;
	public MobiusItem() {
		super(new Item.Properties().group(SonicraftMiscItemGroup.tab).maxDamage(64));
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		PlayerEntity entity = context.getPlayer();
		BlockPos pos = context.getPos().offset(context.getFace());
		ItemStack itemstack = context.getItem();
		World world = context.getWorld();
		if (!entity.canPlayerEdit(pos, context.getFace(), itemstack)) {
			return ActionResultType.FAIL;
		} else {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			if (world.isAirBlock(pos) && true)
				MobiusDimension.portal.portalSpawn(world, pos);
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				MobiusPortalTriggerUsedProcedure.executeProcedure($_dependencies);
			}
			itemstack.damageItem(1, entity, c -> c.sendBreakAnimation(context.getHand()));
			return ActionResultType.SUCCESS;
		}
	}
}
