package net.darkium.client;

import net.darkium.common.ItemsRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabDarkium extends CreativeTabs {
    public TabDarkium(String label) {
        super(label);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public Item getTabIconItem() {
        return ItemsRegister.darkium_ingot;
    }
    
    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
