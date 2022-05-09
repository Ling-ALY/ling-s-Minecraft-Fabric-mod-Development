package bilibili.lingaly.ktmccouse

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.tag.TagKey
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object ModTags {

    object Blocks{

        val probeValuableBlock: TagKey<Block> = createBlockTagKey("probevaluableblock")

        fun createBlockTagKey(name: String): TagKey<Block>{
            return TagKey.of(
                Registry.BLOCK_KEY,
                Identifier(
                    Couse.MOD_ID,
                    name
                )
            )
        }

    }

    object Items{

        fun createItemTagKey(name: String): TagKey<Item>{
            return TagKey.of(
                Registry.ITEM_KEY,
                Identifier(
                    Couse
                        .MOD_ID,
                    name
                )
            )
        }

    }
}