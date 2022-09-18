package net.minecraft.world.gen.layer;

public class GenLayerSmooth extends GenLayer
{
    public GenLayerSmooth(long p_i2131_1_, GenLayer p_i2131_3_)
    {
        super(p_i2131_1_);
        super.parent = p_i2131_3_;
    }

    /**
     * Returns a list of integer values generated by this layer. These may be interpreted as temperatures, rainfall
     * amounts, or biomeList[] indices based on the particular GenLayer subclass.
     */
    public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight)
    {
        int lvt_5_1_ = areaX - 1;
        int lvt_6_1_ = areaY - 1;
        int lvt_7_1_ = areaWidth + 2;
        int lvt_8_1_ = areaHeight + 2;
        int[] lvt_9_1_ = this.parent.getInts(lvt_5_1_, lvt_6_1_, lvt_7_1_, lvt_8_1_);
        int[] lvt_10_1_ = IntCache.getIntCache(areaWidth * areaHeight);

        for (int lvt_11_1_ = 0; lvt_11_1_ < areaHeight; ++lvt_11_1_)
        {
            for (int lvt_12_1_ = 0; lvt_12_1_ < areaWidth; ++lvt_12_1_)
            {
                int lvt_13_1_ = lvt_9_1_[lvt_12_1_ + 0 + (lvt_11_1_ + 1) * lvt_7_1_];
                int lvt_14_1_ = lvt_9_1_[lvt_12_1_ + 2 + (lvt_11_1_ + 1) * lvt_7_1_];
                int lvt_15_1_ = lvt_9_1_[lvt_12_1_ + 1 + (lvt_11_1_ + 0) * lvt_7_1_];
                int lvt_16_1_ = lvt_9_1_[lvt_12_1_ + 1 + (lvt_11_1_ + 2) * lvt_7_1_];
                int lvt_17_1_ = lvt_9_1_[lvt_12_1_ + 1 + (lvt_11_1_ + 1) * lvt_7_1_];

                if (lvt_13_1_ == lvt_14_1_ && lvt_15_1_ == lvt_16_1_)
                {
                    this.initChunkSeed((long)(lvt_12_1_ + areaX), (long)(lvt_11_1_ + areaY));

                    if (this.nextInt(2) == 0)
                    {
                        lvt_17_1_ = lvt_13_1_;
                    }
                    else
                    {
                        lvt_17_1_ = lvt_15_1_;
                    }
                }
                else
                {
                    if (lvt_13_1_ == lvt_14_1_)
                    {
                        lvt_17_1_ = lvt_13_1_;
                    }

                    if (lvt_15_1_ == lvt_16_1_)
                    {
                        lvt_17_1_ = lvt_15_1_;
                    }
                }

                lvt_10_1_[lvt_12_1_ + lvt_11_1_ * areaWidth] = lvt_17_1_;
            }
        }

        return lvt_10_1_;
    }
}
