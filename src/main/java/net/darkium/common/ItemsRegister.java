package net.darkium.common;

import cpw.mods.fml.common.registry.GameRegistry;
import net.darkium.common.items.ItemDragonBone;
import net.darkium.common.items.armors.*;
import net.darkium.common.items.ingots.ItemIngotArgenium;
import net.darkium.common.items.ingots.ItemIngotAzcanium;
import net.darkium.common.items.ingots.ItemIngotCabalium;
import net.darkium.common.items.ingots.ItemIngotDarkium;
import net.darkium.common.items.tools.argenium.ItemAxeArgenium;
import net.darkium.common.items.tools.argenium.ItemPickaxeArgenium;
import net.darkium.common.items.tools.argenium.ItemSpadeArgenium;
import net.darkium.common.items.tools.argenium.ItemSwordArgenium;
import net.darkium.common.items.tools.azcanium.ItemAxeAzcanium;
import net.darkium.common.items.tools.azcanium.ItemPickaxeAzcanium;
import net.darkium.common.items.tools.azcanium.ItemSpadeAzcanium;
import net.darkium.common.items.tools.azcanium.ItemSwordAzcanium;
import net.darkium.common.items.tools.cabalium.ItemAxeCabalium;
import net.darkium.common.items.tools.cabalium.ItemPickaxeCabalium;
import net.darkium.common.items.tools.cabalium.ItemSpadeCabalium;
import net.darkium.common.items.tools.cabalium.ItemSwordCabilium;
import net.darkium.common.items.tools.darkium.*;
import net.darkium.common.items.tools.dragon_bones.ItemAxeDragonBones;
import net.darkium.common.items.tools.dragon_bones.ItemPickaxeDragonBones;
import net.darkium.common.items.tools.dragon_bones.ItemSpadeDragonBones;
import net.darkium.common.items.tools.dragon_bones.ItemSwordDragonBones;
import net.minecraft.item.Item;

public class ItemsRegister {

    // Argenium Items
    public static Item argenium_ingot;
    public static Item argenium_sword, argenium_shovel, argenium_pickaxe, argenium_axe;
    public static Item argenium_helmet, argenium_chestplate, argenium_leggings, argenium_boots;

	// Azcanium Items
	public static Item azcanium_ingot;
	private static Item azcanium_sword, azcanium_shovel, azcanium_pickaxe, azcanium_axe;
	public static Item azcanium_helmet, azcanium_chestplate, azcanium_leggings, azcanium_boots;

	// Cabalium Items
	public static Item cabalium_ingot;
	public static Item cabalium_sword, cabalium_shovel, cabalium_pickaxe, cabalium_axe;
	public static Item cabalium_helmet, cabalium_chestplate, cabalium_leggings, cabalium_boots;

	// Dragon Bones Items
	public static Item dragon_bone;
	// Dragon Bones
	private static Item dragon_bones_sword, dragon_bones_shovel, dragon_bones_pickaxe, dragon_bones_axe;
	public static Item dragon_bones_helmet, dragon_bones_chestplate, dragon_bones_leggings, dragon_bones_boots;

	// Darkium Items
	public static Item darkium_ingot;
    // Darkium Tools
    public static Item darkium_sword, darkium_axe, darkium_pickaxe, darkium_shovel;
    public static Item darkium_multitools;
    // Darkium Armor
    public static Item darkium_helmet, darkium_chestplate, darkium_leggings, darkium_boots;

    public static void init() {
        // Argenium Items
        argenium_ingot = new ItemIngotArgenium();
		// Argenium Tools
		argenium_sword = new ItemSwordArgenium(ToolsMaterialsDarkium.toolsArgenium);
		argenium_shovel = new ItemSpadeArgenium(ToolsMaterialsDarkium.toolsArgenium);
		argenium_pickaxe = new ItemPickaxeArgenium(ToolsMaterialsDarkium.toolsArgenium);
		argenium_axe = new ItemAxeArgenium(ToolsMaterialsDarkium.toolsArgenium);

		// Argenium Armor
		argenium_helmet = new ItemArmorArgenium(ArmorsMaterialsDarkium.armorArgenium, 0);
		argenium_chestplate = new ItemArmorArgenium(ArmorsMaterialsDarkium.armorArgenium, 1);
		argenium_leggings = new ItemArmorArgenium(ArmorsMaterialsDarkium.armorArgenium, 2);
		argenium_boots = new ItemArmorArgenium(ArmorsMaterialsDarkium.armorCabalium, 3);

		// Azcanium Items
		azcanium_ingot = new ItemIngotAzcanium();
		// Azcanium Tools
		azcanium_sword = new ItemSwordAzcanium(ToolsMaterialsDarkium.toolsAzcanium);
		azcanium_shovel = new ItemSpadeAzcanium(ToolsMaterialsDarkium.toolsAzcanium);
		azcanium_pickaxe = new ItemPickaxeAzcanium(ToolsMaterialsDarkium.toolsAzcanium);
		azcanium_axe = new ItemAxeAzcanium(ToolsMaterialsDarkium.toolsAzcanium);

		// Azcanium Armor
		azcanium_helmet = new ItemArmorAzcanium(ArmorsMaterialsDarkium.armorAzcanium, 0);
		azcanium_chestplate = new ItemArmorAzcanium(ArmorsMaterialsDarkium.armorAzcanium, 1);
		azcanium_leggings = new ItemArmorAzcanium(ArmorsMaterialsDarkium.armorAzcanium, 2);
		azcanium_boots = new ItemArmorAzcanium(ArmorsMaterialsDarkium.armorAzcanium, 3);

		// Cabalium Items
		cabalium_ingot = new ItemIngotCabalium();

		// Cabalium Tools

		/* Ajouter des dégats de feu aux outils en cabalium sans fireAspect */
		cabalium_sword = new ItemSwordCabilium(ToolsMaterialsDarkium.toolsCabalium);
		cabalium_axe = new ItemAxeCabalium(ToolsMaterialsDarkium.toolsCabalium);
		cabalium_pickaxe = new ItemPickaxeCabalium(ToolsMaterialsDarkium.toolsCabalium);
		cabalium_shovel = new ItemSpadeCabalium(ToolsMaterialsDarkium.toolsCabalium);

		// Cabalium Armor
		cabalium_helmet = new ItemArmorCabalium(ArmorsMaterialsDarkium.armorCabalium, 0);
		cabalium_chestplate = new ItemArmorCabalium(ArmorsMaterialsDarkium.armorCabalium, 1);
		cabalium_leggings = new ItemArmorCabalium(ArmorsMaterialsDarkium.armorCabalium, 2);
		cabalium_boots = new ItemArmorCabalium(ArmorsMaterialsDarkium.armorCabalium, 3);

		// Dragon Bones Items
		dragon_bone = new ItemDragonBone();

		// Dragon Bones Tools
		dragon_bones_sword = new ItemSwordDragonBones(ToolsMaterialsDarkium.toolsDragonBones);
		dragon_bones_shovel = new ItemSpadeDragonBones(ToolsMaterialsDarkium.toolsDragonBones);
		dragon_bones_pickaxe = new ItemPickaxeDragonBones(ToolsMaterialsDarkium.toolsDragonBones);
		dragon_bones_axe = new ItemAxeDragonBones(ToolsMaterialsDarkium.toolsDragonBones);

		// Dragon Bones Armor
		dragon_bones_helmet = new ItemArmorDragonBones(ArmorsMaterialsDarkium.armorDragonBones, 0);
		dragon_bones_chestplate = new ItemArmorDragonBones(ArmorsMaterialsDarkium.armorDragonBones, 1);
		dragon_bones_leggings = new ItemArmorDragonBones(ArmorsMaterialsDarkium.armorDragonBones, 2);
		dragon_bones_boots = new ItemArmorDragonBones(ArmorsMaterialsDarkium.armorDragonBones, 3);

		// Darkium Items
		darkium_ingot = new ItemIngotDarkium();

		/*
		 * Darkium Tools Penser à ajouter des dégats de feu sans fireaspect (mais
		 * regarder le code de l'enchantement en question)
		 */

		darkium_sword = new ItemSwordDarkium(ToolsMaterialsDarkium.toolsDarkium);
		darkium_axe = new ItemAxeDarkium(ToolsMaterialsDarkium.toolsDarkium);
		darkium_pickaxe = new ItemPickaxeDarkium(ToolsMaterialsDarkium.toolsDarkium);
		darkium_shovel = new ItemSpadeDarkium(ToolsMaterialsDarkium.toolsDarkium);
		darkium_multitools = new ItemMultiToolsDarkium(ToolsMaterialsDarkium.toolsDarkium);

		// Darkium Armor
		darkium_helmet = new ItemArmorDarkium(ArmorsMaterialsDarkium.armorDarkium, 0);
		darkium_chestplate = new ItemArmorDarkium(ArmorsMaterialsDarkium.armorDarkium, 1);
		darkium_leggings = new ItemArmorDarkium(ArmorsMaterialsDarkium.armorDarkium, 2);
		darkium_boots = new ItemArmorDarkium(ArmorsMaterialsDarkium.armorDarkium, 3);
		register();

		/* Penser à ajouter des effets à chaque set d'outils */
	}

	private static void register() {
		// Registering Argenium Items
		registerItems(argenium_ingot);
		// Registering Argenium Tools
		registerItems(argenium_sword);
		registerItems(argenium_shovel);
		registerItems(argenium_pickaxe);
		registerItems(argenium_axe);
		// Registering Argenium Armor
		registerItems(argenium_helmet);
		registerItems(argenium_chestplate);
		registerItems(argenium_leggings);
		registerItems(argenium_boots);
		// Registering Azcanium Items
		registerItems(azcanium_ingot);
		// Registering Azcanium Tools
		registerItems(azcanium_sword);
		registerItems(azcanium_shovel);
		registerItems(azcanium_pickaxe);
		registerItems(azcanium_axe);
		// Registering Azcanium Armor
		registerItems(azcanium_helmet);
		registerItems(azcanium_chestplate);
		registerItems(azcanium_leggings);
		registerItems(azcanium_boots);
		// Registering Cabalium Items
		registerItems(cabalium_ingot);
		// Registering Cabalium Tools
		registerItems(cabalium_sword);
		registerItems(cabalium_shovel);
		registerItems(cabalium_pickaxe);
		registerItems(cabalium_axe);
		// Registering Cabalium Armor
		registerItems(cabalium_helmet);
		registerItems(cabalium_chestplate);
		registerItems(cabalium_leggings);
		registerItems(cabalium_boots);
		// Registering Dragon Bones Items
		registerItems(dragon_bone);
		// Registering Dragon Bones Tools
		registerItems(dragon_bones_sword);
		registerItems(dragon_bones_shovel);
		registerItems(dragon_bones_pickaxe);
		registerItems(dragon_bones_axe);
		// Registering Dragon Bones Armor
		/*
		 * Add a 3D armor model which looks like a dragon skeleton
		 */
		registerItems(dragon_bones_helmet);
		registerItems(dragon_bones_chestplate);
		registerItems(dragon_bones_leggings);
		registerItems(dragon_bones_boots);
		// Registering Darkium Items
		registerItems(darkium_ingot);
		// Registering Darkium Tools
		registerItems(darkium_sword);
		registerItems(darkium_shovel);
		registerItems(darkium_pickaxe);
		registerItems(darkium_axe);
		registerItems(darkium_multitools);
		// Registering Darkium Armor
		registerItems(darkium_helmet);
		registerItems(darkium_chestplate);
		registerItems(darkium_leggings);
		registerItems(darkium_boots);
	}
	
	private static void registerItems(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
}