package bilibili.lingaly.ktmccouse

import bilibili.lingaly.ktmccouse.items.ModItems
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier

object ModItemGroups {

    val TIN: ItemGroup = FabricItemGroupBuilder.build(
        Identifier(
            Couse.MOD_ID,
            "tin"
        )
    ) {
        ItemStack(ModItems.TIN_INGOT)
    }

}