package net.darkium;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.darkium.client.TabDarkium;
import net.darkium.common.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Darkium.MOD_ID, name = Darkium.MOD_NAME, version = Darkium.MOD_VERSION, acceptedMinecraftVersions = Darkium.MC_VERSION)
public class Darkium {
	public static final String MOD_ID = "darkium";
	public static final String MOD_NAME = "Darkium";
	public static final String MOD_VERSION = "1.0";
	public static final String MC_VERSION = "[1.7.10]";

	public static final String COMMON_PROXY = "net.darkium.common.CommonProxy";
	public static final String CLIENT_PROXY = "net.darkium.client.ClientProxy";

	@Mod.Instance(value = MOD_ID)
	public static Darkium instance;

	@SidedProxy(clientSide = Darkium.CLIENT_PROXY, serverSide = Darkium.COMMON_PROXY)
	public static CommonProxy commonProxy;

	public static CreativeTabs tabDarkium = new TabDarkium("tabDarkium");

	@Mod.EventHandler
	public static void preInit(final FMLPreInitializationEvent event) {
		commonProxy.preInit(event);
	}

	@Mod.EventHandler
	public static void init(final FMLInitializationEvent event) {
		commonProxy.init(event);
	}

	@Mod.EventHandler
	public static void postInit(final FMLPostInitializationEvent event) {
		commonProxy.postInit(event);
	}

}
