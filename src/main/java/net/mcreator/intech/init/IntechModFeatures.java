
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.intech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.intech.world.features.ZincOreFeatureFeature;
import net.mcreator.intech.world.features.BauxiteVeinFeature;
import net.mcreator.intech.IntechMod;

@Mod.EventBusSubscriber
public class IntechModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, IntechMod.MODID);
	public static final RegistryObject<Feature<?>> BAUXITE_VEIN = REGISTRY.register("bauxite_vein", BauxiteVeinFeature::new);
	public static final RegistryObject<Feature<?>> ZINC_ORE_FEATURE = REGISTRY.register("zinc_ore_feature", ZincOreFeatureFeature::new);
}
