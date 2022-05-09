package bilibili.lingaly.ktmccouse.items

import bilibili.lingaly.ktmccouse.Couse
import bilibili.lingaly.ktmccouse.ModItemGroups
import bilibili.lingaly.ktmccouse.items.advanced.Probe
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object ModItems {

    val TIN_INGOT: Item = registerItem(
        "tin_ingot",
        Item(
            FabricItemSettings()
                .group(
                    ModItemGroups
                        .TIN
                )
        )
    )

    @Suppress("unused")
    val TIN_NUGGET: Item = registerItem(
        "tin_nugget",
        Item(
            FabricItemSettings()
                .group(
                    ModItemGroups
                        .TIN
                )
        )
    )

    @Suppress("unused")
    val RAW_TIN: Item = registerItem(
        "raw_tin",
        Item(
            FabricItemSettings()
                .group(
                    ModItemGroups
                        .TIN
                )
        )
    )

    @Suppress("unused")
    val FOODA: Item = registerItem(
        "fooda",
        FoodaTip(
            FabricItemSettings()
                .group(
                    ModItemGroups
                        .TIN
                )
                .food(
                    ModFoodComponent
                        .fooda
                )
        )
    )

    @Suppress("unused")
    val PROBE: Item = registerItem(
        "probe",
        Probe(
            FabricItemSettings()
                .group(
                    ModItemGroups
                        .TIN
                )
        )
    )

    private fun registerItem(
        name: String,
        item: Item
    ): Item {
        return Registry
            .register(
                Registry
                    .ITEM,
                Identifier(
                    Couse.MOD_ID,
                    name
                ),
                item
            )
    }

    fun modItemRegister() {}

}