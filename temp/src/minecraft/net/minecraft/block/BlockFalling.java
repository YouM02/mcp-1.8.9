package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockFalling extends Block {
   public static boolean field_149832_M;

   public BlockFalling() {
      super(Material.field_151595_p);
      this.func_149647_a(CreativeTabs.field_78030_b);
   }

   public BlockFalling(Material p_i45405_1_) {
      super(p_i45405_1_);
   }

   public void func_176213_c(World p_176213_1_, BlockPos p_176213_2_, IBlockState p_176213_3_) {
      p_176213_1_.func_175684_a(p_176213_2_, this, this.func_149738_a(p_176213_1_));
   }

   public void func_176204_a(World p_176204_1_, BlockPos p_176204_2_, IBlockState p_176204_3_, Block p_176204_4_) {
      p_176204_1_.func_175684_a(p_176204_2_, this, this.func_149738_a(p_176204_1_));
   }

   public void func_180650_b(World p_180650_1_, BlockPos p_180650_2_, IBlockState p_180650_3_, Random p_180650_4_) {
      if(!p_180650_1_.field_72995_K) {
         this.func_176503_e(p_180650_1_, p_180650_2_);
      }

   }

   private void func_176503_e(World p_176503_1_, BlockPos p_176503_2_) {
      if(func_180685_d(p_176503_1_, p_176503_2_.func_177977_b()) && p_176503_2_.func_177956_o() >= 0) {
         int lvt_3_1_ = 32;
         if(!field_149832_M && p_176503_1_.func_175707_a(p_176503_2_.func_177982_a(-lvt_3_1_, -lvt_3_1_, -lvt_3_1_), p_176503_2_.func_177982_a(lvt_3_1_, lvt_3_1_, lvt_3_1_))) {
            if(!p_176503_1_.field_72995_K) {
               EntityFallingBlock lvt_4_2_ = new EntityFallingBlock(p_176503_1_, (double)p_176503_2_.func_177958_n() + 0.5D, (double)p_176503_2_.func_177956_o(), (double)p_176503_2_.func_177952_p() + 0.5D, p_176503_1_.func_180495_p(p_176503_2_));
               this.func_149829_a(lvt_4_2_);
               p_176503_1_.func_72838_d(lvt_4_2_);
            }
         } else {
            p_176503_1_.func_175698_g(p_176503_2_);

            BlockPos lvt_4_1_;
            for(lvt_4_1_ = p_176503_2_.func_177977_b(); func_180685_d(p_176503_1_, lvt_4_1_) && lvt_4_1_.func_177956_o() > 0; lvt_4_1_ = lvt_4_1_.func_177977_b()) {
               ;
            }

            if(lvt_4_1_.func_177956_o() > 0) {
               p_176503_1_.func_175656_a(lvt_4_1_.func_177984_a(), this.func_176223_P());
            }
         }

      }
   }

   protected void func_149829_a(EntityFallingBlock p_149829_1_) {
   }

   public int func_149738_a(World p_149738_1_) {
      return 2;
   }

   public static boolean func_180685_d(World p_180685_0_, BlockPos p_180685_1_) {
      Block lvt_2_1_ = p_180685_0_.func_180495_p(p_180685_1_).func_177230_c();
      Material lvt_3_1_ = lvt_2_1_.field_149764_J;
      return lvt_2_1_ == Blocks.field_150480_ab || lvt_3_1_ == Material.field_151579_a || lvt_3_1_ == Material.field_151586_h || lvt_3_1_ == Material.field_151587_i;
   }

   public void func_176502_a_(World p_176502_1_, BlockPos p_176502_2_) {
   }
}
