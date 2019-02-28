package com.leyxorcheysen.totalresurrection.init;

import com.leyxorcheysen.totalresurrection.world.generate.GenerateOre;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class GeneratorsInit {
	
	public static void registerGenerators() {
		
		GameRegistry.registerWorldGenerator(new GenerateOre(), 0);
		
	}

}