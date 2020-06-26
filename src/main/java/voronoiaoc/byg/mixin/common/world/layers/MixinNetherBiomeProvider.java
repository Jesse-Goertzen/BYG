package voronoiaoc.byg.mixin.common.world.layers;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.NetherBiomeProvider;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import voronoiaoc.byg.core.byglists.BYGBiomeList;

import java.util.ArrayList;
import java.util.Optional;

@Mixin(NetherBiomeProvider.class)
public class MixinNetherBiomeProvider {
    static ForgeRegistry<Biome> BiomeRegistry = ((ForgeRegistry<Biome>) ForgeRegistries.BIOMES);
    static final Biome ASHENINFERNO = BiomeRegistry.getRaw(new ResourceLocation("biomesoplenty:ashen_inferno"));
    static final Biome UNDERGARDEN = BiomeRegistry.getRaw(new ResourceLocation("biomesoplenty:undergarden"));
    static final Biome VISCERALHEAP = BiomeRegistry.getRaw(new ResourceLocation("biomesoplenty:visceral_heap"));


    @Inject(at = @At("RETURN"), method = "func_235285_d_", cancellable = true)
    private static void addBYGNetherBiomes(long seed, CallbackInfoReturnable<NetherBiomeProvider> cir) {
        ArrayList<Biome> biomes = new ArrayList<>(cir.getReturnValue().func_235203_c_());

        biomes.add(BYGBiomeList.SYTHIANTORRIDS);
        biomes.add(BYGBiomeList.WARPEDDESERT);
        biomes.add(BYGBiomeList.GLOWSTONEGARDENS);
        if (ModList.get().isLoaded("biomesoplenty")) {
            biomes.add(ASHENINFERNO);
            biomes.add(UNDERGARDEN);
            biomes.add(VISCERALHEAP);

        }
        cir.setReturnValue(new NetherBiomeProvider(seed, biomes.stream().flatMap((biome) ->
                biome.func_235055_B_().map((mapper) ->
                        Pair.of(mapper, biome))).collect(ImmutableList.toImmutableList()), Optional.of(NetherBiomeProvider.Preset.field_235288_b_)));
    }
}
