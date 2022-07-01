package net.rae.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.rae.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ECHO_IGNITER = FabricItemGroupBuilder.build(
            new Identifier(TutorialMod.MOD_ID, "echo_igniter"), () -> new ItemStack(ModItems.ECHO_IGNITER));
}
