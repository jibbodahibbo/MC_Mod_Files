package com.digitaleducationadventures.digimod;

import java.util.Random;


import com.digitaleducationadventures.digimod.init.DigiBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

//implementing is used when we are using an interface. We are using the IWorldGenerator interface which has already been created by Minecraft.

public class OreGenerator implements IWorldGenerator {

	//We override previous code inside of minecrafts generate class that might interfere 
	@Override
	
	//This uses the generator to make declare a bunch of variables needed for ore generation
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		//this checks what world we are in
		switch (world.provider.getDimensionId()) {
			case -1: //nether, delete the line below if you don't want your block appearing in the Nether
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 0: //overworld (main world), delete the line below if you don't want your block appearing in the Overworld 
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 1: //End, delete the line below if you don't want your block appearing in the End
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;
		}
	}

	//The actual generation method. 
	private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
        for (int k = 0; k < 16; k++)
        {
        	// x y and y locations for the chunking for the ore. change the 16 to a lower number to make your ore more rare.
        	int firstBlockXCoord = chunkX + rand.nextInt(16);
            int firstBlockZCoord = chunkZ + rand.nextInt(16);
            //The below code states your ore Will be found between y = 0 and y = 100, Change this number from 100 to 20, and you will only 
            //find your ore within 20 blocks of the maps bottom.
            int blockY = rand.nextInt(100);
            
                       
            
            //these create a the block position object for both ores
            BlockPos blockPos = new BlockPos(firstBlockXCoord, blockY, firstBlockZCoord);
           
            
            //this generates the ore of your choice, 16 is the max vein size, blockpos is what controls the location of the ore
           new WorldGenMinable(DigiBlocks.DigiBlock.getDefaultState(), 16).generate(world, rand, blockPos);
          
        }
    }
}
	
	
	
	
	
	
	
