package net.Super.Timeshattered.fluid;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public abstract class MoltenIron
        extends FlowableFluid {

    @Override
    protected boolean isInfinite() {
        return false;
    } //can it be infinite like water?

    protected void flow(WorldAccess world, BlockPos pos, BlockState state, Direction direction, FluidState fluidState) {
            FluidState fluidState2 = world.getFluidState(pos);
                if (fluidState2.isIn(FluidTags.WATER)) {
                    if (state.getBlock() instanceof FluidBlock) {
                        world.setBlockState(pos, Blocks.ANDESITE.getDefaultState(), Block.NOTIFY_ALL);
                    }
                    return;
                }
        super.flow(world, pos, state, direction, fluidState);
    }
    //an attempt to get it to interact. update. it does react. but it does so in a strange way.
    //will try to figure something more out later.

    @Override
    protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {
        BlockEntity blockEntity = state.hasBlockEntity() ? world.getBlockEntity(pos) : null;
        Block.dropStacks(state, world, pos, blockEntity);
    }
    //what happens before breaking a block?

    @Override
    protected int getFlowSpeed(WorldView world) {
        return 3;
    }
    //how fast does it flow.

    @Override
    protected int getLevelDecreasePerBlock(WorldView world) {
        return 1;
    }
    //how much does it decrease in level per block traveled?



    public boolean matchesType(Fluid fluid) {
        return fluid == getStill() || fluid == getFlowing();
    }
    @Override
    public int getLevel(FluidState state) {
        return 8;
    }

    //how many levels does it have?
    @Override
    public int getTickRate(WorldView world) {
        return 20;
    }
    //????

    @Override
    protected float getBlastResistance() {
        return 100f;
    }
    //blast resistance

    @Override
    protected boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
        return false;
    }
    //???

    @Override
    public Fluid getStill() {
        return ModFluids.STILL_MOLTEN_IRON;
    }

    @Override
    public Fluid getFlowing() {
        return ModFluids.FLOWING_MOLTEN_IRON;
    }

    @Override
    public Item getBucketItem() {
        return ModFluids.MOLTEN_IRON_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModFluids.MOLTEN_IRON_BLOCK.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(state));
    }

    @Override
    public boolean isStill(FluidState state) {
        return false;
    }

    public static class Flowing extends MoltenIron {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }
    }

    public static class Still extends MoltenIron {
        @Override
        public int getLevel(FluidState state) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState state) {
            return true;
        }
    }
}

