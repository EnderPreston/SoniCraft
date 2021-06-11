package net.mcreator.sonicraft.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.sonicraft.SonicraftModElements;

import java.lang.reflect.Method;

@SonicraftModElements.ModElement.Tag
public class NullSpaceAccessGameRule extends SonicraftModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("nullSpaceAccess", GameRules.Category.MISC,
			create(false));
	public NullSpaceAccessGameRule(SonicraftModElements instance) {
		super(instance, 691);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
