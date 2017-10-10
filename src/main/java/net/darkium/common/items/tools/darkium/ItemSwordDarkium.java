package net.darkium.common.items.tools.darkium;

import net.darkium.Darkium;
import net.darkium.common.ItemsRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemSwordDarkium extends ItemSword {
	public ItemSwordDarkium(ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(Darkium.tabDarkium);
		this.setUnlocalizedName("darkium_sword");
		this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}

	@Override
	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		return repair.getItem() == ItemsRegister.darkium_ingot;
	}
}