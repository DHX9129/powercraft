package com.DHX.powercraft.init;

import com.DHX.powercraft.block.BlockZGFarmland;
import com.DHX.powercraft.block.BlockZGWater;
import com.DHX.powercraft.block.TestBlock;
import com.DHX.powercraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModBlocks
  {
    public static final TestBlock testblock = new TestBlock();
    public static Fluid fluidZGWater;
    public static Block blockZGWater;
    private static Fluid pcZGWater;

    public static void init()
      {
        pcZGWater = new Fluid("zgwater").setDensity(- 1000);
        FluidRegistry.registerFluid(pcZGWater);
        fluidZGWater = FluidRegistry.getFluid("zgwater");
        GameRegistry.registerBlock(testblock, "testblock");
        blockZGWater = new BlockZGWater(fluidZGWater, Material.water)
            .setBlockName(String.format(Reference.MOD_ID.toLowerCase() + ":blockzgwater"));
        GameRegistry.registerBlock(blockZGWater, "blockzgwater");
        GameRegistry.registerBlock((new BlockZGFarmland()).setHardness(0.6F).setStepSound(Block.soundTypeGravel)
            .setBlockName(String.format(Reference.MOD_ID.toLowerCase() + ":blockzgfarmland"))
            .setBlockTextureName("farmland"), "blockzgfarmland");
        fluidZGWater.setUnlocalizedName(blockZGWater.getUnlocalizedName());
      }
  }
