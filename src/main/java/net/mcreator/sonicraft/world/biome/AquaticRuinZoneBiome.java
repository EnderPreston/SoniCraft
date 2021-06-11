
package net.mcreator.sonicraft.world.biome;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.EntityClassification;

import net.mcreator.sonicraft.entity.PeckyEntity;
import net.mcreator.sonicraft.entity.FlickyEntity;
import net.mcreator.sonicraft.block.AquaticRuinGrassBlock;
import net.mcreator.sonicraft.block.AquaticRuinBricksBlock;
import net.mcreator.sonicraft.SonicraftModElements;

@SonicraftModElements.ModElement.Tag
public class AquaticRuinZoneBiome extends SonicraftModElements.ModElement {
	public static Biome biome;
	public AquaticRuinZoneBiome(SonicraftModElements instance) {
		super(instance, 718);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}
	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-16777088).setWaterColor(-14003747).setWaterFogColor(-12127279)
						.withSkyColor(-16777088).withFoliageColor(-12591044).withGrassColor(-11206896)
						.setAmbientSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
								.getValue(new ResourceLocation("sonicraft:music.game.aquaticruin")))
						.build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().withSurfaceBuilder(
						SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(AquaticRuinGrassBlock.block.getDefaultState(),
								AquaticRuinBricksBlock.block.getDefaultState(), AquaticRuinBricksBlock.block.getDefaultState())));
				biomeGenerationSettings.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEAGRASS
						.withConfiguration(new ProbabilityConfig(0.3F)).func_242731_b(3).withPlacement(Features.Placements.SEAGRASS_DISK_PLACEMENT));
				DefaultBiomeFeatures.withChanceBerries(biomeGenerationSettings);
				DefaultBiomeFeatures.withJungleGrass(biomeGenerationSettings);
				DefaultBiomeFeatures.withLavaAndWaterLakes(biomeGenerationSettings);
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				mobSpawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(FlickyEntity.entity, 1, 1, 1));
				mobSpawnInfo.withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(PeckyEntity.entity, 1, 1, 1));
				biome = new Biome.Builder().precipitation(Biome.RainType.NONE).category(Biome.Category.NONE).depth(-0.5f).scale(0.1f)
						.temperature(0.2f).downfall(0f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("sonicraft:aquatic_ruin_zone"));
			}
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
	}
}
