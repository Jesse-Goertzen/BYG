package voronoiaoc.byg.common.world.surfacebuilders;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

import java.util.Random;

public class EbonyWoodsSB extends SurfaceBuilder<TernarySurfaceConfig> {
    public EbonyWoodsSB(Codec<TernarySurfaceConfig> configIn) {
        super(configIn);
    }

    public void generate(Random random, Chunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, TernarySurfaceConfig config) {
        if (noise > 1.75D) {
            SurfaceBuilder.DEFAULT.generate(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, SurfaceBuilder.GRASS_CONFIG);
        } else if (noise > -0.95D) {
            SurfaceBuilder.DEFAULT.generate(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, SurfaceBuilder.COARSE_DIRT_CONFIG);
        } else {
            SurfaceBuilder.DEFAULT.generate(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, SurfaceBuilder.GRASS_CONFIG);
        }

    }
}