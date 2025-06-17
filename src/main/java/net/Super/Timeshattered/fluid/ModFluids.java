package net.Super.Timeshattered.fluid;

import net.Super.Timeshattered.TimeShattered;
import net.Super.Timeshattered.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFluids {
    public static FlowableFluid STILL_MOLTEN_IRON;
    public static FlowableFluid FLOWING_MOLTEN_IRON;
    public static Block MOLTEN_IRON_BLOCK;

    public static Item MOLTEN_IRON_BUCKET;

    public static void register() {
        STILL_MOLTEN_IRON = Registry.register(Registry.FLUID,
                new Identifier(TimeShattered.MOD_ID, "still_molten_iron"), new MoltenIron.Still());
        FLOWING_MOLTEN_IRON = Registry.register(Registry.FLUID,
                new Identifier(TimeShattered.MOD_ID, "flowing_molten_iron"), new MoltenIron.Flowing());

        MOLTEN_IRON_BLOCK = Registry.register(Registry.BLOCK, new Identifier(TimeShattered.MOD_ID, "molten_iron_block"),
                new FluidBlock(ModFluids.STILL_MOLTEN_IRON, FabricBlockSettings.copyOf(Blocks.WATER)){ });


        MOLTEN_IRON_BUCKET = Registry.register(Registry.ITEM, new Identifier(TimeShattered.MOD_ID, "molten_iron_bucket"),
                new BucketItem(ModFluids.STILL_MOLTEN_IRON, new FabricItemSettings().group(ModItemGroup.FORGING).recipeRemainder(Items.BUCKET).maxCount(1)));

    }

}
