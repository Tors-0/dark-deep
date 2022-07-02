package net.rae.darkdeep.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rae.darkdeep.DarkDeep;

public class ModItems {

    public static final Item ECHO_IGNITER = registerItem("echo_igniter",
            new Item(new FabricItemSettings().group(ModItemGroup.THE_CAVERN).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DarkDeep.MOD_ID, name), item);
    }
    public static void registerModItems() {
        DarkDeep.LOGGER.debug("Registering Mod Items for " + DarkDeep.MOD_ID);
    }
}
