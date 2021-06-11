package net.mcreator.sonicraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameRules;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.particle.EnergyCubesParticle;
import net.mcreator.sonicraft.item.SpecialStageKeyItem;
import net.mcreator.sonicraft.item.PhantomRubyItem;
import net.mcreator.sonicraft.entity.ReplicaShadowEntity;
import net.mcreator.sonicraft.entity.ReplicaMetalSonicEntity;
import net.mcreator.sonicraft.entity.ReplicaChaosEntity;
import net.mcreator.sonicraft.entity.InfiniteEntity;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

@SonicraftModElements.ModElement.Tag
public class InfiniteEntityDiesProcedure extends SonicraftModElements.ModElement {
	public InfiniteEntityDiesProcedure(SonicraftModElements instance) {
		super(instance, 683);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SonicraftMod.LOGGER.warn("Failed to load dependency entity for procedure InfiniteEntityDies!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure InfiniteEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure InfiniteEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure InfiniteEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure InfiniteEntityDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:phantomruby.action")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("sonicraft:phantomruby.action")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
		if (!entity.world.isRemote())
			entity.remove();
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(EnergyCubesParticle.particle, x, (y + 0.5), z, (int) 8, 0.3, 0.5, 0.3, 0);
		}
		if ((entity instanceof InfiniteEntity.CustomEntity)) {
			if (((world.getWorldInfo().getGameRulesInstance().getBoolean(GameRules.DO_MOB_LOOT)) == (true))) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(SpecialStageKeyItem.block, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(PhantomRubyItem.block, (int) (1)));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
				{
					List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (512 / 2d), y - (512 / 2d), z - (512 / 2d), x + (512 / 2d), y + (512 / 2d), z + (512 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if ((entityiterator instanceof ReplicaShadowEntity.CustomEntity)) {
							entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 40);
						}
						if ((entityiterator instanceof ReplicaMetalSonicEntity.CustomEntity)) {
							entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 40);
						}
						if ((entityiterator instanceof ReplicaChaosEntity.CustomEntity)) {
							entityiterator.attackEntityFrom(DamageSource.GENERIC, (float) 40);
						}
					}
				}
			}
		}
	}
}
