package meew0.microbes.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import meew0.microbes.MicrobeMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MicrobeGenericItem extends Item {

    public MicrobeGenericItem(int itemID, CreativeTabs tab, String unlocalizedName) {
        super(itemID - 256); // Set pre-unshifted item ID
        this.setCreativeTab(tab); // Set creative tab
        this.setUnlocalizedName(unlocalizedName); // Set unlocalized name
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconReg) {
        this.itemIcon = iconReg.registerIcon(MicrobeMod.id + ":" + this.getUnlocalizedName()); // Register icon
    }
}
