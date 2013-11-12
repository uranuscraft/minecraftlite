package minecraftlite;
import minecraftlite.items.MiningStick;
import minecraftlite.items.RainStick;
import minecraftlite.items.TnTStick;
import minecraftlite.items.FireStick;
import minecraftlite.items.LightingStick;
import minecraftlite.items.MagicBlazeRod;
import minecraftlite.items.TransmutationStick;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
@Mod(modid=MinecraftLite.modid, name="MinecraftLite", version="1.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MinecraftLite {
	@Instance(value = "uranuscraft_minecraftlite")
    public static MinecraftLite instance;
   public static final String modid = "uranuscraft_minecraftlite";
   public static Item LightningStick;
   public static Item Firestick;
   public static Item blazestick;
   public static Item tntstick;
   public static Item orestick;
   public static Item minestick;
   public static Item rainstick;
   @EventHandler
   public void preInit(FMLPreInitializationEvent event) {
           Configuration config = new Configuration(event.getSuggestedConfigurationFile());
           
           //Config for an Item
           ItemID = config.get(Configuration.CATEGORY_ITEM, "ItemID", 1937).getInt();
         //Config for an Item in the FireMod
           FireItemID = config.get(Configuration.CATEGORY_ITEM, "FireItemID", 1793).getInt();
         //Config for an Item in the FireMod
           BlazeItemID = config.get(Configuration.CATEGORY_ITEM, "BlazeItemID", 1397).getInt();
         
           
           //Config for the Item OreStick
           oreItemID = config.get(Configuration.CATEGORY_ITEM, "oreItemID", 3197).getInt();
           
           
         //Config for the Item MineStick
           mineItemID = config.get(Configuration.CATEGORY_ITEM, "mineItemID", 3917).getInt();
          
           
           
         //Config for the Item the rainStick
           rainItemID = config.get(Configuration.CATEGORY_ITEM, "rainItemID", 1717).getInt();
           
           
           
           //Config for the new tnt
           TntItemID = config.get(Configuration.CATEGORY_ITEM, "TntItemID", 1739).getInt();
           
           //coal mod config
           CoalAmount = config.get(Configuration.CATEGORY_ITEM, "CoalAmount", 1).getInt();
           
           CoalMod = config.get(Configuration.CATEGORY_GENERAL, "CoalMod", true).getBoolean(true);
           
           Property CoalModProperty = config.get(Configuration.CATEGORY_GENERAL, "CoalMod", "nothing");
          
           CoalModProperty.comment = "Say if the CoalMod part is active";
           
           String CoalMod = CoalModProperty.comment;
           
        
           //spider eyes to redstone config
           SpiderEyesToRedstone = config.get(Configuration.CATEGORY_GENERAL, "SpiderEyesToRedstone", true).getBoolean(true);
        
           Property SpiderEyesToRedstoneProperty = config.get(Configuration.CATEGORY_GENERAL, "SpiderEyesToRedstone", "nothing");
          
           SpiderEyesToRedstoneProperty.comment = "Say if the Spider Eyes To Redstone part is active";
           
           String SpiderEyesToRedstone = SpiderEyesToRedstoneProperty.comment;
           
        
         //Fire mod config
           Fire = config.get(Configuration.CATEGORY_GENERAL, "Fire", true).getBoolean(true);
           
           Property FireProperty = config.get(Configuration.CATEGORY_GENERAL, "Fire", "nothing");
          
           FireProperty.comment = "Say if the FireMod part is active";
           
           String FireMod = FireProperty.comment;
           
           //Bedrock mod config
           Bedrock = config.get(Configuration.CATEGORY_GENERAL, "Bedrock", true).getBoolean(true);
           
           Property BedrockProperty = config.get(Configuration.CATEGORY_GENERAL, "Bedrock", "nothing");
          
           BedrockProperty.comment = "Say if Bed rock is craftable";
           
           String BedrockMod = FireProperty.comment;
           
           config.load();
   }
   @EventHandler
   public void load(FMLInitializationEvent event) {
	   
	   tntstick = new TnTStick(TntItemID);
	   LanguageRegistry.addName(tntstick, "Blow up stuff stick");
	   
	   
	   rainstick = new RainStick(rainItemID);
	   LanguageRegistry.addName(rainstick, "Rain stick");
	   
	   
	   ItemStack water = new ItemStack(Item.bucketWater);
		
       GameRegistry.addRecipe(new ItemStack(rainstick), "x", "x",
	                'x', water);
	   
	   
	   
	   
	   minestick = new MiningStick(mineItemID);
	   LanguageRegistry.addName(minestick, "Mining Stick");
	  
	   
	   
	   ItemStack diamonds = new ItemStack(Item.diamond);
		
       GameRegistry.addRecipe(new ItemStack(minestick), "x", "x",
	                'x', diamonds);
	   
	   
	   
	   
	   orestick = new TransmutationStick(oreItemID);
	   LanguageRegistry.addName(orestick, "Transmutation Stick");
	   
	   
	   ItemStack diamondBlock = new ItemStack(Block.blockDiamond);
		
       GameRegistry.addRecipe(new ItemStack(orestick), "x", "x",
	                'x', diamondBlock);
	   
       
       
       
       
       ItemStack tntBlock = new ItemStack(Block.tnt);
		
       GameRegistry.addRecipe(new ItemStack(tntstick), "x", "x",
	                'x', tntBlock);
    
	   //checks to see if SpiderEyesToRedstone = true
	   if(SpiderEyesToRedstone = true) {
       GameRegistry.addSmelting(Item.spiderEye.itemID, new ItemStack(Item.redstone), 0.1f);
	   }
	   //checks to see if CoalMod = true
	   if(CoalMod = true) {
	   
       
       GameRegistry.addShapelessRecipe(new ItemStack(Item.coal, CoalAmount), new Object[]{

           new ItemStack(Item.seeds)
    });
	   
	   }
	 //checks to see if FireMod = true
	   if(Fire = true) {
		   
		   Firestick = new FireStick(FireItemID);
		   LanguageRegistry.addName(Firestick, "Fire stick");
		   
		   blazestick = new MagicBlazeRod(BlazeItemID);
		   LanguageRegistry.addName(blazestick, "Magic Blaze Rod");
		   ItemStack glowstoneBlock = new ItemStack(Block.glowStone);
			
	        GameRegistry.addRecipe(new ItemStack(Firestick), "x", "x",
		                'x', glowstoneBlock);
		   
		   ItemStack netherBrick = new ItemStack(Block.netherBrick);
			
	        GameRegistry.addRecipe(new ItemStack(blazestick), "x", "x",
		                'x', netherBrick);
		   
	        
	        ItemStack enchanted = new ItemStack(Item.swordStone);

	   enchanted.addEnchantment(Enchantment.fireAspect, 1);
	               
	   GameRegistry.addShapelessRecipe(enchanted, new Object[]{
	               new ItemStack(Item.swordStone), new ItemStack(Item.flint)
	   });
	 
	   ItemStack enchantedwooden = new ItemStack(Item.swordWood);

	   enchantedwooden.addEnchantment(Enchantment.fireAspect, 1);
	               
	   GameRegistry.addShapelessRecipe(enchantedwooden, new Object[]{
	               new ItemStack(Item.swordWood), new ItemStack(Item.flint)
	   });
	   ItemStack enchantedgolden = new ItemStack(Item.swordGold);

	   enchantedgolden.addEnchantment(Enchantment.fireAspect, 1);
	               
	   GameRegistry.addShapelessRecipe(enchantedgolden, new Object[]{
	               new ItemStack(Item.swordGold), new ItemStack(Item.flint)
	   }); 
	   ItemStack enchantediron = new ItemStack(Item.swordIron);

	   enchantediron.addEnchantment(Enchantment.fireAspect, 1);
	               
	   GameRegistry.addShapelessRecipe(enchantediron, new Object[]{
	               new ItemStack(Item.swordIron), new ItemStack(Item.flint)
	   }); 
	   ItemStack enchanteddiamond = new ItemStack(Item.swordDiamond);

	   enchanteddiamond.addEnchantment(Enchantment.fireAspect, 1);
	               
	   GameRegistry.addShapelessRecipe(enchanteddiamond, new Object[]{
	               new ItemStack(Item.swordDiamond), new ItemStack(Item.flint)
	   });
	   
	   
	   ItemStack enchantedlev2 = new ItemStack(Item.swordStone);

	   enchantedlev2.addEnchantment(Enchantment.fireAspect, 2);
	               
	   GameRegistry.addShapelessRecipe(enchantedlev2, new Object[]{
	               new ItemStack(Item.swordStone), new ItemStack(Item.blazeRod)
	   });
	 
	   ItemStack enchantedwoodenlev2 = new ItemStack(Item.swordWood);

	   enchantedwoodenlev2.addEnchantment(Enchantment.fireAspect, 2);
	               
	   GameRegistry.addShapelessRecipe(enchantedwoodenlev2, new Object[]{
	               new ItemStack(Item.swordWood), new ItemStack(Item.blazeRod)
	   });
	   ItemStack enchantedgoldenlev2 = new ItemStack(Item.swordGold);

	   enchantedgoldenlev2.addEnchantment(Enchantment.fireAspect, 2);
	               
	   GameRegistry.addShapelessRecipe(enchantedgoldenlev2, new Object[]{
	               new ItemStack(Item.swordGold), new ItemStack(Item.blazeRod)
	   }); 
	   ItemStack enchantedironlev2 = new ItemStack(Item.swordIron);

	   enchantedironlev2.addEnchantment(Enchantment.fireAspect, 2);
	               
	   GameRegistry.addShapelessRecipe(enchantedironlev2, new Object[]{
	               new ItemStack(Item.swordIron), new ItemStack(Item.blazeRod)
	   }); 
	   ItemStack enchanteddiamondlev2 = new ItemStack(Item.swordDiamond);

	   enchanteddiamondlev2.addEnchantment(Enchantment.fireAspect, 2);
	               
	   GameRegistry.addShapelessRecipe(enchanteddiamondlev2, new Object[]{
	               new ItemStack(Item.swordDiamond), new ItemStack(Item.blazeRod)
	   });
	 
	   ItemStack enchantedbow = new ItemStack(Item.bow);

	   enchantedbow.addEnchantment(Enchantment.flame, 1);
	               
	   GameRegistry.addShapelessRecipe(enchantedbow, new Object[]{
	               new ItemStack(Item.bow), new ItemStack(Item.magmaCream)
	   });
	 }
	
	  // Checks to see if bedrock crafting is active 
	   if(Bedrock = true) {
		   LightningStick = new LightingStick(ItemID);
		   LanguageRegistry.addName(LightningStick, "LightningStick");
		
        ItemStack diamondblockStack = new ItemStack(Block.blockDiamond);
		
        GameRegistry.addRecipe(new ItemStack(Block.bedrock), "xxx", "xxx", "xxx",
	                'x', diamondblockStack);
    
ItemStack bedrockStack = new ItemStack(Block.bedrock);
		
        GameRegistry.addRecipe(new ItemStack(LightningStick), "x", "x",
	                'x', bedrockStack);
	   
	   
	   
	   }
   
   
   }
  
   //declare variables
   public static boolean SpiderEyesToRedstone;
public static boolean CoalMod;
public static boolean Fire;
public static boolean Bedrock;
   public static int CoalAmount;
   public static int ItemID;
   public static int FireItemID;
   public static int BlazeItemID;
   public static int TntItemID;
   public static int oreItemID;
   public static int mineItemID;
   public static int rainItemID;
}

