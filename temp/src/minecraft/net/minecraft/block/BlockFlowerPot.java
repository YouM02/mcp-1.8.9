package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFlowerPot;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.StatCollector;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockFlowerPot extends BlockContainer {
   public static final PropertyInteger field_176444_a = PropertyInteger.func_177719_a("legacy_data", 0, 15);
   public static final PropertyEnum<BlockFlowerPot.EnumFlowerType> field_176443_b = PropertyEnum.<BlockFlowerPot.EnumFlowerType>func_177709_a("contents", BlockFlowerPot.EnumFlowerType.class);

   public BlockFlowerPot() {
      super(Material.field_151594_q);
      this.func_180632_j(this.field_176227_L.func_177621_b().func_177226_a(field_176443_b, BlockFlowerPot.EnumFlowerType.EMPTY).func_177226_a(field_176444_a, Integer.valueOf(0)));
      this.func_149683_g();
   }

   public String func_149732_F() {
      return StatCollector.func_74838_a("item.flowerPot.name");
   }

   public void func_149683_g() {
      float lvt_1_1_ = 0.375F;
      float lvt_2_1_ = lvt_1_1_ / 2.0F;
      this.func_149676_a(0.5F - lvt_2_1_, 0.0F, 0.5F - lvt_2_1_, 0.5F + lvt_2_1_, lvt_1_1_, 0.5F + lvt_2_1_);
   }

   public boolean func_149662_c() {
      return false;
   }

   public int func_149645_b() {
      return 3;
   }

   public boolean func_149686_d() {
      return false;
   }

   public int func_180662_a(IBlockAccess p_180662_1_, BlockPos p_180662_2_, int p_180662_3_) {
      TileEntity lvt_4_1_ = p_180662_1_.func_175625_s(p_180662_2_);
      if(lvt_4_1_ instanceof TileEntityFlowerPot) {
         Item lvt_5_1_ = ((TileEntityFlowerPot)lvt_4_1_).func_145965_a();
         if(lvt_5_1_ instanceof ItemBlock) {
            return Block.func_149634_a(lvt_5_1_).func_180662_a(p_180662_1_, p_180662_2_, p_180662_3_);
         }
      }

      return 16777215;
   }

   public boolean func_180639_a(World p_180639_1_, BlockPos p_180639_2_, IBlockState p_180639_3_, EntityPlayer p_180639_4_, EnumFacing p_180639_5_, float p_180639_6_, float p_180639_7_, float p_180639_8_) {
      ItemStack lvt_9_1_ = p_180639_4_.field_71071_by.func_70448_g();
      if(lvt_9_1_ != null && lvt_9_1_.func_77973_b() instanceof ItemBlock) {
         TileEntityFlowerPot lvt_10_1_ = this.func_176442_d(p_180639_1_, p_180639_2_);
         if(lvt_10_1_ == null) {
            return false;
         } else if(lvt_10_1_.func_145965_a() != null) {
            return false;
         } else {
            Block lvt_11_1_ = Block.func_149634_a(lvt_9_1_.func_77973_b());
            if(!this.func_149928_a(lvt_11_1_, lvt_9_1_.func_77960_j())) {
               return false;
            } else {
               lvt_10_1_.func_145964_a(lvt_9_1_.func_77973_b(), lvt_9_1_.func_77960_j());
               lvt_10_1_.func_70296_d();
               p_180639_1_.func_175689_h(p_180639_2_);
               p_180639_4_.func_71029_a(StatList.field_181736_T);
               if(!p_180639_4_.field_71075_bZ.field_75098_d && --lvt_9_1_.field_77994_a <= 0) {
                  p_180639_4_.field_71071_by.func_70299_a(p_180639_4_.field_71071_by.field_70461_c, (ItemStack)null);
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   private boolean func_149928_a(Block p_149928_1_, int p_149928_2_) {
      return p_149928_1_ != Blocks.field_150327_N && p_149928_1_ != Blocks.field_150328_O && p_149928_1_ != Blocks.field_150434_aF && p_149928_1_ != Blocks.field_150338_P && p_149928_1_ != Blocks.field_150337_Q && p_149928_1_ != Blocks.field_150345_g && p_149928_1_ != Blocks.field_150330_I?p_149928_1_ == Blocks.field_150329_H && p_149928_2_ == BlockTallGrass.EnumType.FERN.func_177044_a():true;
   }

   public Item func_180665_b(World p_180665_1_, BlockPos p_180665_2_) {
      TileEntityFlowerPot lvt_3_1_ = this.func_176442_d(p_180665_1_, p_180665_2_);
      return lvt_3_1_ != null && lvt_3_1_.func_145965_a() != null?lvt_3_1_.func_145965_a():Items.field_151162_bE;
   }

   public int func_176222_j(World p_176222_1_, BlockPos p_176222_2_) {
      TileEntityFlowerPot lvt_3_1_ = this.func_176442_d(p_176222_1_, p_176222_2_);
      return lvt_3_1_ != null && lvt_3_1_.func_145965_a() != null?lvt_3_1_.func_145966_b():0;
   }

   public boolean func_149648_K() {
      return true;
   }

   public boolean func_176196_c(World p_176196_1_, BlockPos p_176196_2_) {
      return super.func_176196_c(p_176196_1_, p_176196_2_) && World.func_175683_a(p_176196_1_, p_176196_2_.func_177977_b());
   }

   public void func_176204_a(World p_176204_1_, BlockPos p_176204_2_, IBlockState p_176204_3_, Block p_176204_4_) {
      if(!World.func_175683_a(p_176204_1_, p_176204_2_.func_177977_b())) {
         this.func_176226_b(p_176204_1_, p_176204_2_, p_176204_3_, 0);
         p_176204_1_.func_175698_g(p_176204_2_);
      }

   }

   public void func_180663_b(World p_180663_1_, BlockPos p_180663_2_, IBlockState p_180663_3_) {
      TileEntityFlowerPot lvt_4_1_ = this.func_176442_d(p_180663_1_, p_180663_2_);
      if(lvt_4_1_ != null && lvt_4_1_.func_145965_a() != null) {
         func_180635_a(p_180663_1_, p_180663_2_, new ItemStack(lvt_4_1_.func_145965_a(), 1, lvt_4_1_.func_145966_b()));
      }

      super.func_180663_b(p_180663_1_, p_180663_2_, p_180663_3_);
   }

   public void func_176208_a(World p_176208_1_, BlockPos p_176208_2_, IBlockState p_176208_3_, EntityPlayer p_176208_4_) {
      super.func_176208_a(p_176208_1_, p_176208_2_, p_176208_3_, p_176208_4_);
      if(p_176208_4_.field_71075_bZ.field_75098_d) {
         TileEntityFlowerPot lvt_5_1_ = this.func_176442_d(p_176208_1_, p_176208_2_);
         if(lvt_5_1_ != null) {
            lvt_5_1_.func_145964_a((Item)null, 0);
         }
      }

   }

   public Item func_180660_a(IBlockState p_180660_1_, Random p_180660_2_, int p_180660_3_) {
      return Items.field_151162_bE;
   }

   private TileEntityFlowerPot func_176442_d(World p_176442_1_, BlockPos p_176442_2_) {
      TileEntity lvt_3_1_ = p_176442_1_.func_175625_s(p_176442_2_);
      return lvt_3_1_ instanceof TileEntityFlowerPot?(TileEntityFlowerPot)lvt_3_1_:null;
   }

   public TileEntity func_149915_a(World p_149915_1_, int p_149915_2_) {
      Block lvt_3_1_ = null;
      int lvt_4_1_ = 0;
      switch(p_149915_2_) {
      case 1:
         lvt_3_1_ = Blocks.field_150328_O;
         lvt_4_1_ = BlockFlower.EnumFlowerType.POPPY.func_176968_b();
         break;
      case 2:
         lvt_3_1_ = Blocks.field_150327_N;
         break;
      case 3:
         lvt_3_1_ = Blocks.field_150345_g;
         lvt_4_1_ = BlockPlanks.EnumType.OAK.func_176839_a();
         break;
      case 4:
         lvt_3_1_ = Blocks.field_150345_g;
         lvt_4_1_ = BlockPlanks.EnumType.SPRUCE.func_176839_a();
         break;
      case 5:
         lvt_3_1_ = Blocks.field_150345_g;
         lvt_4_1_ = BlockPlanks.EnumType.BIRCH.func_176839_a();
         break;
      case 6:
         lvt_3_1_ = Blocks.field_150345_g;
         lvt_4_1_ = BlockPlanks.EnumType.JUNGLE.func_176839_a();
         break;
      case 7:
         lvt_3_1_ = Blocks.field_150337_Q;
         break;
      case 8:
         lvt_3_1_ = Blocks.field_150338_P;
         break;
      case 9:
         lvt_3_1_ = Blocks.field_150434_aF;
         break;
      case 10:
         lvt_3_1_ = Blocks.field_150330_I;
         break;
      case 11:
         lvt_3_1_ = Blocks.field_150329_H;
         lvt_4_1_ = BlockTallGrass.EnumType.FERN.func_177044_a();
         break;
      case 12:
         lvt_3_1_ = Blocks.field_150345_g;
         lvt_4_1_ = BlockPlanks.EnumType.ACACIA.func_176839_a();
         break;
      case 13:
         lvt_3_1_ = Blocks.field_150345_g;
         lvt_4_1_ = BlockPlanks.EnumType.DARK_OAK.func_176839_a();
      }

      return new TileEntityFlowerPot(Item.func_150898_a(lvt_3_1_), lvt_4_1_);
   }

   protected BlockState func_180661_e() {
      return new BlockState(this, new IProperty[]{field_176443_b, field_176444_a});
   }

   public int func_176201_c(IBlockState p_176201_1_) {
      return ((Integer)p_176201_1_.func_177229_b(field_176444_a)).intValue();
   }

   public IBlockState func_176221_a(IBlockState p_176221_1_, IBlockAccess p_176221_2_, BlockPos p_176221_3_) {
      BlockFlowerPot.EnumFlowerType lvt_4_1_ = BlockFlowerPot.EnumFlowerType.EMPTY;
      TileEntity lvt_5_1_ = p_176221_2_.func_175625_s(p_176221_3_);
      if(lvt_5_1_ instanceof TileEntityFlowerPot) {
         TileEntityFlowerPot lvt_6_1_ = (TileEntityFlowerPot)lvt_5_1_;
         Item lvt_7_1_ = lvt_6_1_.func_145965_a();
         if(lvt_7_1_ instanceof ItemBlock) {
            int lvt_8_1_ = lvt_6_1_.func_145966_b();
            Block lvt_9_1_ = Block.func_149634_a(lvt_7_1_);
            if(lvt_9_1_ == Blocks.field_150345_g) {
               switch(BlockPlanks.EnumType.func_176837_a(lvt_8_1_)) {
               case OAK:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.OAK_SAPLING;
                  break;
               case SPRUCE:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.SPRUCE_SAPLING;
                  break;
               case BIRCH:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.BIRCH_SAPLING;
                  break;
               case JUNGLE:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.JUNGLE_SAPLING;
                  break;
               case ACACIA:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.ACACIA_SAPLING;
                  break;
               case DARK_OAK:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.DARK_OAK_SAPLING;
                  break;
               default:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.EMPTY;
               }
            } else if(lvt_9_1_ == Blocks.field_150329_H) {
               switch(lvt_8_1_) {
               case 0:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.DEAD_BUSH;
                  break;
               case 2:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.FERN;
                  break;
               default:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.EMPTY;
               }
            } else if(lvt_9_1_ == Blocks.field_150327_N) {
               lvt_4_1_ = BlockFlowerPot.EnumFlowerType.DANDELION;
            } else if(lvt_9_1_ == Blocks.field_150328_O) {
               switch(BlockFlower.EnumFlowerType.func_176967_a(BlockFlower.EnumFlowerColor.RED, lvt_8_1_)) {
               case POPPY:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.POPPY;
                  break;
               case BLUE_ORCHID:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.BLUE_ORCHID;
                  break;
               case ALLIUM:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.ALLIUM;
                  break;
               case HOUSTONIA:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.HOUSTONIA;
                  break;
               case RED_TULIP:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.RED_TULIP;
                  break;
               case ORANGE_TULIP:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.ORANGE_TULIP;
                  break;
               case WHITE_TULIP:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.WHITE_TULIP;
                  break;
               case PINK_TULIP:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.PINK_TULIP;
                  break;
               case OXEYE_DAISY:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.OXEYE_DAISY;
                  break;
               default:
                  lvt_4_1_ = BlockFlowerPot.EnumFlowerType.EMPTY;
               }
            } else if(lvt_9_1_ == Blocks.field_150337_Q) {
               lvt_4_1_ = BlockFlowerPot.EnumFlowerType.MUSHROOM_RED;
            } else if(lvt_9_1_ == Blocks.field_150338_P) {
               lvt_4_1_ = BlockFlowerPot.EnumFlowerType.MUSHROOM_BROWN;
            } else if(lvt_9_1_ == Blocks.field_150330_I) {
               lvt_4_1_ = BlockFlowerPot.EnumFlowerType.DEAD_BUSH;
            } else if(lvt_9_1_ == Blocks.field_150434_aF) {
               lvt_4_1_ = BlockFlowerPot.EnumFlowerType.CACTUS;
            }
         }
      }

      return p_176221_1_.func_177226_a(field_176443_b, lvt_4_1_);
   }

   public EnumWorldBlockLayer func_180664_k() {
      return EnumWorldBlockLayer.CUTOUT;
   }

   public static enum EnumFlowerType implements IStringSerializable {
      EMPTY("empty"),
      POPPY("rose"),
      BLUE_ORCHID("blue_orchid"),
      ALLIUM("allium"),
      HOUSTONIA("houstonia"),
      RED_TULIP("red_tulip"),
      ORANGE_TULIP("orange_tulip"),
      WHITE_TULIP("white_tulip"),
      PINK_TULIP("pink_tulip"),
      OXEYE_DAISY("oxeye_daisy"),
      DANDELION("dandelion"),
      OAK_SAPLING("oak_sapling"),
      SPRUCE_SAPLING("spruce_sapling"),
      BIRCH_SAPLING("birch_sapling"),
      JUNGLE_SAPLING("jungle_sapling"),
      ACACIA_SAPLING("acacia_sapling"),
      DARK_OAK_SAPLING("dark_oak_sapling"),
      MUSHROOM_RED("mushroom_red"),
      MUSHROOM_BROWN("mushroom_brown"),
      DEAD_BUSH("dead_bush"),
      FERN("fern"),
      CACTUS("cactus");

      private final String field_177006_w;

      private EnumFlowerType(String p_i45715_3_) {
         this.field_177006_w = p_i45715_3_;
      }

      public String toString() {
         return this.field_177006_w;
      }

      public String func_176610_l() {
         return this.field_177006_w;
      }
   }
}
