package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.entity.EggmanBossEntity;
import net.mcreator.sonicraft.SonicraftModVariables;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;

@SonicraftModElements.ModElement.Tag
public class ShadowOnEntityTickUpdateProcedure extends SonicraftModElements.ModElement {
	public ShadowOnEntityTickUpdateProcedure(SonicraftModElements instance) {
		super(instance, 567);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure ShadowOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure ShadowOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure ShadowOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure ShadowOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure ShadowOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof PlayerEntity)) {
			SonicraftModVariables.MapVariables
					.get(world).shadow_attack_voice = (double) ((SonicraftModVariables.MapVariables.get(world).shadow_attack_voice) + 5);
			SonicraftModVariables.MapVariables.get(world).syncData(world);
			if (((SonicraftModVariables.MapVariables.get(world).shadow_attack_voice) == 5)) {
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("sonicraft:mob.shadowprovoked")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("sonicraft:mob.shadowprovoked")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				SonicraftModVariables.MapVariables
						.get(world).shadow_attack_voice = (double) ((SonicraftModVariables.MapVariables.get(world).shadow_attack_voice) + 5);
				SonicraftModVariables.MapVariables.get(world).syncData(world);
			}
		} else if ((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof EggmanBossEntity.CustomEntity)) {
			SonicraftModVariables.MapVariables
					.get(world).shadow_attack_voice = (double) ((SonicraftModVariables.MapVariables.get(world).shadow_attack_voice) + 5);
			SonicraftModVariables.MapVariables.get(world).syncData(world);
			if (((SonicraftModVariables.MapVariables.get(world).shadow_attack_voice) == 5)) {
				if (world instanceof World && !world.isRemote()) {
					((World) world)
							.playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("sonicraft:mob.shadow.eggman")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("sonicraft:mob.shadow.eggman")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				SonicraftModVariables.MapVariables
						.get(world).shadow_attack_voice = (double) ((SonicraftModVariables.MapVariables.get(world).shadow_attack_voice) + 5);
				SonicraftModVariables.MapVariables.get(world).syncData(world);
			}
		} else {
			SonicraftModVariables.MapVariables.get(world).shadow_attack_voice = (double) 0;
			SonicraftModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
