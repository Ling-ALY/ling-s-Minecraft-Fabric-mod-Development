package bilibili.lingaly.tutorial;

import bilibili.lingaly.tutorial.item.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {

    public static final CreativeModeTab TUTORIAL = FabricItemGroupBuilder.build(new ResourceLocation(Tutorial.MOD_ID,
                    "tutorial"),
            () -> new ItemStack(ModItems.TUTORIAL_INGOT));

}
