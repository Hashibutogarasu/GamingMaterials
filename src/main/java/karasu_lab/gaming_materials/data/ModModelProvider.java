package karasu_lab.gaming_materials.data;

import karasu_lab.gaming_materials.blocks.ModBlocks;
import karasu_lab.gaming_materials.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GAMING_DIRT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GAMING_COBBLESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GAMING_STONE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.GAMING_MATERIAL, Models.GENERATED);
    }
}
