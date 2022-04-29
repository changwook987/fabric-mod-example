package io.github.changwook987.example.actions;

import io.github.changwook987.example.util.FireworkManufacturer;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class SummonRandomItem extends Action {
    @Override
    public void runOnServer(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        ItemEntity item = new ItemEntity(EntityType.ITEM, world);
        item.setPosition(blockPosToVec3d(pos));

        var random = Registry.ITEM.getRandom(world.getRandom());
        random.ifPresent(entry -> item.setStack(new ItemStack(entry)));

        world.spawnEntity(item);
    }

    @Override
    public void runOnClient(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        Vec3d vec = blockPosToVec3d(pos);

        world.addFireworkParticle(
                vec.getX(),
                vec.getY(),
                vec.getZ(),
                0, 0, 0,
                FireworkManufacturer.generateRandomSpecial()
        );
    }
}
