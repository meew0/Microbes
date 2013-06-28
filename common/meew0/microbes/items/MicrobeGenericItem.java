package meew0.microbes.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import meew0.microbes.MicrobeMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MicrobeGenericItem extends Item {

    public MicrobeGenericItem(int itemID, CreativeTabs tab, String unlocalizedName) {
        super(itemID - 256);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(unlocalizedName);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconReg) {
        this.itemIcon = iconReg.registerIcon(MicrobeMod.id + ":" + this.getUnlocalizedName());
    }
}
