package bilibili.lingaly.tutorial.item.advanced;

import bilibili.lingaly.tutorial.ModTags;
import bilibili.lingaly.tutorial.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Probe extends Item {

    public Probe(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new LiteralText("探测棒"));
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (context.getWorld().isClient()) {
            BlockPos blockPosition = context.getBlockPos();
            boolean found = false;

            for (int i = 0; i <= blockPosition.getY() + 64; i++) {
                //Block block = context.getWorld().getBlockState(blockPosition.down(i)).getBlock();
                /*if (block == ModBlocks.TUTORIAL_ORE
                        || block == ModBlocks.RAW_TUTORIAL_BLOCK
                        || block == ModBlocks.DEEPSLATE_TUTORIAL_ORE) {
                    found = true;
                    break;
                }

                 */
                BlockState blockState = context.getWorld().getBlockState(blockPosition.down(i));
                if (blockState.isIn(ModTags.Blocks.valuableBlock)){
                    found = true;
                    break;
                }
            }

            PlayerEntity playerEntity = context.getPlayer();
            if (found) {
                playerEntity.sendMessage(new TranslatableText("item.probe.useonblock", "", "了"), false);
            } else {
                playerEntity.sendMessage(new TranslatableText("item.probe.useonblock", "没有", ""), false);
            }


            context.getStack().damage(1,
                    context.getPlayer(),
                    (player) -> player.sendToolBreakStatus(player.getActiveHand()));
        }

        return super.useOnBlock(context);
    }
}
