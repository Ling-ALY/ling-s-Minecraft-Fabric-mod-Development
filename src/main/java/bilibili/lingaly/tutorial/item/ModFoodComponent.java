package bilibili.lingaly.tutorial.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodComponent {

    public static FoodProperties fooda = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(0.8f)
            .effect(new MobEffectInstance(MobEffects.LUCK, 1000),
                    1.0f)
            .alwaysEat()
            .build();

}
