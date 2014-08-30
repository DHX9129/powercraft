package com.DHX.powercraft.item;


import com.DHX.powercraft.creativetab.PCCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class ZGSeeds extends Item implements IPlantable
  {
    private Block plantBlock;
    /** BlockID of the block the seeds can be planted on. */
    private Block soilBlockID;

    public ZGSeeds(Block CropBlock, Block soilBlock)
      {
        this.plantBlock = CropBlock;
        this.soilBlockID = soilBlock;
        this.setCreativeTab(PCCreativeTab.PC_Tab);
      }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x,
                             int y, int z, int side, float p_77648_8_, float p_77648_9_,
                             float p_77648_10_)
      {
        if(side != 0)
          {
            return false;
          } else if(player.canPlayerEdit(x, y, z, side, itemStack) &&
            player.canPlayerEdit(x, y - 1, z, side, itemStack))
          {
            if(world.getBlock(x, y, z)
                .canSustainPlant(world, x, y, z, ForgeDirection.DOWN, this) &&
                world.isAirBlock(x, y - 1, z))
              {
                world.setBlock(x, y - 1, z, this.plantBlock);
                -- itemStack.stackSize;
                return true;
              } else
              {
                return false;
              }
          } else
          {
            return false;
          }
      }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z)
      {
        return plantBlock == Blocks.nether_wart ? EnumPlantType.Nether : EnumPlantType.Crop;
      }

    @Override
    public Block getPlant(IBlockAccess world, int x, int y, int z)
      {
        return plantBlock;
      }

    @Override
    public int getPlantMetadata(IBlockAccess world, int x, int y, int z)
      {
        return 0;
      }
  }
