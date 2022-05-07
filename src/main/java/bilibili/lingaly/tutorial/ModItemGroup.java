package bilibili.lingaly.tutorial;

import bilibili.lingaly.fabricmodregister.ModRegister;
import bilibili.lingaly.tutorial.item.ModItems;
import net.minecraft.item.ItemGroup;

public class ModItemGroup {

    /*public static final ItemGroup TUTORIAL = FabricItemGroupBuilder.build(new Identifier(Tutorial.MOD_ID,
                    "tutorial"),
            () -> new ItemStack(ModItems.TUTORIAL_INGOT));*/
    public static final ItemGroup TUTORIAL = ModRegister.registerItemGroup(Tutorial.MOD_ID,
            "tutorial",
            ModItems.TUTORIAL_INGOT);

}
