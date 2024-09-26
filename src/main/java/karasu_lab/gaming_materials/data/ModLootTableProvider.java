package karasu_lab.gaming_materials.data;

import karasu_lab.gaming_materials.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.GAMING_DIRT);
        addDrop(ModBlocks.GAMING_COBBLESTONE);
        addDrop(ModBlocks.GAMING_STONE);
    }
}
