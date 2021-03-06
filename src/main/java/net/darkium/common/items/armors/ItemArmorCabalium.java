package net.darkium.common.items.armors;

import net.darkium.Darkium;
import net.darkium.common.ItemsRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorCabalium extends ItemArmor {
	public ItemArmorCabalium(ItemArmor.ArmorMaterial material, int armorSlot) {
		super(material, 0, armorSlot);
		this.setCreativeTab(Darkium.tabDarkium);
		switch (armorSlot) {
		case 0:
			this.setUnlocalizedName("cabalium_helmet");
			this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
			break;
		case 1:
			this.setUnlocalizedName("cabalium_chestplate");
			this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
			break;
		case 2:
			this.setUnlocalizedName("cabalium_leggings");
			this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
			break;
		case 3:
			this.setUnlocalizedName("cabalium_boots");
			this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
			break;
		}
	}

	public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type) {
		if (itemStack.getItem() == ItemsRegister.cabalium_leggings) {
			return Darkium.MOD_ID + ":textures/models/armor/cabalium_layer_2.png";
		}
		return Darkium.MOD_ID + ":textures/models/armor/cabalium_layer_1.png";
	}

	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if ((player.getCurrentArmor(3) != null) && (player.getCurrentArmor(2) != null)
				&& (player.getCurrentArmor(1) != null) && (player.getCurrentArmor(0) != null)
				&& (player.getCurrentArmor(3).getItem() == ItemsRegister.cabalium_helmet)
				&& (player.getCurrentArmor(2).getItem() == ItemsRegister.cabalium_chestplate)
				&& (player.getCurrentArmor(1).getItem() == ItemsRegister.cabalium_leggings)
				&& (player.getCurrentArmor(0).getItem() == ItemsRegister.cabalium_boots)) {
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 1, 0));
		}
	}

	@Override
	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		return input.getItem() == ItemsRegister.cabalium_ingot;
	}
}
