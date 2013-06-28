package meew0.microbes.items;

import meew0.microbes.MicrobeMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCottonSwab extends MicrobeGenericItem {

    public ItemCottonSwab(int itemID, CreativeTabs tab, String unlocalizedName) {
        super(itemID, tab, unlocalizedName);
        setMaxDamage(3);
    }
    
    @Override
    public boolean onItemUse(ItemStack stack,
            EntityPlayer player, World world, int x, int y,
            int z, int par7, float par8, float par9, float par10) {
        if(player.inventory.hasItemStack(new ItemStack(MicrobeMod.itemEmptyAgarPlate, 1))) { // Check if player has empty plate
            // Do nothing, for now
            stack.damageItem(1, player);
            return true;
        } else {
            MicrobeMod.mod.logger().warning("cottonSwab needs empty agar plate to work!");
            return false;
        }
    }
}
