package net.rae.darkdeep.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.rae.darkdeep.DarkDeep;
import net.rae.darkdeep.block.ModBlocks;
import net.rae.darkdeep.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
        registerFlammableBlock();
        registerFuels();
  }

    private  static void registerFuels() {
        DarkDeep.LOGGER.info("Registering Fuels for " + DarkDeep.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.ASH_STICK, 150);
        registry.add(ModBlocks.ASH_PLANKS,300);
        registry.add(ModBlocks.ASH_LOG,300);
        registry.add(ModBlocks.ASH_WOOD,300);
        registry.add(ModBlocks.STRIPPED_ASH_LOG,300);
        registry.add(ModBlocks.STRIPPED_ASH_WOOD,300);
        registry.add(ModBlocks.ASH_FENCE,450);
        registry.add(ModBlocks.ASH_FENCE_GATE,450);
        registry.add(ModBlocks.ASH_BUTTON,200);
        registry.add(ModBlocks.ASH_PRESSURE_PLATE,200);

    }
    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.ASH_LOG, ModBlocks.STRIPPED_ASH_LOG);
        StrippableBlockRegistry.register(ModBlocks.ASH_WOOD, ModBlocks.STRIPPED_ASH_WOOD);
        StrippableBlockRegistry.register(ModBlocks.DREAMWOOD_LOG, ModBlocks.STRIPPED_DREAMWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.DREAMWOOD, ModBlocks.STRIPPED_DREAMWOOD);
    }
    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.ASH_LOG, 5, 5);
        instance.add(ModBlocks.ASH_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_ASH_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_ASH_WOOD, 5, 5);
        instance.add(ModBlocks.ASH_PLANKS, 5, 20);
        instance.add(ModBlocks.ASH_LEAVES, 30, 60);
    }
}
