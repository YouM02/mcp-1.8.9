package net.minecraft.client.renderer.tileentity;

import net.minecraft.client.model.ModelSkeletonHead;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.util.ResourceLocation;

public class RenderWitherSkull extends Render<EntityWitherSkull>
{
    private static final ResourceLocation invulnerableWitherTextures = new ResourceLocation("textures/entity/wither/wither_invulnerable.png");
    private static final ResourceLocation witherTextures = new ResourceLocation("textures/entity/wither/wither.png");

    /** The Skeleton's head model. */
    private final ModelSkeletonHead skeletonHeadModel = new ModelSkeletonHead();

    public RenderWitherSkull(RenderManager renderManagerIn)
    {
        super(renderManagerIn);
    }

    private float func_82400_a(float p_82400_1_, float p_82400_2_, float p_82400_3_)
    {
        float lvt_4_1_;

        for (lvt_4_1_ = p_82400_2_ - p_82400_1_; lvt_4_1_ < -180.0F; lvt_4_1_ += 360.0F)
        {
            ;
        }

        while (lvt_4_1_ >= 180.0F)
        {
            lvt_4_1_ -= 360.0F;
        }

        return p_82400_1_ + p_82400_3_ * lvt_4_1_;
    }

    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(EntityWitherSkull entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        float lvt_10_1_ = this.func_82400_a(entity.prevRotationYaw, entity.rotationYaw, partialTicks);
        float lvt_11_1_ = entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks;
        GlStateManager.translate((float)x, (float)y, (float)z);
        float lvt_12_1_ = 0.0625F;
        GlStateManager.enableRescaleNormal();
        GlStateManager.scale(-1.0F, -1.0F, 1.0F);
        GlStateManager.enableAlpha();
        this.bindEntityTexture(entity);
        this.skeletonHeadModel.render(entity, 0.0F, 0.0F, 0.0F, lvt_10_1_, lvt_11_1_, lvt_12_1_);
        GlStateManager.popMatrix();
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityWitherSkull entity)
    {
        return entity.isInvulnerable() ? invulnerableWitherTextures : witherTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return this.getEntityTexture((EntityWitherSkull)entity);
    }

    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(Entity entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        this.doRender((EntityWitherSkull)entity, x, y, z, entityYaw, partialTicks);
    }
}