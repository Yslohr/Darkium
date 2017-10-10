package net.darkium.common.items.tools;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import cpw.mods.fml.common.eventhandler.Event.Result;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

public class ItemMultiTools extends ItemPickaxe {
	public ItemMultiTools(ToolMaterial toolMaterial) {
		super(toolMaterial);
	}

	private Set<Block> effectiveAgainst = Sets.newHashSet(Block.blockRegistry);

	@Override
	public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("spade", "pickaxe", "axe", "hoe");
	}

	@Override
	public boolean canHarvestBlock(Block block, ItemStack stack) {
		return effectiveAgainst.contains(block) || super.canHarvestBlock(block, stack);
	}

	@Override
	public float func_150893_a(ItemStack stack, Block block) {
		return (effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.func_150893_a(stack, block));
	}

	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int p_77648_7_,
			float hitX, float hitY, float hitZ) {
		if (!player.canPlayerEdit(x, y, z, p_77648_7_, stack)) {
			return false;
		} else {
			UseHoeEvent event = new UseHoeEvent(player, stack, world, x, y, z);
			if (MinecraftForge.EVENT_BUS.post(event)) {
				return false;
			}
			if (event.getResult() == Result.ALLOW) {
				stack.damageItem(1, player);
				return true;
			}
			Block block = world.getBlock(x, y, z);

			if (p_77648_7_ != 0 && world.getBlock(x, y + 1, z).isAir(world, x, y + 1, z)
					&& (block == Blocks.grass || block == Blocks.dirt)) {
				Block block1 = Blocks.farmland;
				world.playSoundEffect((double) ((float) x + 0.5F), (double) ((float) y + 0.5F),
						(double) ((float) z + 0.5F), block1.stepSound.getStepResourcePath(),
						(block1.stepSound.getVolume() + 1.0F) / 2.0F, block1.stepSound.getPitch() * 0.8F);
				if (world.isRemote) {
					return true;
				} else {
					world.setBlock(x, y, z, block1);
					stack.damageItem(1, player);
					return true;
				}
			} else {
				return false;
			}
		}
	}
}