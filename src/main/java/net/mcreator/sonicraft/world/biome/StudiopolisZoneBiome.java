
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

import net.mcreator.sonicraft.entity.TubinautEntity;
import net.mcreator.sonicraft.entity.PeckyEntity;
import net.mcreator.sonicraft.block.StudiopolisTilesBlock;
import net.mcreator.sonicraft.block.StudiopolisRoadBlock;
import net.mcreator.sonicraft.SonicraftModElements;

@SonicraftModElements.ModElement.Tag
public class StudiopolisZoneBiome extends SonicraftModElements.ModElement {
	public static Biome biome;
	public StudiopolisZoneBiome(SonicraftModElements instance) {
		super(instance, 980);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}
	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-26368).setWaterColor(-6749953).setWaterFogColor(-6750004)
						.withSkyColor(-26368).withFoliageColor(-16724992).withGrassColor(-13395712)
						.setAmbientSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
								.getValue(new ResourceLocation("sonicraft:music.game.studiopolis")))
						.build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().withSurfaceBuilder(
						SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(StudiopolisRoadBlock.block.getDefaultState(),
								StudiopolisTilesBlock.block.getDefaultState(), StudiopolisTilesBlock.block.getDefaultState())));
				DefaultBiomeFeatures.withOverworldOres(biomeGenerationSettings);
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				mobSpawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(PeckyEntity.entity, 1, 1, 1));
				mobSpawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(TubinautEntity.entity, 1, 1, 1));
				biome = new Biome.Builder().precipitation(Biome.RainType.NONE).category(Biome.Category.NONE).depth(0.2f).scale(0.2f)
						.temperature(0.7999999999999999f).downfall(0f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("sonicraft:studiopolis_zone"));
			}
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
	}
}
