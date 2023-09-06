package morph.avaritia.compat.thaumcraft;

import morph.avaritia.Avaritia;
import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.items.ItemsTC;

public class CompatThaumcraftRecipes {

    public static Aspect ULTRA_DEATH;
    
    public static void initThaumcraftRecipe(){
        ULTRA_DEATH = new Aspect("terminus", 0xb90000, new Aspect[] { Aspect.DESIRE, Aspect.ELDRITCH }, new ResourceLocation("avaritia", "textures/misc/terminus.png"), 771);

        ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation(Avaritia.MOD_ID, "big_pearl"), new InfusionRecipe(
                "BIG_PEARL",
                new ItemStack(ModItems.extremely_primordial_pearl),
                12,
                new AspectList().add(Aspect.AIR, 250).add(Aspect.FIRE, 250).add(Aspect.WATER, 250).add(Aspect.EARTH, 250).add(Aspect.ORDER, 250).add(Aspect.ENTROPY, 250).add(Aspect.MAGIC, 250).add(Aspect.ELDRITCH, 250).add(ULTRA_DEATH, 125),
                new ItemStack(ItemsTC.primordialPearl),
                new ItemStack(ItemsTC.primordialPearl),
                new ItemStack(ItemsTC.primordialPearl),
                new ItemStack(ItemsTC.primordialPearl),
                new ItemStack(ItemsTC.primordialPearl),
                new ItemStack(ItemsTC.primordialPearl),
                new ItemStack(ItemsTC.primordialPearl),
                new ItemStack(ItemsTC.primordialPearl)
        ));

        ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation(Avaritia.MOD_ID, "akashic_record"), new InfusionRecipe(
                "AKASHIC_RECORD",
                new ItemStack(ModItems.akashic_record),
                12,
                new AspectList().add(Aspect.MIND, 250).add(Aspect.MAGIC, 250).add(ULTRA_DEATH, 125),
                new ItemStack(ItemsTC.curio, 1, 4),
                "ingotInfinity",
                "ingotInfinity",
                "ingotInfinity",
                "ingotInfinity"
        ));
    }
}
