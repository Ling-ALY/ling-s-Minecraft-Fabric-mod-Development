package bilibili.lingaly.tutorial.item.advanced;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FoodaTip extends Item {

    public FoodaTip(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasAltDown()){
            tooltip.add(new TranslatableText("item.fooda.tip.alt"));
        } else if (Screen.hasShiftDown()){
            tooltip.add(new TranslatableText("item.fooda.tip.shift"));
        } else if (Screen.hasControlDown()){
            tooltip.add(new TranslatableText("item.fooda.tip.ctrl"));
        } else {
            tooltip.add(new TranslatableText("item.fooda.tip"));
        }
    }
}
