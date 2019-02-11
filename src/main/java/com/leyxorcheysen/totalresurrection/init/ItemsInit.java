package com.leyxorcheysen.totalresurrection.init;

import com.leyxorcheysen.totalresurrection.common.items.ItemLifeCrystal;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemsInit {
	
	public static final Item LIFE_CRYSTAL = new ItemLifeCrystal();
	
	public static void registerItems() {
		
		setRegister(LIFE_CRYSTAL);
		
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
    	
    	setRender(LIFE_CRYSTAL);
    	
    }

    private static void setRegister(Item item) {
    	
        ForgeRegistries.ITEMS.register(item);
        
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item item) {

    }

}