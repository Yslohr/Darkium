package net.darkium.common.items.armors;

import net.darkium.Darkium;
import net.darkium.common.ItemsRegister;
import net.darkium.common.items.ingots.ItemIngotDarkium;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorDarkium extends ItemArmor {

    public ItemArmorDarkium(ItemArmor.ArmorMaterial material, int armorSlot) {
        super(material, 0, armorSlot);
        switch(armorSlot){
            case 0:
                this.setCreativeTab(Darkium.tabDarkium);
                this.setUnlocalizedName("darkium_helmet");
                this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
                break;
            case 1:
                this.setCreativeTab(Darkium.tabDarkium);
                this.setUnlocalizedName("darkium_chestplate");
                this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
                break;
            case 2:
                this.setCreativeTab(Darkium.tabDarkium);
                this.setUnlocalizedName("darkium_leggings");
                this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
                break;
            case 3:
                this.setCreativeTab(Darkium.tabDarkium);
                this.setUnlocalizedName("darkium_boots");
                this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
                break;

        }
    }

    @Override
    public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type) {
        if (itemStack.getItem() == ItemsRegister.darkium_leggings) {
            return Darkium.MOD_ID + ":textures/models/armor/darkium_layer_2.png";
        }
        return Darkium.MOD_ID + ":textures/models/armor/darkium_layer_1.png";
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
        if ((player.getCurrentArmor(3) != null)
                && (player.getCurrentArmor(2) != null)
                && (player.getCurrentArmor(1) != null)
                && (player.getCurrentArmor(0) != null)
                && (player.getCurrentArmor(3).getItem() == ItemsRegister.darkium_helmet)
                && (player.getCurrentArmor(2).getItem() == ItemsRegister.darkium_chestplate)
                && (player.getCurrentArmor(1).getItem() == ItemsRegister.darkium_leggings)
                && (player.getCurrentArmor(0).getItem() == ItemsRegister.darkium_boots)) {
            player.fallDistance = 0.0F;
            player.setHealth(player.getMaxHealth());
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 1, 0));
            player.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 300, 0));
            player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 220, 0));
        }
    }

    @Override
    public boolean getIsRepairable(ItemStack input, ItemStack repair) {
        return repair.getItem() == ItemsRegister.darkium_ingot;
    }
}
