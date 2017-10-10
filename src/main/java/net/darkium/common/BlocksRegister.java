package net.darkium.common;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.darkium.common.blocks.BlockDarkium;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;

public class BlocksRegister {

    public static Block argenium_block, azcanium_block, cabalium_block, darkium_block;
   // private static Block argenium_ore, azcanium_ore, cabalium_ore, dragon_fossil;

    public static void init() {
        darkium_block = new BlockDarkium(Material.iron);

        register();
    }

    private static void register(){
        registerBlocks(darkium_block);
    }

    private static void registerBlocks(Block block){
        GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
    }

}
