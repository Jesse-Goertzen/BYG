package voronoiaoc.byg.common.world.feature.features.overworld.trees.redwood;

import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ModifiableTestableWorld;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.Set;

public class RedwoodTree3 extends BYGAbstractTreeFeature<DefaultFeatureConfig> {

    public RedwoodTree3(Codec<DefaultFeatureConfig> configIn) {
        super(configIn);
    }

    protected boolean place(Set<BlockPos> changedBlocks, StructureWorldAccess worldIn, Random rand, BlockPos pos, BlockBox boundsIn, boolean isSapling) {
        int randTreeHeight = 23 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().set(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getHeight()) {

            if (!isDesiredGroundwDirtTag(worldIn, pos.down(), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isSapling)) {
                return false;
            } else {
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 0, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 0, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 0, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 0, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 0, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 1, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 1, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 1, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 1, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 1, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 2, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 2, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 2, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 2, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 2, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 3, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 3, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 3, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 3, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 3, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 4, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 4, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 4, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 4, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 4, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 5, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 5, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 5, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 5, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 5, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 6, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 6, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 6, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 6, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 6, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 7, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 7, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 7, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 7, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 7, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 8, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 8, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 8, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 8, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 8, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 9, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 9, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 9, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 9, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 9, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 10, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 10, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 10, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 10, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 10, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 11, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 11, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 11, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 11, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 11, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 12, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 12, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 12, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 12, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 12, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 13, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 13, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 13, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 13, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 13, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 14, -1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(-1, 14, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 14, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(1, 14, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 14, 1), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 15, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 16, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 17, 0), boundsIn);
                this.treeLog(changedBlocks, worldIn, mainmutable.add(0, 18, 0), boundsIn);


                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 15, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 15, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 15, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 15, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 16, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 16, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 16, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 16, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 17, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 17, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 17, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 17, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 18, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 18, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 18, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 18, 1), boundsIn);


                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 0, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 0, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 0, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2, 0, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, 0, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 0, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 0, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 0, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 1, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 1, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 1, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2, 1, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2, 1, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 1, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 1, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0, 1, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 2, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 2, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1, 2, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1, 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 10, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 10, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 10, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 11, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 11, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 13, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 13, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 13, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 13, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 13, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 13, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 13, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 14, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 14, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 14, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2, 14, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2, 14, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 14, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 14, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 14, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 15, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 15, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 15, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 15, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 17, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 17, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 17, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 17, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 17, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 17, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 17, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 17, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 18, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1, 18, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1, 18, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 18, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0, 19, 0), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, StructureWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        if (canLogPlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.REDWOOD_LOG.getDefaultState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, StructureWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        if (canLogPlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.REDWOOD_LOG.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, StructureWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(blockPos, reader, pos, BYGBlockList.REDWOOD_LEAVES.getDefaultState(), boundingBox);
        }
    }


    private boolean doesTreeFit(ModifiableTestableWorld reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.Mutable pos = new BlockPos.Mutable();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 0;

            for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                    if (!canLogPlaceHere(reader, pos.set(x + xOffset, y + yOffset, z + zOffset))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}