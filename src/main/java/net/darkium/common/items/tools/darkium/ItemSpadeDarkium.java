package net.darkium.common.items.tools.darkium;

import net.darkium.Darkium;
import net.darkium.common.ItemsRegister;
import net.darkium.common.items.ingots.ItemIngotDarkium;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemSpadeDarkium extends ItemSpade {
    public ItemSpadeDarkium(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(Darkium.tabDarkium);
        this.setUnlocalizedName("darkium_shovel");
        this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
    }
    @Override
	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		return repair.getItem() == ItemsRegister.darkium_ingot || repair.getItem() instanceof ItemIngotDarkium;
	}
}
