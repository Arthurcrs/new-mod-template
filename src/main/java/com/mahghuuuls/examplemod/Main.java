package com.mahghuuuls.examplemod;

import com.mahghuuuls.examplemod.proxy.CommonProxy;
import com.mahghuuuls.examplemod.util.ModReference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModReference.MOD_ID, name = ModReference.NAME, version = ModReference.VERSION)
public class Main {

	@SidedProxy(clientSide = ModReference.CLIENT_PROXY_CLASS, serverSide = ModReference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(); // Load configs, register blocks and items
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(); // Register recipes, event handlers and world generation
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(); // Interact with other mods and finalize setup
	}

}