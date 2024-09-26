package karasu_lab.gaming_materials.items;

import karasu_lab.gaming_materials.blocks.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static karasu_lab.gaming_materials.GamingMaterials.MOD_ID;

public class ModItems {
    public static Item GAMING_DIRT_BLOCK_ITEM;
    public static Item GAMING_COBBLESTONE_BLOCK_ITEM;
    public static Item GAMING_STONE_BLOCK_ITEM;

    public static Item GAMING_MATERIAL;

    public static void register(){
        GAMING_DIRT_BLOCK_ITEM = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "gaming_dirt"), new BlockItem(ModBlocks.GAMING_DIRT, new Item.Settings()));
        GAMING_COBBLESTONE_BLOCK_ITEM = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "gaming_cobblestone"), new BlockItem(ModBlocks.GAMING_COBBLESTONE, new Item.Settings()));
        GAMING_STONE_BLOCK_ITEM = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "gaming_stone"), new BlockItem(ModBlocks.GAMING_STONE, new Item.Settings()));

        GAMING_MATERIAL = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "gaming_material"), new Item(new Item.Settings()));
    }
}
