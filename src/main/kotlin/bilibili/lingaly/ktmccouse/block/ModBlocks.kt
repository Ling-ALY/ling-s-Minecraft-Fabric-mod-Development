package bilibili.lingaly.ktmccouse.block

import bilibili.lingaly.ktmccouse.Couse
import bilibili.lingaly.ktmccouse.ModItemGroups
import bilibili.lingaly.ktmccouse.block.advanced.Weakblock
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.block.SlabBlock
import net.minecraft.block.StairsBlock
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object ModBlocks {

    val TIN_BLOCK = registerBlock(
        "tin_block",
        Block(
            FabricBlockSettings
                .of(
                    Material
                        .METAL
                )
                .strength(
                    5f
                )
                .requiresTool()
        ),
        ModItemGroups.TIN
    )

    @Suppress("unused")
    val TIN_ORE = registerBlock(
        "tin_ore",
        Block(
            FabricBlockSettings
                .of(
                    Material
                        .STONE
                )
                .strength(
                    4f
                )
                .requiresTool()
        ),
        ModItemGroups
            .TIN
    )

    @Suppress("unused")
    val DEEPSLATE_TIN_ORE = registerBlock(
        "deepslate_tin_ore",
        Block(
            FabricBlockSettings
                .of(
                    Material
                        .STONE
                )
                .strength(
                    6f
                )
                .requiresTool()
        ),
        ModItemGroups
            .TIN
    )

    @Suppress("unused")
    val RAW_TIN_BLOCK = registerBlock(
        "raw_tin_block",
        Block(
            FabricBlockSettings
                .of(
                    Material
                        .METAL
                )
                .strength(
                    5f
                )
                .requiresTool()
        ),
        ModItemGroups.TIN
    )

    @Suppress("unused")
    val WEAK_BLOCK = registerBlock(
        "weak_block",
        Weakblock(
            FabricBlockSettings
                .of(
                    Material
                        .METAL
                )
                .strength(1f)
        ),
        ModItemGroups
            .TIN
    )

    @Suppress("unused")
    val TIN_STAIR = registerBlock(
        "tin_stair",
        StairsBlock(
            ModBlocks
                .TIN_BLOCK
                .defaultState,
            FabricBlockSettings
                .of(
                    Material
                        .METAL
                )
                .strength(
                    5f
                ),

        ),
        ModItemGroups.TIN
    )

    @Suppress("unused")
    val TIN_SLAB = registerBlock(
        "tin_slab",
        SlabBlock(
            FabricBlockSettings
                .of(
                    Material
                        .METAL
                )
                .strength(5f)
        ),
        ModItemGroups.TIN
    )

    private fun registerBlock(
        name: String,
        block: Block,
        itemGroup: ItemGroup
    ): Block{
        registerBlockItem(
            name,
            block,
            itemGroup
        )
        return Registry
            .register(
                Registry
                    .BLOCK,
                Identifier(
                    Couse
                        .MOD_ID,
                    name
                ),
                block
            )
    }

    @Suppress("unused")
    private fun registerBlockItem(
        name: String,
        block: Block,
        itemGroup: ItemGroup
    ): Item{
        return Registry
            .register(
                Registry.ITEM,
                Identifier(
                    Couse.MOD_ID,
                    name
                ),
                BlockItem(
                    block,
                    FabricItemSettings()
                        .group(itemGroup)
                )
            )
    }

    fun modBlockRegister() {}

}