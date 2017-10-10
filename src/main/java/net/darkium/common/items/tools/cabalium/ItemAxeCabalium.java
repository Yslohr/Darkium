package net.darkium.common.items.tools.cabalium;

import net.darkium.Darkium;
import net.darkium.client.ClientProxy;
import net.darkium.common.ItemsRegister;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemAxeCabalium extends ItemAxe {
    public ItemAxeCabalium(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(Darkium.tabDarkium);
        this.setUnlocalizedName("cabalium_axe");
        this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
    }

    @Override
    public boolean getIsRepairable(ItemStack input, ItemStack repair) {
        return repair.getItem() == ItemsRegister.cabalium_ingot;
    }
}
