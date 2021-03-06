package net.darkium.common.items.tools.cabalium;

import net.darkium.Darkium;
import net.darkium.common.ItemsRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemSwordCabilium extends ItemSword {
	public ItemSwordCabilium(ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(Darkium.tabDarkium);
		this.setUnlocalizedName("cabalium_sword");
		this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}

	@Override
	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		return repair.getItem() == ItemsRegister.cabalium_ingot;
	}

	@Override
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase victimEntityLivingLivingBase,
			EntityLivingBase attackerEntityLivingBase) {
		if (attackerEntityLivingBase instanceof EntityPlayer && itemStack != null
				&& itemStack.getItem() == ItemsRegister.cabalium_sword
				|| itemStack.getItem() instanceof ItemSwordCabilium) {
			itemStack.damageItem(1, attackerEntityLivingBase);
			victimEntityLivingLivingBase.setFire(10);
			return true;
		}
		return super.hitEntity(itemStack, victimEntityLivingLivingBase, attackerEntityLivingBase);
	}
}
