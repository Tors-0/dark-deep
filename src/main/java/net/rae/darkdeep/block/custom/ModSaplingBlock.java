package net.rae.darkdeep.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import java.util.function.Supplier;

public class ModSaplingBlock extends SaplingBlock {
    private final Supplier<Block> ground;
    /**
     * Access widened by fabric-transitive-access-wideners-v1 to accessible
     *
     */
    public ModSaplingBlock(SaplingGenerator generator, Settings settings, Supplier<Block> ground) {
        super(generator, settings);
        this.ground = ground;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ground.get());
    }
}
