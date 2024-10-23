
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaeitems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.aaeitems.world.features.ores.EngieOreFeature;
import net.mcreator.aaeitems.world.features.ores.DeepslateEngieOreFeature;
import net.mcreator.aaeitems.world.features.NothingFeature;
import net.mcreator.aaeitems.world.features.ItemHouseFeature;
import net.mcreator.aaeitems.AaeItemsMod;

@Mod.EventBusSubscriber
public class AaeItemsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AaeItemsMod.MODID);
	public static final RegistryObject<Feature<?>> ENGIE_ORE = REGISTRY.register("engie_ore", EngieOreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPSLATE_ENGIE_ORE = REGISTRY.register("deepslate_engie_ore", DeepslateEngieOreFeature::feature);
	public static final RegistryObject<Feature<?>> NOTHING = REGISTRY.register("nothing", NothingFeature::feature);
	public static final RegistryObject<Feature<?>> ITEM_HOUSE = REGISTRY.register("item_house", ItemHouseFeature::feature);
}
