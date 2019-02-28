package com.leyxorcheysen.totalresurrection.init;

import com.leyxorcheysen.totalresurrection.events.EventInjectLootPools;

import net.minecraftforge.common.MinecraftForge;

public class EventsInit {
	
	public static void registerEvents() {
		
		MinecraftForge.EVENT_BUS.register(new EventInjectLootPools());
		
	}

}