package bilibili.lingaly.ktmccouse.items

import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.item.FoodComponent

object ModFoodComponent {

    val fooda: FoodComponent = FoodComponent
        .Builder()
        .hunger(6)
        .saturationModifier(0.8f)
        .statusEffect(
            StatusEffectInstance(
                StatusEffects.LUCK,
                1000
            ),
            1.0f
        )
        .alwaysEdible()
        .build()

}