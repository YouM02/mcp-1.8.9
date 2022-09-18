package net.minecraft.entity.monster;

import java.util.List;
import java.util.UUID;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityWitch extends EntityMob implements IRangedAttackMob {
   private static final UUID field_110184_bp = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final AttributeModifier field_110185_bq = (new AttributeModifier(field_110184_bp, "Drinking speed penalty", -0.25D, 0)).func_111168_a(false);
   private static final Item[] field_82199_d = new Item[]{Items.field_151114_aO, Items.field_151102_aT, Items.field_151137_ax, Items.field_151070_bp, Items.field_151069_bo, Items.field_151016_H, Items.field_151055_y, Items.field_151055_y};
   private int field_82200_e;

   public EntityWitch(World p_i1744_1_) {
      super(p_i1744_1_);
      this.func_70105_a(0.6F, 1.95F);
      this.field_70714_bg.func_75776_a(1, new EntityAISwimming(this));
      this.field_70714_bg.func_75776_a(2, new EntityAIArrowAttack(this, 1.0D, 60, 10.0F));
      this.field_70714_bg.func_75776_a(2, new EntityAIWander(this, 1.0D));
      this.field_70714_bg.func_75776_a(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
      this.field_70714_bg.func_75776_a(3, new EntityAILookIdle(this));
      this.field_70715_bh.func_75776_a(1, new EntityAIHurtByTarget(this, false, new Class[0]));
      this.field_70715_bh.func_75776_a(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
   }

   protected void func_70088_a() {
      super.func_70088_a();
      this.func_70096_w().func_75682_a(21, Byte.valueOf((byte)0));
   }

   protected String func_70639_aQ() {
      return null;
   }

   protected String func_70621_aR() {
      return null;
   }

   protected String func_70673_aS() {
      return null;
   }

   public void func_82197_f(boolean p_82197_1_) {
      this.func_70096_w().func_75692_b(21, Byte.valueOf((byte)(p_82197_1_?1:0)));
   }

   public boolean func_82198_m() {
      return this.func_70096_w().func_75683_a(21) == 1;
   }

   protected void func_110147_ax() {
      super.func_110147_ax();
      this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(26.0D);
      this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.25D);
   }

   public void func_70636_d() {
      if(!this.field_70170_p.field_72995_K) {
         if(this.func_82198_m()) {
            if(this.field_82200_e-- <= 0) {
               this.func_82197_f(false);
               ItemStack lvt_1_1_ = this.func_70694_bm();
               this.func_70062_b(0, (ItemStack)null);
               if(lvt_1_1_ != null && lvt_1_1_.func_77973_b() == Items.field_151068_bn) {
                  List<PotionEffect> lvt_2_1_ = Items.field_151068_bn.func_77832_l(lvt_1_1_);
                  if(lvt_2_1_ != null) {
                     for(PotionEffect lvt_4_1_ : lvt_2_1_) {
                        this.func_70690_d(new PotionEffect(lvt_4_1_));
                     }
                  }
               }

               this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111124_b(field_110185_bq);
            }
         } else {
            int lvt_1_2_ = -1;
            if(this.field_70146_Z.nextFloat() < 0.15F && this.func_70055_a(Material.field_151586_h) && !this.func_70644_a(Potion.field_76427_o)) {
               lvt_1_2_ = 8237;
            } else if(this.field_70146_Z.nextFloat() < 0.15F && this.func_70027_ad() && !this.func_70644_a(Potion.field_76426_n)) {
               lvt_1_2_ = 16307;
            } else if(this.field_70146_Z.nextFloat() < 0.05F && this.func_110143_aJ() < this.func_110138_aP()) {
               lvt_1_2_ = 16341;
            } else if(this.field_70146_Z.nextFloat() < 0.25F && this.func_70638_az() != null && !this.func_70644_a(Potion.field_76424_c) && this.func_70638_az().func_70068_e(this) > 121.0D) {
               lvt_1_2_ = 16274;
            } else if(this.field_70146_Z.nextFloat() < 0.25F && this.func_70638_az() != null && !this.func_70644_a(Potion.field_76424_c) && this.func_70638_az().func_70068_e(this) > 121.0D) {
               lvt_1_2_ = 16274;
            }

            if(lvt_1_2_ > -1) {
               this.func_70062_b(0, new ItemStack(Items.field_151068_bn, 1, lvt_1_2_));
               this.field_82200_e = this.func_70694_bm().func_77988_m();
               this.func_82197_f(true);
               IAttributeInstance lvt_2_2_ = this.func_110148_a(SharedMonsterAttributes.field_111263_d);
               lvt_2_2_.func_111124_b(field_110185_bq);
               lvt_2_2_.func_111121_a(field_110185_bq);
            }
         }

         if(this.field_70146_Z.nextFloat() < 7.5E-4F) {
            this.field_70170_p.func_72960_a(this, (byte)15);
         }
      }

      super.func_70636_d();
   }

   public void func_70103_a(byte p_70103_1_) {
      if(p_70103_1_ == 15) {
         for(int lvt_2_1_ = 0; lvt_2_1_ < this.field_70146_Z.nextInt(35) + 10; ++lvt_2_1_) {
            this.field_70170_p.func_175688_a(EnumParticleTypes.SPELL_WITCH, this.field_70165_t + this.field_70146_Z.nextGaussian() * 0.12999999523162842D, this.func_174813_aQ().field_72337_e + 0.5D + this.field_70146_Z.nextGaussian() * 0.12999999523162842D, this.field_70161_v + this.field_70146_Z.nextGaussian() * 0.12999999523162842D, 0.0D, 0.0D, 0.0D, new int[0]);
         }
      } else {
         super.func_70103_a(p_70103_1_);
      }

   }

   protected float func_70672_c(DamageSource p_70672_1_, float p_70672_2_) {
      p_70672_2_ = super.func_70672_c(p_70672_1_, p_70672_2_);
      if(p_70672_1_.func_76346_g() == this) {
         p_70672_2_ = 0.0F;
      }

      if(p_70672_1_.func_82725_o()) {
         p_70672_2_ = (float)((double)p_70672_2_ * 0.15D);
      }

      return p_70672_2_;
   }

   protected void func_70628_a(boolean p_70628_1_, int p_70628_2_) {
      int lvt_3_1_ = this.field_70146_Z.nextInt(3) + 1;

      for(int lvt_4_1_ = 0; lvt_4_1_ < lvt_3_1_; ++lvt_4_1_) {
         int lvt_5_1_ = this.field_70146_Z.nextInt(3);
         Item lvt_6_1_ = field_82199_d[this.field_70146_Z.nextInt(field_82199_d.length)];
         if(p_70628_2_ > 0) {
            lvt_5_1_ += this.field_70146_Z.nextInt(p_70628_2_ + 1);
         }

         for(int lvt_7_1_ = 0; lvt_7_1_ < lvt_5_1_; ++lvt_7_1_) {
            this.func_145779_a(lvt_6_1_, 1);
         }
      }

   }

   public void func_82196_d(EntityLivingBase p_82196_1_, float p_82196_2_) {
      if(!this.func_82198_m()) {
         EntityPotion lvt_3_1_ = new EntityPotion(this.field_70170_p, this, 32732);
         double lvt_4_1_ = p_82196_1_.field_70163_u + (double)p_82196_1_.func_70047_e() - 1.100000023841858D;
         lvt_3_1_.field_70125_A -= -20.0F;
         double lvt_6_1_ = p_82196_1_.field_70165_t + p_82196_1_.field_70159_w - this.field_70165_t;
         double lvt_8_1_ = lvt_4_1_ - this.field_70163_u;
         double lvt_10_1_ = p_82196_1_.field_70161_v + p_82196_1_.field_70179_y - this.field_70161_v;
         float lvt_12_1_ = MathHelper.func_76133_a(lvt_6_1_ * lvt_6_1_ + lvt_10_1_ * lvt_10_1_);
         if(lvt_12_1_ >= 8.0F && !p_82196_1_.func_70644_a(Potion.field_76421_d)) {
            lvt_3_1_.func_82340_a(32698);
         } else if(p_82196_1_.func_110143_aJ() >= 8.0F && !p_82196_1_.func_70644_a(Potion.field_76436_u)) {
            lvt_3_1_.func_82340_a(32660);
         } else if(lvt_12_1_ <= 3.0F && !p_82196_1_.func_70644_a(Potion.field_76437_t) && this.field_70146_Z.nextFloat() < 0.25F) {
            lvt_3_1_.func_82340_a(32696);
         }

         lvt_3_1_.func_70186_c(lvt_6_1_, lvt_8_1_ + (double)(lvt_12_1_ * 0.2F), lvt_10_1_, 0.75F, 8.0F);
         this.field_70170_p.func_72838_d(lvt_3_1_);
      }
   }

   public float func_70047_e() {
      return 1.62F;
   }
}
