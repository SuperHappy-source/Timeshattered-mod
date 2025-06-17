package net.Super.Timeshattered.item;

import net.Super.Timeshattered.TimeShattered;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {



    public static final Item FRACTAL_CORE = RegisterItem("fractal_core",
            new Item(new FabricItemSettings().group(ModItemGroup.FRACTAL)));
    //used to craft fractal items.
    public static final Item FRACTAL_PIECE = RegisterItem("fractal_piece",
            new Item(new FabricItemSettings().group(ModItemGroup.FRACTAL)));

    public static final Item FRACTAL_NOISE = RegisterItem("fractal_noise",
            new Item(new FabricItemSettings().group(ModItemGroup.FRACTAL)));

    public static final Item FRACTAL_FOOT = RegisterItem("fractal_foot",
            new Item(new FabricItemSettings().group(ModItemGroup.FRACTAL)));

    public static final Item FRACTAL_NETHERITE = RegisterItem("fractal_netherite",
            new Item(new FabricItemSettings().group(ModItemGroup.FRACTAL)));

    public static final Item FRACTAL_ROSE = RegisterItem("fractal_rose",
            new Item(new FabricItemSettings().group(ModItemGroup.FRACTAL)));

    public static final Item FRACTAL_FLOWER = RegisterItem("fractal_flower",
            new Item(new FabricItemSettings().group(ModItemGroup.FRACTAL)));

    public static final Item FRACTAL_MEMBRANE = RegisterItem("fractal_membrane",
            new Item(new FabricItemSettings().group(ModItemGroup.FRACTAL)));

    public static final Item UNFIRED_PICKAXE_MOLD = RegisterItem("unfired_pickaxe_mold",
            new Item(new FabricItemSettings().group(ModItemGroup.FORGING)));

    public static final Item PICKAXE_MOLD = RegisterItem("pickaxe_mold",
            new Item(new FabricItemSettings().group(ModItemGroup.FORGING)));


    public static final Item MOLTEN_IRON_FILLED_PICKAXE_MOLD = RegisterItem("molten_iron_filled_pickaxe_mold",
            new Item(new FabricItemSettings().group(ModItemGroup.FORGING)));

    public static final Item IRON_FILLED_PICKAXE_MOLD = RegisterItem("iron_filled_pickaxe_mold",
            new Item(new FabricItemSettings().group(ModItemGroup.FORGING)));

    public static final Item IRON_PICKAXE_HEAD = RegisterItem("iron_pickaxe_head",
            new Item(new FabricItemSettings().group(ModItemGroup.FORGING)));

    public static final Item TEST_WEAPON = RegisterItem("test_weapon", //this is used for testing.
            new SwordItem(ModToolMaterial.FRACTAL, 12, -3f, new FabricItemSettings().group(ModItemGroup.FRACTAL)));


    //enders scythe.
    public static final Item ENDER_SCYTHE = RegisterItem("ender_scythe",
            new SwordItem(ModToolMaterial.FRACTAL, 12, -3f,
                    new FabricItemSettings().group(ModItemGroup.FRACTAL)));
    //nightmares scythe
    public static final Item NIGHTMARE_SCYTHE = RegisterItem("nightmare_scythe",
            new SwordItem(ModToolMaterial.FRACTAL, 6, -1f,
                    new FabricItemSettings().group(ModItemGroup.FRACTAL)));



    private static Item RegisterItem(String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(TimeShattered.MOD_ID, name), item);
    }



    public static void registerModItems() {
        TimeShattered.LOGGER.debug("Register Mod Items for" + TimeShattered.MOD_ID);
    }
}
//