package net.darkium.common.blocks;

import net.darkium.Darkium;
import net.darkium.common.BlocksRegister;
import net.minecraft.block.BlockCompressed;
import net.minecraft.block.material.MapColor;
import net.minecraft.world.IBlockAccess;

public class BlockArgenium extends BlockCompressed {
    public BlockArgenium() {
        super(MapColor.silverColor);
        setBlockName("argenium_block");
        setBlockTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
        setHardness(10.0F);
        setHarvestLevel("pickaxe", 3);
        setResistance(20.0F);
    }

    @Override
    public boolean isBeaconBase(IBlockAccess world, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return this == BlocksRegister.argenium_block;
    }
}
