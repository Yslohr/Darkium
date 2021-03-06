package net.darkium.common.items.ingots;

import net.darkium.Darkium;
import net.darkium.client.ClientProxy;
import net.darkium.common.ItemsRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemIngotAzcanium extends Item {
    public ItemIngotAzcanium() {
        this.setCreativeTab(Darkium.tabDarkium);
        this.setUnlocalizedName("azcanium_ingot");
        this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
    }

    @Override
    public boolean isBeaconPayment(ItemStack stack) {
        return this == ItemsRegister.azcanium_ingot;
    }
}