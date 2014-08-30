package com.DHX.powercraft.proxy;

import com.DHX.powercraft.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
  {
    @Override
    public void registerKeyBindings()
      {
        ClientRegistry.registerKeyBinding(KeyBindings.charge);
        ClientRegistry.registerKeyBinding(KeyBindings.release);
      }
  }
