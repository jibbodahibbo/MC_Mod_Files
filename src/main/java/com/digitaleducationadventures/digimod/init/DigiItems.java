package com.digitaleducationadventures.digimod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.digitaleducationadventures.digimod.DigiMod;
import com.digitaleducationadventures.digimod.Reference;
import com.digitaleducationadventures.digimod.item.ItemDigiArmorMaterial;
import com.digitaleducationadventures.digimod.item.ItemDigiAxe;
import com.digitaleducationadventures.digimod.item.ItemDigiHoe;
import com.digitaleducationadventures.digimod.item.ItemDigiPickaxe;
import com.digitaleducationadventures.digimod.item.ItemDigiSpade;
import com.digitaleducationadventures.digimod.item.ItemDigiSword;

public class DigiItems {
	
	public static Item DigiSpecs;
	
	public static Item DigiSword;
	public static Item DigiPickaxe;
	public static Item DigiAxe;
	public static Item DigiSpade;
	public static Item DigiHoe;
	
	public static Item DigiHelmet;
	public static Item DigiChest;
	public static Item DigiBoots;
	public static Item DigiLegs;
	
	public static Item DigiFood;
	
	
	
	public static final Item.ToolMaterial DigiToolMaterial = EnumHelper.addToolMaterial("DigiToolMaterial", 3, 2000, 5.0F, 6.0F, 15);

	public static final ItemArmor.ArmorMaterial DigiArmorMaterial = EnumHelper.addArmorMaterial("DigiArmorMaterial", "DigiArmor", 47, new int []{13,40,24,12},30);

	
	public static void init(){
		
		DigiSword = new ItemDigiSword(DigiToolMaterial).setUnlocalizedName("DigiSword").setCreativeTab(DigiMod.DigiTab);
		DigiPickaxe = new ItemDigiPickaxe(DigiToolMaterial).setUnlocalizedName("DigiPickaxe").setCreativeTab(DigiMod.DigiTab);
		DigiAxe = new ItemDigiAxe(DigiToolMaterial).setUnlocalizedName("DigiAxe").setCreativeTab(DigiMod.DigiTab);
		DigiSpade = new ItemDigiSpade(DigiToolMaterial).setUnlocalizedName("DigiSpade").setCreativeTab(DigiMod.DigiTab);
		DigiHoe = new ItemDigiHoe(DigiToolMaterial).setUnlocalizedName("DigiHoe").setCreativeTab(DigiMod.DigiTab);
		
		DigiSpecs = new Item().setUnlocalizedName("DigiSpecs").setCreativeTab(DigiMod.DigiTab);
		
		DigiHelmet = new ItemDigiArmorMaterial(DigiArmorMaterial,0,0).setUnlocalizedName("DigiHelmet").setCreativeTab(DigiMod.DigiTab);
		DigiChest = new  ItemDigiArmorMaterial(DigiArmorMaterial,0,1).setUnlocalizedName("DigiChest").setCreativeTab(DigiMod.DigiTab);
		DigiLegs = new ItemDigiArmorMaterial(DigiArmorMaterial,0,2).setUnlocalizedName("DigiLegs").setCreativeTab(DigiMod.DigiTab);
		DigiBoots = new  ItemDigiArmorMaterial(DigiArmorMaterial,0,3).setUnlocalizedName("DigiBoots").setCreativeTab(DigiMod.DigiTab);

		DigiFood = new ItemFood(10 , 1.0F, true).setUnlocalizedName("DigiFood").setCreativeTab(DigiMod.DigiTab);
		
		
	}
	
	public static void register(){
		
		GameRegistry.registerItem(DigiFood, DigiFood.getUnlocalizedName().substring(5));
		
		
		GameRegistry.registerItem(DigiSpecs, DigiSpecs.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(DigiSword, DigiSword.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(DigiSpade, DigiSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(DigiAxe, DigiAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(DigiPickaxe, DigiPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(DigiHoe, DigiHoe.getUnlocalizedName().substring(5));
		
		
		GameRegistry.registerItem(DigiHelmet, DigiHelmet.getUnlocalizedName().substring(5)); 
		GameRegistry.registerItem(DigiChest, DigiChest.getUnlocalizedName().substring(5)); 
		GameRegistry.registerItem(DigiLegs, DigiLegs.getUnlocalizedName().substring(5)); 
		GameRegistry.registerItem(DigiBoots, DigiBoots.getUnlocalizedName().substring(5)); 
		
		
		GameRegistry.addRecipe(new ItemStack(DigiItems.DigiSword), new Object[]{" D ",
																	  " S ",
																	  " S ", 'D', DigiItems.DigiSpecs, 'S', Items.stick});
	
		GameRegistry.addRecipe(new ItemStack(DigiAxe), new Object[]{"DD ",
			                                                        "DS ",
			                                                        " S ", 'D', DigiItems.DigiSpecs, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(DigiSpade), new Object[]{" D ",
			                                                          "DSD",
			                                                          " S ", 'D', DigiItems.DigiSpecs, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(DigiHoe), new Object[]{"DD ",
			                                                        " S ",
			                                                        " S ", 'D', DigiItems.DigiSpecs, 'S', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(DigiPickaxe), new Object[]{"DDD",
																	   " S ",
																	   " S ", 'D', DigiItems.DigiSpecs, 'S', Items.stick});

		
		
		
		GameRegistry.addRecipe(new ItemStack(DigiChest), new Object[]{"   ",
																      "DDD",
																      "   ", 'D', DigiBlocks.DigiBlock});
		
		
        GameRegistry.addRecipe(new ItemStack(DigiHelmet), new Object[]{" D ",
																	 "D D",
																	 "   ", 'D', DigiBlocks.DigiBlock});
		
		GameRegistry.addRecipe(new ItemStack(DigiLegs), new Object[]{"   ",
			 														 "D D",
			 														 "D D", 'D', DigiBlocks.DigiBlock});
		
		GameRegistry.addRecipe(new ItemStack(DigiBoots), new Object[]{"   ",
																	 " D ",
																	 "D D", 'D', DigiBlocks.DigiBlock});
		
		GameRegistry.addRecipe(new ItemStack(DigiFood), new Object[]{" D ",
																	 "DAD",
																	 " D ", 'D', DigiItems.DigiSpecs, 'A', Items.apple});

		
		GameRegistry.addSmelting(DigiBlocks.DigiBlock, new ItemStack(DigiSpecs), 5.0F); 
	
	}

	public static void registerRenders(){
		registerRender(DigiSpecs);
		registerRender(DigiSword);
		
		registerRender(DigiHoe);
		registerRender(DigiSpade);
		registerRender(DigiAxe);
		registerRender(DigiPickaxe);
		
		registerRender(DigiHelmet);
		registerRender(DigiChest);
		registerRender(DigiLegs);
		registerRender(DigiBoots);
		
		registerRender(DigiFood);
		
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
	}
	
	
}
