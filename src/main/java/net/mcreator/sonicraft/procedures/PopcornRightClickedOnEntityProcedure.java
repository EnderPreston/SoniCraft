package net.mcreator.sonicraft.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.item.BucketOfPopcornItem;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class PopcornRightClickedOnEntityProcedure extends SonicraftModElements.ModElement {
	public PopcornRightClickedOnEntityProcedure(SonicraftModElements instance) {
		super(instance, 962);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure PopcornRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency sourceentity for procedure PopcornRightClickedOnEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.BUCKET, (int) (1)).getItem())) {
			if (!entity.world.isRemote())
				entity.remove();
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(Items.BUCKET, (int) (1));
				((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) sourceentity).container.func_234641_j_());
			}
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(BucketOfPopcornItem.block, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
		}
	}
}
