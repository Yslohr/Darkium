package net.darkium.common.items.armors;

import net.darkium.Darkium;
import net.darkium.common.ItemsRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.world.World;

public class ItemArmorAzcanium extends ItemArmor {
	public ItemArmorAzcanium(ItemArmor.ArmorMaterial material, int armorSlot) {
		super(material, 0, armorSlot);
		this.setCreativeTab(Darkium.tabDarkium);
        this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
        switch (armorSlot) {
            case 0:
                this.setUnlocalizedName("azcanium_helmet");
                break;
		case 1:
			this.setUnlocalizedName("azcanium_chestplate");
			break;
		case 2:
			this.setUnlocalizedName("azcanium_leggings");
			break;
		case 3:
			this.setUnlocalizedName("azcanium_boots");
			break;
            default:
                this.setUnlocalizedName("");
                break;
        }
    }

	public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type) {
		if (itemStack.getItem() == ItemsRegister.azcanium_leggings) {
			return Darkium.MOD_ID + ":textures/models/armor/argenium_layer_2.png";
		}
		return Darkium.MOD_ID + ":textures/models/armor/argenium_layer_1.png";
	}

    //@Override
    //public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
    //if ((player.getCurrentArmor(3) != null) && (player.getCurrentArmor(2) != null)
    //&& (player.getCurrentArmor(1) != null) && (player.getCurrentArmor(0) != null)
    //&& (player.getCurrentArmor(3).getItem() == ItemsRegister.azcanium_helmet)
    //&& (player.getCurrentArmor(2).getItem() == ItemsRegister.azcanium_chestplate)
    //&& (player.getCurrentArmor(1).getItem() == ItemsRegister.azcanium_leggings)
    //&& (player.getCurrentArmor(0).getItem() == ItemsRegister.azcanium_boots)) {
    ///*
    //* make the player immune to bad status
    //* => Potions Effects, block suffocation
    //* , bad enchantements (do not prevent the player from getting bad enchantements from the enchanting table)
    //
    //  }
    //}

	@Override
	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		return input.getItem() == ItemsRegister.azcanium_ingot;
	}
}