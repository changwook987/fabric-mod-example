package io.github.changwook987.example.actions;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public abstract class Action {
    public void runOnClient(World world, BlockPos pos, BlockState state, PlayerEntity player) {

    }

    public void runOnServer(World world, BlockPos pos, BlockState state, PlayerEntity player) {

    }

    public static Vec3d blockPosToVec3d(BlockPos pos) {
        return new Vec3d(pos.getX() + .5, pos.getY() + .5, pos.getZ() + .5);
    }
}
