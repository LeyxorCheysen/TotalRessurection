package com.leyxorcheysen.totalresurrection.common;

import com.leyxorcheysen.totalresurrection.init.BlocksInit;
import com.leyxorcheysen.totalresurrection.init.EventsInit;
import com.leyxorcheysen.totalresurrection.init.GeneratorsInit;
import com.leyxorcheysen.totalresurrection.init.ItemsInit;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		
		BlocksInit.registerBlocks();
		ItemsInit.registerItems();
		EventsInit.registerEvents();

    }

    public void init(FMLInitializationEvent event) {
    	
    	GeneratorsInit.registerGenerators();

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}