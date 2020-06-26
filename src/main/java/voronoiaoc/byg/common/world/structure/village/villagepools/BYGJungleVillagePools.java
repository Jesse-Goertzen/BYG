package voronoiaoc.byg.common.world.structure.village.villagepools;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Blocks;
import net.minecraft.block.PaneBlock;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.jigsaw.*;
import net.minecraft.world.gen.feature.template.*;

@SuppressWarnings("deprecation")
public class BYGJungleVillagePools {
    public static void init() {
        ImmutableList<StructureProcessor> structureProcessors = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new RuleEntry(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.8F), AlwaysTrueRuleTest.INSTANCE, Blocks.GRASS_PATH.getDefaultState()), new RuleEntry(new TagMatchRuleTest(BlockTags.DOORS), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new RuleEntry(new BlockMatchRuleTest(Blocks.TORCH), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new RuleEntry(new BlockMatchRuleTest(Blocks.WALL_TORCH), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.07F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.GRASS_PATH, 0.07F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHITE_TERRACOTTA, 0.07F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.OAK_LOG, 0.05F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.MOSSY_COBBLESTONE, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.OAK_STAIRS, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.STRIPPED_OAK_LOG, 0.02F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.GLASS_PANE, 0.5F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new RuleEntry(new BlockStateMatchRuleTest(Blocks.GLASS_PANE.getDefaultState().with(PaneBlock.NORTH, true).with(PaneBlock.SOUTH, true)), AlwaysTrueRuleTest.INSTANCE, Blocks.BROWN_STAINED_GLASS_PANE.getDefaultState().with(PaneBlock.NORTH, true).with(PaneBlock.SOUTH, true)), new RuleEntry(new BlockStateMatchRuleTest(Blocks.GLASS_PANE.getDefaultState().with(PaneBlock.EAST, true).with(PaneBlock.WEST, true)), AlwaysTrueRuleTest.INSTANCE, Blocks.BROWN_STAINED_GLASS_PANE.getDefaultState().with(PaneBlock.EAST, true).with(PaneBlock.WEST, true)), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.3F), AlwaysTrueRuleTest.INSTANCE, Blocks.CARROTS.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.POTATOES.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.BEETROOTS.getDefaultState()))));
        ImmutableList<StructureProcessor> structureProcessors1 = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new RuleEntry(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.GRASS_PATH.getDefaultState()))));
        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/jungle/town_centers"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/jungle/town_centers/jungle_marketplace_1", ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new RuleEntry(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.GRASS_PATH.getDefaultState()))))), 50), new Pair<>(new SingleJigsawPiece("byg:village/jungle/town_centers/jungle_marketplace_1", ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new RuleEntry(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.GRASS_PATH.getDefaultState()))))), 50), new Pair<>(new SingleJigsawPiece("byg:village/jungle/town_centers/jungle_marketplace_1"), 50), new Pair<>(new SingleJigsawPiece("byg:village/jungle/town_centers/jungle_marketplace_1", ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new RuleEntry(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.7F), AlwaysTrueRuleTest.INSTANCE, Blocks.GRASS_PATH.getDefaultState()))))), 50), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/town_centers/jungle_marketplace_1", structureProcessors), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/town_centers/jungle_marketplace_1", structureProcessors), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/town_centers/jungle_marketplace_1", structureProcessors), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/town_centers/jungle_marketplace_1", structureProcessors), 1)), JigsawPattern.PlacementBehaviour.RIGID));
        ImmutableList<StructureProcessor> structureProcessors2 = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new RuleEntry(new BlockMatchRuleTest(Blocks.GRASS_PATH), new BlockMatchRuleTest(Blocks.WATER), Blocks.MOSSY_COBBLESTONE.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.GRASS_PATH, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.GRASS_BLOCK.getDefaultState()), new RuleEntry(new BlockMatchRuleTest(Blocks.GRASS_BLOCK), new BlockMatchRuleTest(Blocks.WATER), Blocks.WATER.getDefaultState()), new RuleEntry(new BlockMatchRuleTest(Blocks.DIRT), new BlockMatchRuleTest(Blocks.WATER), Blocks.WATER.getDefaultState()))));
        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/jungle/streets"), new ResourceLocation("byg:village/jungle/terminators"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/corner_01", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/corner_02", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/corner_03", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/straight_01", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/straight_02", structureProcessors2), 4), new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/straight_03", structureProcessors2), 7), new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/straight_04", structureProcessors2), 7), new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/straight_05", structureProcessors2), 3), new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/straight_06", structureProcessors2), 4), new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/crossroad_01", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/crossroad_02", structureProcessors2), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/crossroad_03", structureProcessors2), 2), new Pair[]{new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/crossroad_04", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/crossroad_05", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/crossroad_06", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/streets/turn_01", structureProcessors2), 3)}), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
//        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/jungle/zombie/streets"), new ResourceLocation("byg:village/jungle/terminators"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/corner_01", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/corner_02", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/corner_03", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/straight_01", structureProcessors2), 4), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/straight_02", structureProcessors2), 4), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/straight_03", structureProcessors2), 7), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/straight_04", structureProcessors2), 7), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/straight_05", structureProcessors2), 3), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/straight_06", structureProcessors2), 4), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/crossroad_01", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/crossroad_02", structureProcessors2), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/crossroad_03", structureProcessors2), 2), new Pair<>[]{new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/crossroad_04", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/crossroad_05", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/crossroad_06", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/streets/turn_01", structureProcessors2), 3)}), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        ImmutableList<StructureProcessor> structureProcessors3 = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.3F), AlwaysTrueRuleTest.INSTANCE, Blocks.CARROTS.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.POTATOES.getDefaultState()), new RuleEntry(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.BEETROOTS.getDefaultState()))));
        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/jungle/houses"), new ResourceLocation("byg:village/jungle/terminators"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_farm_1", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_farm_2", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_3", structureProcessors1), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_2", structureProcessors1), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_3", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_library_2", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_library_1", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_3", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_fletcher_1", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_loom_1", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_weaponsmith_1", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_weaponsmith_2", structureProcessors1), 10), new Pair[]{new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_butcher_shop_2", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_tool_smith_1", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_fletcher_house_3", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_3", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_2", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_3", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/", structureProcessors1), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_1"), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_2", structureProcessors3), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_3", structureProcessors3), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_1"), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_2"), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_3"), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_accessory_1"), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_2", ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new RuleEntry(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.7F), AlwaysTrueRuleTest.INSTANCE, Blocks.GRASS_PATH.getDefaultState()))))), 10), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_house_3"), 10), Pair.of(EmptyJigsawPiece.INSTANCE, 10)}), JigsawPattern.PlacementBehaviour.RIGID));
//        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/jungle/zombie/houses"), new ResourceLocation("byg:village/jungle/terminators"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_small_house_1", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_small_house_2", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_small_house_3", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_small_house_4", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_small_house_5", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_small_house_6", structureProcessors), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_small_house_7", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_small_house_8", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_medium_house_1", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_medium_house_2", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_big_house_1", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_butcher_shop_1", structureProcessors), 2), new Pair<>[]{new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_butcher_shop_2", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_tool_smith_1", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_fletcher_house_1", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_shepherds_house_1", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_armorer_house_1", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_fisher_cottage_1", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_tannery_1", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_cartographer_1", structureProcessors), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_library_1", structureProcessors), 3), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_library_2", structureProcessors), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_masons_house_1", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_weaponsmith_1", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_temple_3", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_temple_4", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_stable_1", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_stable_2", structureProcessors), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_large_farm_1", structureProcessors), 4), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_small_farm_1", structureProcessors), 4), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_animal_pen_1", structureProcessors), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/houses/jungle_animal_pen_2", structureProcessors), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_animal_pen_3", structureProcessors), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_meeting_point_4", structureProcessors), 3), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/houses/jungle_meeting_point_5", structureProcessors), 1), Pair<>.of(EmptyJigsawPiece.INSTANCE, 10)}), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/jungle/terminators"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/jungle/terminators/terminator_01", structureProcessors2), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/terminators/terminator_02", structureProcessors2), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/terminators/terminator_03", structureProcessors2), 2), new Pair<>(new SingleJigsawPiece("byg:village/jungle/terminators/terminator_04", structureProcessors2), 2)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/jungle/trees"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new FeatureJigsawPiece(Feature.field_236291_c_.withConfiguration(DefaultBiomeFeatures.MEGA_JUNGLE_TREE_CONFIG)), 1)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/jungle/decor"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/jungle/jungle_lamp_1"), 2), new Pair<>(new FeatureJigsawPiece(Feature.field_236291_c_.withConfiguration(DefaultBiomeFeatures.JUNGLE_GROUND_BUSH_CONFIG)), 0), new Pair<>(new FeatureJigsawPiece(Feature.FLOWER.withConfiguration(DefaultBiomeFeatures.PLAINS_FLOWER_CONFIG)), 0), new Pair<>(new FeatureJigsawPiece(Feature.BLOCK_PILE.withConfiguration(DefaultBiomeFeatures.HAY_PILE_CONFIG)), 0), Pair.of(EmptyJigsawPiece.INSTANCE, 2)), JigsawPattern.PlacementBehaviour.RIGID));
//        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/jungle/zombie/decor"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/jungle/jungle_lamp_1", structureProcessors), 1), new Pair<>(new FeatureJigsawPiece(Feature.field_236291_c_.withConfiguration(DefaultBiomeFeatures.OAK_TREE_CONFIG)), 1), new Pair<>(new FeatureJigsawPiece(Feature.FLOWER.withConfiguration(DefaultBiomeFeatures.PLAINS_FLOWER_CONFIG)), 1), new Pair<>(new FeatureJigsawPiece(Feature.BLOCK_PILE.withConfiguration(DefaultBiomeFeatures.HAY_PILE_CONFIG)), 1), Pair<>.of(EmptyJigsawPiece.INSTANCE, 2)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/jungle/villagers"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/jungle/villagers/nitwit"), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/villagers/baby"), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/villagers/unemployed"), 10)), JigsawPattern.PlacementBehaviour.RIGID));
//        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/jungle/zombie/villagers"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/villagers/nitwit"), 1), new Pair<>(new SingleJigsawPiece("byg:village/jungle/zombie/villagers/unemployed"), 10)), JigsawPattern.PlacementBehaviour.RIGID));
//        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/common/animals"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/common/animals/cows_1"), 7), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/pigs_1"), 7), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/horses_1"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/horses_2"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/horses_3"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/horses_4"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/horses_5"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/sheep_1"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/sheep_2"), 1), Pair<>.of(EmptyJigsawPiece.INSTANCE, 5)), JigsawPattern.PlacementBehaviour.RIGID));
//        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/common/sheep"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/common/animals/sheep_1"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/sheep_2"), 1)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/common/cats"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/common/animals/cat_black"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/cat_british"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/cat_calico"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/cat_persian"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/cat_ragdoll"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/cat_red"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/cat_siamese"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/cat_tabby"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/cat_white"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/cat_jellie"), 1), Pair.of(EmptyJigsawPiece.INSTANCE, 3)), JigsawPattern.PlacementBehaviour.RIGID));
//        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/common/butcher_animals"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/common/animals/cows_1"), 3), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/pigs_1"), 3), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/sheep_1"), 1), new Pair<>(new SingleJigsawPiece("byg:village/common/animals/sheep_2"), 1)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/common/iron_golem"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/common/iron_golem"), 1)), JigsawPattern.PlacementBehaviour.RIGID));
//        JigsawManager.REGISTRY.register(new JigsawPattern(new ResourceLocation("byg:village/common/well_bottoms"), new ResourceLocation("empty"), ImmutableList.of(new Pair<>(new SingleJigsawPiece("byg:village/common/well_bottom"), 1)), JigsawPattern.PlacementBehaviour.RIGID));
    }
}
