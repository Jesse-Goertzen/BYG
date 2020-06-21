package voronoiaoc.byg.common.world.feature.features.overworld.trees;

import javax.annotation.Nullable;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.aspen.AspenTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.aspen.AspenTree2;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.baobab.BaobabTree1;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.bayou.BayouTree1;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.birch.BrownBirchTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.birch.OrangeBirchTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.birch.RedBirchTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.birch.YellowBirchTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.coniferous.SmallFirTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.coniferous.WideFirTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.jacaranda.IndigoJacarandaTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.jacaranda.IndigoJacarandaTree2;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.jacaranda.JacarandaTree1;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.jacaranda.JacarandaTree2;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.joshua.JoshuaTree1;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.joshua.JoshuaTree2;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.oak.BrownOakTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.oak.OrangeOakTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.oak.RedOakTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.palo_verde.PaloVerdeTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.palo_verde.PaloVerdeTree2;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.rainbow_eucalyptus.RainbowEucalyptusTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.skyris.SkyrisTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.skyris.SkyrisTree2;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.taiga.giantspruce.GiantBlueSpruceTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.taiga.giantspruce.GiantOrangeSpruceTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.taiga.giantspruce.GiantRedSpruceTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.taiga.giantspruce.GiantYellowSpruceTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.taiga.spruce.BlueSpruceTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.taiga.spruce.OrangeSpruceTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.taiga.spruce.RedSpruceTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.taiga.spruce.YellowSpruceTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.tropical.ShortTropicalRainForestTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.tropical.TropicalRainForestTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGHugeTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.zelkova.ZelkovaTree;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.zelkova.ZelkovaTree3;

import java.util.Random;

public class BYGSaplingToTree {
    public static class BlueSpruceSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantBlueSpruceTree(DefaultFeatureConfig.CODEC);
        }

        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return new BlueSpruceTree(DefaultFeatureConfig.CODEC);
        }
    }

    public static class RedSpruceSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantRedSpruceTree(DefaultFeatureConfig.CODEC);
        }

        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return new RedSpruceTree(DefaultFeatureConfig.CODEC);
        }
    }

    public static class BaobabSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getBigTreeFeature(Random random) {
            return new BaobabTree1(DefaultFeatureConfig.CODEC);
        }

        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return null;
        }
    }

    public static class OrangeSpruceSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantOrangeSpruceTree(DefaultFeatureConfig.CODEC);
        }

        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return new OrangeSpruceTree(DefaultFeatureConfig.CODEC);
        }
    }


    public static class YellowSpruceSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantYellowSpruceTree(DefaultFeatureConfig.CODEC);
        }

        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return new YellowSpruceTree(DefaultFeatureConfig.CODEC);
        }
    }


    public static class BrownOakSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return new BrownOakTree(DefaultFeatureConfig.CODEC);
        }
    }

    public static class RainbowEucalyptusSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return new RainbowEucalyptusTree(DefaultFeatureConfig.CODEC);
        }
    }


    public static class OrangeOakSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return new OrangeOakTree(DefaultFeatureConfig.CODEC);
        }
    }


    public static class RedOakSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return new RedOakTree(DefaultFeatureConfig.CODEC);
        }
    }


    public static class OrangeBirchSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return new OrangeBirchTree(DefaultFeatureConfig.CODEC);
        }
    }


    public static class BrownBirchSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return new BrownBirchTree(DefaultFeatureConfig.CODEC);
        }
    }


    public static class RedBirchSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return new RedBirchTree(DefaultFeatureConfig.CODEC);
        }
    }


    public static class YellowBirchSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return new YellowBirchTree(DefaultFeatureConfig.CODEC);
        }
    }

    public static class JacarandaSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return random.nextInt(3) == 0 ? new JacarandaTree1(DefaultFeatureConfig.CODEC) : new JacarandaTree2(DefaultFeatureConfig.CODEC);
        }
    }

    public static class IndigoJacarandaSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return random.nextInt(3) == 0 ? new IndigoJacarandaTree(DefaultFeatureConfig.CODEC) : new IndigoJacarandaTree2(DefaultFeatureConfig.CODEC);
        }
    }

    public static class FirSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getBigTreeFeature(Random random) {
            return new WideFirTree(DefaultFeatureConfig.CODEC);
        }

        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return new SmallFirTree(DefaultFeatureConfig.CODEC);
        }
    }

    public static class MahogonySaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return random.nextInt(2) == 0 ? new TropicalRainForestTree(DefaultFeatureConfig.CODEC) : new ShortTropicalRainForestTree(DefaultFeatureConfig.CODEC);
        }
    }

    public static class SkyrisSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return random.nextInt(2) == 0 ? new SkyrisTree(DefaultFeatureConfig.CODEC) : new SkyrisTree2(DefaultFeatureConfig.CODEC);
        }
    }

    public static class AspenSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return random.nextInt(2) == 0 ? new AspenTree(DefaultFeatureConfig.CODEC) : new AspenTree2(DefaultFeatureConfig.CODEC);
        }
    }

    public static class ZelkovaSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return random.nextInt(2) == 0 ? new ZelkovaTree(DefaultFeatureConfig.CODEC) : new ZelkovaTree3(DefaultFeatureConfig.CODEC);
        }

    }

    public static class PaloVerdeSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return random.nextInt(2) == 0 ? new PaloVerdeTree(DefaultFeatureConfig.CODEC, 0) : new PaloVerdeTree2(DefaultFeatureConfig.CODEC, 0);
        }

    }

    public static class WillowSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return random.nextInt(2) == 0 ? new BayouTree1(DefaultFeatureConfig.CODEC) : new BayouTree1(DefaultFeatureConfig.CODEC);
        }

    }

    public static class JoshuaSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<DefaultFeatureConfig> getTreeFeature(Random random) {
            return random.nextInt(2) == 0 ? new JoshuaTree1(DefaultFeatureConfig.CODEC) : new JoshuaTree2(DefaultFeatureConfig.CODEC);
        }

    }
}

