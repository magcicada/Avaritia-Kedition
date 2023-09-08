package morph.avaritia.compat.botania;

import morph.avaritia.compat.Compat;
import morph.avaritia.init.LudicrousItems;
import morph.avaritia.recipe.ExtremeCraftingManager;
import morph.avaritia.recipe.extreme.ExtremeShapedRecipe;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.common.block.ModBlocks;

import static morph.avaritia.init.LudicrousBlocks.*;

public class Tsundere {

    public static void preInit() throws Compat.ItemNotFoundException {

        infinitato = registerBlock(new BlockInfinitato());
        registerItemBlock(infinitato);
        GameRegistry.registerTileEntity(TileInfinitato.class, "avaritia_infinitato");

        BotaniaAPI.registerSubTile("asgardandelion", SubTileAsgardandelion.class);
        BotaniaAPI.registerSubTileSignature(SubTileAsgardandelion.class, new Signature("asgardandelion"));
        BotaniaAPI.addSubTileToCreativeMenu("asgardandelion");
    }

    public static void init() throws Compat.ItemNotFoundException{

        ItemStack cheaty = getFlower("asgardandelion");

        SubTileAsgardandelion.lexicon = new LudicrousLexicon("asgardandelion", BotaniaAPI.categoryGenerationFlowers);
        SubTileAsgardandelion.lexicon.addPage(BotaniaAPI.internalHandler.textPage("avaritia.lexicon.asgardandelion.0"));
        SubTileAsgardandelion.lexicon.setIcon(cheaty);
        ExtremeCraftingManager.addRecipe(cheaty,
                "   III   ",
                "  IIIII  ",
                "  IIXII  ",
                "  IIIII  ",
                "   III   ",
                " nn N nn ",
                "nnnnNnnnn",
                " nn N nn ",
                "    N    ",
                'I', new ItemStack(LudicrousItems.resource, 1, 6),
                'X', new ItemStack(LudicrousItems.resource, 1, 5),
                'N', new ItemStack(LudicrousItems.resource, 1, 4),
                'n', new ItemStack(LudicrousItems.resource, 1, 3));

        Block potato = ModBlocks.tinyPotato;

        ExtremeCraftingManager.addRecipe(new ItemStack(infinitato),
                "IIIIIIIII",
                "IIIIIIIII",
                "IIISISIII",
                "IIIIIIIII",
                "IISIXISII",
                "IIISSSIII",
                "IIIIIIIII",
                "IIIIIIIII",
                "IIIIIIIII",
                'I', new ItemStack(potato),
                'X', new ItemStack(LudicrousItems.resource, 1, 5),
                'S', new ItemStack(Items.DIAMOND));

        BlockInfinitato.lexiconEntry = new LudicrousLexicon("infinitato", BotaniaAPI.categoryMisc);
        BlockInfinitato.lexiconEntry.setLexiconPages(
                BotaniaAPI.internalHandler.textPage("avaritia.lexicon.infinitato.0"),
                new PageLudicrousRecipe("avaritia.lexicon.infinitato.1", new ExtremeShapedRecipe(new ItemStack(infinitato), CraftingHelper.parseShaped(
                        "IIIIIIIII",
                        "IIIIIIIII",
                        "IIISISIII",
                        "IIIIIIIII",
                        "IISIXISII",
                        "IIISSSIII",
                        "IIIIIIIII",
                        "IIIIIIIII",
                        "IIIIIIIII",
                        'I', new ItemStack(potato),
                        'X', new ItemStack(LudicrousItems.resource, 1, 5),
                        'S', new ItemStack(Items.DIAMOND))))
        ).setIcon(new ItemStack(infinitato));
    }
    private static ItemStack getFlower(String type) {
        ItemStack flower = new ItemStack(ModBlocks.specialFlower, 1, 0);
        NBTTagCompound tag = new NBTTagCompound();
        tag.setString("type", type);
        flower.setTagCompound(tag);
        return flower;
    }
}
