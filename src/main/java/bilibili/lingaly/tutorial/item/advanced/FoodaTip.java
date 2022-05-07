package bilibili.lingaly.tutorial.item.advanced;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class FoodaTip extends Item {

    public FoodaTip(FabricItemSettings settings) {
        super(settings);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        if (Screen.hasAltDown()) {
            list.add(new TranslatableComponent("item.fooda.tip.alt"));
        } else if (Screen.hasShiftDown()) {
            list.add(new TranslatableComponent("item.fooda.tip.shift"));
        } else if (Screen.hasControlDown()) {
            list.add(new TranslatableComponent("item.fooda.tip.ctrl"));
        } else {
            list.add(new TranslatableComponent("item.fooda.tip"));
        }
    }

}
