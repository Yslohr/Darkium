package net.darkium.common.items.tools.darkium;

import net.darkium.Darkium;
import net.darkium.client.ClientProxy;
import net.darkium.common.ItemsRegister;
import net.darkium.common.items.ingots.ItemIngotDarkium;
import net.darkium.common.items.tools.ItemMultiTools;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMultiToolsDarkium extends ItemMultiTools {
    public ItemMultiToolsDarkium(ToolMaterial toolMaterial) {
        super(toolMaterial);
        this.setCreativeTab(Darkium.tabDarkium);
        this.setUnlocalizedName("darkium_multitools");
        this.setTextureName(Darkium.MOD_ID + ":" + getUnlocalizedName().substring(5));
    }

    @Override
	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		return repair.getItem() == ItemsRegister.darkium_ingot;
	}

    @Override
    public boolean onBlockDestroyed(ItemStack itemStack, World world, Block destroyedBlock, int x, int y, int z, EntityLivingBase entity) {
        if(world.getBlock(x,y,z).getBlockHardness(world,x ,y, z) <= -1.0F){
            for(int ix = -1; ix < 2; ++ix)
            {
                for (int iy = -1; iy < 2; ++iy)
                {
                    for (int iz = -1; iz < 2; ++iz)
                    {
                        world.func_147480_a(x + ix, y + iy, z + iz, true);
                        itemStack.setItemDamage(itemStack.getItemDamage() - 9);
                    }
                }
            }

            return true;
        }
        return true;
    }
}
