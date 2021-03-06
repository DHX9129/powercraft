package com.DHX.powercraft;

import com.DHX.powercraft.client.handlers.KeyInputEventHandler;
import com.DHX.powercraft.handlers.ConfigurationHandler;
import com.DHX.powercraft.init.ModBlocks;
import com.DHX.powercraft.init.ModItems;
import com.DHX.powercraft.init.Recipes;
import com.DHX.powercraft.reference.Reference;
import com.DHX.powercraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION,
    guiFactory = Reference.GUI_FACTORY_CLASS)
public class powercraft
  {
    @Mod.Instance(Reference.MOD_ID)
    public static powercraft instance;

    @SidedProxy(clientSide = Reference.ClIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS,
        modId = Reference.MOD_ID)
    public static com.DHX.powercraft.proxy.IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
      {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        proxy.registerKeyBindings();

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre-Initialization Complete");
      }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
      {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        Recipes.init();
        LogHelper.info("Initialization Complete");
      }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
      {
        LogHelper.info("Post-Initialization Complete");
      }
  }
