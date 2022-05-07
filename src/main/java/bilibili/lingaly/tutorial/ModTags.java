package bilibili.lingaly.tutorial;


import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks{

        public static TagKey<Block> valuableBlock = createBlockTagKey("valuableblock");

        public static TagKey<Block> createBlockTagKey(String name){
            return TagKey.create(Registry.BLOCK_REGISTRY,
                    new ResourceLocation(Tutorial.MOD_ID,
                            name));
        }

    }

    public static class Items{

        public static TagKey<Item> createItemTagKey(String name){
            return TagKey.create(Registry.ITEM_REGISTRY,
                    new ResourceLocation(Tutorial.MOD_ID,
                            name));
        }

    }

}
