package io.github.changwook987.example.actions;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SummonTNT extends Action {
    @Override
    public void runOnServer(World world, BlockPos pos, BlockState state, PlayerEntity player) {

        for (int i = 0; i < world.getRandom().nextInt(10, 20); i++) {
            TntEntity tnt = new TntEntity(EntityType.TNT, world);
            tnt.setPosition(blockPosToVec3d(pos));
            tnt.setVelocity(world.getRandom().nextDouble(-1, 1), 1, world.getRandom().nextDouble(-1, 1));

            world.spawnEntity(tnt);
        }
    }
}
