package io.github.changwook987.example.blocks;

import io.github.changwook987.example.actions.Action;
import io.github.changwook987.example.actions.Actions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ExampleBlock extends Block {
    public ExampleBlock(Settings settings) {
        super(settings);
    }

    private int index;

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {

        if (world.isClient()) {
            index = world.getRandom().nextInt(0, Actions.ACTION_LIST.size());
            Action action = Actions.ACTION_LIST.get(index);
            action.runOnClient(world, pos, state, player);
        } else {
            Action action = Actions.ACTION_LIST.get(index);
            action.runOnServer(world, pos, state, player);
        }

        super.onBreak(world, pos, state, player);
    }
}
