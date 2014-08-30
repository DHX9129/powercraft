package com.DHX.powercraft.block;

import com.DHX.powercraft.creativetab.PCCreativeTab;
import com.DHX.powercraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class PCBlock extends Block
  {
    public PCBlock(Material material)
      {
        super(material);
        this.setCreativeTab(PCCreativeTab.PC_Tab);
      }

    public PCBlock()
      {
        this(Material.rock);
      }

    @Override
    public String getUnlocalizedName()
      {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
      }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
      {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
      }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
      {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
      }
  }
