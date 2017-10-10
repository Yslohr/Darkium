package net.darkium.common.items;

import net.darkium.Darkium;
import net.minecraft.item.Item;

public class ItemDragonBone extends Item {
    public ItemDragonBone() {
        this.setCreativeTab(Darkium.tabDarkium);
        this.setUnlocalizedName("dragon_bone");
        this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
    }
}
