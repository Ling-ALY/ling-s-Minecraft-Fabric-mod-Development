package bilibili.lingaly.ktmccouse

import bilibili.lingaly.ktmccouse.block.ModBlocks
import bilibili.lingaly.ktmccouse.items.ModItems
import net.fabricmc.api.ModInitializer

object Couse: ModInitializer {
    public const val MOD_ID = "ktmccouse"

    override fun onInitialize() {
        ModItems.modItemRegister()
        ModBlocks.modBlockRegister()
        ModRegister.modRegister()
    }
}