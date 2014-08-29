package com.DHX.powercraft.init;

import com.DHX.powercraft.item.PCItem;
import com.DHX.powercraft.item.TestItem;
import com.DHX.powercraft.item.ZGHoe;
import com.DHX.powercraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
  {
    public static final PCItem testitem = new TestItem();
    public static final Item zghoe = new ZGHoe(Item.ToolMaterial.EMERALD).setUnlocalizedName(String.format(Reference.MOD_ID.toLowerCase() + ":zghoe")).setTextureName("diamond_hoe");

    public static void init()
      {
        GameRegistry.registerItem(testitem, "testitem");
        GameRegistry.registerItem(zghoe, "zghoe");
      }
  }
