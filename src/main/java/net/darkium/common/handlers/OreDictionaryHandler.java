package net.darkium.common.handlers;

import net.darkium.common.ItemsRegister;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
    public static void init() {
        registerOreDictionary();
    }

    private static void registerOreDictionary() {
        OreDictionary.registerOre("ingotArgenium", ItemsRegister.argenium_ingot);
        OreDictionary.registerOre("swordArgenium", ItemsRegister.argenium_sword);
        OreDictionary.registerOre("shovelArgenium", ItemsRegister.argenium_shovel);
        OreDictionary.registerOre("pickaxeArgenium", ItemsRegister.argenium_pickaxe);
        OreDictionary.registerOre("axeArgenium", ItemsRegister.argenium_axe);
        OreDictionary.registerOre("helmetArgenium", ItemsRegister.argenium_helmet);
        OreDictionary.registerOre("chestplateArgenium", ItemsRegister.argenium_chestplate);
        OreDictionary.registerOre("bootsArgenium", ItemsRegister.argenium_boots);
        OreDictionary.registerOre("ingotAzcanium", ItemsRegister.azcanium_ingot);
        OreDictionary.registerOre("ingotCabalium", ItemsRegister.cabalium_ingot);
        OreDictionary.registerOre("dragonBone", ItemsRegister.dragon_bone);
        OreDictionary.registerOre("ingotDarkium", ItemsRegister.darkium_ingot);
    }
}
