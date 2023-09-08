package morph.avaritia.compat.thaumcraft;

import morph.avaritia.Avaritia;
import morph.avaritia.compat.Compat;
import morph.avaritia.init.LudicrousBlocks;
import morph.avaritia.init.LudicrousItems;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.items.ItemsTC;

import static morph.avaritia.init.LudicrousItems.registerItem;

public class Lucrum {

    public static Aspect ULTRA_DEATH;

    public static void preInit() throws Compat.ItemNotFoundException {
        ULTRA_DEATH = new Aspect("terminus", 0xb90000, new Aspect[] { Aspect.DESIRE, Aspect.ELDRITCH }, new ResourceLocation("avaritia", "textures/misc/terminus.png"), 771);

        LudicrousItems.akashic_record = registerItem(new ItemAkashicRecord());
        LudicrousItems.extremely_primordial_pearl = registerItem(new ItemBigPearl());
    }

    public static void init() throws Compat.ItemNotFoundException {
        ThaumcraftApi.addInfusionCraftingRecipe(new ResourceLocation(Avaritia.MOD_ID, "big_pearl"), new InfusionRecipe(
                "BIG_PEARL",
                new ItemStack(LudicrousItems.extremely_primordial_pearl),
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
                new ItemStack(LudicrousItems.akashic_record),
                12,
                new AspectList().add(Aspect.MIND, 250).add(Aspect.MAGIC, 250).add(ULTRA_DEATH, 125),
                new ItemStack(ItemsTC.curio, 1, 4),
                "ingotInfinity",
                "ingotInfinity",
                "ingotInfinity",
                "ingotInfinity"
        ));

        ThaumcraftApi.registerResearchLocation(new ResourceLocation(Avaritia.MOD_ID, "research/research.json"));
    }

    public static void postInit() throws Compat.ItemNotFoundException {
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousItems.resource, 1, 1), new AspectList().add(ULTRA_DEATH, 1).add(Aspect.ENERGY, 8).add(Aspect.CRYSTAL, 32));
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousItems.resource, 1, 4), new AspectList().add(ULTRA_DEATH, 2).add(Aspect.METAL, 12).add(Aspect.ENERGY, 12));
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousItems.resource, 1, 5), new AspectList().add(ULTRA_DEATH, 5).add(Aspect.EXCHANGE, 12));
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousItems.resource, 1, 6), new AspectList().add(ULTRA_DEATH, 16).add(Aspect.ELDRITCH, 64));
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousBlocks.neutron_collector), new AspectList().add(ULTRA_DEATH, 5).add(Aspect.METAL, 64).add(Aspect.ENERGY, 64).add(Aspect.MECHANISM, 64));
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousItems.singularity, 1, 0), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.METAL, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousItems.singularity, 1, 1), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.METAL, 100).add(Aspect.DESIRE, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousItems.singularity, 1, 2), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.SENSES, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousItems.singularity, 1, 3), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.MECHANISM, 100).add(Aspect.ENERGY, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousItems.singularity, 1, 4), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.CRYSTAL, 100).add(Aspect.ORDER, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousItems.singularity, 1, 5), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.METAL, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousItems.singularity, 1, 6), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.METAL, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousItems.singularity, 1, 7), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.METAL, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousItems.singularity, 1, 8), new AspectList().add(ULTRA_DEATH, 3).add(Aspect.METAL, 100));
        ThaumcraftApi.registerObjectTag(new ItemStack(LudicrousItems.infinity_sword), new AspectList().add(ULTRA_DEATH, 60).add(Aspect.AVERSION, 999).add(Aspect.DEATH, 999).add(Aspect.ELDRITCH, 100));
        ThaumcraftApi.registerComplexObjectTag(new ItemStack(LudicrousItems.skull_sword), new AspectList().add(ULTRA_DEATH, 1).add(Aspect.FIRE, 2).add(Aspect.CRYSTAL, 16).add(Aspect.DEATH, 4));

    }
}
