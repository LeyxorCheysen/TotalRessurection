package com.leyxorcheysen.totalresurrection.common.items;

import com.leyxorcheysen.totalresurrection.init.TabsInit;

import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class ItemRegenerationJelly extends ItemFood {

	public ItemRegenerationJelly() {
		
		super(8, 8.0F, false);
		
		this.setCreativeTab(TabsInit.TOTAL_RESURRECTION);
		this.setMaxStackSize(64);
		this.setPotionEffect(new PotionEffect(MobEffects.REGENERATION, 1200, 4), 100.0F);
		this.setRegistryName("regeneration_jelly");
		this.setUnlocalizedName("regeneration_jelly");
		this.setAlwaysEdible();
		
	}

}