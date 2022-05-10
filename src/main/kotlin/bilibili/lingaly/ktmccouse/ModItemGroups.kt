package bilibili.lingaly.ktmccouse

import bilibili.lingaly.easyfabricregisterlib.EFRLModRegister
import bilibili.lingaly.ktmccouse.items.ModItems
object ModItemGroups {

    val TIN = EFRLModRegister
        .registerItemGroup(
            Couse
                .MOD_ID,
            "tin",
            ModItems
                .TIN_INGOT
        )

}