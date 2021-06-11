package net.mcreator.sonicraft.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;

import net.mcreator.sonicraft.SonicraftModVariables;
import net.mcreator.sonicraft.SonicraftModElements;
import net.mcreator.sonicraft.SonicraftMod;

import java.util.Map;
import java.util.HashMap;

@SonicraftModElements.ModElement.Tag
public class InGameTimeVariableProcedure extends SonicraftModElements.ModElement {
	public InGameTimeVariableProcedure(SonicraftModElements instance) {
		super(instance, 582);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SonicraftMod.LOGGER.warn("Failed to load dependency world for procedure InGameTimeVariable!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		return ((SonicraftModVariables.WorldVariables.get(world).game_time) == (world.getWorldInfo().getDayTime()));
	}

	@SubscribeEvent
	public void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			IWorld world = event.world;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("world", world);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
