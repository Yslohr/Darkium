package net.darkium.common.items.tools.dragon_bones;

import net.darkium.Darkium;
import net.darkium.common.ItemsRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemPickaxeDragonBones extends ItemPickaxe {
    public ItemPickaxeDragonBones(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(Darkium.tabDarkium);
        this.setUnlocalizedName("dragon_bones_pickaxe");
        this.setTextureName(Darkium.MOD_ID +":" + getUnlocalizedName().substring(5));
    }

    @Override
    public boolean getIsRepairable(ItemStack input, ItemStack repair) {
        return repair.getItem() == ItemsRegister.dragon_bone;
    }
}
