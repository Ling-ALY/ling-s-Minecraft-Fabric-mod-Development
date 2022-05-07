package bilibili.lingaly.tutorial.block.advanced;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WeakBlock extends Block {

    public WeakBlock(Settings settings) {
        super(settings);
    }

    /*
    尽管onuse已经被标记为弃用(即在将来的版本可能会无法使用)，但是我现在不得不用它
     */
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient()) {
            if (hand == Hand.MAIN_HAND) {
                player.sendMessage(new LiteralText("Client, mainhand"), false);
            } else {
                player.sendMessage(new LiteralText("Client, offhand"), false);
            }
        } else {
            if (hand == Hand.MAIN_HAND) {
                player.sendMessage(new LiteralText("Server, mainhand"), false);
            }
            if (hand == Hand.OFF_HAND) {
                player.sendMessage(new LiteralText("Server, offhand"), false);
            }
        }

        return ActionResult.SUCCESS;
    }

    /*
                玩家站上去后持续获得持续1分钟的虚弱效果
                 */
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = ((LivingEntity) entity);
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 1200));
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
