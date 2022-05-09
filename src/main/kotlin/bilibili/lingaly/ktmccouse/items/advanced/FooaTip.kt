package bilibili.lingaly.ktmccouse.items

import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.world.World

class FoodaTip(settings: Settings?) : Item(settings) {
    override fun appendTooltip(stack: ItemStack, world: World?, tooltip: MutableList<Text>, context: TooltipContext) {
        if (Screen.hasAltDown()) {
            tooltip.add(TranslatableText("item.fooda.tip.alt"))
        } else if (Screen.hasShiftDown()) {
            tooltip.add(TranslatableText("item.fooda.tip.shift"))
        } else if (Screen.hasControlDown()) {
            tooltip.add(TranslatableText("item.fooda.tip.ctrl"))
        } else {
            tooltip.add(TranslatableText("item.fooda.tip"))
        }
    }
}
