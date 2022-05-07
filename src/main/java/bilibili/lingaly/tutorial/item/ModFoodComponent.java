package bilibili.lingaly.tutorial.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponent {

    public static FoodComponent fooda = new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1000),
                    1.0f)
            .alwaysEdible()
            .build();

}
