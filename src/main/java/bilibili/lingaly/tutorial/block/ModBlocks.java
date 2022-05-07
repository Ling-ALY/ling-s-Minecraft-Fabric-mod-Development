package bilibili.lingaly.tutorial.block;

import bilibili.lingaly.fabricmodregister.ModRegister;
import bilibili.lingaly.tutorial.ModItemGroups;
import bilibili.lingaly.tutorial.Tutorial;
import bilibili.lingaly.tutorial.block.advanced.WeakBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.material.Material;

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

    public static Block WEAK_BLOCK= ModRegister.registerBlock(Tutorial.MOD_ID,
            "weak_block",
            new WeakBlock(FabricBlockSettings.of(Material.METAL).strength(1f)),
            ModItemGroups.TUTORIAL);

    public static Block TUTORIAL_STAIR = registerBlock("tutorial_stair",
            new StairBlock(ModBlocks.TUTORIAL_BLOCK.defaultBlockState(),
                    FabricBlockSettings.of(Material.METAL)
                    .strength(4f)
                    .requiresTool()),
            ModItemGroups.TUTORIAL);

    private static Block registerBlock(String name, Block block, CreativeModeTab itemGroup){
        registerBlockItem(name, block, itemGroup);
        return Registry.register(Registry.BLOCK, new ResourceLocation(Tutorial.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, CreativeModeTab itemGroup){
        return Registry.register(Registry.ITEM, new ResourceLocation(Tutorial.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(itemGroup)));
    }

    public static void ModBlockRegister(){}

}
