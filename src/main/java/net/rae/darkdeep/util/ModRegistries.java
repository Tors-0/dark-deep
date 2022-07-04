package net.rae.darkdeep.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.rae.darkdeep.block.ModBlocks;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
        registerFlammableBlock();
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.ASH_LOG, ModBlocks.STRIPPED_ASH_LOG);
        StrippableBlockRegistry.register(ModBlocks.ASH_WOOD, ModBlocks.STRIPPED_ASH_WOOD);
        StrippableBlockRegistry.register(ModBlocks.SCULKED_LOG, ModBlocks.STRIPPED_SCULKED_LOG);
        StrippableBlockRegistry.register(ModBlocks.SCULKED_WOOD, ModBlocks.STRIPPED_SCULKED_WOOD);
    }
    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.ASH_LOG, 5, 5);
        instance.add(ModBlocks.ASH_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_ASH_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_ASH_WOOD, 5, 5);
        instance.add(ModBlocks.ASH_PLANKS, 5, 20);
    }
}
