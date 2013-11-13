package minecraftlite.items;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenTrees;

public class TreeStick extends Item {

	public TreeStick(int par1) {
		super(par1);
		maxStackSize = 64;
        setUnlocalizedName("treestick");

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
            int j = movingobjectposition.blockY;
            int k = movingobjectposition.blockZ;
     
           biome = world.getBiomeGenForCoords(i, k);
          
           
        	  
        	   
        	   world.setBlock(i, j, k, Block.wood.blockID);
        	   world.setBlock(i, j + 1, k, Block.wood.blockID);
        	   world.setBlock(i, j + 2, k, Block.wood.blockID);
        	   world.setBlock(i, j + 3, k, Block.wood.blockID);
        	   world.setBlock(i, j + 4, k, Block.wood.blockID);
        	   world.setBlock(i, j + 5, k, Block.wood.blockID);
        	   world.setBlock(i, j + 6, k, Block.leaves.blockID);
        	   
        	   world.setBlock(i, j + 6, k + 1, Block.leaves.blockID);
        	   world.setBlock(i + 1, j + 6, k, Block.leaves.blockID);
        	   world.setBlock(i, j + 6, k - 1, Block.leaves.blockID);
        	   world.setBlock(i - 1, j + 6, k, Block.leaves.blockID);
        	   
        	   
        	   world.setBlock(i + 1, j + 5, k + 1, Block.leaves.blockID);
        	   world.setBlock(i, j + 5, k + 1, Block.leaves.blockID);
        	   world.setBlock(i, j + 5, k - 1, Block.leaves.blockID);
        	   world.setBlock(i - 1, j + 5, k, Block.leaves.blockID);
        	  
        	   world.setBlock(i + 1, j + 5, k + 1, Block.leaves.blockID);
        	   world.setBlock(i - 1, j + 5, k - 1, Block.leaves.blockID);
        	   
        	   
        	   world.setBlock(i - 1, j + 5, k + 1, Block.leaves.blockID);
        	   world.setBlock(i + 1, j + 5, k - 1, Block.leaves.blockID);
        	   
        	  
        	   world.setBlock(i + 1, j + 4, k + 1, Block.leaves.blockID);
        	   world.setBlock(i, j + 4, k + 1, Block.leaves.blockID);
        	   world.setBlock(i, j + 4, k - 1, Block.leaves.blockID);
        	   world.setBlock(i - 1, j + 4, k, Block.leaves.blockID);
        	  
        	   world.setBlock(i + 1, j + 4, k + 1, Block.leaves.blockID);
        	   world.setBlock(i - 1, j + 4, k - 1, Block.leaves.blockID);
        	   
        	   
        	   world.setBlock(i - 1, j + 4, k + 1, Block.leaves.blockID);
        	   world.setBlock(i + 1, j + 4, k - 1, Block.leaves.blockID);
           
           
                	
        	   world.setBlock(i + 2, j + 4, k + 2, Block.leaves.blockID);
        	   world.setBlock(i, j + 4, k + 2, Block.leaves.blockID);
        	   world.setBlock(i, j + 4, k - 2, Block.leaves.blockID);
        	   world.setBlock(i - 2, j + 4, k, Block.leaves.blockID);
        	  
        	   world.setBlock(i + 2, j + 4, k + 2, Block.leaves.blockID);
        	   world.setBlock(i - 2, j + 4, k - 2, Block.leaves.blockID);
        	   
        	   
        	   world.setBlock(i - 3, j + 4, k + 3, Block.leaves.blockID);
        	   world.setBlock(i + 3, j + 4, k - 3, Block.leaves.blockID);
           
        	   world.setBlock(i + 3, j + 4, k + 3, Block.leaves.blockID);
        	   world.setBlock(i, j + 4, k + 3, Block.leaves.blockID);
        	   world.setBlock(i, j + 4, k - 3, Block.leaves.blockID);
        	   world.setBlock(i - 3, j + 4, k, Block.leaves.blockID);
        	  
        	   world.setBlock(i + 3, j + 4, k + 3, Block.leaves.blockID);
        	   world.setBlock(i - 3, j + 4, k - 3, Block.leaves.blockID);
        	   
        	   
        	   world.setBlock(i - 3, j + 4, k + 3, Block.leaves.blockID);
        	   world.setBlock(i + 3, j + 4, k - 3, Block.leaves.blockID);
           
        	   
                
         
        	   
        	   world.setBlock(i + 1, j + 3, k + 1, Block.leaves.blockID);
        	   world.setBlock(i, j + 3, k + 1, Block.leaves.blockID);
        	   world.setBlock(i, j + 3, k - 1, Block.leaves.blockID);
        	   world.setBlock(i - 1, j + 3, k, Block.leaves.blockID);
        	  
        	   world.setBlock(i + 1, j + 3, k + 1, Block.leaves.blockID);
        	   world.setBlock(i - 1, j + 3, k - 1, Block.leaves.blockID);
        	   
        	   
        	   world.setBlock(i - 1, j + 3, k + 1, Block.leaves.blockID);
        	   world.setBlock(i + 1, j + 3, k - 1, Block.leaves.blockID);
           
           
                	
        	   world.setBlock(i + 2, j + 3, k + 2, Block.leaves.blockID);
        	   world.setBlock(i, j + 3, k + 2, Block.leaves.blockID);
        	   world.setBlock(i, j + 3, k - 2, Block.leaves.blockID);
        	   world.setBlock(i - 2, j + 3, k, Block.leaves.blockID);
        	  
        	   world.setBlock(i + 2, j + 3, k + 2, Block.leaves.blockID);
        	   world.setBlock(i - 2, j + 3, k - 2, Block.leaves.blockID);
        	   
        	   
        	   world.setBlock(i - 3, j + 3, k + 3, Block.leaves.blockID);
        	   world.setBlock(i + 3, j + 3, k - 3, Block.leaves.blockID);
           
        	   world.setBlock(i + 3, j + 3, k + 3, Block.leaves.blockID);
        	   world.setBlock(i, j + 3, k + 3, Block.leaves.blockID);
        	   world.setBlock(i, j + 3, k - 3, Block.leaves.blockID);
        	   world.setBlock(i - 3, j + 3, k, Block.leaves.blockID);
        	  
        	   world.setBlock(i + 3, j + 3, k + 3, Block.leaves.blockID);
        	   world.setBlock(i - 3, j + 3, k - 3, Block.leaves.blockID);
        	   
        	   
        	   world.setBlock(i - 3, j + 3, k + 3, Block.leaves.blockID);
        	   world.setBlock(i + 3, j + 3, k - 3, Block.leaves.blockID);
           
        	   
        	   
        	   
        	   
            
     }return itemstack; 
}
public static BiomeGenBase biome;
public static Block block;


}
