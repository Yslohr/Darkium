package net.darkium.common.items.tools.dragon_bones;

import net.darkium.Darkium;
import net.darkium.common.ItemsRegister;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemAxeDragonBones extends ItemAxe {
    public ItemAxeDragonBones(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(Darkium.tabDarkium);
        this.setUnlocalizedName("dragon_bones_axe");
        this.setTextureName(Darkium.MOD_ID +":" + getUnlocalizedName().substring(5));
    }

    @Override
    public boolean getIsRepairable(ItemStack input, ItemStack repair) {
        return repair.getItem() == ItemsRegister.dragon_bone;
    }
}
