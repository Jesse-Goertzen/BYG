package voronoiaoc.byg.common.properties.blocks;

import net.minecraft.block.*;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class LeafFoliageBlock extends PlantBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);
    private final DyeColor color;

    protected LeafFoliageBlock(DyeColor colorIn, Settings properties) {
        super(properties);
        this.color = colorIn;
    }

    public DyeColor getColor() {
        return this.color;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.getMaterial() == Material.SOIL;
    }
}