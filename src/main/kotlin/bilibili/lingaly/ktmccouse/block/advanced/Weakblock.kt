package bilibili.lingaly.ktmccouse.block.advanced

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.text.LiteralText
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

class Weakblock(settings: Settings?) : Block(settings) {

    override fun onUse(
        state: BlockState?,
        world: World?,
        pos: BlockPos?,
        player: PlayerEntity?,
        hand: Hand?,
        hit: BlockHitResult?
    ): ActionResult {
        if (
            world!!
                .isClient()
        ) {
            if (
                hand == Hand
                    .MAIN_HAND
            ) {
                player!!
                    .sendMessage(
                        LiteralText(
                            "Client, mainhand"
                        ),
                        false
                    )
            } else {
                player!!
                    .sendMessage(
                        LiteralText(
                            "Client, offhand"
                        ),
                        false
                    )
            }
        } else {
            if (
                hand == Hand.MAIN_HAND
            ) {
                player!!
                    .sendMessage(
                        LiteralText(
                            "Server, mainhand"
                        ),
                        false
                    )
            } else {
                player!!
                    .sendMessage(
                        LiteralText(
                            "Server, offhand"
                        ),
                        false
                    )
            }
        }

        return ActionResult.SUCCESS
    }

    override fun onSteppedOn(
        world: World?,
        pos: BlockPos?,
        state: BlockState?,
        entity: Entity?
    ) {
        if (
            !world!!
                .isClient()
        ) {
            if (
                entity is LivingEntity
            ) {
                val livingEntity = entity
                livingEntity
                    .addStatusEffect(
                        StatusEffectInstance(
                            StatusEffects
                                .WEAKNESS,
                            1200
                        )
                    )
            }
        }

        super.onSteppedOn(
            world,
            pos,
            state,
            entity
        )
    }

}