package com.example.testmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = TestMod.MODID, version = TestMod.VERSION)
public class TestMod
{
    public static final String MODID = "testmod";
    public static final String VERSION = "1.0";
    
    @Instance(value = MODID)
    public static TestMod instance;
    
    // @SidedProxy(clientSide = "com.example.testmod.Proxy.ProxyClient", serverSide = "com.example.testmod.Proxy.ProxyCommon")
    //public static ProxyCommon proxy;
    
    public static CreativeTabs tabItems = new CreativeTabs("tabItems"){
    	public Item getTabIconItem(){
    		return new Item();
    	}

    };
    
    
    
    
    
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	//Crafting
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.farmland), Blocks.dirt, Items.stone_hoe);
    	GameRegistry.addShapedRecipe(new ItemStack(Blocks.end_stone), "X X", " Y ", "X X", 'X', Blocks.stone, 'Y',Items.diamond);
    	
    	//Smelting
    	GameRegistry.addSmelting(Blocks.stone, new ItemStack(Items.gold_nugget), 70.0f);
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event) {
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabItems", "en_US", "Top kek tab");
    }
    
//    @EventHandler
//    public void load(FMLInitializationEvent event) {
//    	proxy.registerRenderers();
//    }
}
