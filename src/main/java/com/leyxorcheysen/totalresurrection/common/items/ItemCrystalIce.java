package com.leyxorcheysen.totalresurrection.common.items;

import com.leyxorcheysen.totalresurrection.init.ItemsInit;
import com.leyxorcheysen.totalresurrection.init.TabsInit;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemCrystalIce extends Item {
	
	public ItemCrystalIce() {
		
		this.setCreativeTab(TabsInit.TOTAL_RESURRECTION);
		this.setMaxStackSize(16);
		this.setRegistryName("crystal_ice");
		this.setUnlocalizedName("crystal_ice");
		
	}
	
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        
		ItemStack itemstack = player.getHeldItem(hand);
		
		if(!world.isRemote) {
		
			if(!player.capabilities.isCreativeMode) {
			
				itemstack.shrink(1);
			
			}
			
			player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 1200, 1));
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1200, 1));
		
		}
		
		else player.playSound(SoundEvents.BLOCK_GLASS_BREAK, 1.0F, 1.0F);
        
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
            
    }
	
	public EnumRarity getRarity(ItemStack stack) {
		
	    return ItemsInit.COMMON;
	    
	}

}