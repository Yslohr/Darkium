package net.darkium.common.items.tools.azcanium;

import net.darkium.Darkium;
import net.darkium.common.ItemsRegister;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemSpadeAzcanium extends ItemSpade {
    /**
     * @param toolMaterial
     */
    public ItemSpadeAzcanium(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(Darkium.tabDarkium);
        this.setUnlocalizedName("azcanium_shovel");
        this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
    }

    @Override
    public boolean getIsRepairable(ItemStack input, ItemStack repair) {
        return repair.getItem() == ItemsRegister.azcanium_ingot;
    }
}
