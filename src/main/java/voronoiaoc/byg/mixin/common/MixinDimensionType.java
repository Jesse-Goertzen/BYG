package voronoiaoc.byg.mixin.common;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.ChunkGeneratorType;
import net.minecraft.world.gen.chunk.SurfaceChunkGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import voronoiaoc.byg.common.world.dimension.end.BYGEndBiomeProvider;
import voronoiaoc.byg.common.world.dimension.nether.BYGNetherBiomeProvider;

@Mixin(DimensionType.class)
public class MixinDimensionType {

    @Inject(at = @At("HEAD"), method = "createNetherGenerator(J)Lnet/minecraft/world/gen/chunk/ChunkGenerator;", cancellable = true, require = 0)
    private static void yeetTheNether(long seed, CallbackInfoReturnable<ChunkGenerator> cir) {
        if (FabricLoader.getInstance().isModLoaded("smolder") || FabricLoader.getInstance().isModLoaded("betternether")) {

        }
        else {
            cir.setReturnValue(new SurfaceChunkGenerator(new BYGNetherBiomeProvider(seed), seed, ChunkGeneratorType.Preset.NETHER.getChunkGeneratorType()));
        }
    }

    @Inject(at = @At("HEAD"), method = "createEndGenerator(J)Lnet/minecraft/world/gen/chunk/ChunkGenerator;", cancellable = true, require = 0)
    private static void yeetTheEnd(long seed, CallbackInfoReturnable<ChunkGenerator> cir) {
        cir.setReturnValue(new SurfaceChunkGenerator(new BYGEndBiomeProvider(seed), seed, ChunkGeneratorType.Preset.END.getChunkGeneratorType()));
    }
}