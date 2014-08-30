package com.DHX.powercraft.block;

import com.DHX.powercraft.creativetab.PCCreativeTab;
import net.minecraft.block.material.Material;

public class TestBlock extends PCBlock
  {
    public TestBlock()
      {
        super(Material.anvil);
        this.setBlockName("testblock");
        this.setBlockTextureName("testblock");
        this.setCreativeTab(PCCreativeTab.PC_Tab);
      }
  }
