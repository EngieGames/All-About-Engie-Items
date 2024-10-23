
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaeitems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.aaeitems.world.features.ores.EngieOreFeature;
import net.mcreator.aaeitems.world.features.ores.DeepslateEngieOreFeature;
import net.mcreator.aaeitems.world.features.NothingFeature;
import net.mcreator.aaeitems.world.features.ItemHouseFeature;
import net.mcreator.aaeitems.AaeItemsMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class AaeItemsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AaeItemsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> ENGIE_ORE = register("engie_ore", EngieOreFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EngieOreFeature.GENERATE_BIOMES, EngieOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_ENGIE_ORE = register("deepslate_engie_ore", DeepslateEngieOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateEngieOreFeature.GENERATE_BIOMES, DeepslateEngieOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NOTHING = register("nothing", NothingFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, NothingFeature.GENERATE_BIOMES, NothingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ITEM_HOUSE = register("item_house", ItemHouseFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, ItemHouseFeature.GENERATE_BIOMES, ItemHouseFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
