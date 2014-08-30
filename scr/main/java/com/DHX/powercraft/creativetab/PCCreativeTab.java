package com.DHX.powercraft.creativetab;

import com.DHX.powercraft.init.ModItems;
import com.DHX.powercraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PCCreativeTab
  {
    public static final CreativeTabs PC_Tab = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
      @Override
      public Item getTabIconItem()
        {
          return ModItems.testitem;
        }
    };
  }
