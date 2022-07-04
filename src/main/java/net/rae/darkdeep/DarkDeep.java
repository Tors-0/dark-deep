package net.rae.darkdeep;

import net.fabricmc.api.ModInitializer;
import net.rae.darkdeep.block.ModBlocks;
import net.rae.darkdeep.item.ModItems;
import net.rae.darkdeep.util.ModRegistries;
import net.rae.darkdeep.world.dimension.ModDimensions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// very important comment
public class DarkDeep implements ModInitializer {
	public static final String MOD_ID = "darkdeep";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModDimensions.register();

		ModRegistries.registerModStuffs();

	}
}
