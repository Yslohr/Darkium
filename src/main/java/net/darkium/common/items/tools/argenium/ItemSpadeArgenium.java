package net.darkium.common.items.tools.argenium;

import net.darkium.Darkium;
import net.darkium.client.ClientProxy;
import net.darkium.common.ItemsRegister;
import net.darkium.common.items.ingots.ItemIngotArgenium;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemSpadeArgenium extends ItemSpade {
    public ItemSpadeArgenium(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(Darkium.tabDarkium);
        this.setUnlocalizedName("argenium_shovel");
        this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
    }

    @Override
    public boolean getIsRepairable(ItemStack input, ItemStack repair) {
        return repair.getItem() == ItemsRegister.argenium_ingot;
    }
}
