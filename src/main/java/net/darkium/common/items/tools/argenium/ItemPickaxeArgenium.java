package net.darkium.common.items.tools.argenium;

import net.darkium.Darkium;
import net.darkium.client.ClientProxy;
import net.darkium.common.ItemsRegister;
import net.darkium.common.items.ingots.ItemIngotArgenium;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemPickaxeArgenium extends ItemPickaxe {
    public ItemPickaxeArgenium(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(Darkium.tabDarkium);
        this.setUnlocalizedName("argenium_pickaxe");
        this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
    }

    @Override
    public boolean getIsRepairable(ItemStack input, ItemStack repair) {
        return repair.getItem() == ItemsRegister.argenium_ingot;
    }
}
