
package net.mcreator.sonicraft.world.biome;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.EntityClassification;

import net.mcreator.sonicraft.entity.PickyEntity;
import net.mcreator.sonicraft.entity.OrbinautEntity;
import net.mcreator.sonicraft.entity.FlickyEntity;
import net.mcreator.sonicraft.block.StarLightRoadBlock;
import net.mcreator.sonicraft.block.StarLightMetalBlockBlock;
import net.mcreator.sonicraft.SonicraftModElements;

@SonicraftModElements.ModElement.Tag
public class StarLightZoneBiome extends SonicraftModElements.ModElement {
	public static Biome biome;
	public StarLightZoneBiome(SonicraftModElements instance) {
		super(instance, 882);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}
	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-16777216).setWaterColor(-11444532).setWaterFogColor(-11444532)
						.withSkyColor(-16777216).withFoliageColor(-12613858).withGrassColor(-8078741)
						.setAmbientSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
								.getValue(new ResourceLocation("sonicraft:music.game.starlight")))
						.build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder()
						.withSurfaceBuilder(SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(StarLightRoadBlock.block.getDefaultState(),
								StarLightMetalBlockBlock.block.getDefaultState(), StarLightMetalBlockBlock.block.getDefaultState())));
				DefaultBiomeFeatures.withOverworldOres(biomeGenerationSettings);
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				mobSpawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(FlickyEntity.entity, 1, 1, 1));
				mobSpawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(PickyEntity.entity, 1, 1, 1));
				mobSpawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(OrbinautEntity.entity, 1, 1, 1));
				biome = new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.NONE).depth(0.2f).scale(0.1f).temperature(0.5f)
						.downfall(0.5f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("sonicraft:star_light_zone"));
			}
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
	}
}
