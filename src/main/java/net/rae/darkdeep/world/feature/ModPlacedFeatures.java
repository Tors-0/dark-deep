package net.rae.darkdeep.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> WIDE_ASH_PLACED = PlacedFeatures.register("wide_ash_placed",
            ModConfiguredFeatures.WIDE_ASH_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(2, 0.1f, 2)));
    public static final RegistryEntry<PlacedFeature> TALL_ASH_PLACED = PlacedFeatures.register("tall_ash_placed",
            ModConfiguredFeatures.TALL_ASH_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(6, 0.2f, 3)));
    public static final RegistryEntry<PlacedFeature> DREAMWOOD_PLACED = PlacedFeatures.register("dreamwood_placed",
            ModConfiguredFeatures.DREAMWOOD_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));
}
