package net.rae.darkdeep.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rae.darkdeep.DarkDeep;
import net.rae.darkdeep.item.ModItemGroup;

public class ModBlocks {
    public static final Block COMPRESSED_DEEPSLATE = registerBlock("compressed_deepslate",
            new Block(FabricBlockSettings.of(Material.STONE).strength(8f).requiresTool()), ModItemGroup.THE_CAVERN);

    public static final Block SCULKED_LOG = registerBlock("sculked_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4.5f).requiresTool()), ModItemGroup.THE_CAVERN);
    public static final Block SCULKED_WOOD = registerBlock("sculked_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4.5f).requiresTool()), ModItemGroup.THE_CAVERN);
    public static final Block STRIPPED_SCULKED_LOG = registerBlock("stripped_sculked_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(4.5f).requiresTool()), ModItemGroup.THE_CAVERN);
    public static final Block STRIPPED_SCULKED_WOOD = registerBlock("stripped_sculked_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4.5f).requiresTool()), ModItemGroup.THE_CAVERN);
    public static final Block ASH_LOG = registerBlock("ash_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4f).requiresTool()), ModItemGroup.THE_CAVERN);
    public static final Block ASH_WOOD = registerBlock("ash_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4f).requiresTool()), ModItemGroup.THE_CAVERN);
    public static final Block STRIPPED_ASH_LOG = registerBlock("stripped_ash_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(4f).requiresTool()), ModItemGroup.THE_CAVERN);
    public static final Block STRIPPED_ASH_WOOD = registerBlock("stripped_ash_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4f).requiresTool()), ModItemGroup.THE_CAVERN);

    public static final Block SCULKED_PLANKS = registerBlock("sculked_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(4f).requiresTool()), ModItemGroup.THE_CAVERN);
    public static final Block ASH_PLANKS = registerBlock("ash_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(4f).requiresTool()), ModItemGroup.THE_CAVERN);


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
