package io.github.changwook987.example.actions;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SummonLightningBolt extends Action {
    @Override
    public void runOnServer(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        LightningEntity zombie = new LightningEntity(EntityType.LIGHTNING_BOLT, world);
        zombie.setPosition(blockPosToVec3d(pos));

        world.spawnEntity(zombie);
    }
}
