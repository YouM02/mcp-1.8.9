package net.minecraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSpider extends ModelBase {
   public ModelRenderer field_78209_a;
   public ModelRenderer field_78207_b;
   public ModelRenderer field_78208_c;
   public ModelRenderer field_78205_d;
   public ModelRenderer field_78206_e;
   public ModelRenderer field_78203_f;
   public ModelRenderer field_78204_g;
   public ModelRenderer field_78212_h;
   public ModelRenderer field_78213_i;
   public ModelRenderer field_78210_j;
   public ModelRenderer field_78211_k;

   public ModelSpider() {
      float lvt_1_1_ = 0.0F;
      int lvt_2_1_ = 15;
      this.field_78209_a = new ModelRenderer(this, 32, 4);
      this.field_78209_a.func_78790_a(-4.0F, -4.0F, -8.0F, 8, 8, 8, lvt_1_1_);
      this.field_78209_a.func_78793_a(0.0F, (float)lvt_2_1_, -3.0F);
      this.field_78207_b = new ModelRenderer(this, 0, 0);
      this.field_78207_b.func_78790_a(-3.0F, -3.0F, -3.0F, 6, 6, 6, lvt_1_1_);
      this.field_78207_b.func_78793_a(0.0F, (float)lvt_2_1_, 0.0F);
      this.field_78208_c = new ModelRenderer(this, 0, 12);
      this.field_78208_c.func_78790_a(-5.0F, -4.0F, -6.0F, 10, 8, 12, lvt_1_1_);
      this.field_78208_c.func_78793_a(0.0F, (float)lvt_2_1_, 9.0F);
      this.field_78205_d = new ModelRenderer(this, 18, 0);
      this.field_78205_d.func_78790_a(-15.0F, -1.0F, -1.0F, 16, 2, 2, lvt_1_1_);
      this.field_78205_d.func_78793_a(-4.0F, (float)lvt_2_1_, 2.0F);
      this.field_78206_e = new ModelRenderer(this, 18, 0);
      this.field_78206_e.func_78790_a(-1.0F, -1.0F, -1.0F, 16, 2, 2, lvt_1_1_);
      this.field_78206_e.func_78793_a(4.0F, (float)lvt_2_1_, 2.0F);
      this.field_78203_f = new ModelRenderer(this, 18, 0);
      this.field_78203_f.func_78790_a(-15.0F, -1.0F, -1.0F, 16, 2, 2, lvt_1_1_);
      this.field_78203_f.func_78793_a(-4.0F, (float)lvt_2_1_, 1.0F);
      this.field_78204_g = new ModelRenderer(this, 18, 0);
      this.field_78204_g.func_78790_a(-1.0F, -1.0F, -1.0F, 16, 2, 2, lvt_1_1_);
      this.field_78204_g.func_78793_a(4.0F, (float)lvt_2_1_, 1.0F);
      this.field_78212_h = new ModelRenderer(this, 18, 0);
      this.field_78212_h.func_78790_a(-15.0F, -1.0F, -1.0F, 16, 2, 2, lvt_1_1_);
      this.field_78212_h.func_78793_a(-4.0F, (float)lvt_2_1_, 0.0F);
      this.field_78213_i = new ModelRenderer(this, 18, 0);
      this.field_78213_i.func_78790_a(-1.0F, -1.0F, -1.0F, 16, 2, 2, lvt_1_1_);
      this.field_78213_i.func_78793_a(4.0F, (float)lvt_2_1_, 0.0F);
      this.field_78210_j = new ModelRenderer(this, 18, 0);
      this.field_78210_j.func_78790_a(-15.0F, -1.0F, -1.0F, 16, 2, 2, lvt_1_1_);
      this.field_78210_j.func_78793_a(-4.0F, (float)lvt_2_1_, -1.0F);
      this.field_78211_k = new ModelRenderer(this, 18, 0);
      this.field_78211_k.func_78790_a(-1.0F, -1.0F, -1.0F, 16, 2, 2, lvt_1_1_);
      this.field_78211_k.func_78793_a(4.0F, (float)lvt_2_1_, -1.0F);
   }

   public void func_78088_a(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
      this.func_78087_a(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, p_78088_1_);
      this.field_78209_a.func_78785_a(p_78088_7_);
      this.field_78207_b.func_78785_a(p_78088_7_);
      this.field_78208_c.func_78785_a(p_78088_7_);
      this.field_78205_d.func_78785_a(p_78088_7_);
      this.field_78206_e.func_78785_a(p_78088_7_);
      this.field_78203_f.func_78785_a(p_78088_7_);
      this.field_78204_g.func_78785_a(p_78088_7_);
      this.field_78212_h.func_78785_a(p_78088_7_);
      this.field_78213_i.func_78785_a(p_78088_7_);
      this.field_78210_j.func_78785_a(p_78088_7_);
      this.field_78211_k.func_78785_a(p_78088_7_);
   }

   public void func_78087_a(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_) {
      this.field_78209_a.field_78796_g = p_78087_4_ / 57.295776F;
      this.field_78209_a.field_78795_f = p_78087_5_ / 57.295776F;
      float lvt_8_1_ = 0.7853982F;
      this.field_78205_d.field_78808_h = -lvt_8_1_;
      this.field_78206_e.field_78808_h = lvt_8_1_;
      this.field_78203_f.field_78808_h = -lvt_8_1_ * 0.74F;
      this.field_78204_g.field_78808_h = lvt_8_1_ * 0.74F;
      this.field_78212_h.field_78808_h = -lvt_8_1_ * 0.74F;
      this.field_78213_i.field_78808_h = lvt_8_1_ * 0.74F;
      this.field_78210_j.field_78808_h = -lvt_8_1_;
      this.field_78211_k.field_78808_h = lvt_8_1_;
      float lvt_9_1_ = -0.0F;
      float lvt_10_1_ = 0.3926991F;
      this.field_78205_d.field_78796_g = lvt_10_1_ * 2.0F + lvt_9_1_;
      this.field_78206_e.field_78796_g = -lvt_10_1_ * 2.0F - lvt_9_1_;
      this.field_78203_f.field_78796_g = lvt_10_1_ * 1.0F + lvt_9_1_;
      this.field_78204_g.field_78796_g = -lvt_10_1_ * 1.0F - lvt_9_1_;
      this.field_78212_h.field_78796_g = -lvt_10_1_ * 1.0F + lvt_9_1_;
      this.field_78213_i.field_78796_g = lvt_10_1_ * 1.0F - lvt_9_1_;
      this.field_78210_j.field_78796_g = -lvt_10_1_ * 2.0F + lvt_9_1_;
      this.field_78211_k.field_78796_g = lvt_10_1_ * 2.0F - lvt_9_1_;
      float lvt_11_1_ = -(MathHelper.func_76134_b(p_78087_1_ * 0.6662F * 2.0F + 0.0F) * 0.4F) * p_78087_2_;
      float lvt_12_1_ = -(MathHelper.func_76134_b(p_78087_1_ * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * p_78087_2_;
      float lvt_13_1_ = -(MathHelper.func_76134_b(p_78087_1_ * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * p_78087_2_;
      float lvt_14_1_ = -(MathHelper.func_76134_b(p_78087_1_ * 0.6662F * 2.0F + 4.712389F) * 0.4F) * p_78087_2_;
      float lvt_15_1_ = Math.abs(MathHelper.func_76126_a(p_78087_1_ * 0.6662F + 0.0F) * 0.4F) * p_78087_2_;
      float lvt_16_1_ = Math.abs(MathHelper.func_76126_a(p_78087_1_ * 0.6662F + 3.1415927F) * 0.4F) * p_78087_2_;
      float lvt_17_1_ = Math.abs(MathHelper.func_76126_a(p_78087_1_ * 0.6662F + 1.5707964F) * 0.4F) * p_78087_2_;
      float lvt_18_1_ = Math.abs(MathHelper.func_76126_a(p_78087_1_ * 0.6662F + 4.712389F) * 0.4F) * p_78087_2_;
      this.field_78205_d.field_78796_g += lvt_11_1_;
      this.field_78206_e.field_78796_g += -lvt_11_1_;
      this.field_78203_f.field_78796_g += lvt_12_1_;
      this.field_78204_g.field_78796_g += -lvt_12_1_;
      this.field_78212_h.field_78796_g += lvt_13_1_;
      this.field_78213_i.field_78796_g += -lvt_13_1_;
      this.field_78210_j.field_78796_g += lvt_14_1_;
      this.field_78211_k.field_78796_g += -lvt_14_1_;
      this.field_78205_d.field_78808_h += lvt_15_1_;
      this.field_78206_e.field_78808_h += -lvt_15_1_;
      this.field_78203_f.field_78808_h += lvt_16_1_;
      this.field_78204_g.field_78808_h += -lvt_16_1_;
      this.field_78212_h.field_78808_h += lvt_17_1_;
      this.field_78213_i.field_78808_h += -lvt_17_1_;
      this.field_78210_j.field_78808_h += lvt_18_1_;
      this.field_78211_k.field_78808_h += -lvt_18_1_;
   }
}
