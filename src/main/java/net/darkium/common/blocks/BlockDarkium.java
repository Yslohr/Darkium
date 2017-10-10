package net.darkium.common.blocks;

import net.darkium.Darkium;
import net.darkium.common.BlocksRegister;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockDarkium extends Block {

    public BlockDarkium(Material material) {
        super(material);
        this.setBlockName("darkium_block");
        this.setBlockTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
        this.setCreativeTab(Darkium.tabDarkium);
        this.setResistance(6000000.0F);
    }

    @Override
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return this == BlocksRegister.darkium_block;
    }
}