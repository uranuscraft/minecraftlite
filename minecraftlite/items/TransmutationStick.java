package minecraftlite.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import minecraftlite.MinecraftLite;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class TransmutationStick extends Item{

	public TransmutationStick(int par1) {
		super(par1);
		 maxStackSize = 64;
	        setUnlocalizedName("orestick");
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(MinecraftLite.modid + ":" + (this.getUnlocalizedName().substring(5)));
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
            
            if(world.getBlockId(i, j, k) == Block.oreNetherQuartz.blockID) {   	
                world.setBlock(i, j, k, Block.oreCoal.blockID);
                }
            
            
            else if(world.getBlockId(i, j, k) == Block.oreCoal.blockID) {   	
                world.setBlock(i, j, k, Block.oreIron.blockID);
                }
            
            
            else if(world.getBlockId(i, j, k) == Block.oreIron.blockID) {   	
                world.setBlock(i, j, k, Block.oreRedstone.blockID);
                }
            else if (world.getBlockId(i, j, k) == Block.oreRedstoneGlowing.blockID) {
            	world.setBlock(i, j, k, Block.oreGold.blockID);
            }
            else if (world.getBlockId(i, j, k) == Block.oreGold.blockID) {
            	world.setBlock(i, j, k, Block.oreEmerald.blockID);
            }
            
            else if(world.getBlockId(i, j, k) == Block.oreEmerald.blockID) {   	
                world.setBlock(i, j, k, Block.oreDiamond.blockID);
                }
            
            else if(world.getBlockId(i, j, k) == Block.oreDiamond.blockID) {   	
                world.setBlock(i, j, k, Block.blockNetherQuartz.blockID);
                }
            
            else if(world.getBlockId(i, j, k) == Block.blockNetherQuartz.blockID) {   	
                world.setBlock(i, j, k, Block.coalBlock.blockID);
                }
            else if(world.getBlockId(i, j, k) == Block.coalBlock.blockID) {   	
                world.setBlock(i, j, k, Block.blockIron.blockID);
                }

            else if(world.getBlockId(i, j, k) == Block.blockIron.blockID) {   	
                world.setBlock(i, j, k, Block.blockRedstone.blockID);
                }
            else if (world.getBlockId(i, j, k) == Block.blockRedstone.blockID) {
            	world.setBlock(i, j, k, Block.blockGold.blockID);
            }
            else if(world.getBlockId(i, j, k) == Block.blockGold.blockID) {   	
                world.setBlock(i, j, k, Block.blockEmerald.blockID);
                }
            else if(world.getBlockId(i, j, k) == Block.blockEmerald.blockID) {   	
                world.setBlock(i, j, k, Block.blockDiamond.blockID);
                }
            
            
            
            
    }return itemstack; 
	
	
	
}
}
