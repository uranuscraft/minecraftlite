package minecraftlite.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class TeleportationStick extends Item {

	public TeleportationStick(int par1) {
		super(par1);
		maxStackSize = 64;
        setUnlocalizedName("enderstick");
	}
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
	float f = 1.0F;
    float f1 = entityplayer.prevRotationPitch + (entityplayer.rotationPitch - entityplayer.prevRotationPitch) * f;
    float f2 = entityplayer.prevRotationYaw + (entityplayer.rotationYaw - entityplayer.prevRotationYaw) * f;
    double d = entityplayer.prevPosX + (entityplayer.posX - entityplayer.prevPosX) * (double)f;
    double d1 = (entityplayer.prevPosY + (entityplayer.posY - entityplayer.prevPosY) * (double)f + 1.6200000000000001D) - (double)entityplayer.yOffset;
    double d2 = entityplayer.prevPosZ + (entityplayer.posZ - entityplayer.prevPosZ) * (double)f;
    Vec3 vec3d = Vec3.createVectorHelper(d, d1, d2);
    float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
    float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
    float f5 = -MathHelper.cos(-f1 * 0.01745329F);
    float f6 = MathHelper.sin(-f1 * 0.01745329F);
    float f7 = f4 * f5;
    float f8 = f6;
    float f9 = f3 * f5;
    double d3 = 5000D;
    Vec3 vec3d1 = vec3d.addVector((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
    MovingObjectPosition movingobjectposition = world.rayTraceBlocks_do_do(vec3d, vec3d1, false, true);
    if (movingobjectposition == null)
    {
     return itemstack;
    }
     if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
    {
     int i = movingobjectposition.blockX;
            int j = movingobjectposition.blockY - 1;
            int k = movingobjectposition.blockZ;

            double a = (double)i;
            double b = (double)j;
            double c = (double)k;
<<<<<<< HEAD
            if(entityplayer.capabilities.isCreativeMode||entityplayer.inventory.consumeInventoryItem(Item.redstone.itemID)) { 
            
            entityplayer.setLocationAndAngles(a, b, c, entityplayer.rotationYaw, 0.0F);
            }  
=======
           
            
            entityplayer.setLocationAndAngles(a, b, c, entityplayer.rotationYaw, 0.0F);
           
>>>>>>> cd11bae41c4f935545d5419600d0714a06ca6502
    
    }
     return itemstack; 
    }


public static Entity par1Entity;

}
