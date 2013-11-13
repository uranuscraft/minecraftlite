package minecraftlite.items;

import minecraftlite.MinecraftLite;
import net.machinemuse.api.IModularItem;
import net.machinemuse.api.ModuleManager;
import net.machinemuse.api.moduletrigger.IPlayerTickModule;
import net.machinemuse.api.moduletrigger.IToggleableModule;
import net.machinemuse.numina.sound.Musique;
import net.machinemuse.general.sound.SoundLoader;
import net.machinemuse.powersuits.item.ItemComponent;
import net.machinemuse.powersuits.powermodule.PowerModuleBase;
import net.machinemuse.utils.ElectricItemUtils;
import net.machinemuse.utils.MuseCommonStrings;
import net.machinemuse.utils.MuseItemUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class LightningStick extends PowerModuleBase implements IPlayerTickModule, IToggleableModule {
    public static final String LIGHTNING = "Jolt Energy";
    public static final String MODULE_LIGHTNINGSTICK = "Lightningstick";

    public static void MODULE_LIGHTNINGSTICK(List<IModularItem> validItems) {
        super(validItems);
        addInstallCost(MuseItemUtils.copyAndResize(ItemComponent.lvcapacitor, 1));
        addBaseProperty(LightningStick.LIGHTNING, 1000, "J");
    }

    @Override
    public String getCategory() {
        return MuseCommonStrings.CATEGORY_ENVIRONMENTAL;
    }

    @Override
    public String getDataName() {
        return MODULE_LIGHTNINGSTICK;
    }

    @Override
    public String getLocalizedName() {
        return StatCollector.translateToLocal("module.LightningStick.name");
    }

    @Override
    public String getDescription() {
        return "Shoot the power of lighning at you finger tips";
    }

@Override
public void onRightClick(EntityPlayer player, World world, ItemStack item) {
if (ElectricItemUtils.getPlayerEnergy(player) > 500) {
player.setItemInUse(item, MinecraftLite.ItemID);
}
}
    @Override
    public void onPlayerTickInactive(EntityPlayer player, ItemStack item) {
    }

    @Override
    public String getTextureFile() {
        // TODO Auto-generated method stub
        return "lightningstick";
    }

}
