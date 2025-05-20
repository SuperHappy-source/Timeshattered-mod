package net.Super.Timeshattered.item;

import net.Super.Timeshattered.TimeShattered;
import net.Super.Timeshattered.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FRACTAL = FabricItemGroupBuilder.build(new Identifier(TimeShattered.MOD_ID
    , "fractal"), () -> new ItemStack(ModItems.FRACTAL_CORE));
    public static final ItemGroup NIGHTMARE = FabricItemGroupBuilder.build(new Identifier(TimeShattered.MOD_ID
    , "nightmare"), () -> new ItemStack(ModBlocks.BLOCK_OF_NIGHTMARE_MATTER));
}
