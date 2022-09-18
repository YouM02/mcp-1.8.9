package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.BlockVine;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenVines extends WorldGenerator {
   public boolean func_180709_b(World p_180709_1_, Random p_180709_2_, BlockPos p_180709_3_) {
      for(; p_180709_3_.func_177956_o() < 128; p_180709_3_ = p_180709_3_.func_177984_a()) {
         if(p_180709_1_.func_175623_d(p_180709_3_)) {
            for(EnumFacing lvt_7_1_ : EnumFacing.Plane.HORIZONTAL.func_179516_a()) {
               if(Blocks.field_150395_bd.func_176198_a(p_180709_1_, p_180709_3_, lvt_7_1_)) {
                  IBlockState lvt_8_1_ = Blocks.field_150395_bd.func_176223_P().func_177226_a(BlockVine.field_176273_b, Boolean.valueOf(lvt_7_1_ == EnumFacing.NORTH)).func_177226_a(BlockVine.field_176278_M, Boolean.valueOf(lvt_7_1_ == EnumFacing.EAST)).func_177226_a(BlockVine.field_176279_N, Boolean.valueOf(lvt_7_1_ == EnumFacing.SOUTH)).func_177226_a(BlockVine.field_176280_O, Boolean.valueOf(lvt_7_1_ == EnumFacing.WEST));
                  p_180709_1_.func_180501_a(p_180709_3_, lvt_8_1_, 2);
                  break;
               }
            }
         } else {
            p_180709_3_ = p_180709_3_.func_177982_a(p_180709_2_.nextInt(4) - p_180709_2_.nextInt(4), 0, p_180709_2_.nextInt(4) - p_180709_2_.nextInt(4));
         }
      }

      return true;
   }
}