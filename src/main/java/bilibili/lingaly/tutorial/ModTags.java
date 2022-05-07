package bilibili.lingaly.tutorial;


import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {

    public static class Blocks{

        public static TagKey<Block> valuableBlock = createBlockTagKey("valuableblock");

        public static TagKey<Block> createBlockTagKey(String name){
            return TagKey.of(Registry.BLOCK_KEY,
                    new Identifier(Tutorial.MOD_ID,
                            name));
        }

    }

    public static class Items{

        public static TagKey<Item> createItemTagKey(String name){
            return TagKey.of(Registry.ITEM_KEY,
                    new Identifier(Tutorial.MOD_ID,
                            name));
        }

    }

}
