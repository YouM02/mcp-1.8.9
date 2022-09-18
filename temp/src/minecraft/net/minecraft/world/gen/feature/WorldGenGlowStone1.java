package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenGlowStone1 extends WorldGenerator {
   public boolean func_180709_b(World p_180709_1_, Random p_180709_2_, BlockPos p_180709_3_) {
      if(!p_180709_1_.func_175623_d(p_180709_3_)) {
         return false;
      } else if(p_180709_1_.func_180495_p(p_180709_3_.func_177984_a()).func_177230_c() != Blocks.field_150424_aL) {
         return false;
      } else {
         p_180709_1_.func_180501_a(p_180709_3_, Blocks.field_150426_aN.func_176223_P(), 2);

         for(int lvt_4_1_ = 0; lvt_4_1_ < 1500; ++lvt_4_1_) {
            BlockPos lvt_5_1_ = p_180709_3_.func_177982_a(p_180709_2_.nextInt(8) - p_180709_2_.nextInt(8), -p_180709_2_.nextInt(12), p_180709_2_.nextInt(8) - p_180709_2_.nextInt(8));
            if(p_180709_1_.func_180495_p(lvt_5_1_).func_177230_c().func_149688_o() == Material.field_151579_a) {
               int lvt_6_1_ = 0;

               for(EnumFacing lvt_10_1_ : EnumFacing.values()) {
                  if(p_180709_1_.func_180495_p(lvt_5_1_.func_177972_a(lvt_10_1_)).func_177230_c() == Blocks.field_150426_aN) {
                     ++lvt_6_1_;
                  }

                  if(lvt_6_1_ > 1) {
                     break;
                  }
               }

               if(lvt_6_1_ == 1) {
                  p_180709_1_.func_180501_a(lvt_5_1_, Blocks.field_150426_aN.func_176223_P(), 2);
               }
            }
         }

         return true;
      }
   }
}
