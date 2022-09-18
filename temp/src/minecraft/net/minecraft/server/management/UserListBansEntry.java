package net.minecraft.server.management;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.UUID;
import net.minecraft.server.management.BanEntry;

public class UserListBansEntry extends BanEntry<GameProfile> {
   public UserListBansEntry(GameProfile p_i1134_1_) {
      this(p_i1134_1_, (Date)null, (String)null, (Date)null, (String)null);
   }

   public UserListBansEntry(GameProfile p_i1135_1_, Date p_i1135_2_, String p_i1135_3_, Date p_i1135_4_, String p_i1135_5_) {
      super(p_i1135_1_, p_i1135_4_, p_i1135_3_, p_i1135_4_, p_i1135_5_);
   }

   public UserListBansEntry(JsonObject p_i1136_1_) {
      super(func_152648_b(p_i1136_1_), p_i1136_1_);
   }

   protected void func_152641_a(JsonObject p_152641_1_) {
      if(this.func_152640_f() != null) {
         p_152641_1_.addProperty("uuid", ((GameProfile)this.func_152640_f()).getId() == null?"":((GameProfile)this.func_152640_f()).getId().toString());
         p_152641_1_.addProperty("name", ((GameProfile)this.func_152640_f()).getName());
         super.func_152641_a(p_152641_1_);
      }
   }

   private static GameProfile func_152648_b(JsonObject p_152648_0_) {
      if(p_152648_0_.has("uuid") && p_152648_0_.has("name")) {
         String lvt_1_1_ = p_152648_0_.get("uuid").getAsString();

         UUID lvt_2_1_;
         try {
            lvt_2_1_ = UUID.fromString(lvt_1_1_);
         } catch (Throwable var4) {
            return null;
         }

         return new GameProfile(lvt_2_1_, p_152648_0_.get("name").getAsString());
      } else {
         return null;
      }
   }
}
