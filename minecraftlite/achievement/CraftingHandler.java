package minecraftlite.achievement;


import minecraftlite.items.FireStick;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;
import minecraftlite.MinecraftLite;
public class CraftingHandler implements ICraftingHandler 
{
        

		@Override
		public void onCrafting(EntityPlayer player, ItemStack item,
				IInventory craftMatrix) {
			// TODO Auto-generated method stub
			if (item.itemID == firestick.itemID) {
				player.addStat(MinecraftLite.fireAchieve, 1);
			}
		
		
		
		}

		@Override
		public void onSmelting(EntityPlayer player, ItemStack item) {
			// TODO Auto-generated method stub
			
		}

private static FireStick firestick;

}