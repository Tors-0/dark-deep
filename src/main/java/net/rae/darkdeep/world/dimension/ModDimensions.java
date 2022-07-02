package net.rae.darkdeep.world.dimension;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.rae.darkdeep.DarkDeep;
import net.rae.darkdeep.item.ModItems;

public class ModDimensions {
    public static final RegistryKey<World> DDDIM_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(DarkDeep.MOD_ID, "dddim"));
    public static final RegistryKey<DimensionType> DDDIM_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            DDDIM_DIMENSION_KEY.getValue());


    public static void register() {
        DarkDeep.LOGGER.debug("Registering ModDimensions for " + DarkDeep.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.REINFORCED_DEEPSLATE)
                .destDimID(DDDIM_DIMENSION_KEY.getValue())
                .tintColor(3, 64, 79)
                .lightWithItem(ModItems.THE_CAVERN)
                .onlyLightInOverworld()
                .forcedSize(20, 6)
                .registerPortal();
    }
}
