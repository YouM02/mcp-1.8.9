package net.minecraft.world;

import net.minecraft.profiler.Profiler;
import net.minecraft.server.MinecraftServer;
import net.minecraft.village.VillageCollection;
import net.minecraft.world.border.IBorderListener;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.world.storage.DerivedWorldInfo;
import net.minecraft.world.storage.ISaveHandler;

public class WorldServerMulti extends WorldServer
{
    private WorldServer delegate;

    public WorldServerMulti(MinecraftServer server, ISaveHandler saveHandlerIn, int dimensionId, WorldServer delegate, Profiler profilerIn)
    {
        super(server, saveHandlerIn, new DerivedWorldInfo(delegate.getWorldInfo()), dimensionId, profilerIn);
        this.delegate = delegate;
        delegate.getWorldBorder().addListener(new IBorderListener()
        {
            public void onSizeChanged(WorldBorder border, double newSize)
            {
                WorldServerMulti.this.getWorldBorder().setTransition(newSize);
            }
            public void onTransitionStarted(WorldBorder border, double oldSize, double newSize, long time)
            {
                WorldServerMulti.this.getWorldBorder().setTransition(oldSize, newSize, time);
            }
            public void onCenterChanged(WorldBorder border, double x, double z)
            {
                WorldServerMulti.this.getWorldBorder().setCenter(x, z);
            }
            public void onWarningTimeChanged(WorldBorder border, int newTime)
            {
                WorldServerMulti.this.getWorldBorder().setWarningTime(newTime);
            }
            public void onWarningDistanceChanged(WorldBorder border, int newDistance)
            {
                WorldServerMulti.this.getWorldBorder().setWarningDistance(newDistance);
            }
            public void onDamageAmountChanged(WorldBorder border, double newAmount)
            {
                WorldServerMulti.this.getWorldBorder().setDamageAmount(newAmount);
            }
            public void onDamageBufferChanged(WorldBorder border, double newSize)
            {
                WorldServerMulti.this.getWorldBorder().setDamageBuffer(newSize);
            }
        });
    }

    /**
     * Saves the chunks to disk.
     */
    protected void saveLevel() throws MinecraftException
    {
    }

    public World init()
    {
        this.mapStorage = this.delegate.getMapStorage();
        this.worldScoreboard = this.delegate.getScoreboard();
        String lvt_1_1_ = VillageCollection.fileNameForProvider(this.provider);
        VillageCollection lvt_2_1_ = (VillageCollection)this.mapStorage.loadData(VillageCollection.class, lvt_1_1_);

        if (lvt_2_1_ == null)
        {
            this.villageCollectionObj = new VillageCollection(this);
            this.mapStorage.setData(lvt_1_1_, this.villageCollectionObj);
        }
        else
        {
            this.villageCollectionObj = lvt_2_1_;
            this.villageCollectionObj.setWorldsForAll(this);
        }

        return this;
    }
}
