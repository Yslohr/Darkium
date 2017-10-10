package net.darkium.common.items.tools.azcanium;

import net.darkium.Darkium;
import net.darkium.common.ItemsRegister;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemAxeAzcanium extends ItemAxe {
    /**
     * @param toolMaterial
     */
    public ItemAxeAzcanium(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(Darkium.tabDarkium);
        this.setUnlocalizedName("azcanium_axe");
        this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
    }

    @Override
    public boolean getIsRepairable(ItemStack input, ItemStack repair) {
        return repair.getItem() == ItemsRegister.azcanium_ingot;
    }
}
