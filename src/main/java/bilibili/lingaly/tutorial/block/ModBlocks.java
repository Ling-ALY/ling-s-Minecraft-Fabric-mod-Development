package bilibili.lingaly.tutorial.block;

import bilibili.lingaly.tutorial.ModItemGroups;
import bilibili.lingaly.tutorial.Tutorial;
import bilibili.lingaly.tutorial.block.advanced.WeakBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static Block TUTORIAL_BLOCK = registerBlock("tutorial_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5f).requiresTool()),
            ModItemGroups.TUTORIAL);
    public static Block TUTORIAL_ORE = registerBlock("tutorial_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()),
            ModItemGroups.TUTORIAL);
    public static Block DEEPSLATE_TUTORIAL_ORE = registerBlock("deepslate_tutorial_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()),
            ModItemGroups.TUTORIAL);
    public static Block RAW_TUTORIAL_BLOCK = registerBlock("raw_tutorial_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5f).requiresTool()),
            ModItemGroups.TUTORIAL);

    public static Block WEAK_BLOCK= registerBlock("tutorial_block",
            new WeakBlock(FabricBlockSettings.of(Material.METAL).strength(1f)),
            ModItemGroups.TUTORIAL);

    public static Block TUTORIAL_STAIR = registerBlock("tutorial_stair",
            new StairsBlock(ModBlocks.TUTORIAL_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL)
                    .strength(4f)),
            ModItemGroups.TUTORIAL);

    public static Block TUTORIAL_SLAB = registerBlock("tutorial_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL)
                            .strength(4f)),
            ModItemGroups.TUTORIAL);

    private static Block registerBlock(String name, Block block, ItemGroup itemGroup){
        registerBlockItem(name, block, itemGroup);
        return Registry.register(Registry.BLOCK, new Identifier(Tutorial.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup itemGroup){
        return Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(itemGroup)));
    }

    public static void ModBlockRegister(){}

}
