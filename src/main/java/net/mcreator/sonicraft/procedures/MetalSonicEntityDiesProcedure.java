package net.mcreator.sonicraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.Entity;

import net.mcreator.sonicraft.entity.CPZMetalSonicDeathTriggerEntity;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

@SonicraftModElements.ModElement.Tag
public class MetalSonicEntityDiesProcedure extends SonicraftModElements.ModElement {
	public MetalSonicEntityDiesProcedure(SonicraftModElements instance) {
		super(instance, 892);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SonicraftMod.LOGGER.warn("Failed to load dependency x for procedure MetalSonicEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SonicraftMod.LOGGER.warn("Failed to load dependency y for procedure MetalSonicEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SonicraftMod.LOGGER.warn("Failed to load dependency z for procedure MetalSonicEntityDies!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure MetalSonicEntityDies!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((Entity) world
				.getEntitiesWithinAABB(CPZMetalSonicDeathTriggerEntity.CustomEntity.class,
						new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null,
						(int) (((Entity) world.getEntitiesWithinAABB(CPZMetalSonicDeathTriggerEntity.CustomEntity.class,
								new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosX()),
						(int) (((Entity) world.getEntitiesWithinAABB(CPZMetalSonicDeathTriggerEntity.CustomEntity.class,
								new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosY()),
						(int) (((Entity) world.getEntitiesWithinAABB(CPZMetalSonicDeathTriggerEntity.CustomEntity.class,
								new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
								.stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPosZ()),
						(float) 2.75, Explosion.Mode.DESTROY);
			}
			if (!((Entity) world
					.getEntitiesWithinAABB(CPZMetalSonicDeathTriggerEntity.CustomEntity.class,
							new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).world.isRemote())
				((Entity) world
						.getEntitiesWithinAABB(CPZMetalSonicDeathTriggerEntity.CustomEntity.class,
								new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).remove();
		}
	}
}
