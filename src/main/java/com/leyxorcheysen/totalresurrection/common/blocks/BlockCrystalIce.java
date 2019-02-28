package com.leyxorcheysen.totalresurrection.common.blocks;

import java.util.List;
import java.util.Random;

import com.leyxorcheysen.totalresurrection.init.ItemsInit;
import com.leyxorcheysen.totalresurrection.init.TabsInit;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockCrystalIce extends Block {
	
	public BlockCrystalIce() {
		
		super(Material.ICE);
		
		this.setCreativeTab(TabsInit.TOTAL_RESURRECTION);
		this.setHardness(2.0F);
		this.setLightLevel(5.0F);
		this.setLightOpacity(75);
		this.setRegistryName("crystal_ice_block");
		this.setResistance(2.0F);
		this.setUnlocalizedName("crystal_ice_block");
		this.setSoundType(SoundType.GLASS);
		
	}
	
	@Override 
	public boolean isFullCube(IBlockState state)    {

		return true;

	}

	@SuppressWarnings("deprecation")
	@Override
	 public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos,IBlockState state, int fortune) {
		
		Random rand = new Random();
		
		java.util.List<ItemStack> ret = super.getDrops(world, pos, state,fortune);
		
		ret.add(new ItemStack(ItemsInit.CRYSTAL_ICE, 1 + rand.nextInt(3)));
		
		return ret;
		
	 }

}