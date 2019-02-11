package com.leyxorcheysen.totalresurrection.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventsHandler {
	
	@SubscribeEvent
	public void onLoot(LootTableLoadEvent event) {
		
	    if (LootTableList.CHESTS_DESERT_PYRAMID.equals(event.getName())) {
	    	
	        ResourceLocation loc = new ResourceLocation("total_resurrection", "chests/total_resurrection_desert_pyramid_chest");
	        LootTable customLootTable = event.getLootTableManager().getLootTableFromLocation(loc);
	        event.setTable(customLootTable);
	        
	    }
	    
	}

}