package net.darkium.common.items.armors;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.darkium.Darkium;
import net.darkium.client.models.ModelBipedArmorDragonBones;
import net.darkium.common.ItemsRegister;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemArmorDragonBones extends ItemArmor {
	public ItemArmorDragonBones(ItemArmor.ArmorMaterial material, int armorSlot) {
		super(material, 0, armorSlot);
		this.setCreativeTab(Darkium.tabDarkium);
		switch (armorSlot) {
		case 0:
			this.setUnlocalizedName("dragon_bones_helmet");
			this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
			break;
		case 1:
			this.setUnlocalizedName("dragon_bones_chestplate");
			this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
			break;
		case 2:
			this.setUnlocalizedName("dragon_bones_leggings");
			this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
			break;
		case 3:
			this.setUnlocalizedName("dragon_bones_boots");
			this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
			break;
		}
	}

	public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type) {
		if (itemStack.getItem() == ItemsRegister.dragon_bones_leggings) {
			return Darkium.MOD_ID + ":textures/models/armor/dragon_bones_layer_2.png";
		}
		return Darkium.MOD_ID + ":textures/models/armor/dragon_bones_layer_1.png";
	}

    /*
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
    return new ModelBipedArmorDragonBones(armorSlot);
    }
    */

    public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if ((player.getCurrentArmor(3) != null) && (player.getCurrentArmor(2) != null)
				&& (player.getCurrentArmor(1) != null) && (player.getCurrentArmor(0) != null)
				&& (player.getCurrentArmor(3).getItem() == ItemsRegister.dragon_bones_helmet)
				&& (player.getCurrentArmor(2).getItem() == ItemsRegister.dragon_bones_chestplate)
				&& (player.getCurrentArmor(1).getItem() == ItemsRegister.dragon_bones_leggings)
				&& (player.getCurrentArmor(0).getItem() == ItemsRegister.dragon_bones_boots)) {
			// Set the life of the player to the maximum's player life every 50 seconds
		}
	}

	@Override
	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		return input.getItem() == ItemsRegister.dragon_bone;
	}
}
