package com.leyxorcheysen.totalresurrection.creativetabs;

import com.leyxorcheysen.totalresurrection.init.ItemsInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TotalResurrectionTab extends CreativeTabs {

	public TotalResurrectionTab() {
		
		super("total_resurrection.name");
		
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ItemsInit.LIFE_CRYSTAL);
		
	}

}
