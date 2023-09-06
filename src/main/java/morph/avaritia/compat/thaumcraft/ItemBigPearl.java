package morph.avaritia.compat.thaumcraft;

import codechicken.lib.model.ModelRegistryHelper;
import codechicken.lib.util.TransformUtils;
import morph.avaritia.Avaritia;
import morph.avaritia.api.IHaloRenderItem;
import morph.avaritia.api.registration.IModelRegister;
import morph.avaritia.client.render.item.HaloRenderItem;
import morph.avaritia.entity.EntityEndestPearl;
import morph.avaritia.init.AvaritiaTextures;
import morph.avaritia.init.ModItems;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thaumcraft.common.items.curios.ItemPrimordialPearl;

public class ItemBigPearl extends Item implements IModelRegister {

    public ItemBigPearl() {
        setUnlocalizedName("avaritia:extremely_primordial_pearl");
        setRegistryName("extremely_primordial_pearl");
        setMaxStackSize(1);
        setCreativeTab(Avaritia.tab);
        this.setContainerItem(this);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }

    @Override
    @SideOnly (Side.CLIENT)
    public void registerModels() {
        ModelResourceLocation pearl = new ModelResourceLocation("avaritia:resource", "type=extremely_primordial_pearl");
        ModelLoader.registerItemVariants(ModItems.extremely_primordial_pearl, pearl);
        ModelLoader.setCustomMeshDefinition(ModItems.extremely_primordial_pearl, (ItemStack stack) -> pearl);
    }
}
