package com.leyxorcheysen.totalresurrection.handlers;

import com.leyxorcheysen.totalresurrection.init.ItemsInit;

import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventsHandler {
	
	@SubscribeEvent
	public void onLootTablesLoaded(LootTableLoadEvent event) {

	    if (event.getName().equals(LootTableList.CHESTS_DESERT_PYRAMID)) {

	        final LootPool pool2 = event.getTable().getPool("pool2");

	        if (pool2 != null) {

	            pool2.addEntry(new LootEntryItem(ItemsInit.LIFE_CRYSTAL, 4, 0, new LootFunction[0], new LootCondition[0], "loottable:life_crystal"));
	        
	        }
	        
	    }
	    
	}

}