package net.rae.darkdeep.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rae.darkdeep.DarkDeep;
import net.rae.darkdeep.block.custom.ModSaplingBlock;
import net.rae.darkdeep.item.ModItemGroup;
import net.rae.darkdeep.world.feature.tree.TallAshSaplingGenerator;
import net.rae.darkdeep.world.feature.tree.DreamwoodSaplingGenerator;
import net.rae.darkdeep.world.feature.tree.WideAshSaplingGenerator;

public class ModBlocks {
    public static final Block COMPRESSED_DEEPSLATE = registerBlock("compressed_deepslate",
            new Block(FabricBlockSettings.of(Material.STONE).strength(40f).requiresTool().resistance(800f)), ModItemGroup.THE_CAVERN);

    public static final Block COMPRESSED_DEEPSLATE_BUTTON = registerBlock("compressed_deepslate_button",
            new StoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().noCollision()), ModItemGroup.THE_CAVERN);
    public static final Block COMPRESSED_DEEPSLATE_PRESSURE_PLATE = registerBlock("compressed_deepslate_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.THE_CAVERN);
    public static final Block COMPRESSED_DEEPSLATE_WALL = registerBlock("compressed_deepslate_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(10f).requiresTool().resistance(800f)), ModItemGroup.THE_CAVERN);
    public static final Block COMPRESSED_DEEPSLATE_SLAB = registerBlock("compressed_deepslate_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(10f).requiresTool().resistance(800f)), ModItemGroup.THE_CAVERN);
    public static final Block COMPRESSED_DEEPSLATE_STAIRS = registerBlock("compressed_deepslate_stairs",
            new StairsBlock(ModBlocks.COMPRESSED_DEEPSLATE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).strength(10f).requiresTool().resistance(800f)), ModItemGroup.THE_CAVERN);

    public static final Block DREAMWOOD_PLANKS = registerBlock("dreamwood_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(4.5f)), ModItemGroup.THE_CAVERN);
    public static final Block ASH_PLANKS = registerBlock("ash_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(4f)), ModItemGroup.THE_CAVERN);

    public static final Block ASH_FENCE = registerBlock("ash_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(4f)), ModItemGroup.THE_CAVERN);
    public static final Block ASH_FENCE_GATE = registerBlock("ash_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(4f)), ModItemGroup.THE_CAVERN);
    public static final Block ASH_PRESSURE_PLATE = registerBlock("ash_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).strength(4f)), ModItemGroup.THE_CAVERN);
    public static final Block ASH_BUTTON = registerBlock("ash_button",
            new WoodenButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).noCollision()), ModItemGroup.THE_CAVERN);
    public static final Block ASH_SLAB = registerBlock("ash_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(4f)), ModItemGroup.THE_CAVERN);
    public static final Block ASH_STAIRS = registerBlock("ash_stairs",
            new StairsBlock(ModBlocks.ASH_PLANKS.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOD).strength(4f)), ModItemGroup.THE_CAVERN);

    public static final Block DREAMWOOD_FENCE = registerBlock("dreamwood_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f)), ModItemGroup.THE_CAVERN);
    public static final Block DREAMWOOD_FENCE_GATE = registerBlock("dreamwood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f)), ModItemGroup.THE_CAVERN);
    public static final Block DREAMWOOD_PRESSURE_PLATE = registerBlock("dreamwood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).strength(4.5f)), ModItemGroup.THE_CAVERN);
    public static final Block DREAMWOOD_BUTTON = registerBlock("dreamwood_button",
            new WoodenButtonBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f).noCollision()), ModItemGroup.THE_CAVERN);
    public static final Block DREAMWOOD_SLAB = registerBlock("dreamwood_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).strength(4.5f)), ModItemGroup.THE_CAVERN);
    public static final Block DREAMWOOD_STAIRS = registerBlock("dreamwood_stairs",
            new StairsBlock(ModBlocks.DREAMWOOD_PLANKS.getDefaultState(),
        FabricBlockSettings.of(Material.WOOD).strength(4.5f)), ModItemGroup.THE_CAVERN);


    public static final Block DREAMWOOD_LOG = registerBlock("dreamwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4.5f)), ModItemGroup.THE_CAVERN);
    public static final Block DREAMWOOD = registerBlock("dreamwood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4.5f)), ModItemGroup.THE_CAVERN);
    public static final Block STRIPPED_DREAMWOOD_LOG = registerBlock("stripped_dreamwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(4.5f)), ModItemGroup.THE_CAVERN);
    public static final Block STRIPPED_DREAMWOOD = registerBlock("stripped_dreamwood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4.5f)), ModItemGroup.THE_CAVERN);
    public static final Block ASH_LOG = registerBlock("ash_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4f)), ModItemGroup.THE_CAVERN);
    public static final Block ASH_WOOD = registerBlock("ash_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4f)), ModItemGroup.THE_CAVERN);
    public static final Block STRIPPED_ASH_LOG = registerBlock("stripped_ash_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(4f)), ModItemGroup.THE_CAVERN);
    public static final Block STRIPPED_ASH_WOOD = registerBlock("stripped_ash_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4f)), ModItemGroup.THE_CAVERN);




    public static final Block DREAMWOOD_LEAVES= registerBlock("dreamwood_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.THE_CAVERN);
    public static final Block ASH_LEAVES = registerBlock("ash_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.THE_CAVERN);

    public static final Block DREAMWOOD_SAPLING = registerBlock("dreamwood_sapling",
            new ModSaplingBlock(new DreamwoodSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING), () -> Blocks.SCULK), ModItemGroup.THE_CAVERN);
    public static final Block TALL_ASH_SAPLING = registerBlock("ash_sapling_tall",
            new SaplingBlock(new TallAshSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.THE_CAVERN);
    public static final Block WIDE_ASH_SAPLING = registerBlock("ash_sapling_wide",
            new SaplingBlock(new WideAshSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.THE_CAVERN);



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(DarkDeep.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(DarkDeep.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        DarkDeep.LOGGER.debug("Registering ModBlocks for " + DarkDeep.MOD_ID);
    }
}
