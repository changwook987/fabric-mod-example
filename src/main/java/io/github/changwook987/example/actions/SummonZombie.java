package io.github.changwook987.example.actions;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SummonZombie extends Action {
    @Override
    public void runOnServer(World world, BlockPos pos, BlockState state, PlayerEntity player) {

        for (int i = 0; i < world.getRandom().nextInt(10, 20); i++) {
            ZombieEntity zombie = new ZombieEntity(EntityType.ZOMBIE, world);
            zombie.setPosition(blockPosToVec3d(pos));

            world.spawnEntity(zombie);
        }
    }
}
