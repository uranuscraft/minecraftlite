package minecraftlite.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import minecraftlite.MinecraftLite;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFlintAndSteel;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ReportedException;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
public class FireStick extends Item {

	public FireStick(int par1) {
		super(par1);
		   maxStackSize = 64;
	        setUnlocalizedName("FireStick");
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
	                if(entityplayer.capabilities.isCreativeMode||entityplayer.inventory.consumeInventoryItem(Item.redstone.itemID)) {
	                
	                for(int w = 0; w < 2; w++) {
		                o = w;
		                	l = i + o;
		               
		                n = k + o;
		                
		                
		                q = i - o;
		                r = j - o;
		                s = k - o;

		               
		                if(world.isAirBlock(q, r, s)) {
			                world.setBlock(q, r, s, Block.fire.blockID);
			                }
		                if(world.isAirBlock(q, r, n)) {
			                world.setBlock(q, r, n, Block.fire.blockID);
			                }
		               
		                if(world.isAirBlock(l, r, s)) {
			                world.setBlock(l, r, s, Block.fire.blockID);
			                }
		                
		                if(world.isAirBlock(l, r, n)) {
			                world.setBlock(l, r, n, Block.fire.blockID);
			                }
	                }
	                }
	         }return itemstack; 
	    	
	    	
	    	
	    }
	        
	public static int o;        
	public static int l;
	
	public static int n;
	public static int q;
	public static int r;
	public static int s;
}
			
	       
	        



