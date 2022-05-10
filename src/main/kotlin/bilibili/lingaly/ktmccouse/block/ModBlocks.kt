package bilibili.lingaly.ktmccouse.block

import bilibili.lingaly.easyfabricregisterlib.EFRLModRegister
import bilibili.lingaly.ktmccouse.Couse
import bilibili.lingaly.ktmccouse.ModItemGroups
import bilibili.lingaly.ktmccouse.block.advanced.Weakblock
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Material
import net.minecraft.block.SlabBlock
import net.minecraft.block.StairsBlock

object ModBlocks {

    private const val MOD_ID = Couse.MOD_ID

    val TIN_BLOCK = EFRLModRegister
        .registerBlock(
            MOD_ID,
            "tin_block",
            Material
                .METAL,
            5f,
            true,
            ModItemGroups.TIN
        )

    @Suppress("unused")
    val TIN_ORE = EFRLModRegister
        .registerBlock(
            MOD_ID,
            "tin_ore",
            Material
                .STONE,
            4f,
            true,
            ModItemGroups.TIN
        )

    @Suppress("unused")
    val DEEPSLATE_TIN_ORE = EFRLModRegister
        .registerBlock(
            MOD_ID,
            "deepslate_tin_ore",
            Material
                .STONE,
            6f,
            true,
            ModItemGroups
                .TIN
        )

    @Suppress("unused")
    val RAW_TIN_BLOCK = EFRLModRegister
        .registerBlock(
            MOD_ID,
            "raw_tin_block",
            Material
                .METAL,
            5f,
            true,
            ModItemGroups.TIN
        )

    @Suppress("unused")
    val WEAK_BLOCK = EFRLModRegister
        .registerBlock(
            MOD_ID,
            "weak_block",
            Weakblock(
                FabricBlockSettings
                    .of(
                        Material
                            .METAL
                    )
                    .strength(
                        5f
                    )
            ),
            ModItemGroups
                .TIN
        )

    @Suppress("unused")
    val TIN_STAIR = EFRLModRegister
        .registerBlock(
            MOD_ID,
            "tin_stair",
            StairsBlock(
                TIN_BLOCK
                    .defaultState,
                FabricBlockSettings
                    .of(
                        Material
                            .METAL
                    )
                    .strength(
                        5f
                    )
                ),
            ModItemGroups.TIN
        )

    @Suppress("unused")
    val TIN_SLAB = EFRLModRegister
        .registerBlock(
            MOD_ID,
            "tin_slab",
            SlabBlock(
                FabricBlockSettings
                    .of(
                        Material
                            .METAL
                    )
                    .strength(
                        5f
                    )
            ),
            ModItemGroups
                .TIN
        )

    fun modBlockRegister() {}

}