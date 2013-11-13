package minecraftlite.items;

import minecraftlite.MinecraftLite;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RainStick extends Item {
	
	
    public RainStick(int par1) {
		super(par1);
		
		maxStackSize = 64;
	setUnlocalizedName("rainstick");
}
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister)
{
    this.itemIcon = par1IconRegister.registerIcon(MinecraftLite.modid + ":" + (this.getUnlocalizedName().substring(5)));
}
public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer){

	if(entityplayer.capabilities.isCreativeMode||entityplayer.inventory.consumeInventoryItem(Item.redstone.itemID)) {
        float par1 = 4.0f;
        world.setRainStrength(par1);
        
        
	}
        	
        
        

 
return itemstack; 



}


}


