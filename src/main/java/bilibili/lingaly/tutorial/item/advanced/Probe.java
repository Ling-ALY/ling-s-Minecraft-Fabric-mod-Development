package bilibili.lingaly.tutorial.item.advanced;

import bilibili.lingaly.tutorial.ModTags;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class Probe extends Item {

    public Probe(FabricItemSettings settings) {
        super(settings);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(new TextComponent("探测棒"));
    }

    @Override
    public InteractionResult useOn(UseOnContext useOnContext) {
        if (useOnContext.getLevel().isClientSide()){
            BlockPos blockPos = useOnContext.getClickedPos();
            boolean found = false;

            for (int i = 0; i <= blockPos.getY() + 64; i++){
                BlockState blockState = useOnContext.getLevel().getBlockState(BlockPos.ZERO.below(i));
                if (blockState.is(ModTags.Blocks.valuableBlock)){
                    found = true;
                    break;
                }
            }

            Player player = useOnContext.getPlayer();
            if (found){
                player.sendMessage(new TranslatableComponent("item.probe.useonblock", "", "了"), player.getUUID());
            } else {
                player.sendMessage(new TranslatableComponent("item.probe.useonblock", "没有", ""), player.getUUID());
            }

        }


        return super.useOn(useOnContext);
    }
}
