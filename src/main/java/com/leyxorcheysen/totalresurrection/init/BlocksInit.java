package com.leyxorcheysen.totalresurrection.init;

import com.leyxorcheysen.totalresurrection.common.blocks.BlockCrystalIce;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlocksInit {
	
	public static final Block CRYSTAL_ICE_BLOCK = new BlockCrystalIce();
	
	public static void registerBlocks() {
		
        setRegister(CRYSTAL_ICE_BLOCK);
        
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
    	
        setRender(CRYSTAL_ICE_BLOCK);
        
    }

    private static void setRegister(Block block) {
    	
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Block block) {
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

    }

}