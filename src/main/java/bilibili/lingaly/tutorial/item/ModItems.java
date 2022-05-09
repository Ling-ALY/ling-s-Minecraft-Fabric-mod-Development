package bilibili.lingaly.tutorial.item;

import bilibili.lingaly.tutorial.ModItemGroups;
import bilibili.lingaly.tutorial.Tutorial;
import bilibili.lingaly.tutorial.item.advanced.FoodaTip;
import bilibili.lingaly.tutorial.item.advanced.Probe;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static Item TUTORIAL_INGOT = registerItem("tutorial_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.TUTORIAL)));
    public static Item TUTORIAL_NUGGET = registerItem("tutorial_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.TUTORIAL)));
    public static Item RAW_TUTORIAL = registerItem("raw_tutorial",
            new Item(new FabricItemSettings().group(ModItemGroups.TUTORIAL)));

    public static Item FOODA = registerItem("fooda",
            new FoodaTip(new FabricItemSettings()
                    .group(ModItemGroups.TUTORIAL)
                    .food(ModFoodComponent.fooda)));
    public static Item PROBE = registerItem("probe",
            new Probe(new FabricItemSettings()
                    .group(ModItemGroups.TUTORIAL)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM , new Identifier(Tutorial.MOD_ID , name), item);
    }

    public static void ModItemRegister(){}

}
