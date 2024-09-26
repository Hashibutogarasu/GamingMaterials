package karasu_lab.gaming_materials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static karasu_lab.gaming_materials.GamingMaterials.MOD_ID;

public class ModBlocks {
    public static Block GAMING_DIRT;
    public static Block GAMING_STONE;
    public static Block GAMING_COBBLESTONE;

    public static void register() {
        GAMING_DIRT = Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, "gaming_dirt"), new Block(Block.Settings.copy(Blocks.DIRT)));
        GAMING_STONE = Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, "gaming_stone"), new Block(Block.Settings.copy(Blocks.STONE)));
        GAMING_COBBLESTONE = Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, "gaming_cobblestone"), new Block(Block.Settings.copy(Blocks.COBBLESTONE)));
    }
}
