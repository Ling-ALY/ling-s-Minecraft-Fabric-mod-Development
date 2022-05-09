package bilibili.lingaly.ktmccouse.items.advanced

import bilibili.lingaly.ktmccouse.ModTags
import net.minecraft.client.item.TooltipContext
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.ItemUsageContext
import net.minecraft.text.LiteralText
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.ActionResult
import net.minecraft.world.World

class Probe(settings: Settings?) : Item(settings) {

    override fun appendTooltip(
        stack: ItemStack?,
        world: World?,
        tooltip: MutableList<Text>?,
        context: TooltipContext?
    ) {
        tooltip!!
            .add(
                LiteralText(
                    "探测棒"
                )
            )
    }

    override fun useOnBlock(
        context: ItemUsageContext?
    ): ActionResult {
        if (
            context!!
                .world
                .isClient()
        ) {
            val blockPos = context.blockPos
            var found = false

            for (
            i in 0..blockPos
                .y + 64
            ) {
                val blockState = context
                    .world
                    .getBlockState(
                        blockPos
                            .down(
                                i
                            )
                    )
                if (
                    blockState
                        .isIn(
                            ModTags
                                .Blocks
                                .probeValuableBlock
                        )
                ) {
                    found = true
                    break
                }
            }

            val playerEntity: PlayerEntity = context
                .player!!
            if (found) {
                playerEntity
                    .sendMessage(
                        TranslatableText(
                            "item.probe.useonblock",
                            "",
                            "了"
                        ),
                        false
                    )
            } else {
                playerEntity
                    .sendMessage(
                        TranslatableText(
                            "item.probe.useonblock",
                            "没有",
                            ""
                        ),
                        false
                    )
            }

            context
                .stack
                .damage(
                    1,
                    context.player
                )
                { player ->
                    player!!.sendToolBreakStatus(
                        player.activeHand
                    )
                }
        }

        return super
            .useOnBlock(context)
    }

}