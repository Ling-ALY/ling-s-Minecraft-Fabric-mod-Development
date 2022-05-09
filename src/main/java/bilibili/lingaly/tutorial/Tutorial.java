package bilibili.lingaly.tutorial;

import bilibili.lingaly.tutorial.block.ModBlocks;
import bilibili.lingaly.tutorial.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class Tutorial implements ModInitializer {

    public static String MOD_ID = "tutorial";

    @Override
    public void onInitialize() {
        ModItems.ModItemRegister();
        ModBlocks.ModBlockRegister();
        ModRegister.modRegister();
    }
}
