package minecraftlite.plugins;
import cpw.mods.fml.common.Loader;
import minecraftlite.items.LightningStick;
import net.machinemuse.api.IModularItem;
import net.machinemuse.api.ModuleManager;
import net.machinemuse.numina.general.MuseLogger;

public class Powersuits {
	
	public static void Addon() { 
	boolean h = isModularPowerSuitsLoaded();
	   if(h = true) {
		   ModuleManager.addModule(new LightningStick(Collections.singletonList((IModularItem) ModularPowersuits.powerTool)));
	   }
	   
	}
	public static boolean isModularPowerSuitsLoaded() {
	       return Loader.isModLoaded("ModularPowersuits");
	   }
}
