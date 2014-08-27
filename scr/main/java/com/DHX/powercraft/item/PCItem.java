package com.DHX.powercraft.item;

import com.DHX.powercraft.reference.Reference;
import com.DHX.powercraft.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PCItem extends Item
  {
    public PCItem()
      {
        super();

        //this.setCreativeTab(CreativeTabPC.PC_TAB);
      }

    @Override
    public String getUnlocalizedName()
      {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":",
            getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
      }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
      {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":",
            getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
      }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
      {
        itemIcon = iconRegister.registerIcon(this.getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
        LogHelper.info(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
      }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
      {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
      }
  }