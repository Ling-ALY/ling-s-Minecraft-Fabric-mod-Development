package bilibili.lingaly.tutorial;

import bilibili.lingaly.fabricmodregister.JsonCreater;
import bilibili.lingaly.tutorial.block.ModBlocks;
import bilibili.lingaly.tutorial.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class Tutorial implements ModInitializer {

    public static String MOD_ID = "tutorial";

    public static void main(String[] args) {
        JsonCreater.createItemJson(MOD_ID, "fooda", "食物a");
        JsonCreater.createBlockJson(MOD_ID, "tutorial_block", "教程块");
    }

    @Override
    public void onInitialize() {
        ModItems.ModItemRegister();
        ModBlocks.ModBlockRegister();
        ModRegister.modRegister();
    }
}
