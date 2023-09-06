package morph.avaritia.compat.thaumcraft;

import morph.avaritia.Avaritia;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;

public class CompatThaumcraftResearch {
    public static void registerResearch() {
        ThaumcraftApi.registerResearchLocation(new ResourceLocation(Avaritia.MOD_ID, "research/research.json"));
    }
}
