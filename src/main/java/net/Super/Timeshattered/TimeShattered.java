package net.Super.Timeshattered;

import net.Super.Timeshattered.block.ModBlocks;
import net.Super.Timeshattered.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeShattered implements ModInitializer {
	public static final String MOD_ID = "timeshattered";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
