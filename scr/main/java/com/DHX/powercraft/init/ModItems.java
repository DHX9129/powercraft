package com.DHX.powercraft.init;

import com.DHX.powercraft.item.PCItem;
import com.DHX.powercraft.item.TestItem;
import com.DHX.powercraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
  {
    public static final PCItem testitem = new TestItem();

    public static void init()
      {
        GameRegistry.registerItem(testitem, "testitem");
      }
  }
