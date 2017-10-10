package net.darkium.common.items.armors;

import net.darkium.Darkium;
import net.darkium.common.ItemsRegister;
import net.darkium.common.items.ingots.ItemIngotArgenium;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemArmorArgenium extends ItemArmor {
    public ItemArmorArgenium(ItemArmor.ArmorMaterial material, int armorSlot) {
        super(material, 0, armorSlot);
        this.setCreativeTab(Darkium.tabDarkium);
        switch (armorSlot){
            case 0:
                this.setUnlocalizedName("argenium_helmet");
                this.setTextureName(Darkium.MOD_ID +":" + getUnlocalizedName().substring(5));
                break;
            case 1:
                this.setUnlocalizedName("argenium_chestplate");
                this.setTextureName(Darkium.MOD_ID +":" + getUnlocalizedName().substring(5));
                break;
            case 2:
                this.setUnlocalizedName("argenium_leggings");
                this.setTextureName(Darkium.MOD_ID +":" + getUnlocalizedName().substring(5));
                break;
            case 3:
                this.setUnlocalizedName("argenium_boots");
                this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
                break;
        }
    }

    public String getArmorTexture(ItemStack itemStack, Entity entity, int slot, String type) {
        if(itemStack.getItem() == ItemsRegister.argenium_leggings){
            return Darkium.MOD_ID + ":textures/models/armor/argenium_layer_2.png";
        }
           return Darkium.MOD_ID + ":textures/models/armor/argenium_layer_1.png";
    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
        if ((player.getCurrentArmor(3) != null)
                && (player.getCurrentArmor(2) != null)
                && (player.getCurrentArmor(1) != null)
                && (player.getCurrentArmor(0) != null)
                && (player.getCurrentArmor(3).getItem() == ItemsRegister.argenium_helmet)
                && (player.getCurrentArmor(2).getItem() == ItemsRegister.argenium_chestplate)
                && (player.getCurrentArmor(1).getItem() == ItemsRegister.argenium_leggings)
                && (player.getCurrentArmor(0).getItem() == ItemsRegister.argenium_boots)) {
            player.fallDistance = 0.0F;
        }
    }

    @Override
    public boolean getIsRepairable(ItemStack input, ItemStack repair) {
        return input.getItem() == ItemsRegister.argenium_ingot;
    }
}
