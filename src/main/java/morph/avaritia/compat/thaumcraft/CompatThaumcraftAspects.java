package morph.avaritia.compat.thaumcraft;

import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

import static morph.avaritia.compat.thaumcraft.CompatThaumcraftRecipes.ULTRA_DEATH;

public class CompatThaumcraftAspects {

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void onAspectRegistryEvent(AspectRegistryEvent event)
    {
        registerAspects(event.register);
    }


    public static void registerAspects(AspectEventProxy register) {
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.resource, 1, 1), new AspectList().add(ULTRA_DEATH, 1).add(Aspect.ENERGY, 8).add(Aspect.CRYSTAL, 32));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.resource, 1, 4), new AspectList().add(ULTRA_DEATH, 2).add(Aspect.METAL, 12).add(Aspect.ENERGY, 12));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.resource, 1, 5), new AspectList().add(ULTRA_DEATH, 5).add(Aspect.EXCHANGE, 12));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.resource, 1, 6), new AspectList().add(ULTRA_DEATH, 16).add(Aspect.ELDRITCH, 64));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModBlocks.neutron_collector), new AspectList().add(ULTRA_DEATH, 5).add(Aspect.METAL, 64).add(Aspect.ENERGY, 64).add(Aspect.MECHANISM, 64));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.singularity, 1, 0), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.METAL, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.singularity, 1, 1), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.METAL, 100).add(Aspect.DESIRE, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.singularity, 1, 2), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.SENSES, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.singularity, 1, 3), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.MECHANISM, 100).add(Aspect.ENERGY, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.singularity, 1, 4), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.CRYSTAL, 100).add(Aspect.ORDER, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.singularity, 1, 5), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.METAL, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.singularity, 1, 6), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.METAL, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.singularity, 1, 7), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.METAL, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.singularity, 1, 8), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.METAL, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(ModItems.infinity_sword), new AspectList().add(ULTRA_DEATH, 60).add(Aspect.AVERSION, 999).add(Aspect.DEATH, 999).add(Aspect.ELDRITCH, 100));
        ThaumcraftApi.registerComplexObjectTag(new ItemStack(ModItems.skull_sword), new AspectList().add(ULTRA_DEATH, 1).add(Aspect.FIRE, 2).add(Aspect.CRYSTAL, 16).add(Aspect.DEATH, 4));
    }

}
