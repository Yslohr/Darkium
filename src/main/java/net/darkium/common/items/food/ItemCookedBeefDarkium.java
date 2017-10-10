package net.darkium.common.items.food;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemCookedBeefDarkium extends ItemFood {

	public ItemCookedBeefDarkium(int healHungerAmount, float saturationHealAmount, boolean canBeEatenByWolves) {
		super(healHungerAmount, saturationHealAmount, canBeEatenByWolves);
	}
	
	@Override
	public boolean hasEffect(ItemStack par1ItemStack, int pass) {
		return true;
	}
	
	
}
