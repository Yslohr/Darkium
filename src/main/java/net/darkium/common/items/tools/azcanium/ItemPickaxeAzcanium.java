package net.darkium.common.items.tools.azcanium;

import net.darkium.Darkium;
import net.darkium.common.ItemsRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemPickaxeAzcanium extends ItemPickaxe {
    /**
     * @param toolMaterial
     */
    public ItemPickaxeAzcanium(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(Darkium.tabDarkium);
        this.setUnlocalizedName("azcanium_pickaxe");
        this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
    }

    @Override
    public boolean getIsRepairable(ItemStack input, ItemStack repair) {
        return repair.getItem() == ItemsRegister.azcanium_ingot;
    }
}
