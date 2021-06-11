package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.particle.CycloneReticleParticle;
import net.mcreator.sonicraft.entity.CycloneEntity;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class TargetedOnPotionActiveTickProcedure extends SonicraftModElements.ModElement {
	public TargetedOnPotionActiveTickProcedure(SonicraftModElements instance) {
		super(instance, 584);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure TargetedOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure TargetedOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure TargetedOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure TargetedOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure TargetedOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((entity instanceof CycloneEntity.CustomEntity) == (false)) && ((entity instanceof LivingEntity) == (true))) && ((((EntityTypeTags
				.getCollection().getTagByID(new ResourceLocation(("mod:critters").toLowerCase(java.util.Locale.ENGLISH))).contains(entity.getType()))
				|| (EntityTypeTags.getCollection().getTagByID(new ResourceLocation(("sonicraft:critters").toLowerCase(java.util.Locale.ENGLISH)))
						.contains(entity.getType()))) == (false))
				&& ((((EntityTypeTags.getCollection().getTagByID(new ResourceLocation(("mod:mobians").toLowerCase(java.util.Locale.ENGLISH)))
						.contains(entity.getType()))
						|| (EntityTypeTags.getCollection()
								.getTagByID(new ResourceLocation(("sonicraft:mobians").toLowerCase(java.util.Locale.ENGLISH)))
								.contains(entity.getType()))) == (false))
						&& ((entity instanceof PlayerEntity) == (false)))))) {
			world.addParticle(CycloneReticleParticle.particle, x, (y + 1), z, 0, 0, 0);
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.cyclonetarget")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:mob.cyclonetarget")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
		}
	}
}
