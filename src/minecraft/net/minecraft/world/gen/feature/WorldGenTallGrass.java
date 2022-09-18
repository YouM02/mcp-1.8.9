package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class WorldGenTallGrass extends WorldGenerator
{
    private final IBlockState tallGrassState;

    public WorldGenTallGrass(BlockTallGrass.EnumType p_i45629_1_)
    {
        this.tallGrassState = Blocks.tallgrass.getDefaultState().withProperty(BlockTallGrass.TYPE, p_i45629_1_);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        Block lvt_4_1_;

        while (((lvt_4_1_ = worldIn.getBlockState(position).getBlock()).getMaterial() == Material.air || lvt_4_1_.getMaterial() == Material.leaves) && position.getY() > 0)
        {
            position = position.down();
        }

        for (int lvt_5_1_ = 0; lvt_5_1_ < 128; ++lvt_5_1_)
        {
            BlockPos lvt_6_1_ = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

            if (worldIn.isAirBlock(lvt_6_1_) && Blocks.tallgrass.canBlockStay(worldIn, lvt_6_1_, this.tallGrassState))
            {
                worldIn.setBlockState(lvt_6_1_, this.tallGrassState, 2);
            }
        }

        return true;
    }
}
