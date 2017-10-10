package net.darkium.common.items.tools.azcanium;

import net.darkium.Darkium;
import net.darkium.common.ItemsRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemSwordAzcanium extends ItemSword {
    /**
     * @param toolMaterial
     */
    public ItemSwordAzcanium(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(Darkium.tabDarkium);
        this.setUnlocalizedName("azcanium_sword");
        this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
    }

    @Override
    public boolean getIsRepairable(ItemStack input, ItemStack repair) {
        return repair.getItem() == ItemsRegister.azcanium_ingot;
    }
}