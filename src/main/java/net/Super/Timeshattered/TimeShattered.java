package net.Super.Timeshattered;

import net.Super.Timeshattered.block.ModBlocks;
import net.Super.Timeshattered.fluid.ModFluids;
import net.Super.Timeshattered.item.ModDiscs;
import net.Super.Timeshattered.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class TimeShattered implements ModInitializer {
	public static final String MOD_ID = "timeshattered";
	public static final String HUNT_MODID = "disc_expansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModDiscs.registerModItems();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModFluids.register();

	}
}
