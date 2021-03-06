package voronoiaoc.byg.common.world.surfacebuilders;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;

@SuppressWarnings("deprecation")
public class ShatteredGlacierSB2 extends ShatteredGlacierSB {
    private static final BlockState PACKED_ICE = BYGBlockList.PACKED_BLACK_ICE.getDefaultState();
    private static final BlockState BLUE_ICE = BYGBlockList.BLACK_ICE.getDefaultState();
    private static final BlockState BLUE_ICE2 = Blocks.SNOW_BLOCK.getDefaultState();

    public ShatteredGlacierSB2(Codec<TernarySurfaceConfig> config) {
        super(config);
    }

    public void generate(Random random, Chunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, TernarySurfaceConfig config) {
        double d0 = 0.0D;
        double d1 = Math.min(Math.abs(noise), this.perlin1.sample((double) x * 0.25D, (double) z * 0.25D, false) * 15.0D);
        if (d1 > 0.0D) {
            double d3 = Math.abs(this.perlin2.sample((double) x * 0.001953125D, (double) z * 0.001953125D, false));
            d0 = d1 * d1 * 2.5D;
            double d4 = Math.ceil(d3 * 50.0D) + 14.0D;
            if (d0 > d4) {
                d0 = d4;
            }

            d0 = d0 + 64.0D;
        }

        int chunkX = x & 15;
        int chunkZ = z & 15;
        BlockState blockstatePackedIce = PACKED_ICE;
        BlockState blockstateUnder = biomeIn.getGenerationSettings().getSurfaceConfig().getUnderMaterial();
        int i1 = (int) (noise / 3.0D + 3.0D + random.nextDouble() * 0.25D);
        boolean flag = Math.cos(noise / 3.0D * Math.PI) > 0.0D;
        int j = -1;
        boolean flag1 = false;
        BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();

        for (int k = Math.max(startHeight, (int) d0 + 1); k >= 0; --k) {
            blockpos$mutable.set(chunkX, k, chunkZ);
            if (chunkIn.getBlockState(blockpos$mutable).isAir() && k < (int) d0) {
                chunkIn.setBlockState(blockpos$mutable, defaultBlock, false);
            }

            BlockState blockstate1 = chunkIn.getBlockState(blockpos$mutable);
            if (blockstate1.isAir()) {
                j = -1;
            } else if (blockstate1.getBlock() == defaultBlock.getBlock()) {
                if (j == -1) {
                    flag1 = false;
                    if (i1 <= 0) {
                        blockstatePackedIce = Blocks.AIR.getDefaultState();
                        blockstateUnder = defaultBlock;
                    } else if (k >= seaLevel - 4 && k <= seaLevel + 1) {
                        blockstatePackedIce = PACKED_ICE;
                        blockstateUnder = biomeIn.getGenerationSettings().getSurfaceConfig().getUnderMaterial();
                    }

                    if (k < seaLevel && (blockstatePackedIce == null || blockstatePackedIce.isAir())) {
                        blockstatePackedIce = defaultFluid;
                    }

                    j = i1 + Math.max(0, k - seaLevel);
                    if (k >= seaLevel - 1) {
                        if (k <= seaLevel + 3 + i1) {
                            chunkIn.setBlockState(blockpos$mutable, biomeIn.getGenerationSettings().getSurfaceConfig().getUnderMaterial(), false);
                            flag1 = true;
                        } else {
                            BlockState blockstate3;
                            if (k >= 64 && k <= 127) {
                                if (flag) {
                                    blockstate3 = BLUE_ICE2;
                                } else {
                                    blockstate3 = this.noiseBlockState(x, k, z);
                                }
                            } else {
                                blockstate3 = BLUE_ICE;
                            }

                            chunkIn.setBlockState(blockpos$mutable, blockstate3, false);
                        }
                    } else {
                        chunkIn.setBlockState(blockpos$mutable, blockstateUnder, false);
                        Block block = blockstateUnder.getBlock();
                        if (block == Blocks.WHITE_TERRACOTTA || block == Blocks.ORANGE_TERRACOTTA || block == Blocks.MAGENTA_TERRACOTTA || block == Blocks.LIGHT_BLUE_TERRACOTTA || block == Blocks.YELLOW_TERRACOTTA || block == Blocks.LIME_TERRACOTTA || block == Blocks.PINK_TERRACOTTA || block == Blocks.GRAY_TERRACOTTA || block == Blocks.LIGHT_GRAY_TERRACOTTA || block == Blocks.CYAN_TERRACOTTA || block == Blocks.PURPLE_TERRACOTTA || block == Blocks.BLUE_TERRACOTTA || block == Blocks.BROWN_TERRACOTTA || block == Blocks.GREEN_TERRACOTTA || block == Blocks.RED_TERRACOTTA || block == Blocks.BLACK_TERRACOTTA) {
                            chunkIn.setBlockState(blockpos$mutable, BLUE_ICE, false);
                        }
                    }
                } else if (j > 0) {
                    --j;
                    if (flag1) {
                        chunkIn.setBlockState(blockpos$mutable, BLUE_ICE, false);
                    } else {
                        chunkIn.setBlockState(blockpos$mutable, this.noiseBlockState(x, k, z), false);
                    }
                }
            }
        }

    }
}