package com.leyxorcheysen.totalresurrection.init;

import com.leyxorcheysen.totalresurrection.common.items.ItemLifeCrystal;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemsInit {
	
	public static EnumRarity COMMON = EnumHelper.addRarity("totalresurrection_common", TextFormatting.AQUA, "");
	
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
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }

}