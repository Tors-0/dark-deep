package net.rae.darkdeep.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.rae.darkdeep.DarkDeep;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup THE_CAVERN = FabricItemGroupBuilder.build(
            new Identifier(DarkDeep.MOD_ID, "the_cavern"), () -> new ItemStack(ModItems.THE_CAVERN));
}
