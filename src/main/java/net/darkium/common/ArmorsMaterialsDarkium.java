package net.darkium.common;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorsMaterialsDarkium {
    public static ItemArmor.ArmorMaterial armorArgenium;
    public static ItemArmor.ArmorMaterial armorAzcanium;
    public static ItemArmor.ArmorMaterial armorCabalium;
    public static ItemArmor.ArmorMaterial armorDarkium;
	public static ItemArmor.ArmorMaterial armorDragonBones;


    public static void init(){
        armorArgenium = EnumHelper.addArmorMaterial("ARGENIUM", 55, new int[] { 4, 7, 5, 3 }, 25);
        armorAzcanium = EnumHelper.addArmorMaterial("AZCANIUM", 55, new int[] { 4, 7, 5, 3 }, 25);
        armorCabalium = EnumHelper.addArmorMaterial("CABALIUM", 55, new int[] { 4, 7, 5, 3 }, 25);
        armorDragonBones = EnumHelper.addArmorMaterial("DRAGON BONES", 55, new int[] { 4, 7, 5, 3 }, 25);
        armorDarkium = EnumHelper.addArmorMaterial("DARKIUM", 100, new int[] { 5, 7, 6, 4 }, 35);
    }
}
