package minecraftlite;
import minecraftlite.achievement.CraftingHandler;
import minecraftlite.items.DivingStick;
import minecraftlite.items.MiningStick;
import minecraftlite.items.RainStick;
import minecraftlite.items.TeleportationStick;
import minecraftlite.items.TimeStick;
import minecraftlite.items.TnTStick;
import minecraftlite.items.FireStick;
import minecraftlite.items.LightingStick;
import minecraftlite.items.MagicBlazeRod;
import minecraftlite.items.TransmutationStick;
import minecraftlite.items.TreeStick;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
<<<<<<< HEAD



=======
<<<<<<< HEAD

=======
import minecraftlite.items.LightningStick;
import minecraftlite.plugins.Powersuits;
>>>>>>> cd11bae41c4f935545d5419600d0714a06ca6502
>>>>>>> 08f8385a2e63eeaee81c7839754217b2636fb94b
@Mod(modid=MinecraftLite.modid, name="MinecraftLite", version="1.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MinecraftLite {
	@Instance(value = "uranuscraft_minecraftlite")
    public static MinecraftLite instance;
   public static final String modid = "uranuscraft_minecraftlite";
   //Declare Items
   
   public static Item LightningStick;
   public static Item Firestick;
   public static Item blazestick;
   public static Item tntstick;
   public static Item orestick;
   public static Item minestick;
   public static Item rainstick;
   public static Item treestick;
   public static Item timestick;
   public static Item enderstick;
   public static Item divestick;
   
   
   
   
   
   
   
   
   
   
   
   
   @EventHandler
   public void preInit(FMLPreInitializationEvent event) {
           Configuration config = new Configuration(event.getSuggestedConfigurationFile());
           
           //Config for an Item
           ItemID = config.get(Configuration.CATEGORY_ITEM, "ItemID", 1937).getInt();
         //Config for an Item in the FireMod
           FireItemID = config.get(Configuration.CATEGORY_ITEM, "FireItemID", 1793).getInt();
         //Config for an Item in the FireMod
           BlazeItemID = config.get(Configuration.CATEGORY_ITEM, "BlazeItemID", 1397).getInt();
         
           //Config for an Achievement
           FireAchievementID = config.get(Configuration.CATEGORY_ITEM, "FireAchievementID", 1937).getInt();
           //Config for an Achievement
           BedrockAchievementID = config.get(Configuration.CATEGORY_ITEM, "BedrockAchievementID", 1937).getInt();
         //Config for the Item TimeStick
           timeItemID = config.get(Configuration.CATEGORY_ITEM, "timeItemID", 2197).getInt();
           //Config for the Item OreStick
           oreItemID = config.get(Configuration.CATEGORY_ITEM, "oreItemID", 3197).getInt();
           
           //Config for the Item TreeStick
           treeItemID = config.get(Configuration.CATEGORY_ITEM, "treeItemID", 3719).getInt();
         //Config for the Item MineStick
           mineItemID = config.get(Configuration.CATEGORY_ITEM, "mineItemID", 3917).getInt();
          
           //Config for the Item EnderStick
           enderItemID = config.get(Configuration.CATEGORY_ITEM, "enderItemID", 1718).getInt();
          
           
         //Config for the Item the rainStick
           rainItemID = config.get(Configuration.CATEGORY_ITEM, "rainItemID", 1717).getInt();
           
         
         //Config for the Item DivingStick
           diveItemID = config.get(Configuration.CATEGORY_ITEM, "diveItemID", 1197).getInt();
        
           
           
           
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
	   
	   enderstick = new TeleportationStick(enderItemID);
	   LanguageRegistry.addName(enderstick, "Teleportation Stick");
	   
	   divestick = new DivingStick(diveItemID);
	   LanguageRegistry.addName(divestick, "Diving Stick");
	   
	   
	   
	   
	   ItemStack lily = new ItemStack(Block.waterlily);
		
       GameRegistry.addRecipe(new ItemStack(divestick), "x", "x",
	                'x', lily);
	   
	   ItemStack end = new ItemStack(Item.enderPearl);
		
       GameRegistry.addRecipe(new ItemStack(enderstick), "x", "x",
	                'x', end);
	   
	   tntstick = new TnTStick(TntItemID);
	   LanguageRegistry.addName(tntstick, "Blow up stuff stick");
	  
	   timestick = new TimeStick(timeItemID);
	   LanguageRegistry.addName(timestick, "Time Stick");
	  
	  ItemStack daylight = new ItemStack(Block.daylightSensor);
		
       GameRegistry.addRecipe(new ItemStack(timestick), "x", "x",
	                'x', daylight);
	   
	   treestick = new TreeStick(treeItemID);
	   LanguageRegistry.addName(treestick, "Tree Stick");
	   
	   rainstick = new RainStick(rainItemID);
	   LanguageRegistry.addName(rainstick, "Rain stick");
	   
	   ItemStack wood = new ItemStack(Block.wood);
		
       GameRegistry.addRecipe(new ItemStack(treestick), "x", "x",
	                'x', wood);
	   
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
	   LanguageRegistry.instance().addStringLocalization("itemGroup.tabSticks", "en_US", "Sticks");
	   this.addAchievementLocalizations();
	   
	   this.addAchievementLocalizationsbedrock();
	   AchievementPage.registerAchievementPage(lite);
	   GameRegistry.registerCraftingHandler(craftHandler);
   
	   Firestick.setCreativeTab(this.tabSticks);
	   divestick.setCreativeTab(this.tabSticks);
	   orestick.setCreativeTab(this.tabSticks);
	   minestick.setCreativeTab(this.tabSticks);
  
	   blazestick.setCreativeTab(this.tabSticks);
   
	   timestick.setCreativeTab(this.tabSticks);
   
	   rainstick.setCreativeTab(this.tabSticks);
	   LightningStick.setCreativeTab(this.tabSticks);
	   enderstick.setCreativeTab(this.tabSticks);
	   tntstick.setCreativeTab(this.tabSticks);
	   treestick.setCreativeTab(this.tabSticks);
   }
  
   @EventHandler
   public void load(FMLPostInitializationEvent event) {
<<<<<<< HEAD

	 
=======
<<<<<<< HEAD
	  
=======
	  Powersuits.Addon();
>>>>>>> cd11bae41c4f935545d5419600d0714a06ca6502
>>>>>>> 08f8385a2e63eeaee81c7839754217b2636fb94b
   }
   
   
   
   //declare booleans 
   public static boolean SpiderEyesToRedstone;
public static boolean CoalMod;
public static boolean Fire;
public static boolean Bedrock;
   

// declare ints
public static int CoalAmount;
   public static int ItemID;
   public static int FireItemID;
   public static int BlazeItemID;
   public static int TntItemID;
   public static int oreItemID;
   public static int mineItemID;
   public static int rainItemID;
   public static int treeItemID;
   public static int timeItemID;
   public static int enderItemID;
   public static int diveItemID;
   public static int FireAchievementID;
  
   public static int BedrockAchievementID;
   
   
   
   
   //Declare Achievements
   public static final Achievement fireAchieve = new Achievement(FireAchievementID, "fireAchieve", 1, -2, Firestick, AchievementList.portal).registerAchievement();
   
   
   
   
   private void addAchievementName(String ach, String name)
   {
           LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
   }

   private void addAchievementDesc(String ach, String desc)
   {
           LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
   }
  
   
   
   private void addAchievementLocalizations()
   {
                   this.addAchievementName("fireAchieve", "The Fire Man");
                   this.addAchievementDesc("fireAchieve", "Destroy your foes with fire");
   }
   
   
 
   public static final Achievement bedrockAchieve = new Achievement(BedrockAchievementID, "bedrockAchieve", -1, 2, Block.bedrock, AchievementList.diamonds).registerAchievement();
   
   
   
   
   private void addAchievementNamebedrock(String ach, String name)
   {
           LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
   }

   private void addAchievementDescbedrock(String ach, String desc)
   {
           LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
   }
  
   
   
   private void addAchievementLocalizationsbedrock()
   {
                   this.addAchievementNamebedrock("bedrockAchieve", "Bedrock?");
                   this.addAchievementDescbedrock("bedrockAchieve", "You have crafted bedrock");
   }
   
   
   
   
   
   
   
   
   
   
   
   
   public static AchievementPage lite = new AchievementPage("MinecraftLite", fireAchieve, bedrockAchieve);
   
   
   
   public static CraftingHandler craftHandler = new CraftingHandler();
   
   public static CreativeTabs tabSticks = new CreativeTabs("tabSticks") {
       public ItemStack getIconItemStack() {
               return new ItemStack(LightningStick, 1, 0);
       }
};



}

