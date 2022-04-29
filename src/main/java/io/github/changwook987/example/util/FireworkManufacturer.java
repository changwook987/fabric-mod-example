package io.github.changwook987.example.util;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.util.DyeColor;

import java.util.List;

public class FireworkManufacturer {
    public static NbtCompound generateRandomSpecial() {
        NbtCompound fireworkNbt = new NbtCompound();

        fireworkNbt.putIntArray("Colors", List.of(DyeColor.RED.getFireworkColor()));
        fireworkNbt.putByte("Type", (byte) 2);

        NbtList container = new NbtList();
        container.add(fireworkNbt);

        NbtCompound ret = new NbtCompound();
        ret.put("Explosions", container);
        return ret;
    }
}