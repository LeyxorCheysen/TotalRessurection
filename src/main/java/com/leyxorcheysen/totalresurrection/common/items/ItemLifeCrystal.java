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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLifeCrystal extends Item {
	
	public ItemLifeCrystal() {
		
		this.setCreativeTab(TabsInit.TOTAL_RESURRECTION);
		this.setMaxStackSize(16);
		this.setRegistryName("life_crystal");
		this.setUnlocalizedName("life_crystal");
		
	}
	
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        
		ItemStack itemstack = player.getHeldItem(hand);
		
		if(!world.isRemote) {
		
			if(!player.capabilities.isCreativeMode) {
			
				itemstack.shrink(1);
			
			}
			
			player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 1200, 4));
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 1200, 4));
		
		}
		
		else player.playSound(SoundEvents.BLOCK_GLASS_BREAK, 1.0F, 1.0F);
        
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
            
    }
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack) {
		
        return true;
        
    }
	
	public EnumRarity getRarity(ItemStack stack) {
		
	    return ItemsInit.COMMON;
	    
	}

}