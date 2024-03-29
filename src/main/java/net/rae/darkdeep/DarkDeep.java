package net.rae.darkdeep;

import net.fabricmc.api.ModInitializer;
import net.rae.darkdeep.block.ModBlocks;
import net.rae.darkdeep.item.ModItems;
import net.rae.darkdeep.util.ModRegistries;
import net.rae.darkdeep.world.dimension.ModDimensions;
import net.rae.darkdeep.world.feature.ModConfiguredFeatures;
import net.rae.darkdeep.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// very important comment
public class DarkDeep implements ModInitializer {
	public static final String MOD_ID = "darkdeep";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		ModWorldGen.generateModWorldGen();

		ModDimensions.register();
	}
}
