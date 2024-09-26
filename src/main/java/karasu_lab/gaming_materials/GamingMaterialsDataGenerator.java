package karasu_lab.gaming_materials;

import karasu_lab.gaming_materials.data.ModLootTableProvider;
import karasu_lab.gaming_materials.data.ModModelProvider;
import karasu_lab.gaming_materials.data.ModTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class GamingMaterialsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
	}
}
