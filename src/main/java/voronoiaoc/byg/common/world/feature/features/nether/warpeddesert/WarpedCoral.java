package voronoiaoc.byg.common.world.feature.features.nether.warpeddesert;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.StructureManager;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;

public class WarpedCoral extends Feature<NoFeatureConfig> {
    public WarpedCoral(Codec<NoFeatureConfig> config) {
        super(config);
    }

    public boolean func_230362_a_(ISeedReader worldIn, StructureManager structureManager, ChunkGenerator generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        if (!worldIn.isAirBlock(pos)) {
            return false;
        } else if ((worldIn.getBlockState(pos.down()).getBlock() == BYGBlockList.NYLIUM_SOUL_SAND) || (worldIn.getBlockState(pos.down()).getBlock() == BYGBlockList.NYLIUM_SOUL_SOIL)) {
            worldIn.setBlockState(pos, BYGBlockList.WARPED_CORAL.getDefaultState(), 2);
            return true;
        }
        return true;
    }
}