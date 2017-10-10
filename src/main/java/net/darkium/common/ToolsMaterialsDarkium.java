package net.darkium.common;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ToolsMaterialsDarkium {

    public static Item.ToolMaterial toolsArgenium;
    public static Item.ToolMaterial toolsAzcanium;
    public static Item.ToolMaterial toolsCabalium;
    public static Item.ToolMaterial toolsDragonBones;
    public static Item.ToolMaterial toolsDarkium;

    public static void init(){
        toolsArgenium = EnumHelper.addToolMaterial("ARGENIUM", 3, 3200, 20.0F, 6.0F,25);
        toolsAzcanium = EnumHelper.addToolMaterial("AZCANIUM", 3, 3200, 20.0F, 6.0F,25);
        toolsCabalium = EnumHelper.addToolMaterial("CABALIUM", 3, 3200, 20.0F, 6.0F,25);
        toolsDragonBones = EnumHelper.addToolMaterial("DRAGON BONES", 3, 3200, 20.0F, 6.0F,25);
        toolsDarkium = EnumHelper.addToolMaterial("DARKIUM", 4, 4700, 30.0F, 8, 35);
    }

}
