package bilibili.lingaly.tutorial;


import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {

    public static class Blocks{

        public static Tag<Block> valuableBlock = createBlockTagKey("valuableblock");

        public static Tag<Block> createBlockTagKey(String name){
            return TagRegistry.block(new Identifier(Tutorial.MOD_ID,
                    name));
        }

    }

    public static class Items{

        public static Tag<Item> createItemTagKey(String name){
            return TagRegistry.item(new Identifier(Tutorial.MOD_ID,
                    name));
        }

    }

}
