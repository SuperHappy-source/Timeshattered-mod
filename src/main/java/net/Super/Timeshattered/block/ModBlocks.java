package net.Super.Timeshattered.block;

import net.Super.Timeshattered.TimeShattered;
import net.Super.Timeshattered.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block BLOCK_OF_NIGHTMARE_MATTER = registerBlock("block_of_nightmare_matter",
            new Block(FabricBlockSettings.of(Material.STONE).luminance(1)), ModItemGroup.NIGHTMARE);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TimeShattered.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(TimeShattered.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }




    public static void registerModBlocks() {
        TimeShattered.LOGGER.debug("Registering Modblocks for" + TimeShattered.MOD_ID);
    }
}