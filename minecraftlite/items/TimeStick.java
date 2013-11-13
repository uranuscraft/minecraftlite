package minecraftlite.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class TimeStick extends Item {

	public TimeStick(int par1) {
		super(par1);
		maxStackSize = 64;
        setUnlocalizedName("timestick");

	}
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
   
		long t = world.getWorldTime();
     if(t >= 22812 || t <= 13187 ) {
    	 world.setWorldTime(18000); 
     }
     
     
     else if(t <= 22812 || t >= 13187 ) {
    	 world.setWorldTime(1200);
    	
     }      
     else {
    	 System.out.print("ERROR");
     }
                
                
            
     return itemstack; 
}

}
