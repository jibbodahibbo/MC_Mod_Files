package com.digitaleducationadventures.digimod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


import com.digitaleducationadventures.digimod.init.DigiBlocks;
import com.digitaleducationadventures.digimod.init.DigiItems;
import com.digitaleducationadventures.digimod.proxy.CommonProxy;


@Mod(modid = Reference.MOD_ID , name = Reference.MOD_NAME, version = Reference.VERSION)
public class DigiMod {
	

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	 public static final DigiTab DigiTab = new DigiTab(0, "DigiTab");

	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		DigiBlocks.init();
		DigiBlocks.register();
		DigiItems.init();
		DigiItems.register();
		
		GameRegistry.registerWorldGenerator(new OreGenerator(),2);
		
		
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	////
	
	
	
	
}
