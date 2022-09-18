package net.rae.darkdeep.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.DarkOakFoliagePlacer;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.rae.darkdeep.DarkDeep;
import net.rae.darkdeep.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> WIDE_ASH_TREE =
            ConfiguredFeatures.register("wide_ash_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.ASH_LOG),
                    new DarkOakTrunkPlacer(5, 6, 4),
                    BlockStateProvider.of(ModBlocks.ASH_LEAVES),
                    new DarkOakFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0)),
                    new TwoLayersFeatureSize(1, 0, 2)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> TALL_ASH_TREE =
            ConfiguredFeatures.register("tall_ash_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.ASH_LOG),
                    new MegaJungleTrunkPlacer(15, 18, 6),
                    BlockStateProvider.of(ModBlocks.ASH_LEAVES),
                    new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> DREAMWOOD_TREE =
            ConfiguredFeatures.register("dreamwood_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.DREAMWOOD_LOG),
                    new StraightTrunkPlacer(3, 4, 2),
                    BlockStateProvider.of(ModBlocks.DREAMWOOD_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 2)).dirtProvider(BlockStateProvider.of(Blocks.SCULK)).build());

    public static final RegistryEntry<PlacedFeature> WIDE_ASH_CHECKED =
            PlacedFeatures.register("wide_ash_checked", WIDE_ASH_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.WIDE_ASH_SAPLING));
    public static final RegistryEntry<PlacedFeature> TALL_ASH_CHECKED =
            PlacedFeatures.register("tall_ash_checked", TALL_ASH_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.TALL_ASH_SAPLING));
    public static final RegistryEntry<PlacedFeature> DREAMWOOD_CHECKED =
            PlacedFeatures.register("dreamwood_checked", DREAMWOOD_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.DREAMWOOD_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> WIDE_ASH_SPAWN =
            ConfiguredFeatures.register("wide_ash_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(WIDE_ASH_CHECKED, 0.5f)),
                            WIDE_ASH_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> TALL_ASH_SPAWN =
            ConfiguredFeatures.register("tall_ash_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(TALL_ASH_CHECKED, 0.5f)),
                            TALL_ASH_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> DREAMWOOD_SPAWN =
            ConfiguredFeatures.register("dreamwood_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(DREAMWOOD_CHECKED, 0.5f)),
                            DREAMWOOD_CHECKED));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + DarkDeep.MOD_ID);
    }
}
