package bilibili.lingaly.tutorial;

import bilibili.lingaly.tutorial.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistry {

    public static void modRegistry(){
        registerFuel();
    }

    private static void registerFuel() {
        FuelRegistry fuelRegistry = FuelRegistry.INSTANCE;

        //1秒=20tick，200tick可烧纸一个物品(即10秒)
        fuelRegistry.add(ModItems.PROBE, 100);
    }

}
