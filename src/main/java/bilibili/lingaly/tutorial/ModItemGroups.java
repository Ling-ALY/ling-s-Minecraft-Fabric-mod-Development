package bilibili.lingaly.tutorial;

import bilibili.lingaly.tutorial.item.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    /*public static final ItemGroup TUTORIAL = FabricItemGroupBuilder.build(new Identifier(Tutorial.MOD_ID,
                    "tutorial"),
            () -> new ItemStack(ModItems.TUTORIAL_INGOT));*/
    public static final ItemGroup TUTORIAL = FabricItemGroupBuilder.build(new Identifier(Tutorial.MOD_ID,
                    "tutorial"),
            () -> new ItemStack(ModItems.TUTORIAL_INGOT));

}
