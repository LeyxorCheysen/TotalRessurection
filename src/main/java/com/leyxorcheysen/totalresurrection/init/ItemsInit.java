package com.leyxorcheysen.totalresurrection.init;

import com.leyxorcheysen.totalresurrection.common.items.ItemCrystalIce;
import com.leyxorcheysen.totalresurrection.common.items.ItemLifeCrystal;
import com.leyxorcheysen.totalresurrection.common.items.ItemRegenerationJelly;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemsInit {
	
	public static EnumRarity COMMON = EnumHelper.addRarity("totalresurrection_common", TextFormatting.AQUA, "");
	
	public static final Item LIFE_CRYSTAL = new ItemLifeCrystal();
	public static final ItemFood REGENERATION_JELLY = new ItemRegenerationJelly();
	public static final Item CRYSTAL_ICE = new ItemCrystalIce();
	
	public static void registerItems() {
		
		setRegister(LIFE_CRYSTAL);
		setRegister(REGENERATION_JELLY);
		setRegister(CRYSTAL_ICE);
		
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
    	
    	setRender(LIFE_CRYSTAL);
    	setRender(REGENERATION_JELLY);
    	setRender(CRYSTAL_ICE);
    	
    }

    private static void setRegister(Item item) {
    	
        ForgeRegistries.ITEMS.register(item);
        
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item item) {
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }

}