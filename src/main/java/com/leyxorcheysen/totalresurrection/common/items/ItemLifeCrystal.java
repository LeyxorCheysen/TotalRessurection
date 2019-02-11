package com.leyxorcheysen.totalresurrection.common.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemLifeCrystal extends Item {
	
	public ItemLifeCrystal() {
		
		this.setMaxStackSize(16);
		this.setRegistryName("life_crystal");
		this.setUnlocalizedName("life_crystal");
		
	}
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		
		if(!worldIn.isRemote) {
		
			if(playerIn.capabilities.isCreativeMode) {
			
			itemstack.shrink(1);
			
			}
			
			playerIn.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 1200, 3));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 1200, 3));
		
		}
		
		else playerIn.playSound(SoundEvents.BLOCK_GLASS_BREAK, 1.0F, 1.0F);
        
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
            
    }

}