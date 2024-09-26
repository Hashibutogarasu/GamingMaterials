package karasu_lab.gaming_materials;

import karasu_lab.gaming_materials.blocks.ModBlocks;
import karasu_lab.gaming_materials.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GamingMaterials implements ModInitializer {
	public static final String MOD_ID = "gaming_materials";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.register();
		ModItems.register();
	}
}
