package net.darkium.common;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public static final boolean IS_MOD_IN_DEV = true;

    public void preInit(FMLPreInitializationEvent event) {
        ToolsMaterialsDarkium.init();
        ArmorsMaterialsDarkium.init();
        ItemsRegister.init();
        BlocksRegister.init();
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    public void registerRenders(){}
}
