package bilibili.lingaly.ktmccouse.items

import bilibili.lingaly.ktmccouse.Couse
import bilibili.lingaly.ktmccouse.ModItemGroups
import bilibili.lingaly.ktmccouse.items.advanced.FoodaTip
import bilibili.lingaly.ktmccouse.items.advanced.Probe
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import bilibili.lingaly.easyfabricregisterlib.EFRLModRegister

object ModItems {

    private const val MOD_ID = Couse
        .MOD_ID

    val TIN_INGOT: Item = EFRLModRegister
        .registerItem(
        MOD_ID,
        "tin_ingot",
        ModItemGroups
            .TIN
    )

    @Suppress("unused")
    val TIN_NUGGET: Item = EFRLModRegister
        .registerItem(
        MOD_ID,
        "tin_nugget",
        ModItemGroups
            .TIN
    )

    @Suppress("unused")
    val RAW_TIN: Item = EFRLModRegister
        .registerItem(
        MOD_ID,
        "raw_tin",
        ModItemGroups
            .TIN
    )

    @Suppress("unused")
    val FOODA: Item = EFRLModRegister
        .registerItem(
        MOD_ID,
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
    val PROBE: Item = EFRLModRegister
        .registerItem(
            MOD_ID,
            "probe",
            Probe(
                FabricItemSettings()
                    .group(
                        ModItemGroups
                            .TIN
                    )
            )
        )

    fun modItemRegister() {}

}