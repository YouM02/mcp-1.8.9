package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.util.MathHelper;

public class ModelHorse extends ModelBase {
   private ModelRenderer field_110709_a;
   private ModelRenderer field_178711_b;
   private ModelRenderer field_178712_c;
   private ModelRenderer field_110705_d;
   private ModelRenderer field_110706_e;
   private ModelRenderer field_110703_f;
   private ModelRenderer field_110704_g;
   private ModelRenderer field_110716_h;
   private ModelRenderer field_110717_i;
   private ModelRenderer field_110714_j;
   private ModelRenderer field_110715_k;
   private ModelRenderer field_110712_l;
   private ModelRenderer field_110713_m;
   private ModelRenderer field_110710_n;
   private ModelRenderer field_110711_o;
   private ModelRenderer field_110719_v;
   private ModelRenderer field_110718_w;
   private ModelRenderer field_110722_x;
   private ModelRenderer field_110721_y;
   private ModelRenderer field_110720_z;
   private ModelRenderer field_110688_A;
   private ModelRenderer field_110689_B;
   private ModelRenderer field_110690_C;
   private ModelRenderer field_110684_D;
   private ModelRenderer field_110685_E;
   private ModelRenderer field_110686_F;
   private ModelRenderer field_110687_G;
   private ModelRenderer field_110695_H;
   private ModelRenderer field_110696_I;
   private ModelRenderer field_110697_J;
   private ModelRenderer field_110698_K;
   private ModelRenderer field_110691_L;
   private ModelRenderer field_110692_M;
   private ModelRenderer field_110693_N;
   private ModelRenderer field_110694_O;
   private ModelRenderer field_110700_P;
   private ModelRenderer field_110699_Q;
   private ModelRenderer field_110702_R;
   private ModelRenderer field_110701_S;

   public ModelHorse() {
      this.field_78090_t = 128;
      this.field_78089_u = 128;
      this.field_110715_k = new ModelRenderer(this, 0, 34);
      this.field_110715_k.func_78789_a(-5.0F, -8.0F, -19.0F, 10, 10, 24);
      this.field_110715_k.func_78793_a(0.0F, 11.0F, 9.0F);
      this.field_110712_l = new ModelRenderer(this, 44, 0);
      this.field_110712_l.func_78789_a(-1.0F, -1.0F, 0.0F, 2, 2, 3);
      this.field_110712_l.func_78793_a(0.0F, 3.0F, 14.0F);
      this.func_110682_a(this.field_110712_l, -1.134464F, 0.0F, 0.0F);
      this.field_110713_m = new ModelRenderer(this, 38, 7);
      this.field_110713_m.func_78789_a(-1.5F, -2.0F, 3.0F, 3, 4, 7);
      this.field_110713_m.func_78793_a(0.0F, 3.0F, 14.0F);
      this.func_110682_a(this.field_110713_m, -1.134464F, 0.0F, 0.0F);
      this.field_110710_n = new ModelRenderer(this, 24, 3);
      this.field_110710_n.func_78789_a(-1.5F, -4.5F, 9.0F, 3, 4, 7);
      this.field_110710_n.func_78793_a(0.0F, 3.0F, 14.0F);
      this.func_110682_a(this.field_110710_n, -1.40215F, 0.0F, 0.0F);
      this.field_110711_o = new ModelRenderer(this, 78, 29);
      this.field_110711_o.func_78789_a(-2.5F, -2.0F, -2.5F, 4, 9, 5);
      this.field_110711_o.func_78793_a(4.0F, 9.0F, 11.0F);
      this.field_110719_v = new ModelRenderer(this, 78, 43);
      this.field_110719_v.func_78789_a(-2.0F, 0.0F, -1.5F, 3, 5, 3);
      this.field_110719_v.func_78793_a(4.0F, 16.0F, 11.0F);
      this.field_110718_w = new ModelRenderer(this, 78, 51);
      this.field_110718_w.func_78789_a(-2.5F, 5.1F, -2.0F, 4, 3, 4);
      this.field_110718_w.func_78793_a(4.0F, 16.0F, 11.0F);
      this.field_110722_x = new ModelRenderer(this, 96, 29);
      this.field_110722_x.func_78789_a(-1.5F, -2.0F, -2.5F, 4, 9, 5);
      this.field_110722_x.func_78793_a(-4.0F, 9.0F, 11.0F);
      this.field_110721_y = new ModelRenderer(this, 96, 43);
      this.field_110721_y.func_78789_a(-1.0F, 0.0F, -1.5F, 3, 5, 3);
      this.field_110721_y.func_78793_a(-4.0F, 16.0F, 11.0F);
      this.field_110720_z = new ModelRenderer(this, 96, 51);
      this.field_110720_z.func_78789_a(-1.5F, 5.1F, -2.0F, 4, 3, 4);
      this.field_110720_z.func_78793_a(-4.0F, 16.0F, 11.0F);
      this.field_110688_A = new ModelRenderer(this, 44, 29);
      this.field_110688_A.func_78789_a(-1.9F, -1.0F, -2.1F, 3, 8, 4);
      this.field_110688_A.func_78793_a(4.0F, 9.0F, -8.0F);
      this.field_110689_B = new ModelRenderer(this, 44, 41);
      this.field_110689_B.func_78789_a(-1.9F, 0.0F, -1.6F, 3, 5, 3);
      this.field_110689_B.func_78793_a(4.0F, 16.0F, -8.0F);
      this.field_110690_C = new ModelRenderer(this, 44, 51);
      this.field_110690_C.func_78789_a(-2.4F, 5.1F, -2.1F, 4, 3, 4);
      this.field_110690_C.func_78793_a(4.0F, 16.0F, -8.0F);
      this.field_110684_D = new ModelRenderer(this, 60, 29);
      this.field_110684_D.func_78789_a(-1.1F, -1.0F, -2.1F, 3, 8, 4);
      this.field_110684_D.func_78793_a(-4.0F, 9.0F, -8.0F);
      this.field_110685_E = new ModelRenderer(this, 60, 41);
      this.field_110685_E.func_78789_a(-1.1F, 0.0F, -1.6F, 3, 5, 3);
      this.field_110685_E.func_78793_a(-4.0F, 16.0F, -8.0F);
      this.field_110686_F = new ModelRenderer(this, 60, 51);
      this.field_110686_F.func_78789_a(-1.6F, 5.1F, -2.1F, 4, 3, 4);
      this.field_110686_F.func_78793_a(-4.0F, 16.0F, -8.0F);
      this.field_110709_a = new ModelRenderer(this, 0, 0);
      this.field_110709_a.func_78789_a(-2.5F, -10.0F, -1.5F, 5, 5, 7);
      this.field_110709_a.func_78793_a(0.0F, 4.0F, -10.0F);
      this.func_110682_a(this.field_110709_a, 0.5235988F, 0.0F, 0.0F);
      this.field_178711_b = new ModelRenderer(this, 24, 18);
      this.field_178711_b.func_78789_a(-2.0F, -10.0F, -7.0F, 4, 3, 6);
      this.field_178711_b.func_78793_a(0.0F, 3.95F, -10.0F);
      this.func_110682_a(this.field_178711_b, 0.5235988F, 0.0F, 0.0F);
      this.field_178712_c = new ModelRenderer(this, 24, 27);
      this.field_178712_c.func_78789_a(-2.0F, -7.0F, -6.5F, 4, 2, 5);
      this.field_178712_c.func_78793_a(0.0F, 4.0F, -10.0F);
      this.func_110682_a(this.field_178712_c, 0.5235988F, 0.0F, 0.0F);
      this.field_110709_a.func_78792_a(this.field_178711_b);
      this.field_110709_a.func_78792_a(this.field_178712_c);
      this.field_110705_d = new ModelRenderer(this, 0, 0);
      this.field_110705_d.func_78789_a(0.45F, -12.0F, 4.0F, 2, 3, 1);
      this.field_110705_d.func_78793_a(0.0F, 4.0F, -10.0F);
      this.func_110682_a(this.field_110705_d, 0.5235988F, 0.0F, 0.0F);
      this.field_110706_e = new ModelRenderer(this, 0, 0);
      this.field_110706_e.func_78789_a(-2.45F, -12.0F, 4.0F, 2, 3, 1);
      this.field_110706_e.func_78793_a(0.0F, 4.0F, -10.0F);
      this.func_110682_a(this.field_110706_e, 0.5235988F, 0.0F, 0.0F);
      this.field_110703_f = new ModelRenderer(this, 0, 12);
      this.field_110703_f.func_78789_a(-2.0F, -16.0F, 4.0F, 2, 7, 1);
      this.field_110703_f.func_78793_a(0.0F, 4.0F, -10.0F);
      this.func_110682_a(this.field_110703_f, 0.5235988F, 0.0F, 0.2617994F);
      this.field_110704_g = new ModelRenderer(this, 0, 12);
      this.field_110704_g.func_78789_a(0.0F, -16.0F, 4.0F, 2, 7, 1);
      this.field_110704_g.func_78793_a(0.0F, 4.0F, -10.0F);
      this.func_110682_a(this.field_110704_g, 0.5235988F, 0.0F, -0.2617994F);
      this.field_110716_h = new ModelRenderer(this, 0, 12);
      this.field_110716_h.func_78789_a(-2.05F, -9.8F, -2.0F, 4, 14, 8);
      this.field_110716_h.func_78793_a(0.0F, 4.0F, -10.0F);
      this.func_110682_a(this.field_110716_h, 0.5235988F, 0.0F, 0.0F);
      this.field_110687_G = new ModelRenderer(this, 0, 34);
      this.field_110687_G.func_78789_a(-3.0F, 0.0F, 0.0F, 8, 8, 3);
      this.field_110687_G.func_78793_a(-7.5F, 3.0F, 10.0F);
      this.func_110682_a(this.field_110687_G, 0.0F, 1.5707964F, 0.0F);
      this.field_110695_H = new ModelRenderer(this, 0, 47);
      this.field_110695_H.func_78789_a(-3.0F, 0.0F, 0.0F, 8, 8, 3);
      this.field_110695_H.func_78793_a(4.5F, 3.0F, 10.0F);
      this.func_110682_a(this.field_110695_H, 0.0F, 1.5707964F, 0.0F);
      this.field_110696_I = new ModelRenderer(this, 80, 0);
      this.field_110696_I.func_78789_a(-5.0F, 0.0F, -3.0F, 10, 1, 8);
      this.field_110696_I.func_78793_a(0.0F, 2.0F, 2.0F);
      this.field_110697_J = new ModelRenderer(this, 106, 9);
      this.field_110697_J.func_78789_a(-1.5F, -1.0F, -3.0F, 3, 1, 2);
      this.field_110697_J.func_78793_a(0.0F, 2.0F, 2.0F);
      this.field_110698_K = new ModelRenderer(this, 80, 9);
      this.field_110698_K.func_78789_a(-4.0F, -1.0F, 3.0F, 8, 1, 2);
      this.field_110698_K.func_78793_a(0.0F, 2.0F, 2.0F);
      this.field_110692_M = new ModelRenderer(this, 74, 0);
      this.field_110692_M.func_78789_a(-0.5F, 6.0F, -1.0F, 1, 2, 2);
      this.field_110692_M.func_78793_a(5.0F, 3.0F, 2.0F);
      this.field_110691_L = new ModelRenderer(this, 70, 0);
      this.field_110691_L.func_78789_a(-0.5F, 0.0F, -0.5F, 1, 6, 1);
      this.field_110691_L.func_78793_a(5.0F, 3.0F, 2.0F);
      this.field_110694_O = new ModelRenderer(this, 74, 4);
      this.field_110694_O.func_78789_a(-0.5F, 6.0F, -1.0F, 1, 2, 2);
      this.field_110694_O.func_78793_a(-5.0F, 3.0F, 2.0F);
      this.field_110693_N = new ModelRenderer(this, 80, 0);
      this.field_110693_N.func_78789_a(-0.5F, 0.0F, -0.5F, 1, 6, 1);
      this.field_110693_N.func_78793_a(-5.0F, 3.0F, 2.0F);
      this.field_110700_P = new ModelRenderer(this, 74, 13);
      this.field_110700_P.func_78789_a(1.5F, -8.0F, -4.0F, 1, 2, 2);
      this.field_110700_P.func_78793_a(0.0F, 4.0F, -10.0F);
      this.func_110682_a(this.field_110700_P, 0.5235988F, 0.0F, 0.0F);
      this.field_110699_Q = new ModelRenderer(this, 74, 13);
      this.field_110699_Q.func_78789_a(-2.5F, -8.0F, -4.0F, 1, 2, 2);
      this.field_110699_Q.func_78793_a(0.0F, 4.0F, -10.0F);
      this.func_110682_a(this.field_110699_Q, 0.5235988F, 0.0F, 0.0F);
      this.field_110702_R = new ModelRenderer(this, 44, 10);
      this.field_110702_R.func_78789_a(2.6F, -6.0F, -6.0F, 0, 3, 16);
      this.field_110702_R.func_78793_a(0.0F, 4.0F, -10.0F);
      this.field_110701_S = new ModelRenderer(this, 44, 5);
      this.field_110701_S.func_78789_a(-2.6F, -6.0F, -6.0F, 0, 3, 16);
      this.field_110701_S.func_78793_a(0.0F, 4.0F, -10.0F);
      this.field_110714_j = new ModelRenderer(this, 58, 0);
      this.field_110714_j.func_78789_a(-1.0F, -11.5F, 5.0F, 2, 16, 4);
      this.field_110714_j.func_78793_a(0.0F, 4.0F, -10.0F);
      this.func_110682_a(this.field_110714_j, 0.5235988F, 0.0F, 0.0F);
      this.field_110717_i = new ModelRenderer(this, 80, 12);
      this.field_110717_i.func_78790_a(-2.5F, -10.1F, -7.0F, 5, 5, 12, 0.2F);
      this.field_110717_i.func_78793_a(0.0F, 4.0F, -10.0F);
      this.func_110682_a(this.field_110717_i, 0.5235988F, 0.0F, 0.0F);
   }

   public void func_78088_a(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
      EntityHorse lvt_8_1_ = (EntityHorse)p_78088_1_;
      int lvt_9_1_ = lvt_8_1_.func_110265_bP();
      float lvt_10_1_ = lvt_8_1_.func_110258_o(0.0F);
      boolean lvt_11_1_ = lvt_8_1_.func_110228_bR();
      boolean lvt_12_1_ = lvt_11_1_ && lvt_8_1_.func_110257_ck();
      boolean lvt_13_1_ = lvt_11_1_ && lvt_8_1_.func_110261_ca();
      boolean lvt_14_1_ = lvt_9_1_ == 1 || lvt_9_1_ == 2;
      float lvt_15_1_ = lvt_8_1_.func_110254_bY();
      boolean lvt_16_1_ = lvt_8_1_.field_70153_n != null;
      if(lvt_12_1_) {
         this.field_110717_i.func_78785_a(p_78088_7_);
         this.field_110696_I.func_78785_a(p_78088_7_);
         this.field_110697_J.func_78785_a(p_78088_7_);
         this.field_110698_K.func_78785_a(p_78088_7_);
         this.field_110691_L.func_78785_a(p_78088_7_);
         this.field_110692_M.func_78785_a(p_78088_7_);
         this.field_110693_N.func_78785_a(p_78088_7_);
         this.field_110694_O.func_78785_a(p_78088_7_);
         this.field_110700_P.func_78785_a(p_78088_7_);
         this.field_110699_Q.func_78785_a(p_78088_7_);
         if(lvt_16_1_) {
            this.field_110702_R.func_78785_a(p_78088_7_);
            this.field_110701_S.func_78785_a(p_78088_7_);
         }
      }

      if(!lvt_11_1_) {
         GlStateManager.func_179094_E();
         GlStateManager.func_179152_a(lvt_15_1_, 0.5F + lvt_15_1_ * 0.5F, lvt_15_1_);
         GlStateManager.func_179109_b(0.0F, 0.95F * (1.0F - lvt_15_1_), 0.0F);
      }

      this.field_110711_o.func_78785_a(p_78088_7_);
      this.field_110719_v.func_78785_a(p_78088_7_);
      this.field_110718_w.func_78785_a(p_78088_7_);
      this.field_110722_x.func_78785_a(p_78088_7_);
      this.field_110721_y.func_78785_a(p_78088_7_);
      this.field_110720_z.func_78785_a(p_78088_7_);
      this.field_110688_A.func_78785_a(p_78088_7_);
      this.field_110689_B.func_78785_a(p_78088_7_);
      this.field_110690_C.func_78785_a(p_78088_7_);
      this.field_110684_D.func_78785_a(p_78088_7_);
      this.field_110685_E.func_78785_a(p_78088_7_);
      this.field_110686_F.func_78785_a(p_78088_7_);
      if(!lvt_11_1_) {
         GlStateManager.func_179121_F();
         GlStateManager.func_179094_E();
         GlStateManager.func_179152_a(lvt_15_1_, lvt_15_1_, lvt_15_1_);
         GlStateManager.func_179109_b(0.0F, 1.35F * (1.0F - lvt_15_1_), 0.0F);
      }

      this.field_110715_k.func_78785_a(p_78088_7_);
      this.field_110712_l.func_78785_a(p_78088_7_);
      this.field_110713_m.func_78785_a(p_78088_7_);
      this.field_110710_n.func_78785_a(p_78088_7_);
      this.field_110716_h.func_78785_a(p_78088_7_);
      this.field_110714_j.func_78785_a(p_78088_7_);
      if(!lvt_11_1_) {
         GlStateManager.func_179121_F();
         GlStateManager.func_179094_E();
         float lvt_17_1_ = 0.5F + lvt_15_1_ * lvt_15_1_ * 0.5F;
         GlStateManager.func_179152_a(lvt_17_1_, lvt_17_1_, lvt_17_1_);
         if(lvt_10_1_ <= 0.0F) {
            GlStateManager.func_179109_b(0.0F, 1.35F * (1.0F - lvt_15_1_), 0.0F);
         } else {
            GlStateManager.func_179109_b(0.0F, 0.9F * (1.0F - lvt_15_1_) * lvt_10_1_ + 1.35F * (1.0F - lvt_15_1_) * (1.0F - lvt_10_1_), 0.15F * (1.0F - lvt_15_1_) * lvt_10_1_);
         }
      }

      if(lvt_14_1_) {
         this.field_110703_f.func_78785_a(p_78088_7_);
         this.field_110704_g.func_78785_a(p_78088_7_);
      } else {
         this.field_110705_d.func_78785_a(p_78088_7_);
         this.field_110706_e.func_78785_a(p_78088_7_);
      }

      this.field_110709_a.func_78785_a(p_78088_7_);
      if(!lvt_11_1_) {
         GlStateManager.func_179121_F();
      }

      if(lvt_13_1_) {
         this.field_110687_G.func_78785_a(p_78088_7_);
         this.field_110695_H.func_78785_a(p_78088_7_);
      }

   }

   private void func_110682_a(ModelRenderer p_110682_1_, float p_110682_2_, float p_110682_3_, float p_110682_4_) {
      p_110682_1_.field_78795_f = p_110682_2_;
      p_110682_1_.field_78796_g = p_110682_3_;
      p_110682_1_.field_78808_h = p_110682_4_;
   }

   private float func_110683_a(float p_110683_1_, float p_110683_2_, float p_110683_3_) {
      float lvt_4_1_;
      for(lvt_4_1_ = p_110683_2_ - p_110683_1_; lvt_4_1_ < -180.0F; lvt_4_1_ += 360.0F) {
         ;
      }

      while(lvt_4_1_ >= 180.0F) {
         lvt_4_1_ -= 360.0F;
      }

      return p_110683_1_ + p_110683_3_ * lvt_4_1_;
   }

   public void func_78086_a(EntityLivingBase p_78086_1_, float p_78086_2_, float p_78086_3_, float p_78086_4_) {
      super.func_78086_a(p_78086_1_, p_78086_2_, p_78086_3_, p_78086_4_);
      float lvt_5_1_ = this.func_110683_a(p_78086_1_.field_70760_ar, p_78086_1_.field_70761_aq, p_78086_4_);
      float lvt_6_1_ = this.func_110683_a(p_78086_1_.field_70758_at, p_78086_1_.field_70759_as, p_78086_4_);
      float lvt_7_1_ = p_78086_1_.field_70127_C + (p_78086_1_.field_70125_A - p_78086_1_.field_70127_C) * p_78086_4_;
      float lvt_8_1_ = lvt_6_1_ - lvt_5_1_;
      float lvt_9_1_ = lvt_7_1_ / 57.295776F;
      if(lvt_8_1_ > 20.0F) {
         lvt_8_1_ = 20.0F;
      }

      if(lvt_8_1_ < -20.0F) {
         lvt_8_1_ = -20.0F;
      }

      if(p_78086_3_ > 0.2F) {
         lvt_9_1_ += MathHelper.func_76134_b(p_78086_2_ * 0.4F) * 0.15F * p_78086_3_;
      }

      EntityHorse lvt_10_1_ = (EntityHorse)p_78086_1_;
      float lvt_11_1_ = lvt_10_1_.func_110258_o(p_78086_4_);
      float lvt_12_1_ = lvt_10_1_.func_110223_p(p_78086_4_);
      float lvt_13_1_ = 1.0F - lvt_12_1_;
      float lvt_14_1_ = lvt_10_1_.func_110201_q(p_78086_4_);
      boolean lvt_15_1_ = lvt_10_1_.field_110278_bp != 0;
      boolean lvt_16_1_ = lvt_10_1_.func_110257_ck();
      boolean lvt_17_1_ = lvt_10_1_.field_70153_n != null;
      float lvt_18_1_ = (float)p_78086_1_.field_70173_aa + p_78086_4_;
      float lvt_19_1_ = MathHelper.func_76134_b(p_78086_2_ * 0.6662F + 3.1415927F);
      float lvt_20_1_ = lvt_19_1_ * 0.8F * p_78086_3_;
      this.field_110709_a.field_78797_d = 4.0F;
      this.field_110709_a.field_78798_e = -10.0F;
      this.field_110712_l.field_78797_d = 3.0F;
      this.field_110713_m.field_78798_e = 14.0F;
      this.field_110695_H.field_78797_d = 3.0F;
      this.field_110695_H.field_78798_e = 10.0F;
      this.field_110715_k.field_78795_f = 0.0F;
      this.field_110709_a.field_78795_f = 0.5235988F + lvt_9_1_;
      this.field_110709_a.field_78796_g = lvt_8_1_ / 57.295776F;
      this.field_110709_a.field_78795_f = lvt_12_1_ * (0.2617994F + lvt_9_1_) + lvt_11_1_ * 2.18166F + (1.0F - Math.max(lvt_12_1_, lvt_11_1_)) * this.field_110709_a.field_78795_f;
      this.field_110709_a.field_78796_g = lvt_12_1_ * lvt_8_1_ / 57.295776F + (1.0F - Math.max(lvt_12_1_, lvt_11_1_)) * this.field_110709_a.field_78796_g;
      this.field_110709_a.field_78797_d = lvt_12_1_ * -6.0F + lvt_11_1_ * 11.0F + (1.0F - Math.max(lvt_12_1_, lvt_11_1_)) * this.field_110709_a.field_78797_d;
      this.field_110709_a.field_78798_e = lvt_12_1_ * -1.0F + lvt_11_1_ * -10.0F + (1.0F - Math.max(lvt_12_1_, lvt_11_1_)) * this.field_110709_a.field_78798_e;
      this.field_110712_l.field_78797_d = lvt_12_1_ * 9.0F + lvt_13_1_ * this.field_110712_l.field_78797_d;
      this.field_110713_m.field_78798_e = lvt_12_1_ * 18.0F + lvt_13_1_ * this.field_110713_m.field_78798_e;
      this.field_110695_H.field_78797_d = lvt_12_1_ * 5.5F + lvt_13_1_ * this.field_110695_H.field_78797_d;
      this.field_110695_H.field_78798_e = lvt_12_1_ * 15.0F + lvt_13_1_ * this.field_110695_H.field_78798_e;
      this.field_110715_k.field_78795_f = lvt_12_1_ * -45.0F / 57.295776F + lvt_13_1_ * this.field_110715_k.field_78795_f;
      this.field_110705_d.field_78797_d = this.field_110709_a.field_78797_d;
      this.field_110706_e.field_78797_d = this.field_110709_a.field_78797_d;
      this.field_110703_f.field_78797_d = this.field_110709_a.field_78797_d;
      this.field_110704_g.field_78797_d = this.field_110709_a.field_78797_d;
      this.field_110716_h.field_78797_d = this.field_110709_a.field_78797_d;
      this.field_178711_b.field_78797_d = 0.02F;
      this.field_178712_c.field_78797_d = 0.0F;
      this.field_110714_j.field_78797_d = this.field_110709_a.field_78797_d;
      this.field_110705_d.field_78798_e = this.field_110709_a.field_78798_e;
      this.field_110706_e.field_78798_e = this.field_110709_a.field_78798_e;
      this.field_110703_f.field_78798_e = this.field_110709_a.field_78798_e;
      this.field_110704_g.field_78798_e = this.field_110709_a.field_78798_e;
      this.field_110716_h.field_78798_e = this.field_110709_a.field_78798_e;
      this.field_178711_b.field_78798_e = 0.02F - lvt_14_1_ * 1.0F;
      this.field_178712_c.field_78798_e = 0.0F + lvt_14_1_ * 1.0F;
      this.field_110714_j.field_78798_e = this.field_110709_a.field_78798_e;
      this.field_110705_d.field_78795_f = this.field_110709_a.field_78795_f;
      this.field_110706_e.field_78795_f = this.field_110709_a.field_78795_f;
      this.field_110703_f.field_78795_f = this.field_110709_a.field_78795_f;
      this.field_110704_g.field_78795_f = this.field_110709_a.field_78795_f;
      this.field_110716_h.field_78795_f = this.field_110709_a.field_78795_f;
      this.field_178711_b.field_78795_f = 0.0F - 0.09424778F * lvt_14_1_;
      this.field_178712_c.field_78795_f = 0.0F + 0.15707964F * lvt_14_1_;
      this.field_110714_j.field_78795_f = this.field_110709_a.field_78795_f;
      this.field_110705_d.field_78796_g = this.field_110709_a.field_78796_g;
      this.field_110706_e.field_78796_g = this.field_110709_a.field_78796_g;
      this.field_110703_f.field_78796_g = this.field_110709_a.field_78796_g;
      this.field_110704_g.field_78796_g = this.field_110709_a.field_78796_g;
      this.field_110716_h.field_78796_g = this.field_110709_a.field_78796_g;
      this.field_178711_b.field_78796_g = 0.0F;
      this.field_178712_c.field_78796_g = 0.0F;
      this.field_110714_j.field_78796_g = this.field_110709_a.field_78796_g;
      this.field_110687_G.field_78795_f = lvt_20_1_ / 5.0F;
      this.field_110695_H.field_78795_f = -lvt_20_1_ / 5.0F;
      float lvt_21_1_ = 1.5707964F;
      float lvt_22_1_ = 4.712389F;
      float lvt_23_1_ = -1.0471976F;
      float lvt_24_1_ = 0.2617994F * lvt_12_1_;
      float lvt_25_1_ = MathHelper.func_76134_b(lvt_18_1_ * 0.6F + 3.1415927F);
      this.field_110688_A.field_78797_d = -2.0F * lvt_12_1_ + 9.0F * lvt_13_1_;
      this.field_110688_A.field_78798_e = -2.0F * lvt_12_1_ + -8.0F * lvt_13_1_;
      this.field_110684_D.field_78797_d = this.field_110688_A.field_78797_d;
      this.field_110684_D.field_78798_e = this.field_110688_A.field_78798_e;
      this.field_110719_v.field_78797_d = this.field_110711_o.field_78797_d + MathHelper.func_76126_a(1.5707964F + lvt_24_1_ + lvt_13_1_ * -lvt_19_1_ * 0.5F * p_78086_3_) * 7.0F;
      this.field_110719_v.field_78798_e = this.field_110711_o.field_78798_e + MathHelper.func_76134_b(4.712389F + lvt_24_1_ + lvt_13_1_ * -lvt_19_1_ * 0.5F * p_78086_3_) * 7.0F;
      this.field_110721_y.field_78797_d = this.field_110722_x.field_78797_d + MathHelper.func_76126_a(1.5707964F + lvt_24_1_ + lvt_13_1_ * lvt_19_1_ * 0.5F * p_78086_3_) * 7.0F;
      this.field_110721_y.field_78798_e = this.field_110722_x.field_78798_e + MathHelper.func_76134_b(4.712389F + lvt_24_1_ + lvt_13_1_ * lvt_19_1_ * 0.5F * p_78086_3_) * 7.0F;
      float lvt_26_1_ = (-1.0471976F + lvt_25_1_) * lvt_12_1_ + lvt_20_1_ * lvt_13_1_;
      float lvt_27_1_ = (-1.0471976F + -lvt_25_1_) * lvt_12_1_ + -lvt_20_1_ * lvt_13_1_;
      this.field_110689_B.field_78797_d = this.field_110688_A.field_78797_d + MathHelper.func_76126_a(1.5707964F + lvt_26_1_) * 7.0F;
      this.field_110689_B.field_78798_e = this.field_110688_A.field_78798_e + MathHelper.func_76134_b(4.712389F + lvt_26_1_) * 7.0F;
      this.field_110685_E.field_78797_d = this.field_110684_D.field_78797_d + MathHelper.func_76126_a(1.5707964F + lvt_27_1_) * 7.0F;
      this.field_110685_E.field_78798_e = this.field_110684_D.field_78798_e + MathHelper.func_76134_b(4.712389F + lvt_27_1_) * 7.0F;
      this.field_110711_o.field_78795_f = lvt_24_1_ + -lvt_19_1_ * 0.5F * p_78086_3_ * lvt_13_1_;
      this.field_110719_v.field_78795_f = -0.08726646F * lvt_12_1_ + (-lvt_19_1_ * 0.5F * p_78086_3_ - Math.max(0.0F, lvt_19_1_ * 0.5F * p_78086_3_)) * lvt_13_1_;
      this.field_110718_w.field_78795_f = this.field_110719_v.field_78795_f;
      this.field_110722_x.field_78795_f = lvt_24_1_ + lvt_19_1_ * 0.5F * p_78086_3_ * lvt_13_1_;
      this.field_110721_y.field_78795_f = -0.08726646F * lvt_12_1_ + (lvt_19_1_ * 0.5F * p_78086_3_ - Math.max(0.0F, -lvt_19_1_ * 0.5F * p_78086_3_)) * lvt_13_1_;
      this.field_110720_z.field_78795_f = this.field_110721_y.field_78795_f;
      this.field_110688_A.field_78795_f = lvt_26_1_;
      this.field_110689_B.field_78795_f = (this.field_110688_A.field_78795_f + 3.1415927F * Math.max(0.0F, 0.2F + lvt_25_1_ * 0.2F)) * lvt_12_1_ + (lvt_20_1_ + Math.max(0.0F, lvt_19_1_ * 0.5F * p_78086_3_)) * lvt_13_1_;
      this.field_110690_C.field_78795_f = this.field_110689_B.field_78795_f;
      this.field_110684_D.field_78795_f = lvt_27_1_;
      this.field_110685_E.field_78795_f = (this.field_110684_D.field_78795_f + 3.1415927F * Math.max(0.0F, 0.2F - lvt_25_1_ * 0.2F)) * lvt_12_1_ + (-lvt_20_1_ + Math.max(0.0F, -lvt_19_1_ * 0.5F * p_78086_3_)) * lvt_13_1_;
      this.field_110686_F.field_78795_f = this.field_110685_E.field_78795_f;
      this.field_110718_w.field_78797_d = this.field_110719_v.field_78797_d;
      this.field_110718_w.field_78798_e = this.field_110719_v.field_78798_e;
      this.field_110720_z.field_78797_d = this.field_110721_y.field_78797_d;
      this.field_110720_z.field_78798_e = this.field_110721_y.field_78798_e;
      this.field_110690_C.field_78797_d = this.field_110689_B.field_78797_d;
      this.field_110690_C.field_78798_e = this.field_110689_B.field_78798_e;
      this.field_110686_F.field_78797_d = this.field_110685_E.field_78797_d;
      this.field_110686_F.field_78798_e = this.field_110685_E.field_78798_e;
      if(lvt_16_1_) {
         this.field_110696_I.field_78797_d = lvt_12_1_ * 0.5F + lvt_13_1_ * 2.0F;
         this.field_110696_I.field_78798_e = lvt_12_1_ * 11.0F + lvt_13_1_ * 2.0F;
         this.field_110697_J.field_78797_d = this.field_110696_I.field_78797_d;
         this.field_110698_K.field_78797_d = this.field_110696_I.field_78797_d;
         this.field_110691_L.field_78797_d = this.field_110696_I.field_78797_d;
         this.field_110693_N.field_78797_d = this.field_110696_I.field_78797_d;
         this.field_110692_M.field_78797_d = this.field_110696_I.field_78797_d;
         this.field_110694_O.field_78797_d = this.field_110696_I.field_78797_d;
         this.field_110687_G.field_78797_d = this.field_110695_H.field_78797_d;
         this.field_110697_J.field_78798_e = this.field_110696_I.field_78798_e;
         this.field_110698_K.field_78798_e = this.field_110696_I.field_78798_e;
         this.field_110691_L.field_78798_e = this.field_110696_I.field_78798_e;
         this.field_110693_N.field_78798_e = this.field_110696_I.field_78798_e;
         this.field_110692_M.field_78798_e = this.field_110696_I.field_78798_e;
         this.field_110694_O.field_78798_e = this.field_110696_I.field_78798_e;
         this.field_110687_G.field_78798_e = this.field_110695_H.field_78798_e;
         this.field_110696_I.field_78795_f = this.field_110715_k.field_78795_f;
         this.field_110697_J.field_78795_f = this.field_110715_k.field_78795_f;
         this.field_110698_K.field_78795_f = this.field_110715_k.field_78795_f;
         this.field_110702_R.field_78797_d = this.field_110709_a.field_78797_d;
         this.field_110701_S.field_78797_d = this.field_110709_a.field_78797_d;
         this.field_110717_i.field_78797_d = this.field_110709_a.field_78797_d;
         this.field_110700_P.field_78797_d = this.field_110709_a.field_78797_d;
         this.field_110699_Q.field_78797_d = this.field_110709_a.field_78797_d;
         this.field_110702_R.field_78798_e = this.field_110709_a.field_78798_e;
         this.field_110701_S.field_78798_e = this.field_110709_a.field_78798_e;
         this.field_110717_i.field_78798_e = this.field_110709_a.field_78798_e;
         this.field_110700_P.field_78798_e = this.field_110709_a.field_78798_e;
         this.field_110699_Q.field_78798_e = this.field_110709_a.field_78798_e;
         this.field_110702_R.field_78795_f = lvt_9_1_;
         this.field_110701_S.field_78795_f = lvt_9_1_;
         this.field_110717_i.field_78795_f = this.field_110709_a.field_78795_f;
         this.field_110700_P.field_78795_f = this.field_110709_a.field_78795_f;
         this.field_110699_Q.field_78795_f = this.field_110709_a.field_78795_f;
         this.field_110717_i.field_78796_g = this.field_110709_a.field_78796_g;
         this.field_110700_P.field_78796_g = this.field_110709_a.field_78796_g;
         this.field_110702_R.field_78796_g = this.field_110709_a.field_78796_g;
         this.field_110699_Q.field_78796_g = this.field_110709_a.field_78796_g;
         this.field_110701_S.field_78796_g = this.field_110709_a.field_78796_g;
         if(lvt_17_1_) {
            this.field_110691_L.field_78795_f = -1.0471976F;
            this.field_110692_M.field_78795_f = -1.0471976F;
            this.field_110693_N.field_78795_f = -1.0471976F;
            this.field_110694_O.field_78795_f = -1.0471976F;
            this.field_110691_L.field_78808_h = 0.0F;
            this.field_110692_M.field_78808_h = 0.0F;
            this.field_110693_N.field_78808_h = 0.0F;
            this.field_110694_O.field_78808_h = 0.0F;
         } else {
            this.field_110691_L.field_78795_f = lvt_20_1_ / 3.0F;
            this.field_110692_M.field_78795_f = lvt_20_1_ / 3.0F;
            this.field_110693_N.field_78795_f = lvt_20_1_ / 3.0F;
            this.field_110694_O.field_78795_f = lvt_20_1_ / 3.0F;
            this.field_110691_L.field_78808_h = lvt_20_1_ / 5.0F;
            this.field_110692_M.field_78808_h = lvt_20_1_ / 5.0F;
            this.field_110693_N.field_78808_h = -lvt_20_1_ / 5.0F;
            this.field_110694_O.field_78808_h = -lvt_20_1_ / 5.0F;
         }
      }

      lvt_21_1_ = -1.3089F + p_78086_3_ * 1.5F;
      if(lvt_21_1_ > 0.0F) {
         lvt_21_1_ = 0.0F;
      }

      if(lvt_15_1_) {
         this.field_110712_l.field_78796_g = MathHelper.func_76134_b(lvt_18_1_ * 0.7F);
         lvt_21_1_ = 0.0F;
      } else {
         this.field_110712_l.field_78796_g = 0.0F;
      }

      this.field_110713_m.field_78796_g = this.field_110712_l.field_78796_g;
      this.field_110710_n.field_78796_g = this.field_110712_l.field_78796_g;
      this.field_110713_m.field_78797_d = this.field_110712_l.field_78797_d;
      this.field_110710_n.field_78797_d = this.field_110712_l.field_78797_d;
      this.field_110713_m.field_78798_e = this.field_110712_l.field_78798_e;
      this.field_110710_n.field_78798_e = this.field_110712_l.field_78798_e;
      this.field_110712_l.field_78795_f = lvt_21_1_;
      this.field_110713_m.field_78795_f = lvt_21_1_;
      this.field_110710_n.field_78795_f = -0.2618F + lvt_21_1_;
   }
}
