package com.leyxorcheysen.totalresurrection.common;

import com.leyxorcheysen.totalresurrection.handlers.EventsHandler;
import com.leyxorcheysen.totalresurrection.init.ItemsInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		
		ItemsInit.registerItems();
		MinecraftForge.EVENT_BUS.register(new EventsHandler());

    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}