package net.rae.darkdeep.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.rae.darkdeep.world.feature.ModPlacedFeatures;

@SuppressWarnings("ALL")
public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_DARK),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DREAMWOOD_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_DARK),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WIDE_ASH_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DEEP_DARK),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TALL_ASH_PLACED.getKey().get());
    }
}
