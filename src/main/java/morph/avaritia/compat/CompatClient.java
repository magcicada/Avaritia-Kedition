package morph.avaritia.compat;

import morph.avaritia.compat.botania.MiscellaneousIcons;
import morph.avaritia.compat.botania.RenderTileInfinitato;
import morph.avaritia.compat.botania.TileInfinitato;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import vazkii.botania.api.BotaniaAPIClient;

import static morph.avaritia.init.LudicrousBlocks.infinitato;

public class CompatClient {

	public static void earlyComprettify() {
		if (Compat.botan) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(infinitato), 0, new ModelResourceLocation(infinitato.getRegistryName(), "facing=north"));
			BotaniaAPIClient.registerSubtileModel("asgardandelion", new ModelResourceLocation("botania:" + "asgardandelion"));
			MinecraftForge.EVENT_BUS.register(MiscellaneousIcons.INSTANCE);
		}
	}

	public static void comprettify() {
		if (Compat.botan) {
			ClientRegistry.bindTileEntitySpecialRenderer(TileInfinitato.class, new RenderTileInfinitato());
		}
	}

	public static void lateComprettify() {
	}
}
